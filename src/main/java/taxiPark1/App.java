/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxiPark1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class App {
    static Scanner sc = new Scanner(System.in);
    private static TaxiPark [] taxiParks = new TaxiPark[10];
    private static int numberOfTaxiParks = 0;
    static Random random = new Random();
    
    public static void main(String[] args) {
       
        int choice; // Выбор пользователя в главном меню
        boolean onStart = false; 
       while(!onStart){
       System.out.println("Меню:");
       System.out.println("1: Создать таксопарк");
       System.out.println("2: Информация о таксопарке");
       System.out.println("3: Вывести все таксопарки");
       System.out.println("4: Выход");
       
   try{
      choice = Integer.parseInt(sc.next());
      switch(choice){
          case 1 : createTaxiPark(); break;
          case 2 : taxiStationInfo(); break;
          case 3 : showAllTaxiParks(); break;
          case 4 : onStart = true; break;
      } 
      
   }
   catch(NumberFormatException e){
       System.out.println("Попробуйте еще раз");
   }
   catch(IllegalArgumentException e){
       System.out.println(e.getMessage());
   } 
    }}
    
    /*
    Метод содержит меню для создания таксопарка
    */
    public static void createTaxiPark(){
        System.out.println("Напишите имя своего таксопарка");
        String nameOfPark = sc.next();
        System.out.println("Напишите количество мест под автомобиль в вашем таксопарке");
        int numberOfPlaces = Integer.parseInt(sc.next());
        initializeTaxiPark(nameOfPark,numberOfPlaces);
        
    }
    
    /*
    Метод инициализирует ТАКСОПАРК и добавляет его в массив taxiParks
    */
    public static void initializeTaxiPark(String name, int places){
        TaxiPark taxiPark = new TaxiPark(name, places);
    if(numberOfTaxiParks>=taxiParks.length){
        taxiParks = Arrays.copyOf(taxiParks, numberOfTaxiParks + 10);
    }
        taxiParks[numberOfTaxiParks++] = taxiPark;
    }
    
    /*
    В методе пользователь выбирает над каким таксопарком
     проводить различные операции.
    */
    public static void taxiStationInfo(){
       int choice; // Выбор пользователя (по таксопаркам)
        if(numberOfTaxiParks ==0){
           throw  new IllegalArgumentException("Пока не создано ни одного таксопарка.");
       }
        System.out.println("Выберите таксопарк");
        for(int i=0; i < numberOfTaxiParks; i++){
            System.out.println(i + 1 + "." + taxiParks[i]);
        }
        try{
        choice = Integer.parseInt(sc.next());
        if(choice>numberOfTaxiParks || choice<=0){
            throw new NumberFormatException();
        }
        controlTaxiStation(choice-1);
      }catch (NumberFormatException e){
            System.out.println("Введены неверные данные");
     }
      }
    
    /*
    Метод, который управляет таксопарком
    */
    public static void controlTaxiStation(int indexOfTaxiPark){
        TaxiPark taxiPark = taxiParks[indexOfTaxiPark];
        int choice;//Выбор пользователя(по действиям)
        System.out.println("1. Добавить машину в таксопарк");
        System.out.println("2. Убрать машину из таксопарка");
        System.out.println("3. Вывести все машины таксопарка");
        System.out.println("4. Вывести стоимость таксопарка");
        System.out.println("5. Провести сортировку автомобилей парка по расходу топлива");
        System.out.println("6. Найти автомобиль, имеющий определенную максимальную скорость");
        
        try{
            choice = Integer.parseInt(sc.next());
            switch(choice){
                case 1 :
                    if(!taxiPark.placeOnStation()){
                        throw new IllegalArgumentException("В таксопарке нет места!");}
                           Car car = chooseCar();
                                taxiPark.addCar(car);
                                     break;
                case 2 : taxiPark.removeCar();break;
                case 3 : taxiPark.showAllCarsOfStation();break;
                case 4 : taxiPark.checkPrice(); break;
                case 5 : taxiPark.sortByFuel();break;
                case 6 : taxiPark.showCarBySpeed();break;
            }
            
        }catch(NumberFormatException e){
            System.out.println("Введены неправильные данные");
        }
        
        
        
    }
    /*
     Метод в котором пользователь выбирает  тип машины
    */
      public static Car chooseCar(){
        while(true){
          int choice; //Выбор пользователя (по типу кузова)
        System.out.println("Выберите тип кузова для машины");
        System.out.println("1. Седан");
        System.out.println("2. Грузовой автомобиль");
        
        try{
            choice = Integer.parseInt(sc.next());
            switch(choice){
                case 1 : return sedan();
                case 2 : return van();
                
            }
            
        }catch(NumberFormatException e){
            System.out.println("Введены неправильные данные");
        }
        catch(IllegalArgumentException e){
            System.out.println("Введены неправильные данные");
        }
        }
    }
      
      /*
      Метод возвращает обьект Седан
      */
        public static Car sedan(){
          System.out.println("Введите марку легковой машины");
          String userMark = sc.next();
          Sedan sedan = new Sedan();
          sedan.setMark(userMark);
          sedan.setFuelConsumption(random.nextInt(6) + 10);
          sedan.setMaxSpeed(random.nextInt(150) + 50);
          sedan.setQuantityOfSeats(random.nextInt(2) + 4);
          sedan.setCost(sedan.returnCost());
          return sedan;
      }
        
        public static Car van( ){
            System.out.println("Напишите марку для грузового автомобиля");
            String mark = sc.next();
            Van van = new Van();
            van.setMark(mark);
            van.setMaxSpeed(random.nextInt(80) + 70);
            van.setFuelConsumption(random.nextInt(18) + 10);
            van.setCapacity(random.nextInt(400) + 200);
            van.setCost(van.returnCost());
            return van;
        }
        
        
    
   
    /*
    Метод выводит все таксопарки, созданные пользователем
    */
    public static void showAllTaxiParks(){
        if(numberOfTaxiParks==0){
            System.out.println("Пока не создано ни одного таксопарка");
        }
        for(int i =0; i < numberOfTaxiParks; i ++){
            System.out.println(taxiParks[i].toString());
        }
        
    }
    
     
}
