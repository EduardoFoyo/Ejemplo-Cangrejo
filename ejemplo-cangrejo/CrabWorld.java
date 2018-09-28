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
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        worm worm = new worm();
        addObject(worm,82,226);
        worm worm2 = new worm();
        addObject(worm2,128,152);
        worm worm3 = new worm();
        addObject(worm3,408,63);
        worm worm4 = new worm();
        addObject(worm4,461,187);
        worm worm5 = new worm();
        addObject(worm5,475,236);
        worm worm6 = new worm();
        addObject(worm6,278,302);
        worm worm7 = new worm();
        addObject(worm7,165,363);
        worm worm8 = new worm();
        addObject(worm8,465,340);
        worm worm9 = new worm();
        addObject(worm9,278,204);
        worm worm10 = new worm();
        addObject(worm10,215,59);
        worm worm11 = new worm();
        addObject(worm11,89,53);
        worm worm12 = new worm();
        addObject(worm12,328,48);
        worm worm13 = new worm();
        addObject(worm13,538,10);
        worm worm14 = new worm();
        addObject(worm14,564,163);
        worm worm15 = new worm();
        addObject(worm15,554,266);
        Crab crab = new Crab();
        addObject(crab,240,130);
        Lobster lobster = new Lobster();
        addObject(lobster,402,295);
    }
}
