/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegetables;

import vegetables.Vegetable;

/**
 *
 * @author lenovo
 */
public class Onion extends Vegetable{
    
    public  Onion (String color, double weight, int maturity){
       this.color = color;
       this.weight = weight;
       this.maturity = maturity;
       this.isPeeled = false;
       nameOfPlant = "Лук";
   }
    
}
