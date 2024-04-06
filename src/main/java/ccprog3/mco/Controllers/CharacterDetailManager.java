package ccprog3.mco.Controllers;

import ccprog3.mco.Model.Player.GamePlayer;

public class CharacterDetailManager {
	private GamePlayer cdPlayer;

	private static CharacterDetailManager instance;

	public CharacterDetailManager() {
		cdPlayer = new GamePlayer();
	}

    public static CharacterDetailManager getInstance() {
        if (instance == null) {
            instance = new CharacterDetailManager();
        }
        return instance;
    }


	public void updatePlayerDetails(GamePlayer player) {
		this.cdPlayer = player;

	}

	public GamePlayer getPlayerDetails() {
		return this.cdPlayer;
	}

}
