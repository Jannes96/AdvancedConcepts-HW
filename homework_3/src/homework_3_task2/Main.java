package homework_3_task2;

import homework_3_task2.Email;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Message m1 = new Email();
		Message m2 = new SMS();
		
		System.out.println(m1.getType());
		System.out.println(m2.getType());
		//m1.send();
		
		
	}

}
