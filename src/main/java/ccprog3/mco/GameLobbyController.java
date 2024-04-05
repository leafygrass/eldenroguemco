package ccprog3.mco;

import ccprog3.mco.Model.Player;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GameLobbyController{
    
    @FXML 
    private Label CharacterName;
    @FXML 
    private Label ChosenJobClass;
    @FXML 
    private Label JobLvl;
    @FXML 
    private Label Runes;
    
    
    private Player gcPlayer;

    public void initializeData(Player player) {
        this.gcPlayer = player;
        CharacterName.setText(gcPlayer.getPlayerName());
    }
    
    
    
}