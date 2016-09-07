/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * /


    

/**
 *
 * @author lenovo
 */

package taxiPark1;


public class Car {
    
   private String mark; // Марка автомобиля
   private int fuelConsumption; //Расход топлива
   private int cost; // Цена
   private int maxSpeed; // Максимальная скорость
  
    
    
    public Car(){
        
    } 
    public Car(String mark, int fuelConsumption, int cost , int maxSpeed) {
        this.mark = mark;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
        this.maxSpeed = maxSpeed;
        
    }
    
    

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" + "mark=" + mark + ", fuelConsumption=" + fuelConsumption + ", cost=" + cost + '}';
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    
    
}
