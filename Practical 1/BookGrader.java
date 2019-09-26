import java.util.Random;

/**
 * This is the code that I will used to grade your Book file 
 * @author Dr B
 *
 */
public class BookGrader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int points = 100;
		int deduction = 100/10;
		final int TOTALPAGES1 = 50;
		final int TOTALPAGES2 = 40;
		final String STONE = "Stone";
		final String CHAMBER = "Chamber of Secrets";
		final String GOBBLET = "Gobblet of Fire";
		final String HALF = "Half Blood Prince";
		
		
		//Test the default answering machine
		Book m1 = new Book(STONE, TOTALPAGES1);
		Book m2 = new Book(CHAMBER, TOTALPAGES2);
		
		if (!m1.getTitle().equals(STONE) || ! m2.getTitle().equals(CHAMBER)){
			System.out.println("ERROR: new books should have the correct name");
			System.out.println("      but getTitle() returned the wrong answer");
			points -= deduction*2;
		}

		m1.setTitle(GOBBLET);
		m2.setTitle(HALF);
		if (!m1.getTitle().equals(GOBBLET) || ! m2.getTitle().equals(HALF)){
			System.out.println("ERROR: after calling the setTitle(String method) the getTitle() method should return the correct result, but it doesn't");
			points -= deduction*2;
		}

		
		int pages1 = m1.getTotalPages();
		int pages2 = m2.getTotalPages();
		if (pages1 != TOTALPAGES1 && pages2 != TOTALPAGES2){
			System.out.println("ERROR: new books should have the correct number of pages");
			System.out.println("      but getTotalPages() returned the wrong answer");
			points -= deduction*2;
		}
		else if (pages1 != TOTALPAGES1){
			System.out.println("ERROR: new books should have the correct number of pages");
			System.out.println("      but getTotalPages() returned the wrong answer");
			points -= deduction*2;
		}
		else if (pages2 != TOTALPAGES2){
			System.out.println("ERROR: new books should have the correct number of pages");
			System.out.println("      but getTotalPages() returned the wrong answer");
			points -= deduction*2;
		}

		int currentPage1 = m1.getCurrentPage();
		int currentPage2 = m2.getCurrentPage();
		if (currentPage1 != 1 || currentPage2 != 1){
			System.out.println("ERROR: a new book should start at page 1");
			System.out.println("      but getCurrentPage returned the wrong answer");
			points -= deduction*2;
		}
		
		//Turn a few pages
		Random rand = new Random();
		int rand1 = rand.nextInt(TOTALPAGES1-1) + 1;
		int rand2 = rand.nextInt(TOTALPAGES2-1) + 1;
		for (int i = 0; i < rand1; i++){
			m1.turnPage();
		}
		for (int i = 0; i < rand2; i++){
			m2.turnPage();
		}
		currentPage1 = m1.getCurrentPage();
		currentPage2 = m2.getCurrentPage();
		if (currentPage1 != rand1+1) {
			System.out.println("ERROR: after calling turnPage() " + rand1 + " times the book should be on page " + (rand1+1) + " but getCurrentPage() returned " + currentPage1);
			points -= deduction;
		}
		else if (currentPage2 != rand2+1) {
			System.out.println("ERROR: after calling turnPage() " + rand2 + " times the book should be on page " + (rand2+1) + " but getCurrentPage() returned " + currentPage2);
			points -= deduction;
		}

		//turn the book past the end page
		for (int i = rand1; i < TOTALPAGES1; i++){
			m1.turnPage();
		}
		for (int i = rand2; i < TOTALPAGES2; i++){
			m2.turnPage();
		}
		//Turn the book to page 2
		m1.turnPage();
		m2.turnPage();
		
		currentPage1 = m1.getCurrentPage();
		currentPage2 = m2.getCurrentPage();
		if (currentPage1 != 2 || currentPage2 != 2) {
			System.out.println("ERROR: after calling turnPage() past the end of the book the page count should start back at 1");
			points -= deduction;
		}
		
		
		System.out.println("Your graded percentage for this assignment is: " + points);
	}

}
