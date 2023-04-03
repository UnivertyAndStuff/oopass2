package BakeryOrderingSystem;


public class CustomCakeOrder extends ServiceItem {
    private String occasion;
    private String flavour;
    private String frosting;
    private String decorations;
    
    public CustomCakeOrder(String occasion, String flavour, String frosting, 
            String decorations, double price) {
        super("Custom Cake Order please contact us 03-51667879", 
                price);
        this.occasion = occasion;
        this.flavour = flavour;
        this.frosting = frosting;
        this.decorations = decorations;
    }
    
    public String getOccasion() {
        return occasion;
    }
    
    public String getFlavour() {
        return flavour;
    }
    
    public String getFrosting() {
        return frosting;
    }
    
    public String getDecorations() {
        return decorations;
    }
    
    public void setCustomCakeDetails(String occasion, String flavour, 
            String frosting, String decorations) {
        this.occasion = occasion;
        this.flavour = flavour;
        this.frosting = frosting;
        this.decorations = decorations;
    }
}
