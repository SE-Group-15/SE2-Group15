/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author DELL
 */
public class User {
    
    private int userID;
    private String name;
    private String gender;
    private int age;
    private String address;
    private String phone;
    private String email;
    private String username;
    private String password;

    // Constructor
    public User(int userID, String name, String gender, int age, String address, String phone, String email, String username, String password) {
        this.userID = userID;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    // Getters and setters for attributes
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
