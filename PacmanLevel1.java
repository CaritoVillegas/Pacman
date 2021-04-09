import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanLevel1 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PacmanLevel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        map();
        items();
        huecos();
        chacters();
        
        text();
        
    }
    public void map(){
        for(int x = 0; x < 1080; x+=72){
            this.addObject(new Wall(), x, 0);
            this.addObject(new Wall(), x, 800);
        }
        for(int y=0; y<355; y+=56){
            this.addObject(new Wall(), 0, y);
            this.addObject(new Wall(), 1000, y);
        }
        for(int y=475; y<800; y+=56){
            this.addObject(new Wall(), 0, y);
            this.addObject(new Wall(), 1000, y);
        }
        for(int x=400,y=560,z=400; x<600 && y<620 && z<620; x+=72){
            this.addObject(new WallH(), x, 350);
            this.addObject(new WallH(), y+=72, 350);
            this.addObject(new WallH(), z+=72, 450);
            
        }
        for(int x = 400; x < 620; x+=72){
            this.addObject(new WallH(), x, 450);
        }
        for(int y=380; y<480; y+=55){
            this.addObject(new WallV(), 380, y);
            this.addObject(new WallV(), 650, y);
        }
        
        for(int y=330; y<732; y+=72){
            this.addObject(new WallH(), y, 200);
            this.addObject(new WallH(), y, 600);
        }
        
        for(int x=150, y=590;x<250&&y<690;x+=55,y+=55){
            this.addObject(new WallV(), 150, x);
            this.addObject(new WallV(), 850, x);
            this.addObject(new WallV(), 150, y);
            this.addObject(new WallV(), 850, y);
        }
        for(int y=160, x=790; y<260&&x<890; y+=55,x+=55){
            this.addObject(new WallH(), y,400);
            this.addObject(new WallH(), x, 400);
        }
    }
    public void huecos(){
        addObject(new HuecoDerecha(), 1000, 364);
        addObject(new HuecoIzquierda(), 0, 364);
    }
    public void chacters(){
        addObject(new Pacman(), 500, 250);
        //fantasmas
        addObject(new Pink(), 780, 200);
        addObject(new Blue(), 230, 200);
        addObject(new Red(), 230, 600);
        addObject(new Orange(), 780, 600);
    }
    public void items(){
        for(int x=70;x<950;x+=50){
            addObject(new Sitem(), x,80);
            addObject(new Sitem(), x,730);
        }
        for(int x=100;x<900;x+=50){
            addObject(new Sitem(), x,300);
            addObject(new Sitem(), x,500);
        }
        addObject(new Litem(), 500,550);
        addObject(new Litem(), 500,150);
        addObject(new Banana(), 500,400);
        addObject(new Cherry(), 500,650);
    }
    public void text(){
        addObject(new Point(), 30,793);
    }
}
