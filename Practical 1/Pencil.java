/**
 * 
 * @author
 *
 */
public class Pencil {
	
	/**
	 * This is the no argument constructor
	 * When a pencil is constructed with this constructor it should have
	 * a full eraser (that is able to erase 150 characters)
	 * It cannot write any characters.  Note: once the pencil is
	 * sharpened it can write up to 25 characters until it needs to be sharpened again
	 * 
	 */
	public Pencil(){

	}
	
	/**
	 * This is the 2 argument constructor
	 * @param eraserCapacity, The number of characters the eraser can erase until empty
	 * @param numOfCharactersUntilSharpenedAgain, The number of characters the pencil can write until dull
	 * 
	 * GOTCHAS: Don't allow negative eraserCapacity, set eraser capacity to 0
	 * GOTCHAS: Don't allow negative sharpness,      set sharpness to 0
	 */
	public Pencil(int eraserCapacity, int numOfCharactersUntilSharpenedAgain){

	}

	/**
	 * Replaces the eraser with a new one.
	 * 
	 * @param newEraserCapacity
	 * 
	 * GOTCHAS: Don't allow negative newEraserCapacity, set eraser capacity to 0
	 */
	public void setOrReplaceEraser(int newEraserCapacity){

	}

	/**
	 * @return the number of characters the eraser can currently erase
	 */
	public int getEraserCapacity(){
		return -1;
	}

	/**
	 * @return the number of characters the pencil can still write until dull
	 */
	public int getNumOfCharsUntilPencilIsDull(){
		return -1;
	}

	/**
	 * This method should allow (set) the pencil to write 45 characters
	 */
	public void sharpenPencil(){

	}
	
	/**
	 * @return true if the pencil can still write characters, false otherwise
	 */
	public boolean canStillWrite(){
		return false;
	}
	
	/**
	 * @return true if the eraser can still erase characters, false otherwise
	 */
	public boolean canStillErase(){
		return false;
	}

	/**
	 * This method writes a character. (Don't worry about which character, or how)
	 * After the method is called, the pencil can write 1 fewer characters, but not less than 0 total
	 * 
	 * @return true if the pencil was able to write, false otherwise
	 */
	public boolean usePencilToWriteACharacter(){
		return false;
	}

	/**
	 * This method erases a character. (Don't worry about which character or how)
	 * After the method is called, the pencil can erase 1 fewer characters, but not less than 0
	 * 
	 * @return true if the pencil was able to erase, false otherwise
	 */
	public boolean usePencilToEraseACharacter(){
		return false;
	}
	
}
