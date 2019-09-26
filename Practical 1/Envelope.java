/**
 * 
 * @author 
 *
 */
public class Envelope {

	/**
	 * This is the constructor.
	 * When an envelope is created it has a postage value of 0
	 * and an address value of null
	 * 
	 */
	public Envelope(){
		
	}
	
	
	/**
	 * Sets (changes) the address on the envelope
	 * @param address
	 * 
	 */
	public void setAddress(String address){
		
	}

	/**
	 * 
	 * @returns the current address on the envelope
	 * or null if there is no current address
	 */
	public String getAddress(){
		return "lmnop";
	}
	
	
	/**
	 * adds postage (stamps) to the envelope 
	 * @param postage is the amount of postage added
	 * (the value of the stamp)
	 * 
	 * Gotchas:  Only add postage if the value given is positive
	 * 
	 */
	public void addPostage(int postage){
		
	}
	
	/**
	 * 
	 * @return The total postage currently on the envelope
	 */
	public int getPostage(){
		return -1;
	}

	

	/**
	 * An envelope can be mailed if the following conditions are satisfied
	 * There is at least 42 (cents) postage on the envelope
	 * The address is not ""
	 * If these 2 conditions are satisfied the method should return true
	 * Otherwise the method should return false
	 * 
	 * @return true or false based on the above requirements  
	 */
	public boolean canBeMailed(){
		return false;
	}

	
		
	
}
