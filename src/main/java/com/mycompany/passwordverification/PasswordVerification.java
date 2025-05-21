/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.passwordverification;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class PasswordVerification {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Validation obj_valid = new Validation();
        System.out.println("Enter Your Password ");
        String pass= scan.nextLine();
        
       Boolean PassCheck = obj_valid.CheckCharacter(pass);
        //System.out.println("The method returned : " + PassCheck);
        
        // Make a decision 
        
        
        if(PassCheck ==true)
        {
            System.out.println("Your password is Strong");
            obj_valid.AddDetails();
            
            
        // JOptionPane.showMessageDialog(null, "Your Password is strong");
        }
        else 
        {
            System.out.println("Your password is weak");
        }
        
        System.out.println("---------------------------------------------");
       
       
        
       
    }
}
