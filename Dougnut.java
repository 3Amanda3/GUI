import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Amanda Schepp
 * Mr.Hardman
 * Assignmet 5
 * June 6
 */
public class Dougnut extends SalesItem
{ 
    /**
     * is a constructor class for Dougnut
     */
    public Dougnut()
    {
       double DOUNUT_PRICE = 0.99;
       int BOX_CAPACITY = 6;
       double BOX_PRICE = 5.00;
       
       int numDougnuts = Integer.parseInt( JOptionPane.showInputDialog( null, "Enter the number of Dougnuts: " ));
       int numBoxes;
       
       setNumber(numDougnuts);
       
       numBoxes = numDougnuts / BOX_CAPACITY;
       numDougnuts = numDougnuts % BOX_CAPACITY;
       
       setPrice(numDougnuts*DOUNUT_PRICE + numBoxes);
    }   
}
