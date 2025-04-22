package homework_2_task_3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mail mail1 = new Mail("Köln","Informatik","Hallo!","15.4",false);
		
		Mail mail2 = new Mail("Düsseldorf","BWL","Hallo!","14.4",false);
		
		System.out.println(mail1.getInfo());
		System.out.println(mail2.getInfo());

		Mail[] Group = {mail1, mail2};
	
		Inbox i1 = new Inbox(Group) ;
		
		i1.getHeaders();
		
		int x = i1.countUnread();
		
		System.out.println(x);
		
	}

}
