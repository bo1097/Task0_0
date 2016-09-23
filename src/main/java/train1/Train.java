/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static train1.App.sc;

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
  
   public static enum TrainType{
       TRAIN_TYPE_PASSENGER("Пассажирский"), TRAIN_TYPE_EXPRESS("Экспресс");
       
       public  String name;

        private TrainType(String name) {
            this.name = name;
        }
       
        public  String getName(){
           return name;
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
         if(arrayOfCarriages.length < carriageQuantity ){
             throw new ArrayIndexOutOfBoundsException();
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
     
      /*
    Метод находит вагоны с заданным диапазоно пассажиров
    */
    public  void passengersInRange(Train train){
        String range = "";
        int from; // от
        int to; // до
        boolean onStart = false;
        boolean allGood = false;
      System.out.println("Через дефис напишите диапазон пассажиров. В таком виде: n-n");
    while(!onStart){
        range = sc.next();
        if(checkRange(range)){
        String []split = range.split("-");
        from = Integer.parseInt(split[0]);
        to = Integer.parseInt(split[1]);
        for(int i = 0 ; i < getCarriageQuantity(); i ++){
            if(getArrayOfCarriages()[i].getQuantityOfPassengers()>=from 
                        && getArrayOfCarriages()[i].getQuantityOfPassengers()<=to){
                allGood = true;
                System.out.println(getArrayOfCarriages()[i]);
            }
        }
        if(!allGood){
            System.out.println("Вагонов с количеством пассажиров  в диапазоне " + range + " нет");
        }
        onStart = true;
        } else{
            System.out.println("Неверный диапазон. Попробуйте еще раз ");
        }
        
    }
        
    }
        /*
        Метод проверяет правильно ли пользователь написал диапазон пассажиров
        */
        public  boolean checkRange(String range){
            Pattern p = Pattern.compile("[0-6]?[0-9]{1}[-]{1}[0-6]?[0-9]{1}");
            Matcher m = p.matcher(range);
            return m.matches();
        
        }
        
        /*
    Метод, который находит общее количество пассажиров в поезде
    */
    public  void showQuantityOfPassengers(){
        int allPassengers = 0; // Все пассажиры поезда
        for(int i =0 ; i < getCarriageQuantity(); i ++){
            allPassengers += getArrayOfCarriages()[i].getQuantityOfPassengers();
        }
        System.out.println("Общее количество пассажиров в поезде: " + allPassengers);
    }
    
    /*
    Метод сортирует вагоны по уровню комфорта
    */
    public  void sortOnComfortLevel(){
        Arrays.sort(getArrayOfCarriages());
        showAllCarriages();
    }
    
     /*
    Метод, который находит общее количество багажа в поезде 
    */
    public  void showQuantityOfBaggage(){
       int allBaggage = 0; //Общее количество багажа
        for(int i = 0; i < getCarriageQuantity(); i ++){
            allBaggage += getArrayOfCarriages()[i].getQuantityOfBaggage();
        }
        System.out.println("Общее количество багажа в поезде: " + allBaggage);
    }
     
     
    @Override
    public String toString() {
         return " Тип:" +trainType.getName() + "; Количество вагонов: " + carriageQuantity;
    }

    public int getCarriageCoupeQuantity() {
        return carriageCoupeQuantity;
    }

    public int getCarriagePKQuantity() {
        return carriagePKQuantity;
    }
     
    
    
}
