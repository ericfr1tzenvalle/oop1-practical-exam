/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public class TestPerson {
    public static void main(String[] args) {
        // Person p1 = new Person("Marco", "1234-00");
        // System.out.println(p1);
        // Output: Owner{name=Marco, cpf=1234-00}

        // Person p2 = new Person(null, "1234-00");
        // System.out.println(p2);
        // Exception in thread "main" java.lang.IllegalArgumentException: Name cannot be null or empty

        // Person p3 = new Person("", "1234-00");
        // System.out.println(p3);
        // Exception in thread "main" java.lang.IllegalArgumentException: Name cannot be null or empty

        // Person p4 = new Person("Marco", null);
        // System.out.println(p4);
        // Exception in thread "main" java.lang.IllegalArgumentException: CPF cannot be null or empty

        Person p5 = new Person("Marco", "");
        System.out.println(p5);
        // Exception in thread "main" java.lang.IllegalArgumentException: CPF cannot be null or empty
    }
}
