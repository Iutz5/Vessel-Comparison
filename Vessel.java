/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vessel;

import javax.lang.model.SourceVersion;

/**
 *
 * @author ianut
 */
abstract public class Vessel implements Comparable{
    
    // member data
    protected double _volume;
    protected String _id;
    protected static int _counter = 0;
    protected double _fillLevel = 0; // assuming that all vessels are empty to begin with
    protected double _capacity;
    
    // Constructor
    public Vessel(){
        _counter++;
    }
    
    // accessor
    abstract public double getVolume();
    
    public int compareTo(Object otherObject){
        String otherString = this._id;
        Vessel other = (Vessel) otherObject;
        if(_capacity < other._capacity){
            System.out.println("Vessel " + otherString + " can carry more capacity than Vessel " + other._id + ".");
            return -1;
        }
        if(_capacity > other._capacity){
            System.out.println("Vessel " + otherString + " can carry more capacity than Vessel " + other._id + ".");
            return 1;
        }
        System.out.println("Both Vessel " + otherString + " and Vessel " + other._id + " carry the same capacity.");
        return 0;
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}
