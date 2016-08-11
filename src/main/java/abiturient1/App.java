/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abiturient1;

import java.util.Random;

/**
 *
 * @author bo1097
 */
public class App {
    
    
    static Random r = new Random();
    static Abiturient [] abiturientArray = new Abiturient[r.nextInt(20)];
    
    
    private static String [] names = {
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
    
    private static String [] secondNames = {
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
    private static String [] middleNames = {
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
    private static String [] addresses = {
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
    
    private static String [] phones = {
        "0502867489",
        "0634768910",
        "0678798320",
        "0506784901",
        "0546783017",
        "0576879845",
        "0935679120",
        "0671035643",
        "0564789310",
        "0673874862",
    };
    
   
    public static void main(String[] args) {
        
    }
    
    public static void generateAbiturient(){
       for(int i = 0; i < abiturientArray.length; i++){
           Abiturient ab = new Abiturient();
           ab.setName(names[r.nextInt(abiturientArray.length)]);
           ab.setSecondName(secondNames[r.nextInt(abiturientArray.length)]);
           ab.setmiddleName(middleNames[r.nextInt(abiturientArray.length)]);
           ab.setAdress(addresses[r.nextInt(abiturientArray.length)]);
           ab.setPhone(phones[r.nextInt(abiturientArray.length)]);
           ab.setMarkEnglish(r.nextInt(10));
           ab.setMarkGeography(r.nextInt(10));
           ab.setMarkGrammar(r.nextInt(10));
           ab.setMarkHistory(r.nextInt(10));
           ab.setMarkMath(r.nextInt(10));
       }
    }
    
    
    
   
    
}
