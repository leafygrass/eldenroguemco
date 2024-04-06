package ccprog3.mco.Model.Player;

import ccprog3.mco.Controllers.CharacterDetailManager;
import ccprog3.mco.Model.Job.Job;
import ccprog3.mco.Model.Weapon.Weapon;

public class GamePlayer {

    private int dRunes;
    private String strName;
    private Job cJob;
    private Weapon cWeapon;

    public GamePlayer(){
        this.strName = "";
        this.dRunes = 0;
        this.cJob = new Job("", 0, 0, 0, 0, 0, 0, 0);
        this.cWeapon = new Weapon("", 0, 0, 0, 0, 0, 0, 0);
     }

    public GamePlayer(CharacterDetailManager detail) {
    	this.strName = detail.getPlayerDetails().getPlayerName();
    	this.dRunes = detail.getPlayerDetails().getRunes();
    	this.cJob = detail.getPlayerDetails().getPlayerJob();
    }

    public void newPlayerName(String strNewName) {
    	setStrName(strNewName);
    }

    public void newJob (Job cJob) {
    	setcJob(cJob);
    }
    
    public void newWeapon (Weapon cWeapon) {
    	setcWeapon(cWeapon);
    }

    public int getRunes() {
    	return this.dRunes;
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
        return cJob.getStrJobWeaponName();
    }

    /**
     * Retrieves the name of the player's job.
     *
     * @return The name of the player's job.
     */
    public Job getPlayerJob() {
        return this.cJob;
    }
    
    
    public void newJobByIndex(int index) {
        switch(index) {
            case 0:
                newJob(cJob.getSpecificJobClassbyIndex(0));
                break;
            case 1:
                newJob(cJob.getSpecificJobClassbyIndex(1));
                break;
            case 2:
                newJob(cJob.getSpecificJobClassbyIndex(2));
                break;
            case 3:
                newJob(cJob.getSpecificJobClassbyIndex(3));
                break;
            case 4:
                newJob(cJob.getSpecificJobClassbyIndex(4));
                break;
            case 5:
                newJob(cJob.getSpecificJobClassbyIndex(5));
                break;
            case 6:
                newJob(cJob.getSpecificJobClassbyIndex(6));
                break;
            default:
                // Handle default case, if needed
                break;
        }
    }
    
    public void newWeaponSwordByIndex(int index) {
        switch(index) {
            case 0:
                newWeapon(cWeapon.getSpecificWeaponSwordbyIndex(0));
                break;
            case 1:
            	newWeapon(cWeapon.getSpecificWeaponSwordbyIndex(1));
                break;
            case 2:
            	newWeapon(cWeapon.getSpecificWeaponSwordbyIndex(2));
                break;
            case 3:
            	newWeapon(cWeapon.getSpecificWeaponSwordbyIndex(3));
                break;
            default:
                break;
        }
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
	
	private void setcWeapon(Weapon cWeap) {
		this.cWeapon = cWeap;
	}


}
