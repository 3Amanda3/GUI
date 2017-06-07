import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.util.List;
/**
 * Amanda Schepp
 * Mr.Hardman
 * Assignmet 5
 * June 6
 */
public class UIMainWorld extends World
{
    private boolean onSales;
    private int numItemsAdded;
    private SalesItem salesItems[];

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        startScreen();

        setBg();
    }

    /**
     * when run sets the background to a rainbow
     * @param there are no parameters
     * @return nothing is returned
     */
    public void setBg()
    {
        GreenfootImage colorRect = new GreenfootImage( 30, getHeight());

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

    /**
     * startScreen will add the menu when the program is first run
     * @param there are no parameters
     * @return nothing is returned
     */
    public void startScreen()
    {
        onSales = false;
        salesItems = new SalesItem[50];
        numItemsAdded = 0;
        
        Menu guiMenu = new Menu("File", "New Sale…\nClose\nExit", 40, Color.BLACK, Color.WHITE, Color.RED, Color.WHITE, new FileCommands());
        clearScreen();
        addObject(guiMenu, 100, 20);
    }

    /**
     * salesScreen will add the buttons to the screen to add the items
     * @param there are no parameters
     * @return nothing is returned
     */
    public void salesScreen()
    {
        onSales = true;
        
        Button timbitAdd = new Button(20, "button-blue.png" , "button-green.png", "Add a Timbit");
        Button doughnutAdd = new Button(20, "button-blue.png" , "button-green.png", "Add a Doughnut");;
        Button coffeeAdd = new Button(20, "button-blue.png" , "button-green.png", "Add a Coffee");;

        addObject(timbitAdd, 500, 100);
        addObject(doughnutAdd, 500, 200);
        addObject(coffeeAdd, 500, 300);
    }

    /**
     * thankYou will stop the program and display a thankyou message to the user
     * @param there are no parameters
     * @return nothing is returned
     */
    public void thankYou()
    {
        onSales = false;
        clearScreen();
        showText("Thank-You", getWidth()/2, getHeight()/2);
        Greenfoot.stop();
    }

    public void act()
    {
        if(onSales == true)
        {
            calculateSales();
        }
    }

    /**
     * calculateSales will calculate how many of each item was orderd
     * @param there are no parameters
     * @return nothing is returned
     */
    public void calculateSales()
    {
        double total = 0;
        int numTim = 0;
        int numDoug = 0;
        int numSmCof = 0;
        int numMdCof = 0;
        int numLgCof = 0;
        String showOrder = "";
     
        for(int i = 0; salesItems[i] != null && i < salesItems.length;i++)
        {
            if(salesItems[i] instanceof Timbit)
            {
                numTim = numTim + salesItems[i].getNumOfItem();
            }
            else if(salesItems[i] instanceof Dougnut)
            {
                numDoug =  numDoug + salesItems[i].getNumOfItem();
            }
            else
            {
                if(salesItems[i].getNumOfItem() == 1)
                {
                    numSmCof++;
                }
                else if(salesItems[i].getNumOfItem() == 2)
                {
                    numMdCof++;
                }
                else
                {
                    numLgCof++;
                }
            }
            
            total = total + salesItems[i].getFinalPrice();
            
            showOrder = "Timbits; " +numTim+ "\nDoughnuts; " + numDoug + "\nSmall Coffees; " +numSmCof+ "\nMedium Coffees; " +numMdCof+ "\nLarge Coffees; " +numLgCof;
            showText(showOrder + String.format("\nTotal Price; $%5.2f", total), 200, 200);
        }
    }
        
    /**
     * assItem will add items to the salesitem array and add to num items added
     * @param salesItem s
     * @return nothing is returned
     */
    public void addItem(SalesItem s)
    {
        salesItems[numItemsAdded] = s;
        numItemsAdded++;
    }

    /**
     * clearScreen will clear everything off the screen
     * @param there are no parameters
     * @return nothing is returned
     */
    private void clearScreen()
    {
        showText("", 400,200);
        List objects = getObjects(null);
        
        if(objects != null)
        {
            removeObjects(objects);
        }
    }
}
