package BakeryOrderingSystem;

public class LoyaltyCard {
    
    private String cardType;
    private double discountRate;
    private int points;
    
    public LoyaltyCard(String cardType, double discountRate, int points){
        
        this.cardType= cardType;
        this.discountRate= discountRate;
        this.points=points;
    }

  
    
    public String getCardType(){
        return cardType;
    }
 
    public double getDiscountRate(){
        return discountRate;
    }
    
    public int getpoints(){
        return this.points;
    }
    
    public void addpoints(int points){
        this.points += points;
    }
    
    public void redeemPoints(int points) {
        this.points-=points;
    }
    
    public String toString(){
        return "Loyalty card type:"+ this.cardType+",discount rate:" + 
                this.discountRate + ", loyalty points:" +this.points;
    }

    public String getCardNumber() {
    return "01202094595";
}

}