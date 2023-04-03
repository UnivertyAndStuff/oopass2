package BakeryOrderingSystem;

public abstract class Mug extends MerchandiseItems {
    
    private String[] varieties;
    
    public Mug() {
        super("Mug", new String[]{"Orange", "Black", "Purple", 
            "Gradient", "Rainbow"}, new double[]{8.0, 10.0, 12.0, 15.0, 20.0});
        this.varieties = new String[]{"Standard", "Travel", "Magic"};
    }
    
    public void printMugTypes() {
        System.out.println("Available Mug types:");
        for (String type : this.getTypes()) {
            System.out.println("- " + type);
        }
    }
    
    public String[] getTypes() {
        return this.varieties;
    }
}