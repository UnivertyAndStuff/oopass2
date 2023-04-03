package BakeryOrderingSystem;

import java.util.Date;

public class Order {
    private int invoiceNumber;
    private Date dateOrdered;
    private double subtotal;
    private double taxRate = 0.06;
    private double discountRate;
    private double grandTotal;

    public Order(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        this.dateOrdered = new Date();
        this.calculateSubtotal();
        this.calculateDiscountRate();
        this.calculateGrandTotal();
    }

    public void calculateSubtotal() {
        
    }

    public void calculateDiscountRate() {
      
    }

    public void calculateGrandTotal() {
        double grandTotal = this.subtotal * (1 + this.taxRate) * 
                (1 - this.discountRate);
        this.grandTotal = grandTotal;
    }

    // Getters and setters
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double getGrandTotal() {
        return grandTotal;
    }
}
