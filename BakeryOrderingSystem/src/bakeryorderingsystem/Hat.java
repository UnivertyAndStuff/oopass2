package BakeryOrderingSystem;

public abstract class Hat extends MerchandiseItems {
    private String[] varieties;
    
    public Hat() {
        super("Hat", new String[]{"Black", "Orange & white", "Lemon green",
            "Space gradient"}, new double[]{10.0, 12.0, 11.0, 15.0});
        this.varieties = new String[]{"Baseball cap", "Beanie", "Bucket hat",
            "Fedora"};
    }
    
    public String[] getTypes() {
        return this.varieties;
    }
    
    public void printHatTypes() {
        System.out.println("Available Hat types:");
        for (String type : this.getTypes()) {
            System.out.println("- " + type);
        }
    }
}