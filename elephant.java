import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class elephant extends Actor
{
    /**
     * Act - do whatever the elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move();
        eat();
    }
    
    public void move()
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("W"))
        {
            y -= 2;
        }
        if(Greenfoot.isKeyDown("A"))
        {
            x -=2 ;
        }
        if(Greenfoot.isKeyDown("S"))
        {
            y+= 2;
        }
        if(Greenfoot.isKeyDown("D"))
        {
            x+= 2;
        }
        setLocation(x, y);
    }
    
    public void eat()
    {
        if(isTouching(apple.class))
        {
            removeTouching(apple.class);
            myWorld world = (myWorld) getWorld();
            world.createApple();
            world.increaseScore();
        }
    }
}
