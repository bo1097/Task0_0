/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author bo1097
 */
public class BookMethod {
    
    static Book[] array;
    
    
    
    BookMethod(Book[]array){
        this.array = array;
    }
    
    
    public void author(String name){
        System.out.println("Книги автора " + name + ":");
        
        
        for(Book b : array){
            if(b.getAuthor().equalsIgnoreCase(name)){
                System.out.println(b + " ");
            }
            
        }
        System.out.println();
    }
    
    public void publish (String publishName){
        System.out.println("Книги издательства " + publishName + ":");
        
        
        for(Book b: array){
            if(b.getPublish().equalsIgnoreCase(publishName)){
                System.out.println(b + " ");
            }
        }
        System.out.println();
}
    
    public void year(int year){
        System.out.println("Книги выпущенные после " + year + " года");
        
        for(Book b : array){
            if(b.getYear()>=year){
                System.out.println(b + " ");
            }
        }
    }
    
}
