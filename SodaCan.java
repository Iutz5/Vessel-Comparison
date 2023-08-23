/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vessel;

import java.util.Objects;

/**
 *
 * @author ianut
 */
public class SodaCan extends Vessel implements Fillable {
    // member data
    private double _radius;
    private double _height;
    
    // Constructor
    public SodaCan(double height, double radius){
        super._id = "";
        _radius = radius;
        _height = height;
        _id = "" + super._counter;
        super._volume = Math.PI*Math.pow(_radius,2)*_height;
        super._volume = Math.round(super._volume * 1000);
        super._volume = super._volume / 1000.0;
        super._capacity = super._volume;
    }
    public SodaCan(double height, double radius, String id){
        _radius = radius;
        _height = height;
        _id = id;
        super._volume = Math.PI*Math.pow(_radius,2)*_height;
        super._volume = Math.round(super._volume * 1000);
        super._volume = super._volume / 1000.0;
        super._capacity = super._volume;
    }
    // accessor
    public double getRadius(){
        return _radius;
    }
    public double getHeight(){
        return _height;
    }
    public String getID(){
        return _id;
    }
    
    public double getCapacity(){
        super._capacity = Math.round(super._capacity * 1000);
        super._capacity = super._capacity / 1000.0;
        return super._capacity;
    }
    public double addFill(double amount){
        super._fillLevel = super._fillLevel + amount;
        double remaining = 0;
        if(super._fillLevel > super._volume){
            remaining = super._fillLevel - super._volume;
            remaining = Math.round(remaining * 1000);
            remaining = remaining / 1000.0;
            super._fillLevel = super._volume;
            System.out.println("The Vessel is full. There is " + remaining + " cc remaining");
        }
        return remaining;
    }
    public double getFillLevel(){
        super._fillLevel = Math.round(super._fillLevel * 1000);
        super._fillLevel = super._fillLevel / 1000.0;
        return super._fillLevel;
    }
    public double getVolume(){
        super._volume = Math.round(super._volume * 1000);
        super._volume = super._volume / 1000.0;
        return super._volume;
    }
    public boolean isFull(){
        boolean isFull = true;
        if(super._fillLevel < super._volume){
            isFull = false;
        }
        return isFull;
    }
    @Override
    public String toString(){
        return "Vessel " + super._counter + "\n" + "ID: " + _id + "\n" + "Radius: " + _radius + " cm" + "\n" + "Height: " + _height + " cm" + "\n" + "Volume: " + super._volume + " cc" + "\n" + "Fill Level: " + super._fillLevel + " cc" + "\n";
    }
    @Override
    public boolean equals(Object a){ // Overriding boolean to check deep equality between different objects
        // self check
        if (this == a){
            return true;
        }
        // null check
        if (a == null){
            return false;
        }
        // type check and cast
        if (getClass() != a.getClass()){
            return false;
        }
        SodaCan s1 = (SodaCan) a;
        // field comparison
        boolean toReturn = false;
        if (Objects.equals(_id, s1._id) && Objects.equals(_radius, s1._radius) && Objects.equals(_height, s1._height)){
            toReturn = true;
        }
        return toReturn;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this._radius) ^ (Double.doubleToLongBits(this._radius) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this._height) ^ (Double.doubleToLongBits(this._height) >>> 32));
        hash = 71 * hash + Objects.hashCode(this._id);
        return hash;
    }
}
