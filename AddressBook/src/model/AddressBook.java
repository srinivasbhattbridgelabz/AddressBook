package model;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	List<Contact> contacts = new ArrayList<Contact>();

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
			

}
