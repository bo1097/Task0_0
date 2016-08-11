/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abiturient1;

/**
 *
 * @author bo1097
 */
public class Abiturient {
    private String secondName;
    private String name;
    private String middleName;
    private String adress;
    private String phone;
    private int markHistory;
    private int markMath;
    private int markGeography;
    private int markEnglish;
    private int markGrammar;
    
     public Abiturient(String secondName, String name, String middleName, String adress, String phone, int markHistory, int markMath, int markGeography, int markEnglish, int markGrammar) {
        this.secondName = secondName;
        this.name = name;
        this.middleName = middleName;
        this.adress = adress;
        this.phone = phone;
        this.markHistory = markHistory;
        this.markMath = markMath;
        this.markGeography = markGeography;
        this.markEnglish = markEnglish;
        this.markGrammar = markGrammar;
    }

   public Abiturient(){
       
   }
      @Override
    public String toString() {
        return "Abiturient{" + "surname=" + secondName + ", name=" + name + ", fname=" + middleName + ", adress=" + adress + ", phone=" + phone + ", markHistory=" + markHistory + ", markMath=" + markMath + ", markGeography=" + markGeography + ", markEnglish=" + markEnglish + ", markGrammar=" + markGrammar + '}';
    }
    
    public String getSurname() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getmiddleName() {
        return middleName;
    }

    public void setmiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMarkHistory() {
        return markHistory;
    }

    public void setMarkHistory(int markHistory) {
        this.markHistory = markHistory;
    }

    public int getMarkMath() {
        return markMath;
    }

    public void setMarkMath(int markMath) {
        this.markMath = markMath;
    }

    public int getMarkGeography() {
        return markGeography;
    }

    public void setMarkGeography(int markGeography) {
        this.markGeography = markGeography;
    }

    public int getMarkEnglish() {
        return markEnglish;
    }

    public void setMarkEnglish(int markEnglish) {
        this.markEnglish = markEnglish;
    }

    public int getMarkGrammar() {
        return markGrammar;
    }

    public void setMarkGrammar(int markGrammar) {
        this.markGrammar = markGrammar;
    }
    
}
