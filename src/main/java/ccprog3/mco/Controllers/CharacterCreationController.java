package ccprog3.mco.Controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import ccprog3.mco.Driver;
import ccprog3.mco.Model.Job.Job;
import ccprog3.mco.Model.Player.GamePlayer;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

/**
 * Controller class for the Character Creation screen.
 */
public class CharacterCreationController {

	private GamePlayer cPlayer;
	private CharacterDetailManager cPlayerDetails;
    private boolean nameInput = false;
    private boolean classInput = false;
    private boolean populated = false;
    
    @FXML
    private void initialize() {
    	cPlayer = new GamePlayer();
		cPlayerDetails = CharacterDetailManager.getInstance();
        SelectClass.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null && !newValue.isEmpty()) {
                classInput = true;
            } else {
                classInput = false;
            }
        });
    }


    /**
     * Displays a confirmation dialog for the user before proceeding to the Game Lobby.
     *
     * @throws IOException if an error occurs during the transition to the Game Lobby.
     */
    @FXML
    private void askConfirmation() throws IOException {
        Alert lastChance = new Alert(AlertType.CONFIRMATION);
        lastChance.setHeaderText("You cannot edit your Name and Class after confirmation");
        lastChance.setContentText("Name: " + cPlayer.getPlayerName() + "\nJob: " + cPlayer.getPlayerJobName());
        ButtonType confirmButtonType = new ButtonType("Confirm", ButtonData.OK_DONE);
        lastChance.getButtonTypes().setAll(confirmButtonType, ButtonType.CANCEL);
        Optional<ButtonType> result = lastChance.showAndWait();
        if (result.isPresent() && result.get() == confirmButtonType) {
            switchToGameLobby();
        }
    }

    /**
     * Transitions to the Game Lobby screen.
     *
     * @throws IOException if an error occurs during the transition.
     */
    @FXML
    private void switchToGameLobby() throws IOException {
    	cPlayerDetails.updatePlayerDetails(cPlayer);
        if (nameInput && classInput) {
        	Driver.setRoot("GameLobby");
        } else if (!nameInput && !classInput) {
            Alert errorAlert = new Alert(AlertType.ERROR);
            errorAlert.setHeaderText("Input not valid");
            errorAlert.setContentText("No Name and Class Selected");
            errorAlert.showAndWait();
        } else if (!nameInput) {
            Alert errorAlert = new Alert(AlertType.ERROR);
            errorAlert.setHeaderText("Input not valid");
            errorAlert.setContentText("Name must be between 1 and 25 characters");
            errorAlert.showAndWait();
        } else {
            Alert errorAlert = new Alert(AlertType.ERROR);
            errorAlert.setHeaderText("Input not valid");
            errorAlert.setContentText("Please select a class");
            errorAlert.showAndWait();
        }
    }
    
    @FXML
    private ImageView ShowJobImage;
    private static final Map<String, Image> imageCache = new HashMap<>();
    
    private void changeImage(int index) {
    	String imagePath = "";
    	Image newImage = null; 
    	switch (index) {
    	case 0: //vagabond
    		imagePath = "/ccprog3/mco/photos/JobClass/Vagabond.png";
    		break;
    	case 1: //samurai
    		imagePath = "/ccprog3/mco/photos/JobClass/Samurai.png";
    		break; 
    	case 2: //warrior 
    		imagePath = "/ccprog3/mco/photos/JobClass/Warrior.png";
    		break;
    	case 3: //h
    		imagePath = "/ccprog3/mco/photos/JobClass/Hero.png";
    		break;
    	case 4: //a
    		imagePath = "/ccprog3/mco/photos/JobClass/Astrologer.png";
    		break;
    	case 5: //p
    		imagePath = "/ccprog3/mco/photos/JobClass/Prophet.png";
    		break;
    	default: imagePath = "/ccprog3/mco/photos/JobClass/defaultStuff.png";
    	}		
        newImage = imageCache.computeIfAbsent(imagePath, path -> {
            // Load the image
            return new Image(getClass().getResource(path).toExternalForm());
        });
        ShowJobImage.setImage(newImage);
    }

    
    /**
     * Transitions to the Title Screen.
     *
     * @throws IOException if an error occurs during the transition.
     */
    @FXML
    private void switchToTitleScreen() throws IOException {
        Driver.setRoot("TitleScreen");
    }

    @FXML
    private Label JobStats;

    @FXML
    private void displayJobStats(int jobIndex) {
            String jobStats = cPlayer.getPlayerJob().arrJobListToStringPrintByIndex(jobIndex);
            JobStats.setText(jobStats);
    }

    @FXML
    private ChoiceBox<String> SelectClass;

    @FXML
    private void populateChoiceBox() {
        if (!populated) {
            SelectClass.getItems().addAll(Job.getJobNames());
            SelectClass.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue != null && !newValue.isEmpty()) {
                    switch (newValue) {
                        case "Vagabond":
                            cPlayer.newJobByIndex(0);
                            displayJobStats(0);
                            changeImage(0);
                            classInput = true;
                            break;
                        case "Samurai":
                            cPlayer.newJobByIndex(1);
                            displayJobStats(1);
                            changeImage(1);
                            classInput = true;
                            break;
                        case "Warrior":
                            cPlayer.newJobByIndex(2);
                            displayJobStats(2);
                            changeImage(2);
                            classInput = true;
                            break;
                        case "Hero":
                            cPlayer.newJobByIndex(3);
                            displayJobStats(3);
                            changeImage(3);
                            classInput = true;
                            break;
                        case "Astrologer":
                            cPlayer.newJobByIndex(4);
                            displayJobStats(4);
                            changeImage(4);
                            classInput = true;
                            break;
                        case "Prophet":
                            cPlayer.newJobByIndex(5);
                            displayJobStats(5);
                            changeImage(5);
                            classInput = true;
                            break;
                        default:
                    }
                 CheckName.requestFocus();
                }
            });
            populated = true;
            CheckName.requestFocus();
        }
    }

    @FXML
    private TextField CheckName;

    @FXML
    private void checkNameInput(KeyEvent event) {
        String input = CheckName.getText();
        if (input.length() < 1) {
            nameInput = false;
        } else {
            nameInput = true;
            if (input.length() > 25) {
				input = input.substring(0, 25);
			}
        }
        cPlayer.newPlayerName(input);
    }

}
