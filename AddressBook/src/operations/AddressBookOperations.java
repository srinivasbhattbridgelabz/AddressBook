package operations;

import java.util.List;

import model.Contact;

public interface AddressBookOperations {
	
	public void addContactToAddressBook(Contact contact);
	
	public void modifyContactToAddressBook(Contact contact);
	
	
	public void deleteContact(String name);
	
	public void addMulitpleContacts(List<Contact> contacts);

}
