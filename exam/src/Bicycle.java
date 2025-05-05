import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
//TODO: define Bicycle as a specialization of Vehicle
public class Bicycle extends Vehicle{
    
    private String color;

    public Bicycle(Person mainOwner, String model, String brand, String color) {
        super(mainOwner, model, brand);
        setColor(color);
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        if (color == null || color.isEmpty()) throw new IllegalArgumentException("Color cannot be null or empty");
        this.color = color;
    }

    @Override
    public String move(int distance){
        this.mileage = this.mileage + Math.abs(distance);
        if(this.mileage > 0){
            return "Bicycle is moving forward";
        }else if(this.mileage < 0){
            return "Bicycle is moving backward";
        }
        return "Bicycle is stopped.";
    }

    @Override
    public String toString() {
        return super.toString() + "Bicycle{" + "color=" + color + '}';
    }
    
}
