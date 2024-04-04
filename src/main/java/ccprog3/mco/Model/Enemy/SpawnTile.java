package ccprog3.mco.Model.Enemy;

import java.util.Random;

public class SpawnTile {
    private final Random random;

    public SpawnTile() {
        this.random = new Random();
    }

    public boolean hasTreasure() {
        int rngTreasureOrEnemy = random.nextInt(100) + 1;
        return rngTreasureOrEnemy >= 1 && rngTreasureOrEnemy <= 25;
        // if true, add certain number of runes to player inventory
    }
}

