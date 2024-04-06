package ccprog3.mco.Model.Weapon;
import ccprog3.mco.Model.Job.JobWeaponTemplate;

public class Weapon extends JobWeaponTemplate{
	
	private String strWeaponName;
    private int runeCost;
    private int dDex;
    private int dHP;
    private int dEnd;
    private int dStr;
    private int dInt;
    private int dFth;
	
	
	public Weapon (String strWeaponName, int runeCost, int dDex, int dHP, int dEnd, int dStr, int dInt, int dFth) {
        super(strWeaponName, runeCost, dDex, dHP, dEnd, dStr, dInt, dFth);
    }
	
	public Weapon() {
		this.strWeaponName="";
		this.runeCost=0;
		this.dDex=0;
		this.dHP=0;
		this.dEnd=0;
		this.dStr=0;
		this.dInt=0;
		this.dFth=0;
	}
	
	protected static final Weapon[] arrWeaponSwordList = {
			new Weapon ("Short Sword", 1000, 13, 0, 15, 15,15,15),
			new Weapon ("Rogier's Rapier", 2000, 18, 10, 35, 25, 35,35),
			new Weapon ("Coded Sword", 4000, 21, 20, 40, 35,40, 40),
			new Weapon ("Sword of Night and Flame", 8000, 0, 0, 15, 15,15,15),
	    };
	
	protected static final Weapon[] arrWeaponKatanaList = {
		    new Weapon("Uchigatana", 1875, 15, 20, 35, 30, 0, 0),
		    new Weapon("Moonveil", 3750, 20, 30, 40, 45, 0, 0),
		    new Weapon("Rivers of Blood", 7500, 25, 40, 45, 60, 0, 0),
		    new Weapon("Hand of Malenia", 15000, 30, 50, 50, 75, 15, 15)
		};

	protected static final Weapon[] arrWeaponWhipsList = {
		    new Weapon("Whip", 1500, 20, 15, 60, 20, 0, 0),
		    new Weapon("Urumi", 3000, 25, 0, 15, 15, 15, 15),
		    new Weapon("Thorned Whip", 5000, 30, 30, 80, 50, 0, 40),
		    new Weapon("Hoslow's Petal Whip", 10000, 35, 35, 90, 55, 20, 20)
		};

	protected static final Weapon[] arrWeaponGreatswordList = {
		    new Weapon("Claymore", 3000, 9, 15, 10, 20, 0, 0),
		    new Weapon("Starscourge Greatsword", 6000, 14, 20, 15, 40, 0, 20),
		    new Weapon("Inseparable Sword", 12000, 19, 25, 20, 70, 60, 60),
		    new Weapon("Maliketh's Black Blade", 24000, 24, 30, 25, 80, 40, 60)
		};

	protected static final Weapon[] arrWeaponStavesList = {
		    new Weapon("Astrologer's Staff", 2000, 12, 5, 20, 5, 25, 15),
		    new Weapon("Albinauric Staff", 4000, 14, 10, 30, 10, 45, 35),
		    new Weapon("Staff of the Guilty", 8000, 16, 15, 40, 15, 65, 60),
		    new Weapon("Carian Regal Scepter", 16000, 18, 20, 50, 20, 85, 75)
		};

	protected static final Weapon[] arrWeaponSealsList = {
		    new Weapon("Finger Seal", 2500, 10, 10, 45, 0, 15, 20),
		    new Weapon("Godslayer's Seal", 5000, 12, 15, 50, 0, 35, 40),
		    new Weapon("Golden Order Seal", 10000, 14, 20, 55, 0, 65, 65),
		    new Weapon("Dragon Communion Seal", 15000, 18, 25, 60, 0, 75, 80)
		};
}
