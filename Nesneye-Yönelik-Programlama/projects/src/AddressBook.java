//171805024 Nagihan BAZ
public class AddressBook {

private String id;
private String firstName;
private String lastName;
private String street;
private String city;
private String gender;
private String zip;

public AddressBook(String id , String firstName, String lastName,
                   String street, String city, String gender,
                   String zip) {

                        this.id = id ;
                        this.firstName = firstName;
                        this.lastName  = lastName;
                        this.street = street;
                        this.city = city;
                        this.gender = gender;
                        this.zip = zip;
                       
                        }

public AddressBook(String id) {
    this.id = id;
}

public AddressBook(String id, String firstName) {
    this.id = id;
    this.firstName = firstName;
}

public AddressBook(String id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
}

public String getid() {
    return id;
}

public void setid(String id) {
    this.id = id;
}

public String getfirstName() {
    return firstName;
}

public void setfirstName(String firstName) {
    this.firstName = firstName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public String getstreet() {
    return street;
}

public void setstreet(String street) {
    this.street = street;
}

public String getcity() {
    return city;
}

public void setcity(String city) {
    this.city = city;
}

public String getgender() {
    return gender;
}

public void setgender(String gender) {
    this.gender = gender;
}

public String getzip() {
    return zip;
}

public void setzip(String zip) {
    this.zip = zip;
}



public static String compareNames(String name1, String name2) {
    String nameEquals;
    if ( name1.equals(name2) ) {
        nameEquals = (name1 + " and " + name2 + " are equal names.");
        return nameEquals;
    }
    else {
        nameEquals = (name1 + " and " + name2 + " are not equal names.");
        return nameEquals;
    }
}
}