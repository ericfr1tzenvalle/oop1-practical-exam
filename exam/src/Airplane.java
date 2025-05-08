/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mk
 */


public class Airplane extends Vehicle {
    private Purpose purpose;
    private Person[] owners = new Person[4];

   

    public Airplane(Person mainOwner, String model, String brand, Purpose purpose) {
        super(mainOwner, model, brand);
        this.purpose = purpose;
    }

    public boolean addOwner(Person person) {
        
        
        if (person.equals(this.getMainOwner()) && owners[0] == person) {
            return false;
        }
        if (owners[0] == null || owners[0] != this.getMainOwner()) {
            owners[0] = this.getMainOwner();
        }
        for (int i = 0; i < owners.length; i++) {
            if (owners[i] == null) {
                owners[i] = person;
                return true;
            }
        }
        return false;
    }

    public Person[] getOwners() {
        return owners;
    }

    public boolean belongsTo(Person p) {
        for (int i = 0; i < owners.length; i++) {
            if (owners[i].equals(p)) {
                return true;
            }
        }
        return false;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public String getContent() {
        return this.getPurpose().getUsage();
    }

    public void setPurpose(Purpose p) {
        if (this.purpose == Purpose.AGRICULTURAL || p == Purpose.AGRICULTURAL && this.purpose != Purpose.AGRICULTURAL) {
            throw new IllegalArgumentException("Agricultural airplane cannot change its purpose or be converted from another type.");
        }
        this.purpose = p;
    }

    @Override
    public String move(int distance) {
        int mileage = this.getMileage() + distance;
        this.setMileage(mileage);
        return "The airplane is moving forward";
    }

    @Override
    public String toString() {
        return super.toString() + "Airplane{" + "purpose=" + purpose + '}';
    }

}
