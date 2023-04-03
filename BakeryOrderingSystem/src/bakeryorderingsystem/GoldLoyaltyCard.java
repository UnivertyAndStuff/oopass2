package BakeryOrderingSystem;



public class GoldLoyaltyCard extends LoyaltyCard {
    private static final double DISCOUNT_RATE = 0.20;
    
    public GoldLoyaltyCard(int points) {
        super("Gold", DISCOUNT_RATE, points);
    }
}