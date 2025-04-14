/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NewJFrameTest {

    @Test
    public void testUsernameValid() {
        String validUsername = "kyl_1";
        String invalidUsername = "kyle!!!!!!";

        assertTrue(NewJFrame.isUsernameValid(validUsername), 
            "Username should be correctly formatted.");
        
        assertFalse(NewJFrame.isUsernameValid(invalidUsername), 
            "Username should not be correctly formatted.");
    }

    @Test
    public void testLoginSuccess() {
        NewJFrame.username = "kyl_1";
        NewJFrame.password = "Ch&&sec@ke99!";
        
        assertTrue(NewJFrame.login("kyl_1", "Ch&&sec@ke99!", NewJFrame.username, NewJFrame.password), 
            "Login should be successful.");
    }

    @Test
    public void testLoginFailure() {
        NewJFrame.username = "kyl_1";
        NewJFrame.password = "Ch&&sec@ke99!";
        
        assertFalse(NewJFrame.login("wrongUser ", "wrongPass", NewJFrame.username, NewJFrame.password), 
            "Login should fail.");
    }

    @Test
    public void testPasswordValid() {
        String validPassword = "Ch&&sec@ke99!";
        String invalidPassword = "password";

        assertTrue(NewJFrame.isPasswordValid(validPassword), 
            "Password should meet complexity requirements.");
        
        assertFalse(NewJFrame.isPasswordValid(invalidPassword), 
            "Password should not meet complexity requirements.");
    }

    @Test
    public void testCellphoneNumberValid() {
        String validCellNumber = "+27838968976";
        String invalidCellNumber = "08966553";

        assertTrue(NewJFrame.isCellphoneNumberValid(validCellNumber), 
            "Cellphone number should be correctly formatted.");
        
        assertFalse(NewJFrame.isCellphoneNumberValid(invalidCellNumber), 
            "Cellphone number should not be correctly formatted.");
    }

    @Test
    public void testUserMessages() {
        NewJFrame.username = "kyl_1";
        NewJFrame.first_name = "Kyl";
        NewJFrame.last_name = "Smith";
        
        String welcomeMessage = "Welcome " + NewJFrame.first_name + " " + NewJFrame.last_name + " it is great to see you.";
        assertEquals(welcomeMessage, "Welcome Kyl Smith it is great to see you.", 
            "Welcome message should be correctly formatted.");
    }
}
