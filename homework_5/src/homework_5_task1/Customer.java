package homework_5_task1;

public class Customer {
    private Profile profile;
    private int id;

    public Customer(Profile profile, int id) throws InvalidCustomerException {
        if (profile == null) {
            throw new InvalidCustomerException("Customer profile is missing.");
        }
        if (id < 0) {
            throw new InvalidCustomerException("Customer ID must be non-negative.");
        }
        this.profile = profile;
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public int getId() {
        return id;
    }
}