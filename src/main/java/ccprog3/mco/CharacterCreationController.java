		package ccprog3.mco;
		
		import java.io.IOException;
		
		import ccprog3.mco.Model.Player;
		import ccprog3.mco.Model.JobModel.JobDatabase;
		import javafx.fxml.FXML;
		import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
		import javafx.scene.control.Alert.AlertType;
		import javafx.scene.control.ChoiceBox;
		import javafx.scene.control.TextField;
		import javafx.scene.input.KeyEvent;
		
		public class CharacterCreationController {
		
		    private boolean nameInput = false;
		    private boolean classInput = true;
		    private boolean populated = false;
		    public Player cPlayer = new Player();
		    
		   
		    @FXML
		    private void switchToGameLobby() throws IOException {
		        if (nameInput && classInput) {
		        	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GameLobby.fxml"));
		        	Parent root = fxmlLoader.load();
		        	GameLobbyController gcl = fxmlLoader.getController();
		        	gcl.initializeData(cPlayer); // Call a method to initialize data in GameLobbyController
		        	Scene scene = SelectClass.getScene();
		        	scene.setRoot(root);
		        }
		        else if (!nameInput&& !classInput) {
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
		
		    @FXML
		    private void checkNameInput(KeyEvent event) {
		        String input = CheckName.getText();
		        if (input.length() < 1) {
		            nameInput = false;
		        } else {
		            nameInput = true;
		            if (input.length() > 25) input = input.substring(0, 25);
		        }
		        cPlayer.newPlayerName(input);
		    }
		    
		    
		}
