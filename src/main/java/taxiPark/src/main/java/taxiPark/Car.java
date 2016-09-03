/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxiPark;

/**
 *
 * @author lenovo
 */
public class Car {
    
    private String model;
    private int price;
    private int fuelConsumption;
    private int maxSpeed;

    public Car(String model, int price, int fuelConsumption, int maxSpeed) {
        this.model = model;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    
}
