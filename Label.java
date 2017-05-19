import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Amanda Schepp
 * Mr.Hardman
 * Assignmet 5
 * May 19th
 */
public class Label extends Actor
{
    private String value;
    private int fontSize;
    private Color lineColor = Color.BLACK;
    private Color fillColor = Color.WHITE;
    
    private final Color TRANSPARENT =  new Color(0,0,0,0);
    
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    
    /**
     * label is the constuctor for the class label
     */
    public Label(String v, int fs)
    {
        value = v;
        fontSize = fs;
        
        updateImage();
    }
    
    /**
     * Label is the constructor for the class label
     */
    public Label(int value, int fontSize)
    {
        this(Integer.toString(value), fontSize); 
    }
    
    /**
     * setValue sets the value to v
     * @param String v is the parameter
     * @return nothing is returned
     */
    public void setValue(String v)
    {
        value = v;
        updateImage(); 
    }
    
    /**
     * setValue sets the value of value and v and updates the images
     * @param the paremter int value
     * @param int v
     * @return npthing is returned
     */
    public void setValue(int value)
    {
        this.value = Integer.toString(value);
        updateImage();        
    }
    
    /**
     * setLineColor will make a call to the method updateImage
     * @param there are no parameters
     * @return nothing is returned
     */
    public void setLineColor()
    {
        updateImage();
    }
    
    /**
     * setFillColor will make a call to the method setFillColor
     * @param there are no parameters
     * @return nothing is returned
     */
    public void setFillColor()
    {
        updateImage();
    }
    
    /**
     * updadteImage will set the image to a new image
     * @param there are no parameters
     * @return nothing is returned
     */
    public void updateImage()
    {
        setImage( new GreenfootImage( value, fontSize, fillColor, TRANSPARENT, lineColor ));
    }
}
