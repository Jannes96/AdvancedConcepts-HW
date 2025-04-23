package homework_2_task_2;

public class Librarian extends User{

	String department = "Reference";
	
	@Override
	public String getRole() {
		return this.name + "Librarian";
	}
	
	public void work() {
		//do some work
	}
}
