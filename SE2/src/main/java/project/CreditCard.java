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
public class CreditCard extends Payment {
    private String fullName;
    private int cardNumber;
    private int cvv;

    public CreditCard(int paymentId, String paymentType, Date paymentDate, String paymentStatus, int bill_ID, float payment, String fullName, int cardNumber, int cvv) {
        super(paymentId, paymentType, paymentDate, paymentStatus, bill_ID, payment);
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void makePayment(float amount) {
        super.makePayment(amount);
        System.out.println("Paid using Credit Card.");
    }
}
