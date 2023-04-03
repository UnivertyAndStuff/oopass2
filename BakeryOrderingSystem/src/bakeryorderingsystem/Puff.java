package BakeryOrderingSystem;

public class Puff extends FoodItem {
  
    private String[] varieties;
    
    public Puff() {
        super("Puff", new String[]{"Cream Cheese", "Chocolate",
            "Cinnamon", "Fruit", "Plain"}, new double[]{0.5, 1.0}, 
            new double[]{10.0, 18.0});
        this.varieties = super.getFlavours();
    }

    public void printPuffTypes() {
        System.out.println("Available Puff types:");
        for (String type : this.getTypes()) {
            System.out.println("- " + type);
        }
    }
    
    public String[] getTypes() {
        return this.varieties;
    }

}
