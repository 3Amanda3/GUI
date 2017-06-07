import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
/**
 * Amanda Schepp
 * Mr.Hardman
 * Assignmet 5
 * June 6
 */
public class Coffee extends SalesItem
{
    public Coffee()
    {
        double SM_COFFEE = 1.33;
        double MD_COFFEE = 1.59;
        double LG_COFFEE = 1.86;
        
        String size = JOptionPane.showInputDialog( null, "Enter the number size of coffee: ");
        
        if(size.equalsIgnoreCase("s") == true)
        {
            setNumber(1);
            setPrice(SM_COFFEE);
        }
        else if(size.equalsIgnoreCase("m") == true)
        {
            setNumber(2);
            setPrice(MD_COFFEE);
        }
        else if(size.equalsIgnoreCase("l") == true)
        {
            setNumber(3);
            setPrice(LG_COFFEE);
        }
    }
}
