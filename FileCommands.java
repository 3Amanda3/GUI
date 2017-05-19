import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Amanda Schepp
 * Mr.Hardman
 * Assignmet 5
 * May 19th
 */
public class FileCommands implements MenuCommands
{    
    /**
     * execute will display a message depending on what idx is equal to
     * @param there are no parameters
     * @return nothing is returned
     */
    public void execute(int idx, World w)
    {
        if( idx == 0)
        {
            System.out.println("Running New Command…");
        }
        else if(idx == 1)
        {
            System.out.println("Running Open Command…");
        }
        else if(idx == 2)
        {
            System.out.println("Running Save Command…");
        }
        else if(idx == 3)
        {
            System.out.println("Running Close Command…");
        }
        else if(idx == 4)
        {
            System.out.println("Running Exit Command…");
        }
    }
}
