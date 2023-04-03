package BakeryOrderingSystem;

public class Tart extends FoodItem {
  
    private String[] varieties;
    public Tart() {
    super("Tart", new String[]{"Fruit", "Chocolate", "Custard", "Egg", 
        "Durian"}, new double[]{0.5, 1.0}, new double[]{20.0, 35.0});
    this.varieties = super.getFlavours();
}

    
    public void printTartTypes() {
        System.out.println("Available Tart types:");
        for (String type : this.getTypes()) {
            System.out.println("- " + type);
        }
    }
    
    public String[] getTypes() {
    return this.varieties;
}

}
