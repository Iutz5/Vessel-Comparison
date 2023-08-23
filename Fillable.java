/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vessel;

/**
 *
 * @author ianut
 */
public interface Fillable {
    
    double getCapacity(); // returns maximum amount the class can hold
    
    double getFillLevel(); // returns current amount the class is holding
    
    boolean isFull(); // returns true if fill level is the same as the capacity
    
    double addFill(double amount); // adds amount to the fill level of the class and returns any amount that does not fit in the class
}
