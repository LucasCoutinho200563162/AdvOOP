public class Contact {
    // Declaring variables
    private String name, phoneNumber, email, address;



    // Constructor
    public Contact(String name, String phoneNumber, String email, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    // Setters and getters for all variables
    // Getter for name
    public String getName() {
        return name;
    }

    //Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter for phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }
}
