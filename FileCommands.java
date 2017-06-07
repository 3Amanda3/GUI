import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Amanda Schepp
 * Mr.Hardman
 * Assignmet 5
 * June 6
 */
public class FileCommands implements MenuCommands
{       
    /**
     * execute will display a message depending on what idx is equal to
     * @param idx refurs to the index
     * @param is a call to the world
     * @return nothing is returned
     */
    public void execute(int idx, World w)
    {
        UIMainWorld guiWorld = (UIMainWorld)w;
         
        if( idx == 0)
        {
            guiWorld.salesScreen();
        }
        else if(idx == 1)
        {
            guiWorld.startScreen();
        }
        else if(idx == 2)
        {
            guiWorld.thankYou();
        }
    }
}