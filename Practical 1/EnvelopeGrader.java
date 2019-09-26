/**
 * This is the code that I will used to grade your Envelope.java file
 *  
 * @author Dr. B.
 *
 */
public class EnvelopeGrader {

	public static void main(String[] args) {
		int points = 100;
		int deduction = 100/10;

		//Test the constructor
		Envelope blank15 = new Envelope();
		Envelope blank42 = new Envelope();
		String s = blank15.getAddress();
		int p = blank15.getPostage();
		if(s != null){
			System.err.println("When creating a new envelope the address should be null");
			points -= deduction;
		}
		if (p != 0){
			System.err.println("When creating a new envelope the postage should be 0");
			points -= deduction;
		}
		
		//Try changing the address
		String address1 = "351 W University Blvd";
		String address2 = "Outer Space by way of the Moon";
		Envelope a1 = new Envelope();
		Envelope a2 = new Envelope();
		a1.setAddress(address1);
		a2.setAddress(address2);
		String a1s = a1.getAddress();
		String a2s = a2.getAddress();
		if (!a1s.equals(address1) || !a2s.equals(address2)){
			System.err.println("The address is set and retreived incorrectly");
			points -= deduction*2;
		}
		

		int postage10 = 10;
		int postage15 = 15;
		Envelope e10 = new Envelope();
		Envelope e15 = new Envelope();
		e10.addPostage(postage10);
		e15.addPostage(postage15);
		int p10 = e10.getPostage(); 
		int p15 = e15.getPostage(); 
		if(p10 != postage10 || p15 != postage15){
			System.err.println("The postage is set and retreived incorrectly");
			points -= deduction*2;
		}

		e10.addPostage(-1*postage10);
		e15.addPostage(-1*postage15);
		p10 = e10.getPostage(); 
		p15 = e15.getPostage(); 
		if(p10 != postage10 || p15 != postage15){
			System.err.println("The postage method does not seem to correctly handle negative values");
			points -= deduction*2;
		}
		
		Envelope e3 = new Envelope();
		Envelope e4 = new Envelope();
		Envelope e5 = new Envelope();
		Envelope e6 = new Envelope();
		e3.setAddress("Cupboard under the stairs");
		e4.setAddress("Diagonal Alley");
		e3.addPostage(42);
		e4.addPostage(100);
		if(e3.canBeMailed() != true || e4.canBeMailed() != true || e5.canBeMailed() != false || e6.canBeMailed() != false){
			System.err.println("The can be mailed function does not seem to be working");
			points -= deduction*2;
		}
		
		
		
		
		System.out.println("Your graded percentage for this assignment is: " + points);
	}

}
