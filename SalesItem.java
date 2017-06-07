import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Amanda Schepp
 * Mr.Hardman
 * Assignmet 5
 * June 6
 */
public class SalesItem extends Actor
{
    private double salesPrice;
    private int numOfItem;
    
    /**
     * is a constructor class for SalesItem
     */
    public SalesItem()
    {
        salesPrice = 0;
        numOfItem = 0;
    }
    
    /**
     * is a constructor class for SalesItem
     */
    public SalesItem(double sp)
    {
        salesPrice = sp;
        numOfItem = 1;      
    }
    
    /**
     * getNumOfItem will return the number of items
     * @param there are no parameters
     * @return num of items is reutrned
     * 
     */
    public int getNumOfItem()
    {
        return numOfItem;
    }
    
     /**
     * getFinalPrice will take the final price and add taxes to it
     * @param there are no parameters
     * @return will return the final price of the order
     */
    public double getFinalPrice()
    {
        return (salesPrice * 1.13);        
    }
    
     /**
     * setPrice
     * @param 
     * @return nothing is returned
     */
    public void setPrice(double price)
    {
       salesPrice = price;
    }
    
     /**
     * setNumber
     * @param
     * @return nothing is returned
     */
    public void setNumber(int value)
    {
        numOfItem = value;
    }
}
