import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Amanda Schepp
 * Mr.Hardman
 * Assignmet 5
 * May 19th
 */
public class UIMainWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        testActors();
    }
    
    /**
     * testActors will add the objects to the world
     * @param therer are no parameters
     * @return nothing is returned
     */
    public void testActors()
    {
       addObject( new Button( 20, "button-green.png", "button-blue.png",  "Beep" ), 300, 300); 
       addObject( new Button( 20, "button-blue.png", "button-green.png", "Boop" ), 500, 100); 
       addObject( new Button( 40, "Red.png", "Heart2.png", "?" ), 100, 310); 
       addObject( new Label("Do not press the buttons",40), 300, 200); 
       addObject( new Menu("What does this do?", "New\nOpen\nSave\nClose\nExit", 20 , Color.BLUE , Color.RED , Color.PINK , Color.YELLOW , new FileCommands()), 100, 100);
       addObject( new TextBox("Why am I here?",20,true, Color.YELLOW, Color.GREEN),500,350);
    }
}
