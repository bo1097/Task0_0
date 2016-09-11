/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train;

/**
 *
 * @author lenovo
 */

// Класс описисывает вагон-плацкарт
public class CarriagePK extends Carriage{
        
    int quantityOfBeds; // количество койек
  
    public CarriagePK(int index, int quantityOfPassengers, int comfortLevel) {
        super(index, quantityOfPassengers, comfortLevel);
    }
    
   
  }
