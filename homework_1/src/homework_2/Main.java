package homework_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Publication p1 = new Publication("Data Structures", 2020);
		
		System.out.println(p1.getInfo());
		
		
		Book b1 =  new Book(p1.getTitle(), p1.getYear(), "Jane Doe");
		
		System.out.println(b1.getInfo());
		
		
		Textbook t1 = new Textbook(b1.getTitle(), b1.getYear(), b1.getAuthor(), "Computer Science");
		
		System.out.println(t1.getInfo());
	}

}
