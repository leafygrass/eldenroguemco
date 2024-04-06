package ccprog3.mco.Controllers;

import java.io.IOException;

import ccprog3.mco.Driver;
import ccprog3.mco.Model.Player.GamePlayer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;


/**
 * Controller class for the Game Lobby screen.
 */
public class GameLobbyController {

    private GamePlayer gcPlayer;
    private CharacterDetailManager cPlayerDetails;
    
    @FXML
    private Label CxName;
    @FXML
    private Label ChosenJobClass;
    @FXML
    private Label JobLvl;
    @FXML
    private Label Runes;
    @FXML
    private ShopController sc;
    @FXML
    private MenuButton FT;
    @FXML
    private MenuItem SVCConMen;
    @FXML
    private MenuItem RLAConMen;
    @FXML
    private MenuItem ETConMen;
    
    
    @FXML
    private void initialize() {
    	this.gcPlayer = new GamePlayer(CharacterDetailManager.getInstance());
    	try {
        	CxName.setText(gcPlayer.getPlayerName());
            ChosenJobClass.setText(gcPlayer.getPlayerJobName());
            JobLvl.setText(String.valueOf(gcPlayer.getPlayerJob().getDLevel()));
            Runes.setText(Integer.toString(gcPlayer.getRunes()));
        } catch (Exception e) {
            e.printStackTrace(); // This will print the full stack trace to the standard error stream (usually console)
        }
    	
    }

    /**
     * Initializes the data displayed on the Game Lobby screen.
     */

    /**
     * Switches to the Shop screen.
     *
     * @throws IOException If an error occurs while switching to the Shop screen.
     */
    @FXML
    private void switchToShop() throws IOException {
        Driver.setRoot("Shop");
    }

    /**
     * Switches to the Title Screen.
     *
     * @throws IOException If an error occurs while switching to the Title Screen.
     */
    @FXML
    private void switchToTitleScreen() throws IOException {
        Driver.setRoot("TitleScreen");
    }
    
    @FXML
    private void switchToCharacterLevelUp() throws IOException {
        Driver.setRoot("LevelUp");
    }
   
    @FXML
    private void switchToStormVeilCastle(ActionEvent event) throws IOException {
    	Driver.setRoot("SVCfirstFloor");
    }

//    @FXML
//    private void switchToRayaLucariaAcademy(ActionEvent event) throws IOException {
//    	Driver.setRoot("RayaLucaria");
//    }
//
//    @FXML
//    private void switchToEldenThrone(ActionEvent event) throws IOException{
//    	Driver.setRoot("EldenThrone");
//    }
    
}
