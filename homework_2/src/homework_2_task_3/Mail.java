package homework_2_task_3;

public class Mail {

	private String senderAdress;
	private String subject;
	private String message;
	private String datetime;
	private boolean read;
	
	public Mail(String senderAdress, String subject, String message, String datetime, boolean read) {
		
		this.senderAdress = senderAdress;
		this.subject = subject;
		this.message = message;
		this.datetime = datetime;
		this.read = read;
	
	}
	
	public String getSenderAdress() {
		return senderAdress;
	}
	public void setSenderAdress(String senderAdress) {
		this.senderAdress = senderAdress;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public boolean isRead() {
		return read;
	}
	public void setRead(boolean read) {
		this.read = read;
	}
	
	public String getInfo() {
		return subject + " from " + senderAdress + " on " + datetime + ": " + message;
	}
	
	
}
