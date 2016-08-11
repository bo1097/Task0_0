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
public class App {
    public static void main(String[] args) {
        
        Book b1 = new Book("Системы баз данных","Грег Риккарди","Вильямс",2001,360,250,"Твердый");
        Book b2 = new Book("Изучаем SQL","Линн Бейли","Питер",2012,279,325,"Твердый");
        Book b3 = new Book("Настройка приложений баз данных","Б.А. Новиков, Г.Р. Домбровская","БХВ-Петербург",2006,460,470,"Мягкий");
        Book b4 = new Book("Системы управления базами данных и знаний","А. Наумов","Финансы и статистика",1991,210,250,"Твердый");
        Book b5 = new Book("Базы данных","С.В. Глушаков, Д.В. Ломотько","АСТ",2002,438,500,"Твердый");
        Book b6 = new Book("SQL","Мартин Грабер","Лори",2003,471,400,"Мягкий");
        Book b7 = new Book("Базы данных. Разработка приложений","Л.В. Рудикова","БХВ-Петербург",2006,127,130,"Мягкий");
        Book b8 = new Book("SQL. Сборник рецептов","Энтони Молинаро","Символ-плюс",2009,115,300,"Мягкий");
       
        
        Book [] bArray = {b1,b2,b3,b4,b5,b6,b7,b8};
        
        BookMethod bm = new BookMethod(bArray);
        bm.author("Линн Бейли");
        bm.publish("Вильямс");
        bm.year(2003);
    
    
    }
    
}
