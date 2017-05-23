import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Amanda Schepp
 * Mr.Hardman
 * Assignmet 5
 * May 19th
 */
public class Button2 extends Actor
{
    GreenfootImage img;
    private boolean border = false;
    private int fontSize;
    private Color foreground;
    private Color background;
    
    /**
     * Act - do whatever the TextBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleMouseClicks();
    }
    
    public Button2 (String message, int fs, boolean b, Color fg, Color bg)
    {
        border = b;
        fontSize = fs;
        foreground = fg;
        background = bg;
        
        img = new GreenfootImage (message, fontSize, foreground,background);
       
        display();
    }
    
    /**
     * setTextBox will set the text box to img and make a call to the display method
     * @param theere are no parameteres
     * @return nothing is returend
     */
    public void Button(String message)
    {
         img = new GreenfootImage (message, fontSize, foreground,background);
         display();
    }
    
    /**
     * display will set the image to img and if a boolean is true change the look of img
     * @return nothing is returned
     * @param there are no parameters
     */
    private void display()
    {
       setImage(img);
       
       if(border == true)
       {
           img.setColor( Color.BLACK);
           img.fillRect(0, 0, -1, -1);
           setImage(img);
       }
    }                   
    
    /**
     * handleMouseClicks will set the image to second image when the mouse clicks the button and change it back after
     * @param theere are no parameters
     * @return nothing is returned
     */
    public void handleMouseClicks()
    {
        if(Greenfoot.mousePressed(this) )
        {
           UIMainWorld world = (UIMainWorld)getWorld();
           
           world.setBgRainbow();
        }
         else if(Greenfoot.mouseClicked( this ))
        {           
           UIMainWorld world = (UIMainWorld)getWorld();
           
           world.setBg();
        }

    }
    

}
