package homework_2_task_3;

import java.util.Arrays;

public class Inbox {

	private Mail[] Mails;
	
	public Inbox(Mail[] Mails) {
		this.Mails = Mails;
	}
	
	public void getHeaders() {
		for (Mail mail : Mails) {
			System.out.println( String.valueOf(mail.isRead()) + " | " + mail.getSubject() + " | " + mail.getSenderAdress() + " | " + mail.getDatetime()) ;
		}
	}
	
	
	
}
