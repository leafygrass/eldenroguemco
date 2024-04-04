package ccprog3.mco;

import java.io.IOException;

import ccprog3.mco.Model.Player;
import ccprog3.mco.Model.JobModel.JobDatabase;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class CharacterCreationController {

    private boolean nameInput = false;
    private boolean classInput = false;
    private boolean populated = false;

    private Player cPlayer = new Player(); 

    @FXML
    private void switchToGameLobby() throws IOException {
        if (nameInput == true && classInput == true) Driver.setRoot("GameLobby");
        else if (nameInput == false || classInput ==false) {
            Alert errorAlert = new Alert(AlertType.ERROR);
                errorAlert.setHeaderText("Input not valid");
                errorAlert.setContentText("No Name and Class Selected");
                errorAlert.showAndWait();
        }
        else if (nameInput == false) {
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
    private void switchToTitleScreen() throws IOException {
        Driver.setRoot("TitleScreen");
    }

    @FXML
    private ChoiceBox<String> SelectClass; 

    @FXML 
    private void populateChoiceBox(){
        if (populated == false) {
            SelectClass.getItems().addAll(JobDatabase.getJobNames());
            populated = true;
        } 
    }

    @FXML
    private TextField CheckName;


    // @FXML
    // private void checkNameInput() {
    //     if if (strNewName.length() >= 25 || strNewName.length() <=1 ) {} 
        
    // }
    
}
