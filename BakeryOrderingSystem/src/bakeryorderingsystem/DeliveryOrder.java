package BakeryOrderingSystem;

public class DeliveryOrder extends ServiceItem {
    private String deliveryDate;
    private String deliveryTime;
    private String deliveryAddress;
    
    public DeliveryOrder(String deliveryDate, String deliveryTime, 
            String deliveryAddress, double price) {
        super("Delivery Order", price);
        this.deliveryDate = deliveryDate;
        this.deliveryTime = deliveryTime;
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }
    
    public String getDeliveryTime() {
        return deliveryTime;
    }
    
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
