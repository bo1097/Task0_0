/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train1;

import java.util.Arrays;

/**
 *
 * @author lenovo
 */
public class Train {
    
    private final int carriageQuantity; // Общее количество вагонов 
    private  final int carriageCoupeQuantity; // Количество вагонов купе
    private final int carriagePKQuantity; // Количество вагонов плац-карт
    private int coupeCount; // Счетчик вагонов купе
    private int pkCount; // Счетчик вагонов плац-карт
    private int expressCount; // Счетчик вагонов экспресс
    public final TrainType trainType; 
    private Carriage[] arrayOfCarriages; // Массив вагонов
    private int carriageCount; // Счетчик вагонов поезда

    public Carriage[] getArrayOfCarriages() {
        return arrayOfCarriages;
    }
  
   public enum TrainType{
       TRAIN_TYPE_PASSENGER, TRAIN_TYPE_EXPRESS;

} 
   
   public String typeToString(){
       if(trainType.equals(TrainType.TRAIN_TYPE_PASSENGER)){
           return "Пассажирский";
       }
       if(trainType.equals(TrainType.TRAIN_TYPE_EXPRESS)){
           return "Экспресс";
       }
       else{
           return null;
       }
   }
   
   /*
   Конструктор для создания пассажирского поезда 
   */ 
   public Train(int carriageCoupeQuantity, int carriagePKQuantity){
       trainType = TrainType.TRAIN_TYPE_PASSENGER;
       this.carriageCoupeQuantity = carriageCoupeQuantity;
        this.carriagePKQuantity = carriagePKQuantity;
        carriageQuantity = carriagePKQuantity + carriageCoupeQuantity;
        arrayOfCarriages = new Carriage[carriageQuantity];
     }
   
   /*
   Конструктор для создания экспресс поезда
   */
   public Train(int carriageQuantity){
       trainType = TrainType.TRAIN_TYPE_EXPRESS;
       this.carriageQuantity = carriageQuantity; 
       this.carriageCoupeQuantity = 0;
       this.carriagePKQuantity = 0;
       arrayOfCarriages = new Carriage[carriageQuantity];
   }
   
     public int getCarriageQuantity() {
        return carriageQuantity;
    }
    
    /*
     Метод добавляет определенный вагон в массив вагонов поезда. Длина массива определяется в конструкторе. 
     */
     public void addCarriages(Carriage carriage){
         if(arrayOfCarriages.length <= carriageCount++){
             arrayOfCarriages = Arrays.copyOf(arrayOfCarriages, (carriageCount++) + 10);
         }
         arrayOfCarriages[carriageCount++] = carriage;
     }
     
     /*
     Метод выводит все вагоны данного поезда
     */
     public void showAllCarriages(){
         for(int i =0; i < carriageCount; i ++){
             System.out.println(arrayOfCarriages[i]);
         }
     }
     
     
    @Override
    public String toString() {
         return " Тип:" + typeToString() + "; Количество вагонов: " + carriageQuantity;
    }

    public int getCarriageCoupeQuantity() {
        return carriageCoupeQuantity;
    }

    public int getCarriagePKQuantity() {
        return carriagePKQuantity;
    }
     
    
    
}
