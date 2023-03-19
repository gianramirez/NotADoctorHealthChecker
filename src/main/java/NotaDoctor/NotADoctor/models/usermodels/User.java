package NotaDoctor.NotADoctor.models;

import org.apache.tomcat.jni.Address;

import javax.naming.Name;

public class User {

    private final Address address;
    private Name name;
    public User(String firstName, String lastName, String suffix, String streetAddress, String unit, String city, String state, int zipCode) {
        this.name = new Name(firstName, lastName, suffix);
        this.address = new Address(streetAddress, unit, city, state, zipCode);
    }

    public Name getname() {
        return name;
    }

    public Address getaddress(){
        return address;
    }
     public class Name {
        private final String firstName;
        private final String lastName;
        private final String suffix;

         public Name(String firstName, String lastName, String suffix){
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

     public class Address {
         private final String streetAddress;

         private final String unit;
         private final String city;
         private final String state;
         private final int zipCode;



         public Address(String streetAddress, String unit, String city, String state, int zipCode){
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


}
