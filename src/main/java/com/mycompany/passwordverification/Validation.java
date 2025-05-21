/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passwordverification;

/**
 *
 * @author RC_Student_lab
 */
import java.util.regex.*;
public class Validation {
  
    public Boolean CheckCharacter(String password)
    {
       Pattern pat = Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE); 
       Matcher matcher =pat.matcher(password);
       
    return matcher.find();
    }
   
    public void AddDetails()
    {
        System.out.println(" ************************* \n");
        System.out.println(" You can now add your account details ");
        
        System.out.println(" ********************************** \n");
    
   
    }
    
    public String LoginVerifyUsername(String username)
    {
        
    return username;
    
    }
     public String LoginVerifyPassword(String pass)
    {
        
    return pass;
    
    }
}
