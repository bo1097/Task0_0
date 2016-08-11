/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author bo1097
 */
public class Customer implements Comparable<Customer>{
    private String lastName;
    private String name;
    private String middleName;
    private String address;
    private int creditCard;
    private int bankAccount;
    private int id = 1;

//    public Customer(String lastName, String name, String middleName, String address, long creditCard, long bankAccount,int id) {
//        this.lastName = lastName;
//        this.name = name;
//        this.middleName = middleName;
//        this.address = address;
//        this.creditCard = creditCard;
//        this.bankAccount = bankAccount;
//        this.id = id;
//    }
    

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    
    
    @Override
    public String toString() {
        return "Customer "+ id + ": ФАМИЛИЯ: " + lastName + "  ИМЯ:" + name + "  ОТЧЕСТВО:" + middleName + "  АДРЕС:" + address + "  КРЕДИТНАЯ КАРТА:" + creditCard + "  НОМЕР СЧЕТА:" + bankAccount + '}';
    }

    

    @Override
    public int compareTo(Customer c) {
        return lastName.compareToIgnoreCase(c.lastName);
    }
    
    
   
    
    
    
    
    
}
