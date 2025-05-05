/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public class TestRegister {
    public static void main(String[] args) {
        // Register reg1 = new Register(1000, "POA", "04/29/2025");
        // System.out.println(reg1);
        // Expected output: Register{number=1000, location=POA, date=04/29/2025}
        
        // Register reg2 = new Register(0, "POA", "04/29/2025");
        // System.out.println(reg2);
        // Exception in thread "main" java.lang.IllegalArgumentException: Number must be greater than zero
        
        // Register reg3 = new Register(10, "", "04/29/2025");
        // System.out.println(reg3);
        // Exception in thread "main" java.lang.IllegalArgumentException: Location cannot be null or empty
        
        // Register reg4 = new Register(10, null, "04/29/2025");
        // System.out.println(reg4);
        // Exception in thread "main" java.lang.IllegalArgumentException: Location cannot be null or empty
        
        // Register reg5 = new Register(10, "POA", "");
        // System.out.println(reg5);
        // Exception in thread "main" java.lang.IllegalArgumentException: Date cannot be null or empty
        
        // Register reg6 = new Register(10, "POA", null);
        // System.out.println(reg6);
        // Exception in thread "main" java.lang.IllegalArgumentException: Date cannot be null or empty
    }
}
