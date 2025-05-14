package homework_4_task1;

public abstract class Article {

	protected int discountTreshhold;
	protected int householdLimit;
	
	public abstract int getBulkDiscount();
	public abstract boolean showWarning();

}
