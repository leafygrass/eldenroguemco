package ccprog3.mco.Controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import ccprog3.mco.Driver;
import ccprog3.mco.Model.Player.GamePlayer;
import ccprog3.mco.Model.Weapon.Weapon;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShopController {

	private GamePlayer scPlayer;
	private boolean populated = false;
	private Weapon scWeapon = new Weapon();
	
	@FXML 
	private Label PlayerRunes;
	
	private void getPlayerRunes() {
		PlayerRunes.setText(Integer.toString(scPlayer.getRunes()));
	}
	
	@FXML
	private Label PlayerDex; 
	
	private void getPlayerDex() {
		PlayerDex.setText(Integer.toString(scPlayer.getPlayerJob().getDDex()));
	}
	
	@FXML 
	private Label runesCost;
	
	@FXML
	private void initialize() {
		this.scPlayer = new GamePlayer(CharacterDetailManager.getInstance());
		getPlayerRunes();
		getPlayerDex();
		populateWPTypeChoiceBox();
		WPTypeChoiceBox.valueProperty().addListener((observable, oldValue, newValue) -> {
	        populateWPChoiceBox(newValue);
	    });
	}

	@FXML
	private void switchToGameLobby() throws IOException {
		Driver.setRoot("GameLobby");
	}
	
    @FXML
    private ImageView WeaponImage;
    private static final Map<String, Image> imageCache = new HashMap<>();
    
    private void changeWeapImage(int index) {
    	String imagePath = "";
    	Image newImage = null; 
    	switch (index) {
    	case 0: 
    		imagePath = "/ccprog3/mco/photos/Swords/short_sword_image.png";
    		break;
    	case 1: 
    		imagePath = "/ccprog3/mco/photos/Swords/rogiers_rapier_image.png";
    		break; 
    	case 2:  
    		imagePath = "/ccprog3/mco/photos/Swords/coded_sword_image.png";
    		break;
    	case 3: 
    		imagePath = "/ccprog3/mco/photos/Swords/sword_of_night_and_flame_image.png";
    		break;
    	default:
    	}		
        newImage = imageCache.computeIfAbsent(imagePath, path -> {
            // Load the image
            return new Image(getClass().getResource(path).toExternalForm());
        });
        WeaponImage.setImage(newImage);
    }
	
	private void changeWeapImage2(int index) {
    	String imagePath = "";
    	Image newImage = null; 
    	switch (index) {
    	case 0: 
    		imagePath = "/ccprog3/mco/photos/shotgun/shotgun_image.png";
    		break;
    	default:
    	}		
        newImage = imageCache.computeIfAbsent(imagePath, path -> {
            // Load the image
            return new Image(getClass().getResource(path).toExternalForm());
        });
        WeaponImage.setImage(newImage);
    }
	
	@FXML
    private ChoiceBox<String> WPTypeChoiceBox;
	
	private void populateWPTypeChoiceBox() {
	    if (!populated) {
	        WPTypeChoiceBox.getItems().addAll("Shotgun", "Sword", "Katana", "Whips", "Greatsword", "Staff", "Seals");
	        populated = true; 
	    }
	}
	
    @FXML
    private Label WeaponDetailsView;

    @FXML
    private void displayWeapStats(int weapIndex) {
            String WPdetails = scWeapon.arrWeapSwordListToStringPrintByIndex(weapIndex);
            WeaponDetailsView.setText(WPdetails);
    }
	
	
	@FXML
    private ChoiceBox<String> WPChoiceBox;
	
	private void populateWPChoiceBox(String weaponType) {
		WPChoiceBox.getItems().clear();
		switch(weaponType) {
			case "Shotgun":
			WPChoiceBox.getItems().addAll(Weapon.getWeaponShotgunListName());
			WPChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue != null && !newValue.isEmpty()) {
                    switch (newValue) {
						case "shotgun":
                        	displayWeapStats(0);
                            changeWeapImage2(0);
                            break;
                        default:
                    }
                }
            });

			break;
		case "Sword":
			WPChoiceBox.getItems().addAll(Weapon.getWeaponSwordListName());
			WPChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue != null && !newValue.isEmpty()) {
                    switch (newValue) {
                        case "Short Sword":
                        	displayWeapStats(0);
                            changeWeapImage(0);
                            break;
                        case "Rogier's Rapier":
                        	scPlayer.newJobByIndex(1);
                        	displayWeapStats(1);
                            changeWeapImage(1);
                            break;
                        case "Coded Sword":
                        	scPlayer.newJobByIndex(2);
                        	displayWeapStats(2);
                            changeWeapImage(2);
                            break;
                        case "Sword of Night and Flame":
                        	scPlayer.newJobByIndex(3);
                        	displayWeapStats(3);
                            changeWeapImage(3);
                            break;
                        default:
                    }
                }
            });

			break;
		case "Katana":
			WPChoiceBox.getItems().addAll(Weapon.getWeaponKatanaListName());
			break;
		case "Whips":
			WPChoiceBox.getItems().addAll(Weapon.getWeaponWhipsListName());
			break;
		case "Greatsword":
			WPChoiceBox.getItems().addAll(Weapon.getWeaponGreatswordListName());
			break;
		case "Staff":
			WPChoiceBox.getItems().addAll(Weapon.getWeaponStavesListName());
			break;
		case "Seals":
			WPChoiceBox.getItems().addAll(Weapon.getWeaponSealsListName());
			break;
		}
		
	}
	



}
