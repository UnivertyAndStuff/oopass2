package BakeryOrderingSystem;
public class BronzeLoyaltyCard extends LoyaltyCard{

    private static  double DISCOUNT_RATE = 0.05;

    public BronzeLoyaltyCard(int points) {
        super("Bronze", DISCOUNT_RATE, points);
    }

       
}
