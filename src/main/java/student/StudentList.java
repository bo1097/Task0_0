/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author bo1097
 */
public class StudentList {
    
   private static  Student[]st;
   
    StudentList(Student [] s){
        st = s;
    }
    
    public void byFakultet(String fakultet){
        System.out.println("Студенты факультета " + fakultet);
        
       for(Student s : st){
           if(s.getFakultet().equalsIgnoreCase(fakultet)){
               System.out.println(s);
           }
       }
    }
    public void byKursAndFakulet(int kurs, String fakultet){
        System.out.println("Студенты " + kurs + " курса. Факультета " + fakultet);
        
        for(Student s : st){
           if(s.getFakultet().equalsIgnoreCase(fakultet) && s.getKurs() == kurs){
                System.out.println(s);
            }else {
              System.out.println("Таких студентов нету"); break;
           }
        }
    }
    
    public void listOfStudents(){
        for(Student s: st){
            if(s.getKurs() == 1){
                System.out.println("Студенты первого курса: " + s);
            }
            if(s.getKurs() == 2){
                System.out.println("Студенты второго курса: " + s);
            }
            if(s.getKurs() == 3){
                System.out.println("Студенты третьего курса: " + s);
            }
            if(s.getKurs() == 4){
                System.out.println("Студенты четвертого курса: " + s);
            }
            if(s.getKurs() == 2){
                System.out.println("Студенты пятого курса: " + s);
            }
        }
    }
    public void studentYear(int year){
        System.out.println("Список студентов родившиеся после " + year + " года");
        for(Student s: st){
            if(s.getYear() >= year){
                System.out.println(s + " ");
               
            }
             else{
                    System.out.println("Таких студентов нет"); break;    
                        }
        }
        
    }
    public void studentGroup(String group){
        System.out.println("Cписок студентов из группы "  + group);
        for(Student s: st){
            if(s.getGroup().equalsIgnoreCase(group)){
                System.out.println(s + " ");
            }
                
        }
    }
    
    
    
    
    
}
