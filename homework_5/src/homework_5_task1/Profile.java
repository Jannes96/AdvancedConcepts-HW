package homework_5_task1;

public class Profile {
    private ShippingInfo shippingInfo;

    public Profile(ShippingInfo shippingInfo) throws MissingShippingInfoException {
        if (shippingInfo == null) {
            throw new MissingShippingInfoException("Shipping info is missing.");
        }
        this.shippingInfo = shippingInfo;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }
}