//171805024 Nagihan BAZ
public class TestAddressBook {

public static void main(String[] args) {

    System.out.println("ENTRY 1");

    AddressBook entry1 = new AddressBook("1", "Ali", "Aslan", "77165 St.", 
                                         "Adana", "M",  "01360");

    System.out.println( "id:        " + entry1.getid() );
    System.out.println( "First Name:       " + entry1.getfirstName() );
    System.out.println( "Last  Name:        " + entry1.getLastName() );
    System.out.println( "Street:           " + entry1.getstreet() );
    System.out.println( "City:        " + entry1.getcity() );
    System.out.println( "Gender:        " + entry1.getgender() );
    System.out.println( "Zip:    " + entry1.getzip() );
    
    System.out.println("\nENTRY 2");

    AddressBook entry2 = new AddressBook("2", "Ayþe", "Akýn", "Atatürk St.", 
                                         "Adana", "F",  "01140");

    System.out.println( "id:        " + entry1.getid() );
    System.out.println( "First Name:       " + entry2.getfirstName() );
    System.out.println( "Last  Name:        " + entry2.getLastName() );
    System.out.println( "Street:           " + entry2.getstreet() );
    System.out.println( "City:        " + entry2.getcity() );
    System.out.println( "Gender:        " + entry2.getgender() );
    System.out.println( "Zip:    " + entry2.getzip() );
    System.out.println("\nENTRY 3");

    AddressBook entry3 = new AddressBook("3", "Ahmet", "Öztürk", "Adnan Menders St.", 
                                         "Aydýn", "F",  "09010");

    System.out.println( "id:        " + entry3.getid() );
    System.out.println( "First Name:       " + entry3.getfirstName() );
    System.out.println( "Last  Name:        " + entry3.getLastName() );
    System.out.println( "Street:           " + entry3.getstreet() );
    System.out.println( "City:        " + entry3.getcity() );
    System.out.println( "Gender:        " + entry3.getgender() );
    System.out.println( "Zip:    " + entry3.getzip() );



    AddressBook.compareNames(entry1.getid() + " " + 
                             entry1.getfirstName().charAt(0) + " " + 
                             entry1.getLastName(), 
                             entry2.getid() + " " + 
                             entry2.getfirstName().charAt(0) + " " + 
                             entry2.getLastName() ); 






}
}