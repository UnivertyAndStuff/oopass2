package BakeryOrderingSystem;

public class Bread extends FoodItem {

    private String[] varieties;

    public Bread(String[] varieties) {
        super("Bread", new String[]{"Cranberry & chocolate", "Wheat", 
            "Pandan", "Multigrain", "Rye"}, new double[]{0.5, 1.0}, 
            new double[]{8.0, 15.0});
        this.varieties = varieties;
    }

    public void printBreadTypes() {
        System.out.println("Available Bread types:");
        for (String type : this.varieties) {
            System.out.println("- " + type);
        }
    }

    public String[] getVarieties() {
        return this.varieties;
    }
}
