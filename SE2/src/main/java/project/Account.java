/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author DELL
 */

import java.util.ArrayList;
public class Account {
        private ArrayList<User> users;

    public Account() {
        users = new ArrayList<>();
    }

    public void registerUser(String name, String username, String password) {
        users.add(new User(name, username, password));
    }

    // This method prints the details of all registered users
    public void printUsers() {
        if (users.isEmpty()) {
            System.out.println("No users registered yet.");
            return;
        }

        System.out.println("Registered Users:");
        for (User user : users) {
            System.out.println(user); // Assuming User class has a meaningful toString() method
        }
    }

//login
    
  public boolean verifyLogin(String username, String password) {
    for (User user : users) {
      if (user.getName().equals(username) && user.getPassword().equals(password)) {
        return true;
      }
    }
    return false;
  }
  
}