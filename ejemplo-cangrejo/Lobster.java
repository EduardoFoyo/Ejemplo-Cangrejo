import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
     private int i;
     public Lobster(){
         i = 0;
           
     }
    public void act() 
    {
        if(i>5){
            turn(Greenfoot.getRandomNumber(180)-90);
            i=0;
        }
        if(isTouching(Crab.class)){
            removeTouching(Crab.class);
        }
        move(5);
        i++;
    }    
}
