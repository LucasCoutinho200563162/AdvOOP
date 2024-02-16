public class ContactView {
    // Displaying all details
    public void displayAllContactDetails(Contact contact) {
        System.out.printf("The following are the contact defails:\n" +
                "Name: %s\n" +
                "Phone number: %s\n" +
                "Email address: %s\n" +
                "Address: %s\n", contact.getName(),contact.getPhoneNumber(),contact.getEmail(), contact.getAddress());
    }

    // Displaying name
    public void displayName(Contact contact) {
        System.out.println("The name of the contact is " + contact.getName());
    }

    // Displaying Phone number
    public void displayPhoneNumber(Contact contact) {
        System.out.println("The phone number of the contact is " + contact.getPhoneNumber());
    }

    // Displaying email
    public void displayEmail(Contact contact) {
        System.out.println("The email of the contact is " + contact.getEmail());
    }

    // Displaying address
    public void displayAddress(Contact contact) {
        System.out.println("The address of the contact is " + contact.getAddress());
    }
}
