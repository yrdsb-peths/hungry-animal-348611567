import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apple extends Actor
{
    /**
     * Act - do whatever the apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        fall();
        if(elephant.getX() == getX() && elephant.getY() == getY())
        {
            
        }
    }
    
    public void fall()
    {
        
        int x = getX();
        int y = getY();
        y++;
        setLocation(x, y);
    }
}
