/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

import java.util.Random;

/**
 *
 * @author lenovo
 */

//Класс описывает Вагон 
public class Carriage {
    
    private int index; // Номер вагона
    private int quantityOfPassengers; // Количество пассажиров
    private int quantityOfBaggage; // Количество багажа
    private int comfortLevel; // Уровень комфорта 
    Random r = new Random();
   
    
    public Carriage() {
        
   }

    
    
    public Carriage(int index, int quantityOfPassengers,int comfortLevel) {
        this.index = index;
        this.quantityOfPassengers = quantityOfPassengers;
        this.comfortLevel = comfortLevel;
        this.quantityOfBaggage = quantityOfPassengers/3;
    }
    
    
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getQuantityOfPassengers() {
        return quantityOfPassengers;
    }

    public void setQuantityOfPassengers(int quantityOfPassengers) {
        this.quantityOfPassengers = quantityOfPassengers;
    }

    public int getQuantityOfBaggage() {
        return quantityOfBaggage;
    }

    public void setQuantityOfBaggage(int quantityOfBaggage) {
        this.quantityOfBaggage = quantityOfBaggage;
    }

    @Override
    public String toString() {
        return "Carriage{" + "index=" + index + ", quantityOfPassengers=" + quantityOfPassengers + ", quantityOfBaggage=" + quantityOfBaggage + ", comfortLevel=" + comfortLevel + '}';
    }
    
   
    
    
    
}
