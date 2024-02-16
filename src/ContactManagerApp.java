public class ContactManagerApp {
    public static void main(String[] args){
        // Creating the contact object
        Contact firstContact = new Contact("John Doe", "+11234567890", "johndoe@email.com", "123, First Street 111 ABC" );
        // Instantiate the contact view
        ContactView contactView = new ContactView();
        // Instantiate the controller using the contact model and view above
        ContactController firstContactController = new ContactController(firstContact, contactView);


        System.out.println("All details of the first contact before update");
        // Accessing the controller to print all details
        firstContactController.checkAllContactDetails();
        // Updating contact email using the controller
        firstContactController.setContactEmail("john_doe@email.com");
        firstContactController.setContactName("John Doe Jr");
        System.out.println();
        System.out.println("New contact email after update");
        // Checking the new email from the view
        firstContactController.checkContactEmailView();

        System.out.println();
        System.out.println("New contact name after update");
        // Checking the new name from the view
        firstContactController.checkContactNameView();


        System.out.println();
        System.out.println("Final contact details after updates");
        // Checking final details from the view
        firstContactController.checkAllContactDetails();


        // Changing all contact details
        firstContactController.setContactDetails("Jane Doe", "+8527419630", "jane_doe@email.com","999 Fake Street");
        System.out.println();
        System.out.println("Final contact details after full update");
        firstContactController.checkAllContactDetails();
    }
}
