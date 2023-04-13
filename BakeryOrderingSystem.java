///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
package bakeryorderingsystem;
import java.util.Arrays;
import java.util.Scanner;
import bakeryorderingsystem.invoice;

import java.util.Scanner;

public class BakeryOrderingSystem {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to Benzies Bakery Ordering System!");

            //---------------------------Customers details-----------------------------
            System.out.println("Enter your first name: ");
            String firstName = scanner.nextLine();
            System.out.println("Enter your last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.println("Enter your Phone number: ");
            String phoneNo = scanner.nextLine();
            System.out.println("Are you a member(Y/N): ");
            String member = scanner.nextLine();

            //This is the variable to initialized input
            System.out.println("Enter pastry name:");
            String pastryName = scanner.nextLine();
            String flavoursInput;
            String[] flavours;
            String quantityInput;
            String[] quantity;
            double[] price;
            double total = 0;
            double gtotal = 0;
            
            //---------------------------for members-----------------------------
            if (member.equals("Y")) {
                //---------------------------pastry type-----------------------------
                if (pastryName.equals("bread")) {
                    System.out.println("Cranberry & chocolate, Wheat, Pandan, Multigrain, Rye");
                    System.out.println("Enter flavours (separated by comma):");
                    flavoursInput = scanner.nextLine();
                    flavours = flavoursInput.split(",");
                    System.out.println("6 Slices, 12 Slices");
                    System.out.println("Enter quantity (separated by comma):");
                    quantityInput = scanner.nextLine();
                    quantity = quantityInput.split(",");
                    price = new double[]{2.0, 4.0}; // example prices for 6 slices and 12 slices
                    if (quantityInput.equals("6")) {
                        total = price[0];
                    } else if (quantityInput.equals("12")) {
                        total = price[1];
                    } else {
                        System.out.println("invalid");
                    }
                } else if (pastryName.equals("cake")) {
                    System.out.println("Hazelnut choc, Vanilla, Strawberry, Lemon, Red Velvet");
                    System.out.println("Enter flavours (separated by comma):");
                    flavoursInput = scanner.nextLine();
                    flavours = flavoursInput.split(",");
                    System.out.println("1 slice, 6 slices, Whole cake");
                    System.out.println("Enter quantity (separated by comma):");
                    quantityInput = scanner.nextLine();
                    quantity = quantityInput.split(",");
                    price = new double[]{5, 25.0, 45.0}; // example prices for 6 slices and 12 slices
                    if (quantityInput.equals("1")) {
                        total = price[0];
                    } else if (quantityInput.equals("6")) {
                        total = price[1];
                    } else if (quantityInput.equals("whole")) {
                        total = price[2];
                    } else {
                        System.out.println("invalid");
                    }
                } else if (pastryName.equals("doughnut")) {
                    System.out.println("Glazed, Chocolate, Biscoff, Onde-onde, Cinnamon");
                    System.out.println("Enter flavours (separated by comma):");
                    flavoursInput = scanner.nextLine();
                    flavours = flavoursInput.split(",");
                    System.out.println("1 doughnut, 6 doughnuts, 12 doughnuts");
                    System.out.println("Enter quantity (separated by comma):");
                    quantityInput = scanner.nextLine();
                    quantity = quantityInput.split(",");
                    price = new double[]{4.0, 24.0, 42.0};
                    if (quantityInput.equals("1")) {
                        total = price[0];
                    } else if (quantityInput.equals("6")) {
                        total = price[1];
                    } else if (quantityInput.equals("12")) {
                        total = price[2];
                    } else {
                        System.out.println("invalid");
                    }
                } else if (pastryName.equals("tart")) {
                    System.out.println("Fruit, Chocolate, Custard, Egg, Durian");
                    System.out.println("Enter flavours (separated by comma):");
                    flavoursInput = scanner.nextLine();
                    flavours = flavoursInput.split(",");
                    System.out.println("10 pieces, 20 pieces, 50 Pieces");
                    System.out.println("Enter quantity (separated by comma):");
                    quantityInput = scanner.nextLine();
                    quantity = quantityInput.split(",");
                    price = new double[]{12.0, 22.0, 33.0};
                    if (quantityInput.equals("10")) {
                        total = price[0];
                    } else if (quantityInput.equals("20")) {
                        total = price[1];
                    } else if (quantityInput.equals("50")) {
                        total = price[2];
                    } else {
                        System.out.println("invalid");
                    }
                }else if (pastryName.equals("puff")) {
                    System.out.println("Cream Cheese, Chocolate, Cinnamon, Fruit, Plain");
                    System.out.println("Enter flavours (separated by comma):");
                    flavoursInput = scanner.nextLine();
                    flavours = flavoursInput.split(",");
                    System.out.println("1 piece, 5 pieces, 10 pieces");
                    System.out.println("Enter quantity (separated by comma):");
                    quantityInput = scanner.nextLine();
                    quantity = quantityInput.split(",");
                    price = new double[]{4.0, 19.0, 37.0};
                    if (quantityInput.equals("1")) {
                        total = price[0];
                    } else if (quantityInput.equals("5")) {
                        total = price[1];
                    } else if (quantityInput.equals("10")) {
                        total = price[2];
                    } else {
                        System.out.println("invalid");
                    }
                } else {
                    System.out.println("Invalid pastry name.");
                    continue;
                }

                // calculate total price
                for (int i = 0; i < quantity.length; i++) {
                    if (quantity[i].equals("6")) {
                        total += price[0];
                    } else if (quantity[i].equals("12") || quantity[i].equals("Whole cake") || quantity[i].equals("12 doughnuts")) {
                        total += price[1];
                    } else if (quantity[i].equals("1 doughnut") || quantity[i].equals("1 slice")) {
                        total += price[2];
                    } else {
                        System.out.println("Invalid quantity.");
                        continue;
                    }
                }

                // check for member discount
                if (member.equals("Y")) {
                    gtotal = total * 0.9; // 10% discount for members
                } else {
                    gtotal = total;
                }

                // print the order summary
                System.out.println("------------------------");
                System.out.println("Order Summary:");
                System.out.println("Name: " + firstName + " " + lastName);
                System.out.println("Age: " + age);
                System.out.println("Phone number: " + phoneNo);
                System.out.println("Pastry name: " + pastryName);
                System.out.println("Flavours: " + String.join(", ", flavours));
                System.out.println("Quantity: " + String.join(", ", quantity));
                System.out.println("Total price: RM" + total);
                System.out.println("Grand total: RM" + gtotal);
                System.out.println("------------------------");
                
                // ask if the user wants to place another order
                System.out.println("Do you want to place another order? (Y/N)");
                String orderAgain = scanner.nextLine();
                if (orderAgain.equals("Y")) {
                    continue;
                } else {
                    break;
                }
            
            } else if (member.equals("N")) {
                //---------------------------pastry type-----------------------------
                if (pastryName.equals("bread")) {
                    System.out.println("Cranberry & chocolate, Wheat, Pandan, Multigrain, Rye");
                    System.out.println("Enter flavours (separated by comma):");
                    flavoursInput = scanner.nextLine();
                    flavours = flavoursInput.split(",");
                    System.out.println("6 Slices, 12 Slices");
                    System.out.println("Enter quantity (separated by comma):");
                    quantityInput = scanner.nextLine();
                    quantity = quantityInput.split(",");
                    price = new double[]{2.0, 4.0}; // example prices for 6 slices and 12 slices
                    if (quantityInput.equals("6")) {
                        total = price[0];
                    } else if (quantityInput.equals("12")) {
                        total = price[1];
                    } else {
                        System.out.println("invalid");
                    }
                } else if (pastryName.equals("cake")) {
                    System.out.println("Hazelnut choc, Vanilla, Strawberry, Lemon, Red Velvet");
                    System.out.println("Enter flavours (separated by comma):");
                    flavoursInput = scanner.nextLine();
                    flavours = flavoursInput.split(",");
                    System.out.println("1 slice, 6 slices, Whole cake");
                    System.out.println("Enter quantity (separated by comma):");
                    quantityInput = scanner.nextLine();
                    quantity = quantityInput.split(",");
                    price = new double[]{5, 25.0, 45.0}; // example prices for 6 slices and 12 slices
                    if (quantityInput.equals("1")) {
                        total = price[0];
                    } else if (quantityInput.equals("6")) {
                        total = price[1];
                    } else if (quantityInput.equals("whole")) {
                        total = price[2];
                    } else {
                        System.out.println("invalid");
                    }
                } else if (pastryName.equals("doughnut")) {
                    System.out.println("Glazed, Chocolate, Biscoff, Onde-onde, Cinnamon");
                    System.out.println("Enter flavours (separated by comma):");
                    flavoursInput = scanner.nextLine();
                    flavours = flavoursInput.split(",");
                    System.out.println("1 doughnut, 6 doughnuts, 12 doughnuts");
                    System.out.println("Enter quantity (separated by comma):");
                    quantityInput = scanner.nextLine();
                    quantity = quantityInput.split(",");
                    price = new double[]{4.0, 24.0, 42.0};
                    if (quantityInput.equals("1")) {
                        total = price[0];
                    } else if (quantityInput.equals("6")) {
                        total = price[1];
                    } else if (quantityInput.equals("12")) {
                        total = price[2];
                    } else {
                        System.out.println("invalid");
                    }
                } else if (pastryName.equals("tart")) {
                    System.out.println("Fruit, Chocolate, Custard, Egg, Durian");
                    System.out.println("Enter flavours (separated by comma):");
                    flavoursInput = scanner.nextLine();
                    flavours = flavoursInput.split(",");
                    System.out.println("10 pieces, 20 pieces, 50 Pieces");
                    System.out.println("Enter quantity (separated by comma):");
                    quantityInput = scanner.nextLine();
                    quantity = quantityInput.split(",");
                    price = new double[]{12.0, 22.0, 33.0};
                    if (quantityInput.equals("10")) {
                        total = price[0];
                    } else if (quantityInput.equals("20")) {
                        total = price[1];
                    } else if (quantityInput.equals("50")) {
                        total = price[2];
                    } else {
                        System.out.println("invalid");
                    }
                }else if (pastryName.equals("puff")) {
                    System.out.println("Cream Cheese, Chocolate, Cinnamon, Fruit, Plain");
                    System.out.println("Enter flavours (separated by comma):");
                    flavoursInput = scanner.nextLine();
                    flavours = flavoursInput.split(",");
                    System.out.println("1 piece, 5 pieces, 10 pieces");
                    System.out.println("Enter quantity (separated by comma):");
                    quantityInput = scanner.nextLine();
                    quantity = quantityInput.split(",");
                    price = new double[]{4.0, 19.0, 37.0};
                    if (quantityInput.equals("1")) {
                        total = price[0];
                    } else if (quantityInput.equals("5")) {
                        total = price[1];
                    } else if (quantityInput.equals("10")) {
                        total = price[2];
                    } else {
                        System.out.println("invalid");
                    }
                } else {
                    System.out.println("Invalid pastry name.");
                    continue;
                }

                // calculate total price
                for (int i = 0; i < quantity.length; i++) {
                    if (quantity[i].equals("6")) {
                        total += price[0];
                    } else if (quantity[i].equals("12") || quantity[i].equals("Whole cake") || quantity[i].equals("12 doughnuts")) {
                        total += price[1];
                    } else if (quantity[i].equals("1 doughnut") || quantity[i].equals("1 slice")) {
                        total += price[2];
                    } else {
                        System.out.println("Invalid quantity.");
                        continue;
                    }
                }

                // check for member discount
                if (member.equals("Y")) {
                    gtotal = total; // 10% discount for members
                } else {
                    gtotal = total;
                }

                // print the order summary
                System.out.println("------------------------");
                System.out.println("Order Summary:");
                System.out.println("Name: " + firstName + " " + lastName);
                System.out.println("Age: " + age);
                System.out.println("Phone number: " + phoneNo);
                System.out.println("Pastry name: " + pastryName);
                System.out.println("Flavours: " + String.join(", ", flavours));
                System.out.println("Quantity: " + String.join(", ", quantity));
                System.out.println("Total price: RM" + total);
                System.out.println("Grand total: RM" + gtotal);
                System.out.println("------------------------");
                
                // ask if the user wants to place another order
                System.out.println("Do you want to place another order? (Y/N)");
                String orderAgain = scanner.nextLine();
                if (orderAgain.equals("Y")) {
                    continue;
                } else {
                    break;
                }
            }
       }
    }    
}
    
                


