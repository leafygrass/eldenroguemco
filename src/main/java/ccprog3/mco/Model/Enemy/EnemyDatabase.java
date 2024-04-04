package ccprog3.mco.Model.Enemy;

import java.util.Random;

public class EnemyDatabase {
    private String enemyName = "";
    private double healthPoints = 0;
    private int enemyAttack = 0;
    private int minimumEnemyAttack = 0;
    private int maximumEnemyAttack = 0;
    private double physicalDefense = 0;
    private double sorceryDefense = 0;
    private double incantationDefense = 0;
    private Random random;
    private int currentArrayArea = 0;

    public EnemyDatabase() {
        this.random = new Random();
    }

    public void setCurrentArrayArea(int currentArrayArea) {
        this.currentArrayArea = currentArrayArea;
    }

    public int getArrayArea() {
        return currentArrayArea;
    }

    public int getminimumEnemyAttack() {
        return minimumEnemyAttack;
    }

    public int getmaximumEnemyAttack() {
        return maximumEnemyAttack;
    }

    public double getCurrentHealthPoints() {
        return healthPoints;
    }

    public void setCurrentHealthPoints(double currentHealthPoints) {
        this.healthPoints = currentHealthPoints;
    }

    private void initializeMob(String name, int minHealth, int maxHealth, int minAttack, int maxAttack,
                               double physicalDef, double sorceryDef, double incantationDef) {
        this.enemyName = name;
        this.healthPoints = random.nextInt(maxHealth - minHealth + 1) + minHealth;
        this.minimumEnemyAttack = minAttack;
        this.maximumEnemyAttack = maxAttack;
        this.enemyAttack = random.nextInt(maxAttack - minAttack + 1) + minAttack;
        this.physicalDefense = physicalDef;
        this.sorceryDefense = sorceryDef;
        this.incantationDefense = incantationDef;
        setCurrentHealthPoints(healthPoints);
    }

    private void initializeBoss(String name, int healthPoints, int minAttack, int maxAttack,
                                double physicalDef, double sorceryDef, double incantationDef) {
        this.enemyName = name;
        this.healthPoints = healthPoints;
        this.enemyAttack = random.nextInt(maxAttack - minAttack + 1) + minAttack;
        this.physicalDefense = physicalDef;
        this.sorceryDefense = sorceryDef;
        this.incantationDefense = incantationDef;
        setCurrentHealthPoints(healthPoints);
    }

    public void createGodrickSoldier() {
        initializeMob("Godrick Soldier", 20, 30, 70, 80, 0.20, 0.15, 0.10);
    }

    public void createGodrickArcher() {
        initializeMob("Godrick Archer", 25, 36, 110, 121, 0.50, 0.15, 0.20);
    }

    public void createGodrickKnight() {
        initializeMob("Godrick Knight", 70, 81, 120, 131, 0.25, 0.25, 0.25);
    }

    public void createLivingJar() {
        initializeMob("Living Jar", 20, 30, 70, 80, 0.20, 0.15, 0.10);
    }

    public void createGlinstoneSorcerer() {
        initializeMob("Glinstone Sorcerer", 25, 36, 110, 121, 0.50, 0.15, 0.20);
    }

    public void createBattlemage() {
        initializeMob("Battlemage", 70, 81, 120, 131, 0.25, 0.25, 0.25);
    }

    public void createGodrickTheGrafted() {
        initializeBoss("Godrick The Grafted", 200, 150, 300, 0.35, 0.20, 0.15);
    }

    public void createRennalaQueenOfTheFullMoon() {
        initializeBoss("Rennala, Queen of the Full Moon", 400, 200, 300, 0.15, 0.35, 0.25);
    }

    public void createTheEldenBeast() {
        initializeBoss("The Elden Beast", 800, 250, 500, 0.25, 0.50, 0.40);
    }

    public int getEnemyAttack() {
        return enemyAttack;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public double getPhysicalDefense() {
        return physicalDefense;
    }

    public double getSorceryDefense() {
        return sorceryDefense;
    }

    public double getIncantationDefense() {
        return incantationDefense;
    }

    public void createBossEnemy() {
        if (getArrayArea() == 0) {
            createGodrickTheGrafted();
        } else if (getArrayArea() == 1) {
            createRennalaQueenOfTheFullMoon();
        } else if (getArrayArea() == 2) {
            createTheEldenBeast();
        }
    }
}



