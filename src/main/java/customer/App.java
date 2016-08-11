/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.util.Arrays;
import java.util.Random;


/**
 *
 * @author bo1097
 */
public class App {
    
    private static Customer [] customerArray = new Customer[10];
    static Random r = new Random();
    
    private static String []lastNames = {
        "Греховодов",
        "Колесников",
        "Артемов",
        "Иванов",
        "Петров",
        "Сидоров",
        "Макаренко",
        "Лукьяненко",
        "Дьяков",
        "Мануйлов"
  };
    private static String []names = {
        "Богдан",
        "Роман",
        "Артем",
        "Иван",
        "Петр",
        "Никита",
        "Кирилл",
        "Андрей",
        "Илья",
        "Олег"
  };
    private static String []middleNames = {
        "Олександрович",
        "Юрьевич",
        "Артемович",
        "Иванович",
        "Петрович",
        "Михайлович",
        "Кириллович",
        "Андреевич",
        "Ильич",
        "Адольфович"
  };
    
    private static String []addresses = {
        "Новгородская 43",
        "Павлова 156",
        "Сумская 68",
        "Иванова 12",
        "Петрова 81",
        "Клочковская 184",
        "Петровского 11",
        "Пушкинская 57",
        "Шевченко 231",
        "Проспект Ленина 12"
  };
    public static void generateCustomer(){
        for(int i =0; i < customerArray.length; i ++){
        Customer c = new Customer();
        c.setName(names[r.nextInt(customerArray.length)]);
        c.setLastName(lastNames[r.nextInt(customerArray.length)]);
        c.setMiddleName(middleNames[r.nextInt(customerArray.length)]);
        c.setAddress(addresses[r.nextInt(customerArray.length)]);
        c.setCreditCard(checkNumber(r.nextInt(9999)));
        c.setBankAccount(checkNumber(r.nextInt(9999)));
        c.setId(i+1);
        customerArray [i] = c;
    }
}
    
    
    public static void show(){
        for(Customer c : customerArray){
            System.out.println(c + " ");
        }
    }
    
            
            
    public static void main(String []args){
        generateCustomer();
        show();
        showInAlphabet();
        showCardInDiaposone();
        
     }
    
    public static int checkNumber(int num){
        
     while(num<=999){
     num = r.nextInt(9999);
     }
     return num;
       
   }
    public static void showInAlphabet(){
        Arrays.sort(customerArray);
        System.out.println("Список клиентов в алфавитном порядке");
        for(Customer c: customerArray){
            System.out.println(c + " ");
        }
    }
    
    public static void showCardInDiaposone(){
      int from = checkNumber(r.nextInt(9999));
      int to = from + r.nextInt(9999-from);
    System.out.println("Список клиентов с кредитной карточкой в диапазоне от " + from + " до "+ to);
          
        for(Customer c : customerArray){
            if(c.getCreditCard()>=from && c.getCreditCard()<=to){
                System.out.println(c);
            }
            
   }
    
}}
