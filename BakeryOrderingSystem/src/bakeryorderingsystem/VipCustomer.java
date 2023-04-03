package BakeryOrderingSystem;

/**
 *
 * @author user
 */
public class VipCustomer extends Customer {

    private GoldLoyaltyCard loyaltyCard;

    public VipCustomer(String firstName, String lastName, int phoneNo, String address, String city, String state, int postcode, LoyaltyCard card, String emailAddress) {
        super(firstName, lastName, address, city, state, phoneNo, emailAddress, true);
        setLoyaltyCard(card);
    }

    private void setLoyaltyCard(LoyaltyCard card) {
        if (card instanceof GoldLoyaltyCard) {
            this.loyaltyCard = (GoldLoyaltyCard) card;
        } else {
            this.loyaltyCard = new GoldLoyaltyCard();
        }
    }

    public void addPoints(int points) {
        if (points <= 0) {
            // Invalid number of points to add.
            return;
        }
        this.loyaltyCard.addPoints(points);
    }

    public void redeemPoints(int points) {
        if (points <= 0) {
            // Invalid number of points to redeem.
            return;
        }
        if (this.loyaltyCard.getPoints() < points) {
            // Not enough points to redeem.
            return;
        }
        this.loyaltyCard.redeemPoints(points);
    }

    public String toString() {
        return super.toString() + this.loyaltyCard.toString() + ", ";
    }

    public double getDiscountRate() {
        return this.loyaltyCard.discountRate;
    }

    private class GoldLoyaltyCard extends LoyaltyCard {
        private String cardType = "Gold";
        private double discountRate = 0.15;
        private int points = 0;

        public GoldLoyaltyCard(String cardType, double discountRate, int points) {
            super(cardType, discountRate, points);
        }

        public void addPoints(int points) {
            this.points += points;
        }

        public void redeemPoints(int points) {
            if (this.points < points) {
                // Not enough points to redeem.
                return;
            }
            this.points -= points;
        }

        public int getPoints() {
            return this.points;
        }

        public String toString() {
            return "Loyalty card type: " + this.cardType + ", discount rate: " + this.discountRate + ", loyalty points: " + this.points;
        }
    }
}
