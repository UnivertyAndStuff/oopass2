package BakeryOrderingSystem;

public  class FoodItem{
    
    private String name;
    private String[] flavours;
    private double[] sizes;
    private double[] prices;


public FoodItem(String name, String[] flavours, double[] sizes, double[]prices)
{

this.name=name;
this.flavours = flavours;
this.sizes = sizes;
this.prices= prices;

}

public String getName(){
    return name;
}

public String[] getFlavours(){
    return flavours;
}

public double[] getSizes(){
    return sizes;
}

public double[] getPrices(){
    return prices;
}

}



