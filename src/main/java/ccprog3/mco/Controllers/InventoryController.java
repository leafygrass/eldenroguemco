package ccprog3.mco.Controllers;

import ccprog3.mco.Model.Player.GamePlayer;
import javafx.fxml.FXML;

public class InventoryController {
	
	private GamePlayer icPlayer;
	
	@FXML
	private void initializer() {
		this.icPlayer = new GamePlayer (CharacterDetailManager.getInstance());
	}

}
