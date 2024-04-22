/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author DELL
 */
public class Customer extends User {

    private double consumption;
    private Inquiry inquiry;
    private String meterClassification;
    private Bill bill;
    private String meterType;


    public Customer(int userID, String name, String gender, int age, String address, String phone, String email, String username, String password,
                    double consumption, Inquiry inquiry, String meterClassification, Bill bill, String meterType) {

        super(userID, name, gender, age, address, phone, email, username, password);

        // Initialize additional attributes for Customer class
        this.consumption = consumption;
        this.inquiry = inquiry;
        this.meterClassification = meterClassification;
        this.bill = bill;
        this.meterType = meterType;
    }



 
    public String billingHistory() {

        return "Billing history for customer";
    }


    public void updateInfo(double consumption, Inquiry inquiry, String meterClassification, Bill bill, String meterType) {
        this.consumption = consumption;
        this.inquiry = inquiry;
        this.meterClassification = meterClassification;
        this.bill = bill;
        this.meterType = meterType;
    }


}
