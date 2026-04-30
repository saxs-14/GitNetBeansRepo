/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dict421.gitassignmentproject;

/**
 *
 * @author mamag
 */
public class Login {
    public void loginUser(String username) {
        System.out.println("Welcome, " + username + "! You have successfully logged in.");
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.loginUser("Phathu");
    }
}