/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxiPark;

import java.util.Random;

/**
 *
 * @author lenovo
 */
public class Car implements Comparable<Object> {
    static Random r = new Random();
    private String model;
    private int price;
    private int fuelConsumption;
    private int fuelConsumptionOnTrack; //Расход топилва по трассе
    private int maxSpeed;
    
    private static final String [] marks = {
      "Bmw",
      "Audi",
      "Opel",
      "Mercedez",
      "Toyota",
      "Chevrolet",
      "Renault",
      "Lexus",
      "Lada",
      "Kia",
      "Wolksvagen"     
    };

    public Car(String model, int price, int fuelConsumption, int maxSpeed) {
        this.model = model;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }
    
    public static void fillWithRandomMarks(int quantityOfCars){
       boolean onStart = false;
      while(!onStart){ 
          if(quantityOfCars == 0){
            System.out.println("Не создано ни одной машины");
        }
        String [] arrayOfCars = new String[quantityOfCars];
        for(int i =0; i < arrayOfCars.length; i ++){
            arrayOfCars[i] = marks[r.nextInt(marks.length)];
            System.out.println(arrayOfCars[i] + ", ");
            
     }
      onStart = true;}}

    
    

    
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
    //Метод создает рандомный расход топлива
    public static int returnRandomFuel(int consumption){
        while(consumption<6){
            consumption = r.nextInt(30);
        }
        return consumption;
   }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
