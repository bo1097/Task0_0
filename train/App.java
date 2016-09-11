/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author lenovo
 */

// Главный класс, содержащий метод main
public class App {
   
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    static CarriageExpress[] arrayOfExpresses;//Массив для вагонов эксрпесс поезда
    static Train [] arrayOfTrains = new Train [10]; // Массив поездов созданных пользователем
    static int numberOfTrains = 0;
    static Carriage [] arrayOfCoupes =  new Carriage[10]; // Массив для вагонов купе
    static Carriage [] arrayOfPKs = new Carriage[10]; // Массив для вагонов плац-карт
    
    public static void main(String[] args) {
        int choice; // Выбор пользователя
        boolean onStart = false;
        while(!onStart){
            System.out.println("Меню");
            System.out.println("1. Создать поезд");
            System.out.println("2. Инфо о поезде ");
            System.out.println("3. Показать все поезда");
          
            try{
                choice = Integer.parseInt(sc.next());
                switch(choice){
            case 1: createTrain();break;
            case 2: trainInfo(); break;
            case 3: showAllTrains(); break;
                }   
            }
            catch(NumberFormatException e ){
                System.out.println("Попробуйте еще раз");
            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        
        }

}

    public static void createTrain() {
       int choice; 
        System.out.println("Выберите тип поезда");
        System.out.println("1. Экспресс");
        System.out.println("2. Пассажирский");
        
        try{
            choice = Integer.parseInt(sc.next());
            switch(choice){
                case 1 : createExpress();break;
                case 2 : createPassengerTrain();break;
            }
            
        }catch(NumberFormatException e){
            System.out.println("Попробуйте еще раз");
        }}
    
    /*
    Метод создает экспресс поезд.
   */    
    public static void createExpress(){
        int carriageQuantity; // Количество вагонов выбранное пользователем
        System.out.println("Введите количество вагонов в поезде");
        carriageQuantity = Integer.parseInt(sc.next());
        Train trainExpress = new Train(carriageQuantity);
        Train train = trainExpress;
        initializeTrain(train);
        createCarriages(carriageQuantity, train);
        }
    
     public static void initializeTrain(Train train){
        if(numberOfTrains>=arrayOfTrains.length){
            arrayOfTrains = Arrays.copyOf(arrayOfTrains, numberOfTrains + 10);
        }
        arrayOfTrains[numberOfTrains++] = train;
        
    }
    
    
    public static void createCarriages(int carriageQuantity, Train train){
        for(int i =0; i < carriageQuantity; i ++){
          Carriage carriageExpress = new Carriage(i + 1, passengersOnCarriage(), comfortLevel());
          train.addCarriage(carriageExpress, i);
    }}
    /*
    Метод создает пассажирский поезд
    */
    public static void createPassengerTrain(){
       System.out.println("Введите количество вагонов-купе в вашем поезде");
       int quantityOfCoupe = Integer.parseInt(sc.next()); // Количество вагонов-купе выбранное пользователем
       System.out.println("Введите количество вагонов - плацкарт в вашем поезде");
       int quantityOfPK = Integer.parseInt(sc.next()); // Количество вагонов - плацкарт выбранное пользователем
       Train train = new Train(quantityOfCoupe, quantityOfPK);
       initializeTrain(train);
       createPassengerCarriages(quantityOfCoupe, quantityOfPK,train);
     }
    
    /*
    Метод создает два вида вагонов для пассажирского поезда. Вагон-купе и вагон-плацкарт. И запихивает
    их в общий массив вагонов. 
    */
    public static void createPassengerCarriages(int quantityOfCoupe, int quantityOfPK, Train train){
         for(int i =0; i < quantityOfCoupe; i ++){
            Carriage carriageCoupe = new Carriage(i + 1, passengersOnCarriage(),comfortLevel());
            arrayOfCoupes[i] = carriageCoupe;
        }
            for(int j = 0; j<quantityOfPK; j++ ){
                Carriage carriagePK = new Carriage(j+1, passengersOnCarriage(), 1);
                arrayOfPKs[j] = carriagePK;
        } 
         train.addCarriages(arrayOfCoupes, arrayOfPKs);
         
           
    }
    /*
    Метод возвращает количество пассажиров. Минимум - 15, Максимум - 60
    */
    public static int passengersOnCarriage(){
        int quantityOfPassengers = r.nextInt(61);
        while(quantityOfPassengers<15){
            quantityOfPassengers = r.nextInt(61);
        }
        return quantityOfPassengers;
    }
    
    
    /*
    Метод возвращает уровень комфортности. Шкала от 2 до 4
    */
    public static int comfortLevel(){
        int comfortLevel = r.nextInt(4);
        while(comfortLevel ==1){
            comfortLevel = r.nextInt(5);
            
    }
        return comfortLevel;
    }
    
    /*
    Метод предоставляет пользователю меню для просмотра информации про поезд
    */
    public static void trainInfo(){
        if(numberOfTrains ==0){
            throw new IllegalArgumentException("Пока не создано ни одного поезда ");
        }
        Train train = arrayOfTrains[chooseTrain()];
        System.out.println("1. Показать все вагоны поезда");
        int userChoice = Integer.parseInt(sc.next());
        switch(userChoice){
            case 1 : train.showAllCarriages();
        }
        
       
        
        
    }
/*
    Метод предоставляет пользователю выбрать нужный поезд. И возвращает число, 
    которое является индексом нужного поезда в массив arrayOfTrains
    */
    public static int chooseTrain(){
        while(true){
             System.out.println("Выберите поезд");
        for(int i =0; i < numberOfTrains; i ++){
            System.out.println( i + 1 + "- " + arrayOfTrains[i]);
        }
        int userChoice = Integer.parseInt(sc.next());
        if(userChoice > 0 && userChoice<=numberOfTrains){
            return userChoice-1;
        }
        else{
            System.out.println("Попробуйте еще раз");
        }
      }
     }
   /*
    Метод выводит все поезда, созданные пользователем
    */
    public static void showAllTrains(){
     for(int i = 0; i < numberOfTrains; i++){
         System.out.println(arrayOfTrains[i]);
     }   
    }
}

    

