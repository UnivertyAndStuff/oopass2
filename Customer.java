/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakeryorderingsystem;

/**
 *
 * @author user
 */
public class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private int phoneNo;
    private boolean member;
    
    public Customer(){
        firstName = "";
        lastName = "";
        age = 0;
        phoneNo = 0;
        member = true;
    }
    
    public Customer(String first, String last, int Age, int number, boolean card){
        setCustomer(first, last, Age, number, card);
    }
    
    public String toString(){
        return (firstName + " " + lastName + " " + age + " " + phoneNo + " " + member);
    }
    
    public void setCustomer(String first, String last, int Age, int number, boolean card){
        firstName = first;
        lastName = last;
        age = Age;
        phoneNo = number;
        member = card;
    }
    
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public int getPhoneNo(){
        return phoneNo;
    }
    public boolean getMmeber(){
        return member;
    }
}
