package homework_4_task1;

public abstract class PopularGrocery extends GroceryItem{

	 protected int popularityLevel;
	    protected int quantity;

	    public PopularGrocery(int popularityLevel) {
	        this.popularityLevel = popularityLevel;
	        this.isPopular = true;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    @Override
	    public boolean showWarning() {
	        return quantity > householdLimit;
	    }
	    
}
  