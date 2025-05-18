package homework_5_task1;

public class EComController {
    public static void main(String[] args) {
        try {
            ShippingInfo info = new ShippingInfo("Munich", 80331, "Germany");
            Profile profile = new Profile(info);
            Customer customer = new Customer(profile, 123);

            System.out.println("Shipping to: " +
                customer.getProfile().getShippingInfo().getCity());

        } catch (InvalidShippingInfoException e) {
            System.out.println("Shipping Error: " + e.getMessage());
        } catch (MissingShippingInfoException e) {
            System.out.println("Profile Error: " + e.getMessage());
        } catch (InvalidCustomerException e) {
            System.out.println("Customer Error: " + e.getMessage());
        }
    }
}