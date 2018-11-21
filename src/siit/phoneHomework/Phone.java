package siit.phoneHomework;

import java.util.ArrayList;

public abstract class Phone {

    ArrayList<Contact> contacts = new ArrayList<>();
    ArrayList<String> calls = new ArrayList<>();
    private int batteryLevel;

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void addContact(String index, String phoneNumber, String firstName, String lastName) {
        Contact contact = new Contact(index, phoneNumber, firstName, lastName);
        contacts.add(contact);
    }

    public void listContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact.getIndex() + " " + contact.getPhoneNumber() + " " +
                    contact.getFirstName() + " " + contact.getLastName());
        }
    }

    public void sendMessage(String phoneNumber, String messageContent) {
        batteryLevel--;

        for (Contact contact : contacts) {
            if (phoneNumber.equals(contact.getPhoneNumber())) {
                contact.sendMessage(messageContent);
            }
        }
    }

    public void listMessages(String phoneMessages) {
        for (Contact contact : contacts) {
            if (phoneMessages.equals(contact.getPhoneNumber())) {
                contact.listMessages();
            }
        }
    }

    public void call(String phoneNumber) {
        batteryLevel -= 2;

        calls.add(phoneNumber);
    }

    public void viewHistory() {
        for (String call : calls) {
            System.out.println(call);
        }
    }
}
