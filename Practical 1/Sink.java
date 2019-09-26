/**
 * 
 * @author 
 *
 */
public class Sink {

	/**
	 * This is the no argument constructor.
	 * When an sink is created using this constructor it has no water in it
	 * and a brand name of Barker
	 * and a max water volume limit of 100 liters 
	 * 
	 */
	public Sink(){

	}
	
	/**
	 * This is the 2 argument constructor.
	 * When an sink is created using this constructor it has no water in it
	 * and a brand name of brandName (the parameter)
	 * and a max water volume of volumnLimit (the parameter)

	 * @param brandName, the name used for the brand
	 * @param volumeLimit, the volume Limit for the sink
	 * 
	 * GOTCHAS.  If the volumeLimit is negative, set the limit to 0
	 */
	public Sink(String brandName, int volumeLimit){

	}
	
	/**
	 * Sets (changes) the brand name of the sink
	 * @param name
	 * 
	 */
	public void setBrandName(String name){

	}

	/**
	 * 
	 * @returns the current brand name of the sink
	 *
	 */
	public String getBrandName(){
		return "There is no brand name";
	}

	
	/**
	 * 
	 * Changes (sets) the max volume limit
	 * 
	 * @param maxVolume is the new max volume for the sink
	 * 
	 * GOTCHAS:  Only set the max volume to the new value if the new value is positive
	 */
	public void setMaxWaterVolume(int maxVolume){

	}
	
	/**
	 * 
	 * @return the current max water volume
	 */
	public int getMaxWaterVolume(){
		return -456;
	}
	
	
	/**
	 * 
	 * @return The current volume of water in the sink
	 */
	public int getCurrentVolumnOfWaterInSink(){
		return -543;
	}

	
	/**
	 * adds more water (liters) into the sink 
	 * @param liter is the amount of extra water added
	 * 
	 * Gotchas:  Only add liter if the value given is positive, otherwise do not change the water level in the sink
	 * 
	 */
	public void addWater(int liter){

	}
	

	/**
	 * drains / removes water (liters) from the sink 
	 * @param liter is the amount of water to be drained / removed
	 * 
	 * Gotchas:  Only drain liter if the value given is positive, otherwise do not change the water level in the sink
	 * Gotchas:  Do not let the water level go negative, just put it to 0 if it does
	 * 
	 */
	public void drainWater(int liter){

	}

	

	/**
	 * 
	 * @return true if there is too much water in the sink, false otherwise  
	 */
	public boolean isOverFlowing(){
		return false;
	}

	
		
	
}
