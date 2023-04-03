package BakeryOrderingSystem;

public class RegularCustomer extends Customer {

    private String cardType;
    private int points;
    private double discountRate;

    public RegularCustomer(String firstName, String lastName, int phoneNo,
                            String address, String city, String state, int postcode,
                            LoyaltyCard card, String emailAddress, String cardType) {
        super(firstName, lastName, address, city, state, phoneNo, emailAddress, card, true);

        this.cardType = cardType;
        this.points = 0;
        if ("bronze".equals(cardType)) {
            this.discountRate = 0.05;
        } else if ("silver".equals(cardType)) {
            this.discountRate = 0.1;
        } else {
            // Default card type is bronze
            this.discountRate = 0.05;
        }
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public void redeemPoints(int points) {
        if (this.points >= points) {
            this.points -= points;
        } else {
            System.out.println("Not enough points to redeem.");
        }
    }

    public double getDiscountRate() {
        return this.discountRate;
    }

    public int getPoints() {
        return this.points;
    }

    public String toString() {
        return "Customer's Name:" + getFirstName() + " " + getLastName() + "\n"+
            "MobileNo:" + getPhoneNo() +"\n"+
            "Address :" + getAddress() + "," + getCity() + "," 
            + getState() + "," + getPostcode() +"\n" +
            "Loyalty card type: " + this.cardType +
            ", discount rate: " + this.discountRate + ", loyalty points: "
            + this.points;
    }
}
