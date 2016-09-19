/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train1;

/**
 *
 * @author lenovo
 */
public class Carriage implements Comparable<Carriage> {
    
    private int index; // Индекс вагона в поезде
    private int quantityOfPassengers; // Количество пассажиров в вагоне
    private int quantityOfBaggage; // Количество багажа в вагоне
    private int comfortLevel; // Уровень комфорта в вагоне 
    
    public final CarriageType carriageType;

    public int getQuantityOfBaggage() {
        return quantityOfBaggage;
    }

    @Override
    public int compareTo(Carriage o) {
        if(o == null){
            return -1;
        }
        if(this.comfortLevel > o.comfortLevel){
            return 1;
        }
        if(this.comfortLevel < o.comfortLevel){
            return -1;
        }
        else{
            return 0;
        }
    }
        
    
    public static enum CarriageType {
        CARRIAGE_TYPE_COUPE, CARRIAGE_TYPE_PK, CARRIAGE_TYPE_EXPRESS;

        @Override
        public String toString() {
            switch(this){
                case CARRIAGE_TYPE_COUPE : return "Купе"; 
                case CARRIAGE_TYPE_PK : return "Плац-Карт";
                case CARRIAGE_TYPE_EXPRESS : return "Экспресс";
                default : throw new IllegalArgumentException();
            }
        }
        
    }
    
    /*
    Конструктор который опредляет тип вагона и его параметры
    */
    public Carriage(CarriageType carriageType, int index, int quantityOfPassengers, int comfortLevel ){
        this.carriageType = carriageType;
        this.index = index;
        this.quantityOfPassengers = quantityOfPassengers; 
        this.comfortLevel = comfortLevel;
        quantityOfBaggage = quantityOfPassengers / 3;
    }
    
    
    
    
    public int getQuantityOfPassengers() {
        return quantityOfPassengers;
    }

    @Override
    public String toString() {
        return "Вагон " + index + ". " + "Тип: " + carriageType +
                "; Количество пассажиров: " + quantityOfPassengers +
                "; Количество багажа: " + quantityOfBaggage + "; Уровень комфорта: " + comfortLevel;
     }
    
    
    
}
