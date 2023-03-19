package NotaDoctor.NotADoctor.models.usermodels;

public class ImmutableName implements Name {
    private final String firstName;
    private final String lastName;
    private final String suffix;

    public ImmutableName(String firstName, String lastName, String suffix) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuffix() {
        return suffix;
    }
}
