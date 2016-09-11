/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author lenovo
 */

//Класс описывает поезд
public class Train {
    private int carriageQuantity;// Количество вагонов
    private Carriage[] arrayOfCarriages = new Carriage[10];
    private int carriageCoupeQuantity; // количество вагонов купе
    private int carriagePKQuantity; // Количество вагонов плац-карт
   
    /*
    Конструктор для экспресс поезда. Который имеет только один вид вагонов - Экспресс.
    */
    public Train(int carriageQuantity) {
        this.carriageQuantity = carriageQuantity;
    }
    
    
    public Train(int carriageCoupeQuantity, int carriagePKQuantity){
        this.carriageCoupeQuantity = carriageCoupeQuantity;
        this.carriagePKQuantity = carriagePKQuantity;
        this.carriageQuantity = carriagePKQuantity + carriageCoupeQuantity;
    }
    
    
   
    public int getCarriageQuantity() {
        return carriageQuantity;
    }

    public void setCarriageQuantity(int carriageQuantity) {
        this.carriageQuantity = carriageQuantity;
    }

    @Override
    public String toString() {
        return "Train{" + "carriageQuantity=" + carriageQuantity + '}';
    }
   
    public void addCarriage(Carriage carriage, int i){
    if(carriageQuantity>=arrayOfCarriages.length){
        arrayOfCarriages = Arrays.copyOf(arrayOfCarriages, carriageQuantity + 10);
    }
        arrayOfCarriages[i] = carriage;
    }
    
    public void addCarriages(Carriage [] carriageCoupes, Carriage[] carriagePKs){
        arrayOfCarriages = new Carriage[carriageCoupes.length + carriagePKs.length];
        System.arraycopy(carriagePKs, 0, arrayOfCarriages, 0, carriagePKs.length);
        System.arraycopy(carriageCoupes, 0, arrayOfCarriages, carriagePKs.length, carriageCoupes.length);
    }
    
    
    public void showAllCarriages(){
      for(int i =0; i < carriageQuantity; i ++){
          System.out.println(arrayOfCarriages[i]);
    }
    }

    public Carriage[] getArrayOfCarriages() {
        return arrayOfCarriages;
    }

    public void setArrayOfCarriages(Carriage[] arrayOfCarriages) {
        this.arrayOfCarriages = arrayOfCarriages;
    }

    public int getCarriageCoupeQuantity() {
        return carriageCoupeQuantity;
    }

    public void setCarriageCoupeQuantity(int carriageCoupeQuantity) {
        this.carriageCoupeQuantity = carriageCoupeQuantity;
    }

    public int getCarriagePKQuantity() {
        return carriagePKQuantity;
    }

    public void setCarriagePKQuantity(int carriagePKQuantity) {
        this.carriagePKQuantity = carriagePKQuantity;
    }
   
    
    
}