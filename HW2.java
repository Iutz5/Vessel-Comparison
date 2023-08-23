/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;
import Vessel.*;

/**
 *
 * @author ianut
 */
public class HW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ErlenmeyerFlask eF1 = new ErlenmeyerFlask(9,3,17,4);
        System.out.println(eF1);
        ErlenmeyerFlask eF2 = new ErlenmeyerFlask(13,4,19,2);
        System.out.println(eF2);
        ErlenmeyerFlask eF3 = new ErlenmeyerFlask(5,2,10,1);
        System.out.println(eF3);
        
        SodaCan sc1 = new SodaCan(12.2, 3.25);
        System.out.println(sc1);
        SodaCan sc2 = new SodaCan(11.1, 1.7);
        System.out.println(sc2);
        SodaCan sc3 = new SodaCan(17.5, 3.25);
        System.out.println(sc3);
        
        sc1.addFill(50);
        System.out.println(sc1.isFull());
        System.out.println("The Vessel has " + sc1.getFillLevel() + " cc in its container");
        System.out.println("The Vessel can hold " + sc1.getCapacity() + " cc in its container");
        sc1.addFill(500);
        System.out.println(sc1.isFull());
        System.out.println("The Vessel has " + sc1.getFillLevel() + " cc in its container");
        System.out.println("The Vessel can hold " + sc1.getCapacity() + " cc in its container");
        
        eF1.addFill(70);
        System.out.println(eF1.isFull());
        System.out.println("The Vessel has " + eF1.getFillLevel() + " cc in its container");
        System.out.println("The Vessel can hold " + eF1.getCapacity() + " cc in its container");
        eF1.addFill(700);
        System.out.println(eF1.isFull());
        System.out.println("The Vessel has " + eF1.getFillLevel() + " cc in its container");
        System.out.println("The Vessel can hold " + eF1.getCapacity() + " cc in its container");
        
        eF1.compareTo(eF2);
        sc1.compareTo(sc3);
    }
    
}
