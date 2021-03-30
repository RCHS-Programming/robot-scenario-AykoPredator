import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (Marshal Duncan) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Wall(), 0, 150);
        addObject(new Wall(), 50, 150);
        addObject(new Wall(), 100, 150);
        addObject(new Wall(), 150, 150);
        addObject(new Wall(), 200, 150);
        addObject(new Wall(), 240, 150);
        addObject(new Wall(), 560, 150);
        addObject(new Wall(), 600, 150);
        addObject(new Wall(), 650, 150);
        addObject(new Wall(), 700, 150);
        addObject(new Wall(), 750, 150);
        addObject(new Wall(), 800, 150);
        addObject(new Block(), 400, 150);
        addObject(new Home(), 750, 550);
        addObject(new Scorepanel(), 75, 560);
        addObject(new Pizza(), 700, 500);
        addObject(new Pizza(), 600, 550);
        addObject(new Pizza(), 200, 500);
        addObject(new Pizza(), 400, 350);
        addObject(new Pizza(), 100, 400);
        addObject(new Robot(), 50, 50);
        
    }
}
