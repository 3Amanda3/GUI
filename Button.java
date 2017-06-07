import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Amanda Schepp
 * Mr.Hardman
 * Assignmet 5
 * June 6
 */
public class Button extends Actor
{
    private int fontSize;
    private String firstImage;
    private String secondImage;    
    
    private GreenfootImage text1;
    private GreenfootImage text2;
    private String text;
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleMouseClicks();
    }  
    
    /**
     * button is a constructor for the button class
     */
    public Button(int fs, String f, String s, String t)
    {
        fontSize = fs;
        firstImage = f;
        secondImage = s;
        text = t;
        text1 = new GreenfootImage(t, fontSize, Color.WHITE, new Color(0,0,0,0));
        text2 = new GreenfootImage(t, fontSize, Color.BLACK, new Color(0,0,0,0));
        setImage( f );
        
        getImage().drawImage(text1,(getImage().getWidth() - text1.getWidth())/2,(getImage().getHeight() - text1.getHeight())/2);
    }
    
    /**
     * button is a construtor for the button class
     */
    public Button(String f, String s)
    {
        firstImage = f;
        secondImage = s;
        
        setImage( f );
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
            setImage( secondImage );
            getImage().drawImage(text2,(getImage().getWidth() - text2.getWidth())/2,(getImage().getHeight() - text2.getHeight())/2);
        }
        else if(Greenfoot.mouseClicked( this ))
        {
            setImage(firstImage);
            getImage().drawImage(text1,(getImage().getWidth() - text1.getWidth())/2,(getImage().getHeight() - text1.getHeight())/2);
            
            clickedAction();
        }
    }
    
    /**
     * clickedAction will be used in another project
     * @Param there are no parameters
     * @Return nothing is returned
     */
    public void clickedAction()
    {
         UIMainWorld guiWorld = (UIMainWorld)getWorld();
         
         if(text.equalsIgnoreCase("Add a Timbit"))
         {
             guiWorld.addItem(new Timbit());
         }
         else if(text.equalsIgnoreCase("Add a Doughnut"))
         {
             guiWorld.addItem(new Dougnut());
         }
          else if(text.equalsIgnoreCase("Add a Coffee"))
         {
             guiWorld.addItem(new Coffee());
         }
    }
}