package ccprog3.mco.Model.Enemy;

import java.util.Random;

public class Enemy_RNG {
    private Random random;

    public Enemy_RNG() {
        this.random = new Random();
    }

    public void randomEnemy(EnemyDatabase enemyDatabase) {
        int randomEnemy = random.nextInt(3);
        if (randomEnemy == 0) {
            if (enemyDatabase.getArrayArea() == 0) {
                enemyDatabase.createGodrickSoldier();
            } else if (enemyDatabase.getArrayArea() == 1) {
                enemyDatabase.createLivingJar();
            } else if (enemyDatabase.getArrayArea() == 2) {
                randomEnemy = random.nextInt(2);
                if (randomEnemy == 0) {
                    enemyDatabase.createGodrickSoldier();
                } else if (randomEnemy == 1) {
                    enemyDatabase.createLivingJar();
                }
            }
        } else if (randomEnemy == 1) {
            if (enemyDatabase.getArrayArea() == 0) {
                enemyDatabase.createGodrickArcher();
            } else if (enemyDatabase.getArrayArea() == 1) {
                enemyDatabase.createGlinstoneSorcerer();
            } else if (enemyDatabase.getArrayArea() == 2) {
                randomEnemy = random.nextInt(2);
                if (randomEnemy == 0) {
                    enemyDatabase.createGodrickArcher();
                } else if (randomEnemy == 1) {
                    enemyDatabase.createGlinstoneSorcerer();
                }
            }
        } else if (randomEnemy == 2) {
            if (enemyDatabase.getArrayArea() == 0) {
                enemyDatabase.createGodrickSoldier();
            } else if (enemyDatabase.getArrayArea() == 1) {
                enemyDatabase.createBattlemage();
            } else if (enemyDatabase.getArrayArea() == 2) {
                randomEnemy = random.nextInt(2);
                if (randomEnemy == 0) {
                    enemyDatabase.createGodrickSoldier();
                } else if (randomEnemy == 1) {
                    enemyDatabase.createBattlemage();
                }
            }
        }
    }
}
