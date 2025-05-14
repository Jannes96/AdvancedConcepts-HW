package homework_4_task1;

public class Milk extends PopularGrocery{

	 public Milk(int quantity, int discountTreshhold, int popularityLevel) {
	        super(popularityLevel);
	        this.quantity = quantity;
	        this.discountTreshhold = discountTreshhold;
	        this.householdLimit = 20;
	    }

	    @Override
	    public int getBulkDiscount() {
	        return quantity >= discountTreshhold ? 12 : 0;
	    }
	
}
