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
public class Student {
    
    private String surname;
    private String name;
    private String fname;
    private String date;
    private int year;
    private String adress;
    private int adnum;
    private String phone;
    private String fakultet;
    private int kurs;
    private String group;
    private int id;

    public Student(String surname, String name, String fname, String date, int year, String adress, int adnum, String phone, String fakultet, int kurs, String group) {
        this.surname = surname;
        this.name = name;
        this.fname = fname;
        this.date = date;
        this.year = year;
        this.adress = adress;
        this.adnum = adnum;
        this.phone = phone;
        this.fakultet = fakultet;
        this.kurs = kurs;
        this.group = group;
        
    }

    


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year= year;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAdnum() {
        return adnum;
    }

    public void setAdnum(int adnum) {
        this.adnum = adnum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

   public void show(){
       System.out.println("Студент " + getSurname() + ", " + getName()+ ", " + getFname() + ", " + getDate() + ", " + getAdress()+ ", " + getAdnum()+ ", " + getPhone()+ ", " + getFakultet()+ ", " + getKurs()+ ", " + getGroup());
   }
   
   
    @Override
    public String toString(){
      return  "Имя:" + getName() + "; Фамилия:" + getSurname() + "; Отчество:" + getFname() +"; Дата рождения: " + getDate() + getYear() + "; Адрес проживания:" +  getAdress() + "; Номер дома:" + getAdnum() + "; Номер телефона:" + getPhone() + "; Факультет:" + getFakultet() + "; Курс:" + getKurs() + "; Группа:" +   getGroup();
    }
    
   
}