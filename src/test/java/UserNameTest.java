/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.passwordverification.Validation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class UserNameTest {
    
   Validation obj_val = new Validation(); 
   @Test
   public void UserNameTest()
   {
       assertEquals("Enobela",obj_val.LoginVerifyUsername("Enobela"));
   }
    // Test the code
    @Test
   public void PassUserTest()
   {
       assertEquals("@Enobela",obj_val.LoginVerifyPassword("#Enobela"));
   }
    
   
}
