/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author DELL
 */
public class Employee extends User {

    private String department;


    public Employee(int userID, String name, String gender, int age, String address, String phone, String email, String username, String password, String department) {
        super(userID, name, gender, age, address, phone, email, username, password);
        this.department = department;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

 
    public void enterReading() {

        System.out.println("Entering reading for user: " + getUsername());
    }



}
