import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
        detectBlockCollision();
        detectWallCollision();
        eatPizza();
        detectHome();
        
    }    
    public void checkKeyPress()
    {
        if( Greenfoot.isKeyDown("up") )
        {
            setLocation( getX(), getY() - 5);
        }
        
        if( Greenfoot.isKeyDown("down") )
        {
            setLocation( getX(), getY() + 5);
        }

        if( Greenfoot.isKeyDown("right") )
        {
            setLocation( getX() + 5, getY() );
        }
        
        if( Greenfoot.isKeyDown("left") )
        {
            setLocation( getX() - 5, getY() );
        }
    }
    public void detectBlockCollision(){
    if(isTouching(Wall.class)){
        Greenfoot.playSound("hurt.wav");
        setLocation(50,50);
    }
}
   public void detectWallCollision(){ 
    if(isTouching(Block.class))
    {
        Greenfoot.playSound("hurt.wav");
        setLocation(50,50);
    }
}
    public void eatPizza(){
        if(isTouching(Pizza.class)){
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
        }
    }
    
    public void detectHome(){
        if(isTouching(Home.class)){
        Greenfoot.playSound("yipee.wav");
        setLocation(50,50);
        }       
    }
}

