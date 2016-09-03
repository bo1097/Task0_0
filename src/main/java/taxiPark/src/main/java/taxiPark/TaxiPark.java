/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxiPark;

/**
 *
 * @author lenovo
 */
public class TaxiPark {
    
     private static int costOfPark;
     private static int quantityOfCars;
     private static String nameOfPark;

    public TaxiPark(String nameOfPark, int quantityOfCars, int costOfPark) {
       this.nameOfPark = nameOfPark;
       this.quantityOfCars = quantityOfCars;
       this.costOfPark = costOfPark;
   }

    

    
     
    public static int getCostOfPark() {
        return costOfPark;
    }

    public static void setCostOfPark(int aCostOfPark) {
        costOfPark = aCostOfPark;
    }

    public static int getQuantityOfCars() {
        return quantityOfCars;
    }

    public static void setQuantityOfCars(int aQuantityOfCars) {
        quantityOfCars = aQuantityOfCars;
    }

    public static String getNameOfPark() {
        return nameOfPark;
    }

    public static void setNameOfPark(String aNameOfPark) {
        nameOfPark = aNameOfPark;
    }
     
     
     
    
    
    
}
