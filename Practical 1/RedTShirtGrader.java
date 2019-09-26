
/**
 * 
 * @author barkern
 *
 */
public class RedTShirtGrader {

	public static void main(String[] args) {
		int score = 100;
		int deduction = 100/9;

		try{
			//Default Constructor
			RedTShirt b = new RedTShirt();
			if(!"Unknown Student".equals(b.getNameOfStudent()) || b.getSize() != 20 || b.isCSISMajor() != true){
				System.out.println("Error with no argument constructor or getters.");
				System.out.println("\tA new shirt should have all 3 proper values");
				score -= deduction;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with no argument constructor or getters.");
			System.out.println("\tA new shirt should have all 3 proper values");
			score -= deduction;
		}

		try{
			//2 argument constructor
			for (int i = 0; i < 100; i++){
				String r1 = "Student_" + makeUpWord();
				int shirtSize = (int)((Math.random()*100)+20);

				RedTShirt b = new RedTShirt(r1, shirtSize);
				if(!r1.equals(b.getNameOfStudent()) || b.getSize() != shirtSize || b.isCSISMajor() != true){
					System.out.println("Error with 2 argument constructor or getters on good values.");
					System.out.println("\tA new shirt should have all 3 proper values");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with 2 argument constructor or getters on good values.");
			System.out.println("\tA new shirt should have all 3 proper values");
			score -= deduction;
		}

		try{
			//3 argument constructor
			for (int i = 0; i < 100; i++){
				String r1 = "Student_" + makeUpWord();
				int shirtSize = (int)((Math.random()*100)+20);
				boolean isACSISMajor = Math.random()>0.5;

				RedTShirt b = new RedTShirt(r1, shirtSize, isACSISMajor);
				if(!r1.equals(b.getNameOfStudent()) || b.getSize() != shirtSize || b.isCSISMajor() != isACSISMajor){
					System.out.println("Error with 3 argument constructor or getters on good values.");
					System.out.println("\tA new shirt should have all 3 proper values");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with 3 argument constructor or getters on good values.");
			System.out.println("\tA new shirt should have all 3 proper values");
			score -= deduction;
		}


		try{
			//bad values in 2 argument constructor
			for (int i = 0; i < 100; i++){
				String r1 = "Student_" + makeUpWord();
				String r2 = "Student_" + makeUpWord();
				int shirtSizeTooLow = -1*(int)((Math.random()*100)+20);
				int shirtSizeTooHigh = (int)((Math.random()*100)+201);

				RedTShirt b1 = new RedTShirt(r1, shirtSizeTooLow);
				RedTShirt b2 = new RedTShirt(r2, shirtSizeTooHigh);
				RedTShirt b3 = new RedTShirt(null, shirtSizeTooLow*-1);
				if(!r1.equals(b1.getNameOfStudent()) || b1.getSize() != 10 || b1.isCSISMajor() != true ||
						!r2.equals(b2.getNameOfStudent()) || b2.getSize() != 200 || b2.isCSISMajor() != true ||	
						!"Hacker".equals(b3.getNameOfStudent()) || b3.getSize() != shirtSizeTooLow*-1 || b3.isCSISMajor() != true
						){
					System.out.println("Error with 2 argument constructor or getters on BAD values.");
					System.out.println("\tA new shirt should have all 3 proper values, even given improper inputs");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with 2 argument constructor or getters on BAD values.");
			System.out.println("\tA new shirt should have all 3 proper values, even given improper inputs");
			score -= deduction;
		}

		try{
			//bad values in 3 argument constructor
			for (int i = 0; i < 100; i++){
				String r1 = "Student_" + makeUpWord();
				String r2 = "Student_" + makeUpWord();
				int shirtSizeTooLow = -1*(int)((Math.random()*100)+20);
				int shirtSizeTooHigh = (int)((Math.random()*100)+201);
				boolean isMajor1 = Math.random()>0.5;
				boolean isMajor2 = Math.random()>0.5;
				boolean isMajor3 = Math.random()>0.5;

				RedTShirt b1 = new RedTShirt(r1, shirtSizeTooLow, isMajor1);
				RedTShirt b2 = new RedTShirt(r2, shirtSizeTooHigh, isMajor2);
				RedTShirt b3 = new RedTShirt(null, shirtSizeTooLow*-1, isMajor3);

				if(!r1.equals(b1.getNameOfStudent()) || b1.getSize() != 10 || b1.isCSISMajor() != isMajor1 ||
						!r2.equals(b2.getNameOfStudent()) || b2.getSize() != 200 || b2.isCSISMajor() != isMajor2 ||	
						!"Super Hacker".equals(b3.getNameOfStudent()) || b3.getSize() != shirtSizeTooLow*-1 || b3.isCSISMajor() != isMajor3
						){
					System.out.println("Error with 3 argument constructor or getters on bad values.");
					System.out.println("\tA new shirt should have all 3 proper values, even given improper inputs");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with 3 argument constructor or getters on bad values.");
			System.out.println("\tA new shirt should have all 3 proper values, even given improper inputs");
			score -= deduction;
		}


		try{
			//setNameOfStudent - good values
			for(int i = 0; i < 100; i++){
				RedTShirt b = new RedTShirt();
				String r1 = "Student_" + makeUpWord();

				b.setNameOfStudent(r1);
				if(!r1.equals(b.getNameOfStudent())){
					System.out.println("Error with setNameOfStudent or getters on good values.");
					System.out.println("\tSetting the name should work");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with setNameOfStudent or getters on good values.");
			System.out.println("\tSetting the name should work");
			score -= deduction;
		}

		try{
			//setNameOfStudent - bad values
			for(int i = 0; i < 100; i++){
				RedTShirt b = new RedTShirt();

				b.setNameOfStudent(null);
				if(!"Dumbledore".equals(b.getNameOfStudent())){
					System.out.println("Error with setNameOfStudent or getters on BAD values.");
					System.out.println("\tSetting the name should work, even with bad values");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with setNameOfStudent or getters on BAD values.");
			System.out.println("\tSetting the name should work, even with bad values");
			score -= deduction;
		}

		try{
			//changeToCSISMajor, changeToNonMajor
			for(int i = 0; i < 100; i++){
				RedTShirt b = new RedTShirt(makeUpWord(),(int)(Math.random()*10+21),false);
				
				for(int j = 0; j < 10; j++){
					b.changeToCSISMajor();
				}
				if(b.isCSISMajor() != true){
					System.out.println("Error with changeToCSISMajor");
					System.out.println("\tChanging the major should work");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with changeToCSISMajor");
			System.out.println("\tChanging the major should work");
			score -= deduction;
		}
		try{
			//changeToCSISMajor, changeToNonMajor
			for(int i = 0; i < 100; i++){
				RedTShirt b = new RedTShirt(makeUpWord(),(int)(Math.random()*10+21),true);
				
				for(int j = 0; j < 10; j++){
					b.changeToNonMajor();;
				}
				if(b.isCSISMajor() != false){
					System.out.println("Error with changeToNonMajor");
					System.out.println("\tChanging the major should work");
					score -= deduction;
					break;
				}
			}

		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error with changeToNonMajor");
			System.out.println("\tChanging the major should work");
			score -= deduction;
		}



		if(score < 5){
			score = 0;
		}
		System.out.println("Score for RedTShirt.java: " + score);


	}

	public static String makeUpWord(){
		String t = "";
		String [] args = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		for(int j = 0; j < 200; j++){
			int rand = (int)(Math.random()*args.length);
			t = t + args[rand];
		}
		return t;
	}

}
