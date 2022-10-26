import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone (String phoneNumber){
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if (findContact(contact) == -1) {
            return myContacts.add(contact);
        }
        else {
            return false;
        }
    }
    public boolean updateContact(Contact contact1, Contact contact2){
        if(findContact(contact1) != -1){
            myContacts.set(myContacts.indexOf(contact1), contact2);
            return true;
        }
        return false;
    }
    public boolean removeContact(Contact contact){
        return myContacts.remove(contact);
    }
    private int findContact(Contact contact){
        return findContact(contact.getName());
    }
    private int findContact(String contactName){
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String contactName){
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return contact;
            }
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List:");
        for(int i = 0; i< myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            System.out.println(i+1 + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}