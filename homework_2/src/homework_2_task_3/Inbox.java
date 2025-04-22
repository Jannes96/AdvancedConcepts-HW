package homework_2_task_3;

import java.util.Arrays;

public class Inbox {

	private Mail[] Mails;
	
	public Inbox(Mail[] Mails) {
		this.Mails = Mails;
	}
	
	public void getHeaders() {
		for (Mail mail : Mails) {
			if (mail.isRead()) {
			System.out.println(  "read | " + mail.getSubject() + " | " + mail.getSenderAdress() + " | " + mail.getDatetime()) ;
			} else {
			System.out.println(  "unread | " + mail.getSubject() + " | " + mail.getSenderAdress() + " | " + mail.getDatetime());
			}	
		}
	}
	
	public int countUnread() {
		int i = 0;
		for (Mail mail : Mails) {
			if (mail.isRead() == false) {
				i++;
			}
		}
		return i;
	}
	
	
	
	
	
	
	
}
