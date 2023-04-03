package BakeryOrderingSystem;

public  class ServiceItem{
    
    private String servicename;
    private double minprice;
    
    public ServiceItem(String servicename, double minprice){
        
        this.servicename=servicename;
        this.minprice=minprice;
    }
    
    public String getServiceName(){
        return servicename;
    }
    
    public double getMinPrice(){
        return minprice;
    }
    
   
    
   }