/**
 * 
 * @author
 *
 */
public class MagicWand {

	/**
	 * This is the no argument constructor
	 * When a Wand is created using this constructor it has
	 * 2000 max magic points
	 * 2000 current magic points
	 * a brand name of "Ollivander"
	 * a magic core of "Dragon heartstring"
	 * 
	 */
	public MagicWand(){
		
	}
	
	/**
	 * This is the 2 argument constructor
	 * When a Wand is created using this constructor it has
	 * a magic core of "Unicorn tail hair"
	 * and the following parameters
	 * @param maxMagicPoints the number of magic points
	 * @param theBrandName the brand name of the wand
	 * 
	 * It also has a full charge of magic points
	 * 
	 * GOTCHAS.  If the maxMagicPoints is negative, set the limit to 0
	 */
	public MagicWand(int maxMagicPoints, String theBrandName){
		
	}
	
	/**
	 * This method should return the number of magic points left 
	 * 
	 * @return the number of magic points left
	 */
	public int getCurrentMagicCharge() {
		return -1;
	}

	/**
	 * The method should return the brand name of the wand
	 * 
	 * @return the brand name of the wand
	 */
	public String getBrandName() {
		return "Nothing";
	}

	/**
	 * This method should return the type of magic core in the wand
	 * 
	 * @return the type of magic core in the wand
	 */
	public String getMagicCore() {
		return "Nothing";
	}

	/**
	 * This method should return true if the spell can be cast, false otherwise.
	 * It should also reduce the charge of the wand by numSpellPoints if the spell can be cast
	 * 
	 * A spell can be cast is numSpellPoints <= the current amount of magic points the wand has 
	 * 
	 * @param numSpellPoints the number of points it costs to use the wand
	 * @return true if the spell is cast, false otherwise
	 * 
	 * GOTCHAS: if the numSpellPoints is negative, do not change the current number of points and just return false
	 */
	public boolean castSpell (int numSpellPoints){
		return true;
	}
	
	
	/**
	 * This method should set the number of current magic points to whatever max point value was given to the constructor
	 * 
	 */
	public void rechargeWand() {

	}
	


	/**
	 * @return true if the current wand has any magic points left, false otherwise
	 */
	public boolean hasCharge(){
		return false;
	}
	
	
}
