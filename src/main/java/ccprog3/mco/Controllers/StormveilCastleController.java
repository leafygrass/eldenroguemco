package ccprog3.mco.Controllers;

import ccprog3.mco.Model.Player.GamePlayer;
import javafx.fxml.FXML;

public class StormveilCastleController {
	
	private GamePlayer SVCplayer;
	
	@FXML
	private void initialize() {
		this.SVCplayer = new GamePlayer(CharacterDetailManager.getInstance());
	}

}
