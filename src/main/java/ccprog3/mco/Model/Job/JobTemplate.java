package ccprog3.mco.Model.Job;

public abstract class JobTemplate {
    protected String strJobName = "";
    protected int dLevel;
    protected int dHP;
    protected int dDex;
    protected int dInt;
    protected int dEnd;
    protected int dStr;
    protected int dFth;

    /**
     * Constructs a Job object with the specified attributes.
     *
     * @param strJobName The name of the job.
     * @param dLevel     The level of the job.
     * @param dHP        The hit points of the job.
     * @param dDex       The dexterity of the job.
     * @param dEnd       The endurance of the job.
     * @param dStr       The strength of the job.
     * @param dFth       The faith of the job.
     */
    public JobTemplate(String strJobName, int dLevel, int dHP, int dDex, int dInt, int dEnd, int dStr, int dFth) {
        this.strJobName = strJobName;
        this.dLevel = dLevel;
        this.dHP = dHP;
        this.dDex = dDex;
        this.dInt = dInt;
        this.dEnd = dEnd;
        this.dStr = dStr;
        this.dFth = dFth;
    }

    protected JobTemplate () { //default constructor

    }

    /**
     * Retrieves the name of the job.
     *
     * @return The name of the job.
     */
    public String getStrJobName() {
        return this.strJobName;
    }

    /**
     * Retrieves the level of the job.
     *
     * @return The level of the job.
     */
    public int getDLevel() {
        return this.dLevel;
    }

    /**
     * Retrieves the hit points of the job.
     *
     * @return The hit points of the job.
     */
    public int getDHP() {
        return this.dHP;
    }

    /**
     * Retrieves the dexterity of the job.
     *
     * @return The dexterity of the job.
     */
    public int getDDex() {
        return this.dDex;
    }

    /**
     * Retrieves the intelligence of the job.
     *
     * @return The intelligence of the job.
     */
    public int getDInt() {
        return this.dInt;
    }

    /**
     * Retrieves the endurance of the job.
     *
     * @return The endurance of the job.
     */
    public int getDEnd() {
        return this.dEnd;
    }

    /**
     * Retrieves the strength of the job.
     *
     * @return The strength of the job.
     */
    public int getDStr() {
        return this.dStr;
    }

    /**
     * Retrieves the faith of the job.
     *
     * @return The faith of the job.
     */
    public int getDFth() {
        return this.dFth;
    }
}
