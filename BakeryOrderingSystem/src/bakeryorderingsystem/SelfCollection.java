package BakeryOrderingSystem;

public class SelfCollection extends ServiceItem {
    private String collectionDate;
    private String collectionTime;
    
    public SelfCollection(String collectionDate, String collectionTime, 
            double price) {
        super("Self Collection ", price);
        this.collectionDate = collectionDate;
        this.collectionTime = collectionTime;
    }
    
    public String getCollectionDate() {
        return collectionDate;
    }
    
    public String getCollectionTime() {
        return collectionTime;
    }
    
    public void setCollectionDate(String collectionDate) {
        this.collectionDate = collectionDate;
    }
    
    public void setCollectionTime(String collectionTime) {
        this.collectionTime = collectionTime;
    }
}
