package ccprog3.mco.Controllers;

import ccprog3.mco.Model.Player.GamePlayer;
import javafx.fxml.FXML;

public class RayaLucariaController {
	
private GamePlayer rlPlayer;
	
	@FXML
	private void initializer() {
		this.rlPlayer = new GamePlayer (CharacterDetailManager.getInstance());
	}

}
