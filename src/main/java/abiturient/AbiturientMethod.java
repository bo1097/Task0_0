/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abiturient;

/**
 *
 * @author bo1097
 */
public class AbiturientMethod {
    
   static Abiturient[] array;
     public AbiturientMethod(Abiturient[]array){
         this.array = array;
     }
     
     public void abiturient(){
         System.out.println("Список абитуриентов");
         System.out.println();
         for(Abiturient ab: array){
             System.out.println(ab + " ");
         }
     }
     
     public void badMarks(){
         System.out.println("Список абитуриентов с неудовлетворитльными оценками");
         System.out.println();
         for(Abiturient p: array){
             if(p.getMarkEnglish()+p.getMarkGeography()+p.getMarkGrammar()+p.getMarkHistory()+p.getMarkMath()<15){
                 System.out.println(p + " ");
             }
             
         }
     }
     
     public void byMark(int mark){
         System.out.println("Список абитурентов, у которых сумма баллов выше " + mark);
         System.out.println();
         for(Abiturient ab:array){
             if(ab.getMarkEnglish()+ab.getMarkGeography()+ab.getMarkGrammar()+ab.getMarkHistory()+ab.getMarkMath()>mark){
                 System.out.println(ab + " ");
             }
         }
     }
     public void bestMark(){
         System.out.println(  "абитуриента с лучшими оценками");
         int summ;
         int temp=0;
         for(Abiturient ab: array){
         summ = ab.getMarkEnglish()+ab.getMarkGeography()+ab.getMarkGrammar()+ab.getMarkHistory()+ab.getMarkMath();
          if(summ>temp){
              temp = summ;
          }
             System.out.println(temp + " ");
             
         }
     }
    
}
