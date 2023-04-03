package BakeryOrderingSystem;

import java.util.Date;

public class ServiceOrder  {
    private int invoiceNumber;
    private Date dateOfOrder;
    private ServiceItem[] itemsOrdered;
    private String orderedBy;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;
    private double total;
    private double taxRate = 0.06;
    private double discountRate = 0.0;

    public ServiceOrder(int invoiceNumber, Date dateOfOrder,
            ServiceItem[] itemsOrdered, String orderedBy,
                        String customerName, String emailAddress, 
                        String phoneNumber) {
        this.invoiceNumber = invoiceNumber;
        this.dateOfOrder = dateOfOrder;
        this.itemsOrdered = itemsOrdered;
        this.orderedBy = orderedBy;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        calculateTotal();
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
        calculateTotal();
    }

    private void calculateTotal() {
        double subtotal = 0.0;
        for (ServiceItem item : itemsOrdered) {
            subtotal += item.getMinPrice();
        }
        double discount = subtotal * discountRate;
        double tax = (subtotal - discount) * taxRate;
        total = subtotal - discount + tax;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public ServiceItem[] getItemsOrdered() {
        return itemsOrdered;
    }

    public String getOrderedBy() {
        return orderedBy;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getTotal() {
        return total;
    }
}
