package ccprog3.mco.Controllers;

import java.io.IOException;

import ccprog3.mco.Driver;
import ccprog3.mco.Model.Player.GamePlayer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class InventoryController {
	
	private GamePlayer icPlayer;
	
	@FXML
	private Label PlayerRunes;
	private void getPlayerRunes() {
		PlayerRunes.setText(Integer.toString(icPlayer.getRunes()));
	}
	
	@FXML 
	private Label PlayerDex;
	private void getPlayerDex() {
		PlayerDex.setText(Integer.toString(icPlayer.getPlayerJob().getDDex()));
	}
	
	@FXML
	private void initialize() {
		this.icPlayer = new GamePlayer (CharacterDetailManager.getInstance());
		getPlayerRunes();
		getPlayerDex();
		PlayerRunes.setText(Integer.toString(icPlayer.getRunes()));
		PlayerDex.setText(Integer.toString(icPlayer.getPlayerJob().getDDex()));
	}
	
	 @FXML
	 private void switchToGameLobby() throws IOException {
		 CharacterDetailManager.getInstance().updatePlayerDetails(icPlayer);
	     Driver.setRoot("GameLobby");
	    }

}
