package operations;

import java.util.List;

import model.AddressBook;
import model.Contact;

public class AddressBookOperationsImpl implements AddressBookOperations {

	AddressBook book = new AddressBook();
	
	@Override
	public void addContactToAddressBook(Contact contact) {
		
		
		book.getContacts().add(contact);
		
	}

	@Override
	public void modifyContactToAddressBook(Contact contact) {
		book.getContacts().stream().filter(c2 -> c2.getFirstName().contentEquals(contact.getFirstName()) && c2.getLastName().contentEquals(contact.getLastName()) ).map 
		
	}

	@Override
	public void deleteContact(String name) {
		
	}

	@Override
	public void addMulitpleContacts(List<Contact> contacts) {
		
	}

}
