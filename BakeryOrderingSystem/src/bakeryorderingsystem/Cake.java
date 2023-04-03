package BakeryOrderingSystem;

public class Cake extends FoodItem {

    private String[] varieties;

    public Cake() {
        super("Cake", new String[]{"Hazelnut choc", "Vanilla", 
            "Strawberry", "Lemon", "Red Velvet"}, new double[]{0.5, 1.0},
            new double[]{25.0, 45.0});
        
        
        this.varieties = new String[]{"Hazelnut choc", "Vanilla", 
            "Strawberry", "Lemon", "Red Velvet"};
    }

    public void printCakeTypes() {
        System.out.println("Available cake types:");
        for (String type : this.getTypes()) {
            System.out.println("- " + type);
        }
    }

    public String[] getTypes() {
        return this.varieties;
    }
}
