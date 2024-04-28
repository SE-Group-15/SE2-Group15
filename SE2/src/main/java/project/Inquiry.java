/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Date;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


   

   
    

public class Inquiry{

    private int inquiryid;
    private String inquiryinfo;
    private Date inquirydate;
    private JLabel accountLabel;
    private JTextField accountField;
    private JButton searchButton;
    private JLabel inquiryLabel;
    private JTextField inquiryField;
    private JButton submitButton;


   public Inquiry() {
        initComponents();

        setTitle("Inquiry Form");
        setSize(500, 250);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String accountNumber = accountField.getText();
                 
          JOptionPane.showMessageDialog(Inquiry.this, "Searching for account: " + accountNumber);
    }
               
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inquiry = inquiryField.getText();
                JOptionPane.showMessageDialog(Inquiry.this, "Submitted inquiry: " + inquiry);
            }
        });
    }

    private void initComponents() {
        accountLabel = new JLabel("Account :");
        accountField = new JTextField();
        searchButton = new JButton("Search");
        inquiryLabel = new JLabel("What is your inquiry?");
        inquiryField = new JTextField();
        submitButton = new JButton("Submit");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        accountLabel.setBounds(20, 20, 120, 25);
        add(accountLabel);

        accountField.setBounds(150, 20, 200, 25);
        add(accountField);

        searchButton.setBounds(360, 20, 100, 25);
        add(searchButton);

        inquiryLabel.setBounds(20, 60, 150, 25);
        add(inquiryLabel);

        inquiryField.setBounds(180, 60, 280, 25);
        add(inquiryField);

        submitButton.setBounds(180, 100, 100, 30);
        add(submitButton);
    }
 
        
        
        
    

    public Inquiry(int inquiryid, String inquiryinfo, Date inquirydate) {
        this.inquiryid = inquiryid;
        this.inquiryinfo = inquiryinfo;
        this.inquirydate = inquirydate;
    }


    public int getInquiryid() {
        return inquiryid;
    }

    public void setInquiryid(int inquiryid) {
        this.inquiryid = inquiryid;
    }

    public String getInquiryinfo() {
        return inquiryinfo;
    }

    public void setInquiryinfo(String inquiryinfo) {
        this.inquiryinfo = inquiryinfo;
    }

    public Date getInquirydate() {
        return inquirydate;
    }

    public void setInquirydate(Date inquirydate) {
        this.inquirydate = inquirydate;
    }


    public void createInquiry() {

        System.out.println("New inquiry created: " + this.inquiryinfo);
    }


    public static void reviewInquiry() {

        System.out.println("Reviewing inquiries");
 
    }
    
    } 