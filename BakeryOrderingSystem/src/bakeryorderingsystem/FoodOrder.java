package BakeryOrderingSystem;

import java.util.Date;

public class FoodOrder {
    private int invoiceNumber;
    private Date dateOrdered;
    private FoodItem[] itemsOrdered;
    private int itemsOrderedCount;
    private Customer customer;
    private double subtotal;
    private double taxRate = 0.06;
    private double discountRate;
    private double grandTotal;

    public FoodOrder(int invoiceNumber, int maxItemsOrdered, Customer customer)
    {
        this.invoiceNumber = invoiceNumber;
        this.itemsOrdered = new FoodItem[maxItemsOrdered];
        this.itemsOrderedCount = 0;
        this.customer = customer;
        this.dateOrdered = new Date();
        this.calculateSubtotal();
        this.calculateDiscountRate();
        this.calculateGrandTotal();
    }

    public void addItemOrdered(FoodItem item) {
        if (itemsOrderedCount < itemsOrdered.length) {
            itemsOrdered[itemsOrderedCount] = item;
            itemsOrderedCount++;
            this.calculateSubtotal();
            this.calculateDiscountRate();
            this.calculateGrandTotal();
        } else {
            System.out.println("Error: Cannot add more items to this order");
        }
    }

    public void removeItemOrdered(FoodItem item) {
        int index = -1;
        for (int i = 0; i < itemsOrderedCount; i++) {
            if (itemsOrdered[i] == item) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < itemsOrderedCount - 1; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
            }
            itemsOrderedCount--;
            this.calculateSubtotal();
            this.calculateDiscountRate();
            this.calculateGrandTotal();
        } else {
            System.out.println("Error: Item not found in order");
        }
    }

    private void calculateSubtotal() {
    double subtotal = 0;
    for (int i = 0; i < itemsOrderedCount; i++) {
        double[] prices = itemsOrdered[i].getPrices();
        for (int j = 0; j < prices.length; j++) {
            subtotal += prices[j];
        }
    }
    this.subtotal = subtotal;
}


    private void calculateDiscountRate() {
        if (this.customer.getCard() != null) {
            this.discountRate = this.customer.getCard().getDiscountRate();
        } else {
            this.discountRate = 0;
        }
    }

    private void calculateGrandTotal() {
        double grandTotal = this.subtotal * (1 + this.taxRate) * 
                (1 - this.discountRate);
        this.grandTotal = grandTotal;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public FoodItem[] getItemsOrdered() {
        FoodItem[] items = new FoodItem[itemsOrderedCount];
        for (int i = 0; i < itemsOrderedCount; i++) {
            items[i] = itemsOrdered[i];
        }
        return items;
    }

    public Customer getCustomer() {
        return customer;
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

