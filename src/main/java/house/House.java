/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

/**
 *
 * @author bo1097
 */
public class House {
    
    private int flatNum;
    private int square;
    private int floor;
    private int roomNum;
    private String street;
    private String type;
    private int term;

    public House(int flatNum, int square, int floor, int roomNum, String street, String type, int term) {
        this.flatNum = flatNum;
        this.square = square;
        this.floor = floor;
        this.roomNum = roomNum;
        this.street = street;
        this.type = type;
        this.term = term;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public int getFlatNum() {
        return flatNum;
    }

    public void setFlatNum(int flatNum) {
        this.flatNum = flatNum;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "House{" + "flatNum=" + flatNum + ", square=" + square + ", floor=" + floor + ", roomNum=" + roomNum + ", street=" + street + ", type=" + type + ", term=" + term + '}';
    }
    
    
    
}
