package BakeryOrderingSystem;

public abstract class Poster extends MerchandiseItems {
     
    private String[] varieties;
    public Poster() {
    super("Poster", new String[]{"Logo-Black", "Logo-rainbow",
        "Logo-midnight purple", "Logo-orange"},
        new double[]{10.0, 12.0, 15.0});
    this.varieties = new String[]{"Small", "Medium", "Large"};
}

    public void printPosterTypes() {
        System.out.println("Available Poster types:");
        for (String type : this.getTypes()) {
            System.out.println("- " + type);
        }
    }
    
    public String[] getTypes() {
        return this.varieties;
    }

}
