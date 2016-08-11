/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

/**
 *
 * @author bo1097
 */
public class Patient {
    private String name;
    private String middlename;
    private String secondName;
    private String address;
    private String phone;
    private int medCard;
    private String diagnose;

    
    public Patient(){
        
    }

    public Patient(String name, String middlename, String secondName, String address, String phone, int medCard, String diagnose) {
        this.name = name;
       this.middlename = middlename;
        this.secondName = secondName;
      this.address = address;
        this.phone = phone;
       this.medCard = medCard;
     this.diagnose = diagnose;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMedCard() {
        return medCard;
    }

    public void setMedCard(int medCard) {
        this.medCard = medCard;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", middlename=" + middlename + ", secondName=" + secondName + ", address=" + address + ", phone=" + phone + ", medCard=" + medCard + ", diagnose=" + diagnose + '}';
    }
    
    
    
    
}
