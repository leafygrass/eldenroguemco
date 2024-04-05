		package ccprog3.mco;
		
		import java.io.IOException;
import java.util.Optional;

import ccprog3.mco.Model.Player;
import ccprog3.mco.Model.Job.Job;
import javafx.fxml.FXML;
		import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
		import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
		import javafx.scene.input.KeyEvent;
		
		public class CharacterCreationController {
		
		    private boolean nameInput = false;
		    private boolean classInput = false;
		    private boolean populated = false;
		    public Player cPlayer = new Player();
		    
		   
		    
		    @FXML 
		    private void askConfirmation() throws IOException {
		    	Alert lastChance = new Alert(AlertType.CONFIRMATION);
		    	lastChance.setContentText("Are you sure? \nName: " + cPlayer.getPlayerName() + "\nJob: " + cPlayer.getPlayerJobName()); 	
		        Optional <ButtonType> result = lastChance.showAndWait();
		        if (result.isPresent() && result.get() == ButtonType.OK) {
		            switchToGameLobby();
		        }
		    }
		    
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
		    private Label JobStats;
		    
		    @FXML 
		    private void displayJobStats(int classIndex) {
		    	if (classIndex == 0) JobStats.setText("");
		    	else {
		    	String jobStats = cPlayer.getPlayerJob().arrJobListToStringPrintByIndex(classIndex);
		        JobStats.setText(jobStats);
		    }
		    }
		    
		
		    @FXML
		    private ChoiceBox<String> SelectClass; 
		    
		    @FXML
		    private void initialize() {
		        SelectClass.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
		            if (newValue != null && !newValue.isEmpty()) {
		                classInput = true;
		            } else {
		                classInput = false;
		            }
		        });
		    }
		
		    @FXML 
		    private void populateChoiceBox() {
		        if (!populated) {
		            SelectClass.getItems().addAll(Job.getJobNames());
		            SelectClass.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
		                if (newValue != null && !newValue.isEmpty()) {
		                    switch (newValue) {
		                        case "":
		                            cPlayer.newJobByIndex(0);
		                            displayJobStats(0);
		                            classInput = true;
		                            break;
		                        case "Vagabond":
		                            cPlayer.newJobByIndex(1);
		                            displayJobStats(1);
		                            classInput = true;
		                            break;
		                        case "Samurai":
		                            cPlayer.newJobByIndex(2);
		                            displayJobStats(2);
		                            classInput = true;
		                            break;
		                        case "Warrior":
		                            cPlayer.newJobByIndex(3);
		                            displayJobStats(3);
		                            classInput = true;
		                            break;
		                        case "Hero":
		                            cPlayer.newJobByIndex(4);
		                            displayJobStats(4);
		                            classInput = true;
		                            break;
		                        case "Astrologer":
		                            cPlayer.newJobByIndex(5);
		                            displayJobStats(5);
		                            classInput = true;
		                            break;
		                        case "Prophet":
		                            cPlayer.newJobByIndex(6);
		                            displayJobStats(6);
		                            classInput = true;
		                            break;
		                        default:
		                            // Handle unexpected value
		                    }
		                }
		            });

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
