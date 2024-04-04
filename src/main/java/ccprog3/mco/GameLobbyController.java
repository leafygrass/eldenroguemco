package ccprog3.mco;

import ccprog3.mco.Model.Player;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GameLobbyController{
    
    @FXML 
    private Label CharacterName;
    
    private Player gcPlayer;

    public void initializeData(Player player) {
        this.gcPlayer = player;
        CharacterName.setText(gcPlayer.getPlayerName());
        System.out.print(gcPlayer.getPlayerName());
        // You can use gcPlayer here to initialize UI elements or perform other tasks
    }
    
    
    
}