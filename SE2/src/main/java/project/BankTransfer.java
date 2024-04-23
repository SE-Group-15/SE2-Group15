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
public class BankTransfer extends Payment {
     private int accountNumber;
    private int routingNumber;

    public BankTransfer(int paymentId, String paymentType, Date paymentDate, String paymentStatus, int bill_ID, float payment, int accountNumber, int routingNumber) {
        super(paymentId, paymentType, paymentDate, paymentStatus, bill_ID, payment);
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

     @Override
    public void makePayment(float amount) {
        super.makePayment(amount);
        System.out.println("Paid using Bank Transfer.");
    }
}
