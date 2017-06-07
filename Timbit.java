import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Amanda Schepp
 * Mr.Hardman
 * Assignmet 5
 * June 6
 */
public class Timbit extends SalesItem
{
    /**
     *  is a construcot class for Timbit
     */
    public Timbit()
    {
       double TIMBIT_PRICE = 0.30;
       int BOX_CAPACITY = 12;
       double BOX_PRICE = 3.00;
       
       int numTimbits = Integer.parseInt( JOptionPane.showInputDialog( null, "Enter the number of Timbits: " ));
       int numBoxes;
       
       setNumber(numTimbits);
       
       numBoxes = numTimbits / BOX_CAPACITY;
       numTimbits = numTimbits % BOX_CAPACITY;
       
       setPrice(numTimbits*TIMBIT_PRICE + numBoxes);
    }
}