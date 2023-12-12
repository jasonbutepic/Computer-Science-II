import java.util.Scanner;

public class Customer {
    private String firstName, lastName, street, city, state, zip;
    Scanner input = new Scanner(System.in);

    //constructor
    public Customer(String fName, String lName, String str, String c, String s, String z){
        firstName = fName;
        lastName = lName;
        street = str;
        city = c;
        state = s;
        zip = z;
    }

    public String toString(){
        String custString;

        custString = firstName + " " + lastName + "\n";
        custString += street + "\n";
        custString += city + ", " + state + " " + zip;
        return(custString);
    }

    public void newAddress(String str, String c, String s, String z){
        street = str;
        city = c;
        state = s;
        zip = z;
        System.out.println("Address changed. It is now:");
    }
}
