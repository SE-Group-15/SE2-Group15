/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.util.Date;
/**
 *
 * @author Ahmed
 */
public class Paypal extends Payment {
     private String username;
    private String password;

    public Paypal(int paymentId, String paymentType, Date paymentDate, String paymentStatus, int bill_ID, float payment, String username, String password) {
        super(paymentId, paymentType, paymentDate, paymentStatus, bill_ID, payment);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

     @Override
    public void makePayment(float amount) {
        super.makePayment(amount);
        System.out.println("Paid using Paypal.");
    }
}
