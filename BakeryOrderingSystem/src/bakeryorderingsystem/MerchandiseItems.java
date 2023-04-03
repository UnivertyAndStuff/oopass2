package BakeryOrderingSystem;

public abstract class MerchandiseItems {
    
    private String name;
    private String[] colours;
    private double[] prices;


public MerchandiseItems(String name, String[] colours, double[] prices){

this.name=name;
this.colours = colours;
this.prices= prices;

}

public String geName(){
    return name;
}

public String[] getColours(){
    return colours;
}

public double[] getPrices(){
    return prices;
}

    public abstract double getPrice();

}
