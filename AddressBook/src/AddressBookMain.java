import java.util.Scanner;

import model.Contact;
import operations.AddressBookOperationsImpl;

public class AddressBookMain {
public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);
	AddressBookOperationsImpl opn = new AddressBookOperationsImpl();
    System.out.println("Enter details - F.N|L.N|address|city|state|phone|email|Opertion");
    while(true) {
    // String input
    String details = myObj.nextLine();
    
    String [] userDetails = details.split("|");
    if("ADD".contentEquals(userDetails[7])) {
    Contact c1 = new Contact(userDetails[0], userDetails[1], userDetails[2], userDetails[3], userDetails[4], userDetails[5], userDetails[6]);

    
    opn.addContactToAddressBook(c1);
    }else if("EDIT".contentEquals(userDetails[7])) {
    	  Contact c1 = new Contact(userDetails[0], userDetails[1], userDetails[2], userDetails[3], userDetails[4], userDetails[5], userDetails[6]);
    	opn.modifyContactToAddressBook(c1);
    }
    
    }
    
    
    
}
}
