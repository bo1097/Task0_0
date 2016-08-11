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
public class App {
    
    public static void main(String[] args) {
        
       Student s1 = new Student("Grehovodov", "Bogdan", "Oleksandrovich", "10.01.", 1997, "Novgorodskaya", 20, "0502868899","SGT", 3, "a");
       Student s2 = new Student("Kolesnikov", "Roman", "Urevich", "06.08.",1997, "Pavlova", 20, "0502868855","IF", 2, "b");
       Student s3 = new Student("Sidorov", "Ivan", "Oleksandrovich", "11.01.",1995, "Sumska", 21, "050286887876","IF", 2, "c");
       Student s4 = new Student("Ivanov", "Peter", "Olegovich", "14.01.",1998, "Petrovskogo", 11, "0632868899","SGT", 3, "a");
       Student s5 = new Student("Kozlov", "Maxim", "Ivanovich", "10.05.",1995, "Klochkovckaya", 67, "0982868899","SGT", 3, "v");
       Student s6 = new Student("Kovalenko", "Aloyna", "Oleksandrovna", "02.06.",1994, "23 Avgusta", 45, "0632868899","MEO", 5, "e");
       Student s7 = new Student("Petrov", "Roman", "Igorevich", "04.03.",1997, "Prospekt Lenina", 43, "0632978899","MEO", 5, "a");
       Student s8 = new Student("Stam", "Sophia", "Oleksandrovna", "13.07.",1993 ,"Ahsarova", 5, "0602868899","SGT", 1, "e");
       Student s9 = new Student("Galkina", "Yana", "Igorevna", "25.07.",1992, "Pavlova", 76, "0602818899","IF", 4, "e");
       
       Student [] stud = {s1,s2,s3,s4,s5,s6,s7,s8,s9};
        

        
        for(Student s: stud){
            System.out.println(s);
        }
        
        StudentList st = new StudentList(stud);
        st.byFakultet("SGT");
        st.byKursAndFakulet(2, "IF");
        st.listOfStudents();
        st.studentYear(2000);
       st.studentGroup("e");
        
        
    }}
        
       
        

    
           
        
    