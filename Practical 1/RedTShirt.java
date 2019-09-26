/**
 * 
 * @author 
 *
 */
public class RedTShirt {

	/**
	 * This is the no argument constructor
	 * A RedTShirt created using this constructor should have the following traits:
	 * 
	 * It should be assigned to the student "Unknown Student"
	 * It should have a size of 20.  Let's pretend that number is inches
	 * It should be for a CSIS major, and not for a Non-major 
	 */
	public RedTShirt(){

	}

	/**
	 * This is the 2 argument constructor
	 * A RedTShirt created using this constructor should have the following traits:
	 * 
	 * It should be assigned to the student using the following parameter
	 * @param nameOfStudentTheShirtIsFor
	 * 
	 * It should have a size based on the following parameter
	 * @param size
	 * 
	 * It should be for a CSIS major, and not for a Non-major
	 * 
	 *  GOTCHAS:
	 *  Bad values for the name (i.e. null) should put a name of "Hacker"
	 *  Bad values for the size should assign values based on the following
	 *    Less than 10 should be assigned 10
	 *    More than 200 should be assigned 200
	 */
	public RedTShirt(String nameOfStudentTheShirtIsFor, int size){

	}

	/**
	 * This is the 2 argument constructor
	 * A RedTShirt created using this constructor should have the following traits:
	 * 
	 * It should be assigned to the student using the following parameter
	 * @param nameOfStudentTheShirtIsFor
	 * 
	 * It should have a size based on the following parameter
	 * @param size
	 * 
	 * It should be for a CSIS major or a non majoy based on the following parameter
	 * @param isCSISMajor
	 * 
	 *  GOTCHAS:
	 *  Bad values for the name (i.e. null) should put a name of "Super Hacker"
	 *  Bad values for the size should assign values based on the following
	 *    Less than 10 should be assigned 10
	 *    More than 200 should be assigned 200
	 */
	public RedTShirt(String nameOfStudentTheShirtIsFor, int size, boolean isCSISMajor){

	}

	/**
	 * This method should 
	 * @return the name of the student this shirt is assigned to
	 */
	public String getNameOfStudent(){
		return null;
	}

	/**
	 * This method should change the name of the student this shirt is assigned to based on the following parameter
	 * @param studentName
	 * 
	 * GOTCHAS:
	 *  Bad values for the name (i.e. null) should put a name of "Dumbledore"
	 */
	public void setNameOfStudent(String studentName){

	}

	/**
	 * This method should return the current size of the shirt
	 * @return
	 */
	public int getSize(){
		return -1;
	}

	/**
	 * This method should 
	 * @return true if the student is a CSIS major or false if they are a non major
	 */
	public boolean isCSISMajor(){
		return Math.random()<0.5;
	}

	/**
	 * This method should remember that the student is now a non major
	 * 
	 * NOTE: This method may be called multiple times in a row.
	 */
	public void changeToNonMajor(){

	}

	/**
	 * This method should remember that the student is now a CSIS major
	 * 
	 * NOTE: This method may be called multiple times in a row.
	 */
	public void changeToCSISMajor(){

	}

}
