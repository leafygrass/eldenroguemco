package ccprog3.mco.Model;

import ccprog3.mco.Model.JobModel.Job;
import ccprog3.mco.Model.JobModel.JobDatabase;

public class Player {

    private int dRunes;
    private String strName = "";
    private Job cJob;
    private JobDatabase cJobList;

    public Player(){
        this.strName = "";
        this.dRunes = 0;
        this.cJob = new Job(cJobList);
        this.cJob.initialJob();
     }



    /**
     * Sets the name of the player.
     * 
     * @param strNewName The new name of the player.
     */
    public void setPlayerName(String strNewName) {
        this.strName = strNewName;
    }

    /**
     * Retrieves the name of the player.
     * 
     * @return The name of the player.
     */
    public String getPlayerName() {
        return this.strName;
    }

    /**
     * Retrieves the name of the player's job.
     * 
     * @return The name of the player's job.
     */
    public String getPlayerJobName() {
        return cJob.getStrJobName();
    }

    public Job getPlayerJob() {
        return this.cJob;
    }


}
