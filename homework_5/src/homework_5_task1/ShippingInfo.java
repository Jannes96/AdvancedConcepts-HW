package homework_5_task1;

public class ShippingInfo {
    private String city;
    private int zip;
    private String country;

    public ShippingInfo(String city, int zip, String country) throws InvalidShippingInfoException {
        if (city == null || city.isEmpty()) {
            throw new InvalidShippingInfoException("City cannot be empty.");
        }
        if (zip <= 0) {
            throw new InvalidShippingInfoException("ZIP code must be a positive number.");
        }
        this.city = city;
        this.zip = zip;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public int getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }
}
