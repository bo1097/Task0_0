/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

import java.util.Random;

/**
 *
 * @author bo1097
 */
public class App {
    
   static  Random r = new Random();

    private static Patient [] patientArray = new Patient[10];
    private static String [] names ={
        "Богдан",
        "Роман",
        "Игорь",
        "Павел",
        "Кирилл",
        "Никита",
        "Станислав",
        "Геннадий",
        "Федор",
        "Савелий",
    };
       private static String [] secondNames ={
        "Греховодов",
        "Колесников",
        "Алехин",
        "Дуров",
        "Макаренко",
        "Иваненко",
        "Вакарчук",
        "Букин",
        "Бондарчук",
        "Васильев",
    };
      private  static String [] middleNames ={
        "Олександрович",
        "Юрьевич",
        "Васильевич",
        "Игнатович",
        "Алексеевич",
        "Олегович",
        "Геннадьевич",
        "Станиславович",
        "Кириллович",
        "Иванович",
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
        private  static String [] phones ={
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
         private  static String [] diagnoses ={
        "ОРЗ",
        "Ангина",
        "Воспаление легких",
        "Пилонефрит",
        "Воспаление силизенки",
        "Кашель",
        "Отравление",
        "Головная боль",
        "Отравление",
        "Пилонефрит",
    };
       
    
    public static void main(String[] args) {
       initializePatient();
        print();
        medCard();
        
    }
    
    public static void initializePatient(){
        for(int i =0; i < patientArray.length;i++){
            Patient p = new Patient();
            p.setName(names[r.nextInt(names.length)]);
            p.setSecondName(secondNames[r.nextInt(secondNames.length)]);
            p.setMiddlename(middleNames[r.nextInt(middleNames.length)]);
            p.setAddress(addresses[r.nextInt(addresses.length)]);
            p.setPhone(phones[r.nextInt(phones.length)]);
            p.setDiagnose(diagnoses[r.nextInt(diagnoses.length)]);
            p.setMedCard(checkNumber(r.nextInt(9999)));
            patientArray[i] = p;
            
            
        }
        
    }
    
    public static int checkNumber(int num){
        if(num<=999){
            num = r.nextInt(9999);
        }return num;
    }
    
    public static void print(){
        //initializePatient();
        for(Patient p : patientArray){
            System.out.println(p);
        }
    }
    
    
    public static void medCard(){
       int from = checkNumber(r.nextInt(9999));
       int to = from +r.nextInt(9999-from);
        System.out.println("Список пациентов, у которых медицинская карта в дипазоне от " + from + " до " + to);
        for(Patient p : patientArray){
            if(p.getMedCard()>= from && p.getMedCard()<=to){
                System.out.println(p);
            }
        }
    }
    
   
}
