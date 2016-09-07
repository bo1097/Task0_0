/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxiPark1;

/**
 *
 * @author lenovo
 */
public class Van extends Car {
    
    private int capacity; // Грузоподьемность грузовика
    
    Van(){
        
    }
    
    public Van(String mark, int fuelConsumption, int cost, int maxSpeed, int indexOfCar, int capacity) {
        super(mark, fuelConsumption, cost, maxSpeed);
        this.capacity = capacity;
    }
    
    public int returnCost(){
        return (capacity + super.getMaxSpeed()) + 10500;
    }
    
    
    @Override
    public String toString() {
        return " Грузовой автомобиль " + super.getMark()  + ":"+
                " стоимость - " + super.getCost() + " USD" +
                ", расход топлива - " + super.getFuelConsumption() + " л/100км."+
                 ", грузоподьемность грузовика - " + capacity + " тон." ;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
}
