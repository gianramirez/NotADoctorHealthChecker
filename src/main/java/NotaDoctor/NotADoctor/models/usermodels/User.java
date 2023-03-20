package NotaDoctor.NotADoctor.models.usermodels;

import javax.naming.Name;


public class User {

    private final Name name;
    private final Address address;

    public User(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }


}
