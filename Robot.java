import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    private GreenfootImage robotimage1;
    private GreenfootImage robotimage2;
    private GreenfootImage robotimage3;
    private int lives = 3;
    private int score;
    private int pizzaEaten;
    
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void GameOverpic(){
       robotimage3 = new GreenfootImage("gameover.png"); 
    }
    public void act() 
    {
        GameOverpic();
        checkKeyPress();
        detectBlockCollision();
        detectWallCollision();
        eatPizza();
        FinishedGame();
        GameOver();
    }  
    public void FinishedGame(){
        if(pizzaEaten > 4){
            detectHome();
        }
    }
    public void GameOver(){
        if(lives < 0){
            setImage(robotimage3);
            Greenfoot.stop();
        }
    }
    public Robot(){
    robotimage1 = new GreenfootImage("man01.png");
    robotimage2 = new GreenfootImage("man02.png");
    setImage(robotimage1);
    }
    public void IncreaseScore(){
        score = score + 100;
    }
    public void switchImage(){
        if (getImage() == robotimage1)
        {
            setImage (robotimage2);
        }
        else
        {
            setImage (robotimage1);
        }
    } 
    public void checkKeyPress()
    {
        if( Greenfoot.isKeyDown("up") )
        {
            setLocation( getX(), getY() - 5);
            switchImage();
        }
        
        if( Greenfoot.isKeyDown("down") )
        {
            setLocation( getX(), getY() + 5);
            switchImage();
        }

        if( Greenfoot.isKeyDown("right") )
        {
            setLocation( getX() + 5, getY() );
            switchImage();
        }
        
        if( Greenfoot.isKeyDown("left") )
        {
            setLocation( getX() - 5, getY() );
            switchImage();
        }
    }
    public void detectBlockCollision(){
    if(isTouching(Wall.class)){
        Greenfoot.playSound("hurt.wav");
        setLocation(50,50);
        lives = lives - 1;
    }
    }
   public void detectWallCollision(){ 
    if(isTouching(Block.class))
    {
        Greenfoot.playSound("hurt.wav");
        setLocation(50,50);
        lives = lives - 1;
    }
    }
    public void eatPizza(){
        if(isTouching(Pizza.class)){
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
            pizzaEaten = pizzaEaten + 1;
        }
    }
    
    public void detectHome(){
        if(isTouching(Home.class)){
         Greenfoot.playSound("yipee.wav");
         setLocation(50,50);
         IncreaseScore();
        } 
     }
    
}

