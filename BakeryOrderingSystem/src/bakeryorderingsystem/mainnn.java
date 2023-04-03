import BakeryOrderingSystem.Bread;
import BakeryOrderingSystem.Cake;
import BakeryOrderingSystem.Customer;
import BakeryOrderingSystem.Hat;
import BakeryOrderingSystem.Mug;
import BakeryOrderingSystem.Poster;
import BakeryOrderingSystem.RegularCustomer;
import BakeryOrderingSystem.VipCustomer;
import java.util.Scanner;

public class BakeryOrderingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer;
        double taxRate = 0.06;

        // Register new customer
        System.out.println("Welcome to our bakery! Are you a new customer? (Y/N)");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("Y")) {
            System.out.println("Please enter your name:");
            String name = scanner.next();
            System.out.println("Please enter your email address:");
            String email = scanner.next();
            customer = new RegularCustomer(name, email);
        } else {
            System.out.println("Are you a VIP customer? (Y/N)");
            answer = scanner.next();
            if (answer.equalsIgnoreCase("Y")) {
                customer = new VipCustomer();
            } else {
                System.out.println("Please enter your name:");
                String firstName = scanner.next();
                System.out.println("Please enter your email address:");
                String emailAddress = scanner.next();
                customer = new RegularCustomer(firstName, emailAddress);
            }
        }

        // Choose item type
        System.out.println("What would you like to order? Enter 'F' for food, 'M' for merchandise, 'S' for service:");
        String itemType = scanner.next();
        switch (itemType.toUpperCase()) {
            case "F":
                // Choose food item
                System.out.println("What would you like to order? Enter 'C' for cake, 'B' for bread:");
                String foodType = scanner.next();
                switch (foodType.toUpperCase()) {
                    case "C":
                        Cake cake = new Cake();
                        System.out.println("Available flavors:");
                        for (String flavor : cake.getFlavours()) {
                            System.out.println("- " + flavor);
                        }
                        System.out.println("Enter the flavor you would like to order:");
                        String flavors = scanner.next();
                        cake.setTypes(Types);
                        System.out.println("Enter the quantity you would like to order:");
                        int quantity = scanner.nextInt();
                        customer.orderFood(cake, quantity);
                        break;
                    case "B":
                        Bread bread = new Bread();
                        System.out.println("Available types:");
                        for (String type : bread.getVarieties()) {
                            System.out.println("- " + type);
                        }
                        System.out.println("Enter the type you would like to order:");
                        String breadType = scanner.next();
                        bread.setType(breadType);
                        System.out.println("Enter the quantity you would like to order:");
                        quantity = scanner.nextInt();
                        customer.orderFood(bread, quantity);
                        break;
                    default:
                        System.out.println("Invalid input.");
                        break;
                }
                break;
            case "M":
                // Choose merchandise item
                System.out.println("What would you like to order? Enter 'H' for hat, 'M' for mug, 'P' for poster:");
                String merchandiseType = scanner.next();
                switch (merchandiseType.toUpperCase()) {
                    case "H":
                        Hat hat = new Hat();
                        System.out.println("Available types:");
                        for (String type : hat.getTypes()) {
                            System.out.println("- " + type);
                        }
                        System.out.println("Enter the type you would like to order:");
                        String hatType = scanner.next();
                        hat.setType(hatType);

                        
                        System.out.println("Enter the quantity you would like to order:");

                        int quantity = scanner.nextInt();

                        customer.orderMerchandise(hat, quantity);
  
                        break;

                    case "M":

                        Mug mug = new Mug();

                        System.out.println("Available designs:");

                        for (String design : mug.getTypes()) {

                            System.out.println("- " + design);

                        }

                        System.out.println("Enter the design you would like to order:");

                        String mugDesign = scanner.next();

                        mug.setDesign(mugDesign);

                        System.out.println("Enter the quantity you would like to order:");

                        quantity = scanner.nextInt();

                        
                       Customer.orderMerchandise(mug, quantity);

                       break;

                    case "P":

                        Poster poster = new Poster();

                        System.out.println("Available designs:");

                        for (String design : poster.getDesigns()) {

                            System.out.println("- " + design);

                        }

                        System.out.println("Enter the design you would like to order:");

                        String posterDesign = scanner.next();

                        poster.setDesign(posterDesign);

                        System.out.println("Enter the quantity you would like to order:");

                        quantity = scanner.nextInt();

                        customer.orderMerchandise(poster, quantity);

                        break;

                    default:

                        System.out.println("Invalid input.");

                        break;

                }

                break;

            case "S":

                System.out.println("What service would you like to order? Enter 'D' for delivery, 'C' for catering:");

                String serviceType = scanner.next();

                switch (serviceType.toUpperCase()) {
case "D":
System.out.println("Enter your address:");
String address = scanner.next();
customer.orderDelivery(address);
break;
case "C":
System.out.println("Enter the number of people you would like to cater for:");
int numPeople = scanner.nextInt();
customer.orderCatering(numPeople);
break;
default:
System.out.println("Invalid input.");
break;
}
break;
default:
System.out.println("Invalid input.");
break;
}
            // Calculate total cost and print receipt
    double subtotal = customer.getSubtotal();
    double tax = subtotal * taxRate;
    double total = subtotal + tax;
    System.out.println("\nReceipt:");
    System.out.println("Customer: " + customer.getName());
    System.out.println("Email: " + customer.getEmail());
    System.out.println("Item: " + customer.getItemOrdered());
    System.out.println("Quantity: " + customer.getQuantityOrdered());
    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
    System.out.println("Tax: $" + String.format("%.2f", tax));
    System.out.println("Total: $" + String.format("%.2f", total));
}

}