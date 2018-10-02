import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private Counter vidas;
    private Crab crab;
    private Lobster lobster;
    private worm worm;
    private int numGusanos;
    
    
    
    public CrabWorld(int numGusanos)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Tiempo tiempo = new Tiempo();
        vidas = new Counter("vidas: ");
        this.addObject(vidas, 440, 20);
        this.addObject(tiempo,60,20);
        vidas.setValue(3);
        this.numGusanos = numGusanos;
        prepare();
    }

    private void prepare()
    {
        for(int i=0; i<numGusanos;i++){
            worm worm = new worm();
            addObject(worm,Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(1000));
        }
        Crab crab = new Crab();
        addObject(crab,240,130);
        Lobster lobster = new Lobster();
        addObject(lobster,402,295);
        Tiempo tiempo = new Tiempo();
        addObject(tiempo,43,23);
    }
    
    public void vidas(){
        int valor = vidas.getValue()-1;
        vidas.setValue(valor);
        crab.setLocation(102,70);
        if(valor == 0){
            Greenfoot.stop();
        }
    }
    
}
