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
public class Sedan extends Car{
    
    private int quantityOfSeats; //Количество пассажирских мест
    
    
    public Sedan(){
        
    }
    public Sedan(String mark, int fuelConsumption, int cost, int maxSpeed, int quantityOfSeats){
        super(mark,fuelConsumption,cost,maxSpeed);
        this.quantityOfSeats = quantityOfSeats;
    }
    
    public int returnCost(){
        return (super.getMaxSpeed()- super.getFuelConsumption()) + 10000;
    }
    
    @Override
    public String toString() {
        return " Легковой автомобиль " + super.getMark()  + ":"+
                " стоимость - " + super.getCost() + " USD" +
                ", расход топлива - " + super.getFuelConsumption() + " л/100км."+
                 ", количество посадочных мест - " + quantityOfSeats ;
    }

    public int getQuantityOfSeats() {
        return quantityOfSeats;
    }

    public void setQuantityOfSeats(int quantityOfSeats) {
        this.quantityOfSeats = quantityOfSeats;
    }
    
    
}
