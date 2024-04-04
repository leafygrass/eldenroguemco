package ccprog3.mco.Model.Enemy;

import java.util.Random;

public class EnemyDatabase extends EnemyTemplate {

    public EnemyDatabase(int enemyHP, int enemyATK, double enemyphysDEF, double enemysrcDEF, double enemyincDEF, String enemyName) {
        super(enemyHP, enemyATK, enemyphysDEF, enemysrcDEF, enemyincDEF, enemyName);
    }

    /**
     * This method generates an enemy based on certain conditions such as <br>
     * the area index and its randomized type.
     *
     * @param areaIndex The current area index
     * @return The generated enemy
     */
    public EnemyTemplate generateEnemy(int areaIndex) {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;

        if (randomNumber == 1) {
            int ENEMY_HEALTH = random.nextInt(11) + 20;
            int ENEMY_ATTACK = random.nextInt(11) + 70;
            setEnemyStats(ENEMY_HEALTH, ENEMY_ATTACK, 0.20, 0.15, 0.10);

            if (areaIndex == 1) {
                setEnemyName("Godrick Soldier");
            } 
        } else if (randomNumber == 2) {
            int ENEMY_HEALTH = random.nextInt(11) + 25;
            int ENEMY_ATTACK = random.nextInt(11) + 110;
            setEnemyStats(ENEMY_HEALTH, ENEMY_ATTACK, 0.50, 0.15, 0.20);
            if (areaIndex == 1) {
                setEnemyName("Godrick Archer");
            } 
        } else if (randomNumber == 3) {
            int ENEMY_HEALTH = random.nextInt(11) + 70;
            int ENEMY_ATTACK = random.nextInt(11) + 120;
            setEnemyStats(ENEMY_HEALTH, ENEMY_ATTACK, 0.25, 0.25, 0.20);

            if (areaIndex == 1) {
                setEnemyName("Godrick Knight");
            } 
        }

        return new EnemyTemplate(getEnemyHP(), getEnemyATK(), getEnemyPhysDEF(), getEnemySRCDEF(), getEnemyIncDEF(), getEnemyName());
    }

    /**
     * This method is used to generate a boss enemy based on the area index.
     *
     * @param areaIndex Current area index
     * @return The generated boss enemy
     */
    public EnemyTemplate generateBoss(int areaIndex) {
        Random random = new Random();
        int ENEMY_ATTACK;

        if (areaIndex == 1) {
            ENEMY_ATTACK = random.nextInt(151) + 150;
            setEnemyStats(200, ENEMY_ATTACK, 0.35, 0.20, 0.15);
            setEnemyName("Godrick the Grafted");
        } else if (areaIndex == 2) {
            ENEMY_ATTACK = random.nextInt(101) + 200;
            setEnemyStats(400, ENEMY_ATTACK, 0.15, 0.35, 0.25);
            setEnemyName("Rennala, Queen of the Moon");
        } else if (areaIndex == 3) {
            ENEMY_ATTACK = random.nextInt(251) + 250;
            setEnemyStats(800, ENEMY_ATTACK, 0.25, 0.50, 0.40);
            setEnemyName("The Elden Beast");
        }

        return new EnemyTemplate(getEnemyHP(), getEnemyATK(), getEnemyPhysDEF(), getEnemySRCDEF(), getEnemyIncDEF(), getEnemyName());
    }

    private void setEnemyStats(int enemyHP, int enemyATK, double enemyphysDEF, double enemysrcDEF, double enemyincDEF) {
        setEnemyHP(enemyHP);
        setEnemyATK(enemyATK);
        setEnemyPhysDEF(enemyphysDEF);
        setEnemySrcDEF(enemysrcDEF);
        setEnemyIncDEF(enemyincDEF);
    }
}


