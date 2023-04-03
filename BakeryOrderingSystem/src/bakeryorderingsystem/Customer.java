package BakeryOrderingSystem;

public abstract  class Customer 
{
 
   private String firstName;
private String lastName;
private int phoneNo;
private String address;
private String city;
private String state;
private int postcode;
private LoyaltyCard card;

// constructor for new customer
public Customer(String firstName, String address, String state, String city, int postcode, String emailAddress,
        int phoneNo, String cardType, double discountRate, int loyaltyPoints, boolean isNewCustomer) {
    this.firstName = firstName;
    this.lastName = "";
    this.phoneNo = phoneNo;
    this.address = address;
    this.city = city;
    this.state = state;
    this.postcode = postcode;
    this.card = isNewCustomer ? new LoyaltyCard(cardType, discountRate, loyaltyPoints) : null;
}

// constructor for existing customer
public Customer(String firstName, String lastName, String address, String city, String state, int phoneNo,
        String emailAddress, LoyaltyCard card) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNo = phoneNo;
    this.address = address;
    this.city = city;
    this.state = state;
    this.postcode = 0; // added a default value for postcode
    this.card = card;
    this.emailAddress = emailAddress;
}

public String getEmailAddress() {
    return emailAddress;
}

public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
}

private String emailAddress;

// using getter method
public LoyaltyCard getCardType() {
    return this.card;
}

public String getFirstName() {
    return this.firstName;
}

public String getLastName() {
    return this.lastName;
}

public int getPhoneNo() {
    return this.phoneNo;
}

public String getAddress() {
    return this.address;
}

public String getCity() {
    return this.city;
}

public String getState() {
    return this.state;
}

public int getPostcode() {
    return this.postcode;
}

// using setter method

public void setfirstName(String newfirstName) {
    this.firstName = newfirstName;
}

public void setlastName(String newlastName) {

    this.lastName = newlastName;
}

public void setphoneNo(int newphoneNo) {
    this.phoneNo = newphoneNo;
}

public void setaddress(String newaddress) {
    this.address = newaddress;
}

public void setcity(String newcity) {
    this.city = newcity;
}

public void setstate(String newstate) {
    this.state = newstate;
}

public void setpostcode(int newpostcode) {
    this.postcode = newpostcode;
}

public void setcard(LoyaltyCard newCard) {
    this.card = newCard;
}

public abstract double getDiscountRate();

public String toString() {
    return "Customer's Name: " + this.firstName + " " + this.lastName + "\n" + "MobileNo: " + this.phoneNo + "\n"
            + "Address: " + this.address + ", " + this.city + ", " + this.state + ", " + this.postcode + "\n"
            + this.card.toString();
}

    Object getCard() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
    
   
