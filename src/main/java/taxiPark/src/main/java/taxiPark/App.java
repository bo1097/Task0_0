/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxiPark;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class App {
    
    
    
    private static TaxiPark []taxiParks = new TaxiPark[2];
    static Scanner sc= new Scanner(System.in);;
    static boolean onStart = false;
    static int quantityOfParks = 0;
    static int i;
    //static final int j = 1+i;
    
    
    
   public static void main(String[] args) {
   int choice;
       while(!onStart){
       System.out.println("Меню:");
       System.out.println("1: Создать таксопарк");
       System.out.println("2: Информация о таксопарке");
       System.out.println("3: Выход");
       
       try {
           choice = Integer.parseInt(sc.next());
           switch(choice){
               case 1: createTaxiPark();break;
                            
               case 2:  taxiParkInfo(); break;
           }
           
           
       } catch (Exception e) {
           System.out.println("Попробуйте еще раз");
       }
       }
                }
    
//   Пункт меню : 1
//   Метод создает таксопарк
    public static void createTaxiPark(){
        System.out.println("Введите количество автопарков, которые хотите создать");
        quantityOfParks =Integer.parseInt(sc.next());
        for(i=0; i<quantityOfParks; i++){
        int j = i + 1;    
        System.out.println("Создание " +j+"-ого "+"таксопарка");
        System.out.println("Введите имя для вашего "+j+"-ого "+ "таксопарка");
        String userParkName = sc.next();
        System.out.println("Введите количество машин в этом таксопарке");
        int userQuantityOfCars =Integer.parseInt(sc.next());
        initializeTaxiParks(i,userParkName,userQuantityOfCars,countParkPrice(userQuantityOfCars));
  }}
     //   Пункт меню : 1
    //Метод высчитывает стоимость автопарка
    public static int countParkPrice(int quantityOfCars){
        int price = quantityOfCars * 20;
        return price;
    }
    
    //   Пункт меню : 1
    //Метод помещяет обьект в массив taxiparks
    public static void initializeTaxiParks(int count, String name, int cars, int price){
        TaxiPark taxiPark = new TaxiPark(name,cars,price);
        taxiParks[count] = taxiPark;
    }
    
//    Пункт меню: 2
//    Метод выводит информацию об автопарке
    public static void taxiParkInfo(){
        if(quantityOfParks ==0){
            System.out.println("Пока не существует ни одного таксопарка");
        }else{
       System.out.println("Выберите таксопарк");
        for (int i =0; i<taxiParks.length; i ++) {
            int j = i+1;
            System.out.print( j + ":"+taxiParks[i].getNameOfPark());
            System.out.println();
        }}
        
        
    }
    
   
    

    
}
