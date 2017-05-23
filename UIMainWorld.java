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
        
        setBg();
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
       addObject( new Button2("Magic",20,true, Color.BLUE, Color.GREEN),400,350);
       addObject( new Button( 40, "Red.png", "Heart2.png", "?" ), 100, 310); 
       addObject( new Label("Do not press the buttons",40), 300, 200); 
       addObject( new Menu("What does this do?", "New\nOpen\nSave\nClose\nExit", 20 , Color.BLUE , Color.RED , Color.PINK , Color.YELLOW , new FileCommands()), 100, 100);
       addObject( new TextBox("Why am I here?",20,true, Color.WHITE, Color.GREEN),500,350);
    }
    
    /**
     * when run sets the background to a colour
     * @param there are no parameters
     * @return nothing is returned
     */
    public void setBg()
    {
       GreenfootImage bg = getBackground();
       bg.setColor( Color.BLACK );       
       bg.fill();
    }
    
    /**
     * when run sets the background to a colour
     * @param there are no parameters
     * @return nothing is returned
     */
    public void setBgRainbow()
    {
        GreenfootImage colorRect = new GreenfootImage( 50, getHeight());

        for(int i = 0; i < getWidth() / colorRect.getWidth(); i++)
        {
            if( i % 7 == 0)
            {
                colorRect.setColor( Color.RED);
                colorRect.fillRect(0,0,colorRect.getWidth(), getHeight() );               
            }

            if( i % 7 == 1)
            {
                colorRect.setColor( Color.ORANGE);
                colorRect.fillRect(0,0,colorRect.getWidth(), getHeight() );                
            }

            if( i % 7 == 2)
            {
                colorRect.setColor( Color.YELLOW );
                colorRect.fillRect(0,0,colorRect.getWidth(), getHeight() );                
            }

            if( i % 7 == 3)
            {
                colorRect.setColor( Color.GREEN );
                colorRect.fillRect(0,0,colorRect.getWidth(), getHeight() );                
            }

            if( i % 7 == 4)
            {
                colorRect.setColor( Color.BLUE );
                colorRect.fillRect(0,0,colorRect.getWidth(), getHeight() );                
            }

            if( i % 7 == 5)
            {
                colorRect.setColor( Color.WHITE );
                colorRect.fillRect(0,0,colorRect.getWidth(), getHeight() );                
            }

            if( i % 7 == 6)
            {
                colorRect.setColor( Color.BLACK);
                colorRect.fillRect(0,0,colorRect.getWidth(), getHeight() );                
            }

            getBackground().drawImage( colorRect, i*colorRect.getWidth(), 0);
        }
    }    
}
