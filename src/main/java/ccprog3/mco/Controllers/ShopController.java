package ccprog3.mco.Controllers;

import java.io.IOException;

import ccprog3.mco.Driver;
import ccprog3.mco.Model.Player.GamePlayer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ShopController {

	private GamePlayer scPlayer;
	
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
		
	}

	@FXML
	private void switchToGameLobby() throws IOException {
		Driver.setRoot("GameLobby");
	}



}
