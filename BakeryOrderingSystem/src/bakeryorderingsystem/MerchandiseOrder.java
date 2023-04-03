package BakeryOrderingSystem;

public class MerchandiseOrder {
    
    private int invoiceNumber;
    private String dateOfOrder;
    private MerchandiseItems itemOrdered;
    private String orderedBy;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private double total;
    private double taxRate = 0.06;
    private double discountRate = 0.0;
    private double grandTotal;
    
    public MerchandiseOrder(int invoiceNumber, String dateOfOrder, 
            MerchandiseItems itemOrdered, String orderedBy, 
            String customerName, String customerEmail, String customerPhone) 
    {
        this.invoiceNumber = invoiceNumber;
        this.dateOfOrder = dateOfOrder;
        this.itemOrdered = itemOrdered;
        this.orderedBy = orderedBy;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.total = itemOrdered.getPrice();
    }
    
    public void calculateGrandTotal(Customer customer, LoyaltyCard loyaltyCard) 
    {
        this.discountRate = customer.getDiscountRate() + 
                loyaltyCard.getDiscountRate();
        double discountAmount = this.total * this.discountRate;
        double taxedAmount = (this.total - discountAmount) * this.taxRate;
        this.grandTotal = this.total - discountAmount + taxedAmount;
    }
    
    // Getters and setters
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(String dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public MerchandiseItems getItemOrdered() {
        return itemOrdered;
    }

    public void setItemOrdered(MerchandiseItems itemOrdered) {
        this.itemOrdered = itemOrdered;
    }

    public String getOrderedBy() {
        return orderedBy;
    }

    public void setOrderedBy(String orderedBy) {
        this.orderedBy = orderedBy;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }
}
