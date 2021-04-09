import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sitem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sitem extends Items
{
    private static final GreenfootImage image = new GreenfootImage("images/minitem.png");
    
    public Sitem(){
        setImage(image);
        points = 10;
    }    
}
