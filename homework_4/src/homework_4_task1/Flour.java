package homework_4_task1;

public class Flour extends PopularGrocery {

    public Flour(int quantity, int discountTreshhold, int popularityLevel) {
        super(popularityLevel);
        this.quantity = quantity;
        this.discountTreshhold = discountTreshhold;
        this.householdLimit = 15;
    }

    @Override
    public int getBulkDiscount() {
        return quantity >= discountTreshhold ? 5 : 0;
    }
}
