/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author DELL
 */
public class Admin extends User {

    private String role;


    public Admin(int userID, String name, String gender, int age, String address, String phone, String email, String username, String password, String role) {
        super(userID, name, gender, age, address, phone, email, username, password);
        this.role = role;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public void viewCustomerInfo(int userID) {

        System.out.println("Viewing customer information for user ID: " + userID);
    }


    public void updateCustomerInfo(int userID) {

        System.out.println("Updating customer information for user ID: " + userID);
    }
}
