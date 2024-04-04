package ccprog3.mco.Model.JobModel;

public class JobDatabase extends JobTemplate{

    protected JobDatabase(String strJobName, int dLevel, int dHP, int dDex, int dInt, int dEnd, int dStr, int dFth) {
        super(strJobName, dLevel, dHP, dDex, dInt, dEnd, dStr, dFth);
    }

    protected JobDatabase() {
    }

      /**
    * Represents an array of pre-defined Job objects.
    * Each element in the array represents a specific job with its attributes.
    * The array is initialized with the following jobs:
    * - Vagabond: A job with high dexterity and strength.
    * - Samurai: A job with high hit points and dexterity.
    * - Warrior: A job with high endurance and strength.
    * - Hero: A job with high strength and faith.
    * - Astrologer: A job with high intelligence and endurance.
    * - Prophet: A job with high faith and strength.
    */

    protected static final JobDatabase[] arrJobList = { 
        new JobDatabase("", 0, 0, 0, 0, 0, 0, 0),
        new JobDatabase("Vagabond", 9, 15, 13, 9, 11, 14, 9),
        new JobDatabase("Samurai", 9, 12, 15, 9, 13, 12, 8),
        new JobDatabase("Warrior", 8, 11, 16, 10, 11, 10, 8),
        new JobDatabase("Hero", 7, 14, 9, 7, 12, 16, 8),
        new JobDatabase("Astrologer", 6, 9, 12, 16, 9, 8, 7),
        new JobDatabase("Prophet", 7, 10, 10, 7, 8, 11, 16),
    }; 

    /**
    * Retrieves the array of pre-defined Job objects.
    *
    * @return An array containing pre-defined Job objects representing different jobs in the game.
    */
    
    public JobDatabase[] getJobList() {
        return arrJobList;
    }

    public JobDatabase getSpecificJobClassbyIndex(int dIndex) {
        if (dIndex >= 1 && dIndex < arrJobList.length) {
            return arrJobList[dIndex];
        } else {
            System.out.println("Not Found");
            return null; 
        }
    }

    public JobDatabase initialJob() {
        return arrJobList[0];
    }
    

    public static String[] getJobNames() {
        String[] jobNames = new String[arrJobList.length];
        for (int i = 1; i < arrJobList.length; i++) {
            jobNames[i] = arrJobList[i].getStrJobName();
        }
        return jobNames;
    }

    public String arrJobListToStringPrint() {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 1; i < arrJobList.length; i++) {
            JobTemplate job = arrJobList[i];
            strBuilder.append("\n").append(i + ". Job Class: ").append(job.getStrJobName()).append("\n")
                        .append("Level: ").append(job.getDLevel()).append("\n")
                        .append("Health Points: ").append(job.getDHP()).append("\n")
                        .append("Dexterity: ").append(job.getDDex()).append("\n")
                        .append("Intelligence: ").append(job.getDInt()).append("\n")
                        .append("Endurance: ").append(job.getDEnd()).append("\n")
                        .append("Strength: ").append(job.getDStr()).append("\n")
                        .append("Faith ").append(job.getDFth()).append("\n");
        }
        return strBuilder.toString();
    }

    /**
     * Retrieves the name of the job at the specified index.
     *
     * @param dIndex The index of the job.
     * @return The name of the job, or "Not Found" if the index is out of range.
     */
    public String getJobName(int dIndex) {
        if (dIndex >= 0 && dIndex < arrJobList.length) {
            return arrJobList[dIndex].getStrJobName();
        } else {
            return "Not Found"; 
        }
    }

     /**
     * Retrieves the level of the job at the specified index.
     *
     * @param dIndex The index of the job.
     * @return The level of the job, or -1 if the index is out of range.
     */
    public int getJobLevel(int dIndex) {
        if (dIndex >= 1 && dIndex < arrJobList.length) {
            return arrJobList[dIndex].getDLevel();
        } else {
            System.out.println("Not Found");
            return -1; 
        }
    }

    /**
     * Retrieves the hit points of the job at the specified index.
     *
     * @param dIndex The index of the job.
     * @return The hit points of the job, or -1 if the index is out of range.
     */
    public int getJobHP(int dIndex) {
        if (dIndex >= 1 && dIndex < arrJobList.length) {
            return arrJobList[dIndex].getDHP();
        } else {
            System.out.println("Not Found");
            return -1;
        }
    }

    /**
     * Retrieves the dexterity of the job at the specified index.
     *
     * @param dIndex The index of the job.
     * @return The dexterity of the job, or -1 if the index is out of range.
     */
    public int getJobDex(int dIndex) {
        if (dIndex >= 1 && dIndex < arrJobList.length) {
            return arrJobList[dIndex].getDDex();
        } else {
            System.out.println("Not Found");
            return -1;
        }
    }

    public int getJobInt(int dIndex) {
        if (dIndex >= 1 && dIndex < arrJobList.length) {
            return arrJobList[dIndex].getDInt();
        } else {
            System.out.println("Not Found");
            return -1;
        }
    }

    /**
     * Retrieves the endurance of the job at the specified index.
     *
     * @param dIndex The index of the job.
     * @return The endurance of the job, or -1 if the index is out of range.
     */
    public int getJobEnd(int dIndex) {
        if (dIndex >= 1 && dIndex < arrJobList.length) {
            return arrJobList[dIndex].getDEnd();
        } else {
            System.out.println("Not Found");
            return -1;
        }
    }

    /**
     * Retrieves the strength of the job at the specified index.
     *
     * @param dIndex The index of the job.
     * @return The strength of the job, or -1 if the index is out of range.
     */
    public int getJobStr(int dIndex) {
        if (dIndex >= 1 && dIndex < arrJobList.length) {
            return arrJobList[dIndex].getDStr();
        } else {
            System.out.println("Not Found");
            return -1;
        }
    }

    /**
     * Retrieves the faith of the job at the specified index.
     *
     * @param dIndex The index of the job.
     * @return The faith of the job, or -1 if the index is out of range.
     */
    public int getJobFth(int dIndex) {
        if (dIndex >= 1 && dIndex < arrJobList.length) {
            return arrJobList[dIndex].getDFth();
        } else {
            System.out.println("Not Found");
            return -1;
        }
    }
    
}
