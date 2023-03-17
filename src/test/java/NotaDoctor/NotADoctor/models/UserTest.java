package NotaDoctor.NotADoctor.models;

import NotaDoctor.NotADoctor.repositories.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void testGetName() {
        User user = new User("John", "Doe", "Jr.", "123 Deer Run", "Apt 1", "Columbus", "OH", 43116);
        User.Name name = user.getname();

        Assertions.assertEquals("John", name.getFirstName(), "Wrong first name");
        Assertions.assertEquals("Doe", name.getLastName(), "Wrong last name");
        Assertions.assertEquals("Jr.", name.getSuffix(), "Wrong suffix");
    }

    @Test
    public void testGetAddress(){
        User user = new User("John", "Doe", "Jr.", "123 Deer Run", "Apt 1", "Columbus", "OH", 43116);
        User.Address address = user.getaddress();

        Assertions.assertEquals("123 Deer Run", address.getStreetAddress(), "Wrong street address");
        Assertions.assertEquals("Apt 1", address.getUnit(), "Wrong unit");
        Assertions.assertEquals("Columbus", address.getCity(), "Wrong city");
        Assertions.assertEquals("OH", address.getState(), "Wrong state");
        Assertions.assertEquals(43116, address.getZipCode(), "Wrong zip code");
    }


}