package BakeryOrderingSystem;



public class SilverLoyaltyCard extends LoyaltyCard {
    private static final double DISCOUNT_RATE = 0.1;
    
    public SilverLoyaltyCard(int points) {
        super("Silver", DISCOUNT_RATE, points);
    }
}