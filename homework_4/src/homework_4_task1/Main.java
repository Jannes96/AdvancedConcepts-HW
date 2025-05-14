package homework_4_task1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Milk milk = new Milk(21, 10, 8);
	    Flour flour = new Flour(12, 10, 5);
		
        System.out.println("Milk discount: " + milk.getBulkDiscount());  // 12
        System.out.println("Milk warning: " + milk.showWarning());      // true

        System.out.println("Flour discount: " + flour.getBulkDiscount());  // 5
        System.out.println("Flour warning: " + flour.showWarning());       // false
		
	}

}
