package siit.phoneHomework;

import java.util.ArrayList;

public class Contact {

    private String index;
    private String phoneNumber;
    private String firstName;
    private String lastName;

    ArrayList<String> messages = new ArrayList<>();
    private static final int LENGTH_LIMIT = 100;

    public Contact(String index, String phoneNumber, String firstName, String lastName) {
        this.index = index;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getIndex() {
        return index;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void sendMessage(String messageContent) {
        if (messageContent.length() <= LENGTH_LIMIT) {
            messages.add(messageContent);
        } else {
            System.out.println("Your message is too long! " + LENGTH_LIMIT + " or less chars!");
        }
    }

    public void listMessages() {
        for (String message : messages) {
            System.out.println(message);
        }
    }
}
