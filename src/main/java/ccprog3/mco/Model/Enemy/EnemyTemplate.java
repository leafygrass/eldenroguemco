package ccprog3.mco.Model.Enemy;

public class EnemyTemplate {
    protected String enemyName;
    protected int enemyHP;
    protected int enemyATK;
    protected double enemyphysDEF;
    protected double enemysrcDEF;
    protected double enemyincDEF;

    public EnemyTemplate(int enemyHP, int enemyATK, double enemyphysDEF, double enemysrcDEF, double enemyincDEF, String enemyName) {
    this.enemyHP = enemyHP;
    this.enemyATK = enemyATK;
    this.enemyphysDEF = enemyphysDEF;
    this.enemysrcDEF = enemysrcDEF;
    this.enemyincDEF = enemyincDEF;
    this.enemyName = enemyName;
    }
    
    public void setEnemyName (String enemyName) {
        this.enemyName = enemyName;
    }

    public String getEnemyName () {
        return enemyName;
    }

    public int getEnemyHP () {
        return enemyHP;
    }

    public int getEnemyATK () {
        return enemyATK;
    }

    public double getEnemyPhysDEF () {
        return enemyphysDEF;
    }

    public double getEnemySRCDEF () {
        return enemysrcDEF;
    }

    public double getEnemyIncDEF () {
        return enemyincDEF;
    }

    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }

    public void setEnemyATK(int enemyATK) {
        this.enemyATK = enemyATK;
    }

    public void setEnemyPhysDEF(double enemyphysDEF) {
        this.enemyphysDEF = enemyphysDEF;
    }

    public void setEnemySrcDEF(double enemysrcDEF) {
        this.enemysrcDEF = enemysrcDEF;
    }

    public void setEnemyIncDEF(double enemyincDEF) {
        this.enemyincDEF = enemyincDEF;
    }
}

