package ccprog3.mco.Model;

import ccprog3.mco.Model.Job.Job;

public class Player {

    private int dRunes;
    private String strName;
    private Job cJob;

    public Player(){
        this.strName = "";
        this.dRunes = 0;
        this.cJob = new Job("", 0, 0, 0, 0, 0, 0, 0);
        this.cJob.initialJob();
     }

    public void newPlayerName(String strNewName) {
    	setStrName(strNewName);
    }
    
    public void newJob (Job cJob) {
    	setcJob(cJob);
    }
    
    public int getRunes() {
    	return this.dRunes;
    }
    
    public void newJobByIndex (int index) {
    	if (index == 0 ) newJob(cJob.getSpecificJobClassbyIndex(0));
    	else if (index == 1) newJob(cJob.getSpecificJobClassbyIndex(1));
    	else if (index == 2 )newJob(cJob.getSpecificJobClassbyIndex(2));
    	else if (index == 3 )newJob(cJob.getSpecificJobClassbyIndex(3));
    	else if (index == 4)newJob(cJob.getSpecificJobClassbyIndex(4));
    	else if (index == 5)newJob(cJob.getSpecificJobClassbyIndex(5));
    	else if (index == 6)newJob(cJob.getSpecificJobClassbyIndex(6));
    }
    
    public void setRunes (int dRunes) {
    	setdRunes(dRunes);
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

    /**
     * Retrieves the name of the player's job.
     * 
     * @return The name of the player's job.
     */
    public Job getPlayerJob() {
        return this.cJob;
    }

	private void setdRunes(int dRunes) {
		this.dRunes = dRunes;
	}

	private void setStrName(String strName) {
		this.strName = strName;
	}

	private void setcJob(Job cJob) {
		this.cJob = cJob;
	}


}
