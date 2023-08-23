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
public class ErlenmeyerFlask extends Vessel implements Fillable {
    // member data
    private double _baseRadius;
    private double _mouthRadius;
    private double _totalHeight;
    private double _neckHeight;

    
    // Constructor 
    public ErlenmeyerFlask(double neckHeight, double mouthRadius, double totalHeight, double baseRadius){
        _baseRadius = baseRadius;
        _mouthRadius = mouthRadius;
        _totalHeight = totalHeight;
        _neckHeight = neckHeight;
        super._id = ""+super._counter;
        super._volume = 1.0/3*Math.PI*(Math.pow(_baseRadius,2)+_baseRadius*_mouthRadius+Math.pow(_mouthRadius,2))*_totalHeight;
        super._volume = Math.round(super._volume * 1000);
        super._volume = super._volume / 1000.0;
        super._capacity = super._volume;
    }
    public ErlenmeyerFlask(double neckHeight, double mouthRadius, double totalHeight, double baseRadius, String id){
        _baseRadius = baseRadius;
        _mouthRadius = mouthRadius;
        _totalHeight = totalHeight;
        _neckHeight = neckHeight;
        super._id = id;
        super._volume = 1.0/3*Math.PI*(Math.pow(_baseRadius,2)+_baseRadius*_mouthRadius+Math.pow(_mouthRadius,2))*_totalHeight;
        super._volume = Math.round(super._volume * 1000);
        super._volume = super._volume / 1000.0;
        super._capacity = super._volume;
    }
    
    // accessors
    public double getBaseRadius(){
        return _baseRadius;
    }
    public double getMouthRadius(){
        return _mouthRadius;
    }
    public double getTotalHeight(){
        return _totalHeight;
    }
    public double getNeckHeight(){
        return _neckHeight;
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
        return "Vessel " + super._counter + "\n" + "ID: " + _id + "\n" + "Neck Height: " + _neckHeight + " cm" + "\n" + "Mouth Radius: " + _mouthRadius + " cm" + "\n" + "Total Height: " + _totalHeight + " cm" + "\n" + "Base Radius: " + _baseRadius + " cm" + "\n" + "Volume: " + super._volume + " cc" + "\n" + "Fill Level: " + super._fillLevel + " cc" + "\n";
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
        ErlenmeyerFlask eF1 = (ErlenmeyerFlask) a;
        // field comparison
        boolean toReturn = false;
        if (Objects.equals(_id, eF1._id) && Objects.equals(_neckHeight, eF1._neckHeight) && Objects.equals(_mouthRadius, eF1._mouthRadius) && Objects.equals(_totalHeight,eF1._totalHeight) && Objects.equals(_baseRadius, eF1._baseRadius)){
            toReturn = true;
        }
        return toReturn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this._baseRadius) ^ (Double.doubleToLongBits(this._baseRadius) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this._mouthRadius) ^ (Double.doubleToLongBits(this._mouthRadius) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this._totalHeight) ^ (Double.doubleToLongBits(this._totalHeight) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this._neckHeight) ^ (Double.doubleToLongBits(this._neckHeight) >>> 32));
        hash = 79 * hash + Objects.hashCode(this._id);
        return hash;
    }
}
