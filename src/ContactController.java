public class ContactController {
    private Contact model;
    private ContactView view;


    // Creating the controller
    public ContactController(Contact model, ContactView view) {
        this.model = model;
        this.view = view;
    }


    // Method to change all details at once
    public void setContactDetails(String name, String phoneNumber, String email, String address) {
        model.setName(name);
        model.setPhoneNumber(phoneNumber);
        model.setEmail(email);
        model.setAddress(address);
    }

    // Method to change the contact name
    public void setContactName(String name){
        model.setName(name);
    }

    // Method to change the phone number
    public void setContactPhoneNumber(String phoneNumber){
        model.setPhoneNumber(phoneNumber);
    }

    // Method to change the email address
    public void setContactEmail(String email){
        model.setEmail(email);
    }

    // Method to change the address
    public void setContactAddress(String address){
        model.setAddress(address);
    }

    //Method to check all the details from the view
    public void checkAllContactDetails() {
        view.displayAllContactDetails(model);
    }

    // Method to check the name from the view
    public void checkContactNameView() {
        view.displayName(model);
    }

    // Method to check the phone number from the view
    public void checkContactPhoneNumberView() {
        view.displayPhoneNumber(model);
    }


    // Method to check the email from the view
    public void checkContactEmailView() {
        view.displayEmail(model);
    }

    // Method to check the address from the view
    public void checkContactAddressView() {
        view.displayAddress(model);
    }

}
