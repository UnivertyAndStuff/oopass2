/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bakeryorderingsystem;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class BakeryOrderingSystem {
    static Scanner scanner =  new Scanner(System.in);
    static String firstName = scanner.nextLine(), lastName = scanner.nextLine();
    static int age = scanner.nextInt(), phoneNo = scanner.nextInt();
    
    static Customer customer = new Customer(firstName, lastName, age, phoneNo, true);
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(customer);
    }
    
}
