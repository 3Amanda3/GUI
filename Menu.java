import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Amanda Schepp
 * Mr.Hardman
 * Assignmet 5
 * May 19th
 */
public class Menu extends Actor
{
    TextBox titleBar;
    TextBox menuItems;
    MenuCommands menuCommands;
    int fontSize = 24;
    boolean visible = false;
    Color mainFG;
    Color mainBG;
    Color secondFG;
    Color secondBG;
    int titleHeight;
    int menuHeight;

    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleMouse();
    }    

    /**
     * constructor for menu
     */
    public Menu(String tb, String items, int fs, Color fgMain, Color bgMain, Color fgSecond, Color bgSecond, MenuCommands mc)
    {
        menuCommands = mc;
        fontSize = fs;
        mainFG = fgMain;
        mainBG = bgMain;
        secondFG =fgSecond;
        secondBG = bgSecond;

        titleBar = new TextBox( tb, fs, true, fgMain, bgMain );
        menuItems = new TextBox( items, fs, false, fgSecond, bgSecond );
    }

    /**
     * constructer for menu
     */
    public Menu()
    {
        this("not initialized", "none", 24, Color.BLACK, Color.lightGray, Color.BLACK, Color.WHITE, null);
    }

    /**
     * addedToWorld will add the title bar to the world and set menu and title height
     * @param there are no parameters
     * @return npthing is returned
     */
    public void addedToWorld(World w)
    {
        w.addObject(titleBar, getX(), getY());
        titleHeight =  (titleBar.getImage().getHeight());
        menuHeight = (menuItems.getImage().getHeight());
    }

    /**
     * handleMouse will get the mouse info and use that to set visable to its correct bool true or false and add and remove menuitems
     * @param there are no parameters
     * @return nothing is returned
     */
    public void handleMouse()
    {
        MouseInfo mi;
        int menuIndex;

        if(Greenfoot.mouseClicked(titleBar) )
        {
            if(visible == false)
            {
                getWorld().addObject(menuItems, getX(), getY() + (titleHeight + menuHeight)/2);
                visible = !visible;
            }
            else if(visible == true)
            {
                getWorld().removeObject(menuItems);
                visible = !visible;
            }
        }
        if(Greenfoot.mouseClicked(menuItems) )
        {
            mi = Greenfoot.getMouseInfo();
            menuIndex = ( (mi.getY() - menuItems.getY() + menuHeight / 2) - 1 ) / fontSize;
            menuCommands.execute(menuIndex, getWorld());
            visible = !visible;
            getWorld().removeObject(menuItems);
        }
    }
}
