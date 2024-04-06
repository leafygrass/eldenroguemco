package ccprog3.mco.Controllers;
import java.io.IOException;
import ccprog3.mco.Driver;
import ccprog3.mco.Model.Player.*;
import javafx.fxml.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CharacterLevelUpController {
	
	private GamePlayer clPlayer;
    private CharacterDetailManager cPlayerDetails;
    
    @FXML 
    private Label playerRunes;
    

	@FXML
	public void initialize() {
		this.clPlayer = new GamePlayer(CharacterDetailManager.getInstance());
		playerRunes.setText(Integer.toString(clPlayer.getRunes()));
		
	}
	
	@FXML 
	private Button GLButton;
	
	public void switchToGameLobby() throws IOException {
		Driver.setRoot("GameLobby");
	}
	
	
	
}
