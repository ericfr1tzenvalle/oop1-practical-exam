/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public class TestAirplane {
    public static void main(String[] args) {

        // ----------- BASIC AIRPLANE CREATION TESTS -----------

        // Person p1 = new Person("Marco", "1234-00");
        // Airplane av1 = new Airplane(p1, "737", "boeing", Purpose.CARGO);
        // System.out.println(av1);
        // Expected output: 
        // Vehicle{registration=null, model=737, brand=boeing, mileage=0}
        // Airplane{purpose=CARGO}

        // Invalid model (empty)
        // Airplane av2 = new Airplane(p1, "", "boeing", Purpose.CARGO);
        // Exception: IllegalArgumentException: The model cannot be null or empty

        // Invalid model (null)
        // Airplane av3 = new Airplane(p1, null, "boeing", Purpose.CARGO);
        // Exception: IllegalArgumentException: The model cannot be null or empty

        // Invalid brand (empty)
        // Airplane av4 = new Airplane(p1, "737", "", Purpose.CARGO);
        // Exception: IllegalArgumentException: The brand cannot be null or empty

        // Invalid brand (null)
        // Airplane av5 = new Airplane(p1, "737", null, Purpose.CARGO);
        // Exception: IllegalArgumentException: The brand cannot be null or empty


        // ----------- TESTING AIRPLANE WITH REGISTRATION -----------

        // Airplane av1 = new Airplane(p1, "737", "boeing", Purpose.CARGO);
        // Registration reg1 = new Registration(1000, "POA", "04/29/2025");
        // av1.setRegistration(reg1);
        // System.out.println(av1);
        // Expected output:
        // Vehicle{registration=Registration{number=1000, location=POA, date=04/29/2025}, 
        // model=737, brand=boeing, mileage=0}
        // Airplane{purpose=CARGO}

        // Invalid registration (null)
        // Airplane av2 = new Airplane(p1, "737", "boeing", Purpose.CARGO);
        // av2.setRegistration(null);
        // Exception: IllegalArgumentException: The registration cannot be null


        // ----------- TESTING PRIMARY OWNER AND OWNERS LIST -----------

        // Airplane av1 = new Airplane(p1, "737", "boeing", Purpose.CARGO);
        // Registration reg1 = new Registration(1000, "POA", "04/29/2025");
        // av1.setRegistration(reg1);
        // Person p2 = new Person("Ana", "6789-22");
        // av1.setPrimaryOwner(p2);
        // System.out.println(av1);
        // Expected output:
        // Vehicle{registration=Registration{number=1000, location=POA, date=04/29/2025}, 
        // model=737, brand=boeing, mileage=0, primaryOwner=Owner{name=Ana, cpf=6789-22}}
        // Airplane{purpose=CARGO}

        // Testing owners list
        // System.out.println("Added Marco? " + av1.addOwner(p1));             // true
        // Person p3 = new Person("Joao", "2345-99");
        // System.out.println("Added Joao? " + av1.addOwner(p3));              // true
        // System.out.println("Added Ana again? " + av1.addOwner(p2));         // false
        // System.out.println("Added Luiz? " + av1.addOwner(new Person("Luiz", "6543-77"))); // true
        // System.out.println("Added Pedro? " + av1.addOwner(new Person("Pedro", "2468-11"))); // false

        // Listing all current owners
        // Person[] owners = av1.getOwners();
        // for (int i = 0; i < owners.length; i++) {
        //     System.out.println(owners[i]);  // Expected: Ana, Marco, Joao, Luiz
        // }

        // Checking ownership
        // System.out.println("Is Luiz an owner of the airplane? " + av1.isOwner(new Person("Luiz", "6543-77"))); // true
        // System.out.println("Is Pedro an owner of the airplane? " + av1.isOwner(new Person("Pedro", "2468-11"))); // false


        // ----------- TESTING MOVEMENT AND PURPOSE METHODS -----------

        // Airplane av1 = new Airplane(p1,"737", "boeing", Purpose.CARGO);
        // Registration reg1 = new Registration(1000, "POA", "04/29/2025");
        // av1.setRegistration(reg1);

        // System.out.println(av1.move(1500));                     // "The airplane is moving forward"
        // System.out.println("Current mileage = " + av1.getMileage());  // 1500

        // av1.move(1000);
        // System.out.println("Current mileage = " + av1.getMileage());  // 2500

        // Invalid mileage
        // av1.move(-100);
        // Exception: IllegalArgumentException: Mileage cannot be negative

        // Checking content based on purpose
        // System.out.println("The airplane is transporting " + av1.getContent());  // goods

        // Changing purpose
        // av1.setPurpose(Purpose.PASSENGER);
        // System.out.println("The airplane is transporting " + av1.getContent());  // passengers

        // Invalid change of purpose (after already set)
        // av1.setPurpose(Purpose.AGRICULTURAL);
        // Exception: IllegalArgumentException: Airplane cannot change purpose

        // Another invalid change of purpose
        // Airplane av2 = new Airplane(p1,"TECO-TECO", "ZZZZ", Purpose.AGRICULTURAL);
        // av2.setPurpose(Purpose.CARGO);
        // Exception: IllegalArgumentException: Airplane cannot change purpose
    }
}
