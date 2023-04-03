package BakeryOrderingSystem;

public class Doughnut extends FoodItem {
    
    private String[] varieties;
    
    public Doughnut() {
        super("Doughnut", new String[]{"Glazed", "Chocolate", 
            "Biscoff", "Onde-onde", "Cinnamon"}, new double[]{0.5, 1.0}, 
            new double[]{6.0, 10.0});
        this.varieties = new String[]{"Glazed", "Chocolate", 
            "Biscoff", "Onde-Onde", "Cinnamon"};
    }
    
    public void printDoughnutTypes() {
        System.out.println("Available Doughnut types:");
        for (String type : this.getTypes()) {
            System.out.println("- " + type);
        }
    }
    
    public String[] getTypes() {
        return this.varieties;
    }
}