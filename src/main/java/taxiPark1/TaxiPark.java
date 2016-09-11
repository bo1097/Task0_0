/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxiPark1;

/**
 *
 * @author lenovo
 */
public class TaxiPark {
    
    private String name; //Название таксопарка
    private int price = 0;  // Цена таксопарка
    private int quantityOfPlaces; // количество мест под машины
    private Car[] carsOnStation; // Массив для хранения машин
    private int numberOfCars =0; // Количество машин в таксопарке
   
    public TaxiPark(String name,int quantityOfPlaces){
       this.name = name;
       carsOnStation = new Car[quantityOfPlaces];
       this.quantityOfPlaces = quantityOfPlaces;
   }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantityOfPlaces() {
        
        return quantityOfPlaces;
    }

    public void setQuantityOfPlaces(int quantityOfPlaces) {
        this.quantityOfPlaces = quantityOfPlaces;
    }
    
     public Car[] getCarsOnStation() {
        return carsOnStation;
    }

    public void setCarsOnStation(Car[] carsOnStation) {
        this.carsOnStation = carsOnStation;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }
    

    @Override
    public String toString() {
        return "TaxiPark{" + "name=" + name + ", quantityOfPlaces=" + quantityOfPlaces + '}';
    }
    
    /*
    Метод, который добавляет машины в таксопарк
    */
    public void addCar(Car car){
    carsOnStation[numberOfCars++] = car;
    price += car.getCost();
        }
    /*
    Метод, который удаляет машину из таксопарка
    */
    public void removeCar(){
        
        
    }
    
    /*
    Метод, который выводит все машины таксопарка
    */
    public void showAllCarsOfStation(){
        for(int i=0; i< numberOfCars; i++){
            System.out.println( i+1+": " + carsOnStation[i]);
        }
    }
    /*
    Метод, который сортирует машины по расходу топлива
    */
    public void sortByFuel(){
        
    }
    /*
    Метод, который выводит машины с заданной максимальной скоростью 
    */
    public void showCarBySpeed(){
        
    }
    /*
    Метод возвращает булевое значение, в зависимости от того есть ли место на станции или нет. 
    */
    
    public boolean placeOnStation(){
        return numberOfCars < carsOnStation.length;
        }

  
   
    
    
    
    
    
    
    
}
