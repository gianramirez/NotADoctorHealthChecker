package NotaDoctor.NotADoctor.models.usermodels;

public class ImmutableAddress implements Address{
    private final String streetAddress;
    private final String unit;
    private final String city;
    private final String state;
    private final int zipCode;

    public ImmutableAddress(String streetAddress, String unit, String city, String state, int zipCode) {
        this.streetAddress = streetAddress;
        this.unit = unit;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getUnit() {
        return unit;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }
}
