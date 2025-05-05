/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public class TestBikeCycle {
    public static void main(String[] args) {
        // BikeCycle cb1 = new BikeCycle(null, "air", "caloi", "black");
        // Exception in thread "main" java.lang.IllegalArgumentException: Owner cannot be null

        Person p1 = new Person("Marco", "1234-00");

        // BikeCycle cb1 = new BikeCycle(p1, "air", "caloi", "black");
        // System.out.println(cb1);
        // Vehicle{registration=null, model=air, brand=caloi, mileage=0, mainOwner=Owner{name=Marco, cpf=1234-00}}BikeCycle{color=black}

        // cb1.setMainOwner(new Person("Ana", "6789-11"));
        // System.out.println(cb1);
        // Vehicle{registration=null, model=air, brand=caloi, mileage=0, mainOwner=Owner{name=Ana, cpf=6789-11}}BikeCycle{color=black}

        // BikeCycle cb2 = new BikeCycle(p1, "air", "caloi", "");
        // System.out.println(cb2);
        // Exception in thread "main" java.lang.IllegalArgumentException: Color cannot be null or empty

        // BikeCycle cb3 = new BikeCycle(p1, "air", "caloi", null);
        // System.out.println(cb3);
        // Exception in thread "main" java.lang.IllegalArgumentException: Color cannot be null or empty

        // ---------------- BikeCycle with registration test ----------------

        // BikeCycle cb1 = new BikeCycle(p1, "air", "caloi", "black");
        Registration reg1 = new Registration(1000, "POA", "04/29/2025");

        // cb1.setRegistration(reg1);
        // System.out.println(cb1);
        // Vehicle{registration=Registration{number=1000, place=POA, date=04/29/2025}, model=air, brand=caloi, mileage=0}BikeCycle{color=black}

        // cb1.setRegistration(null);
        // Exception in thread "main" java.lang.IllegalArgumentException: Registration cannot be null

        // ---------------- BikeCycle methods test ----------------
        Bicycle cb1 = new Bicycle(p1, "air", "caloi", "black");
        System.out.println(cb1.move(-100)); // The BikeCycle is moving backwards
        System.out.println("Current mileage = " + cb1.getMileage()); // Current mileage = 100
        System.out.println(cb1.move(1100)); // The BikeCycle is moving forward
        System.out.println("Current mileage = " + cb1.getMileage()); // Current mileage = 1200
    }
}
