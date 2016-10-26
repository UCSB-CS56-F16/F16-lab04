package edu.ucsb.cs56.drawings.dong_he.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 A House
 
 @author Phill Conrad
 @version for CS56, W16, UCSB
 
 */
public class RocketShip extends Rocket implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public RocketShip(double x, double y, double width, double height)
    {
        // construct the basic house shell
        super(x,y,width,height);
        
        // get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();
        
        double firstWindowX = x + (width/2);
        double firstWindowY = y + (height/4);
        double winHt = height/8;
        
        Rectangle2D.Double win1 =
        new Rectangle2D.Double(firstWindowX, firstWindowY, winHt, winHt);
        Rectangle2D.Double win2 =
        new Rectangle2D.Double(firstWindowX, 2 * firstWindowY, winHt, winHt);
        Rectangle2D.Double win3 =
        new Rectangle2D.Double(firstWindowX, 3 * firstWindowY, winHt, winHt);
        
        // add the windows to the house
        // Look up the meaning of the second parameter of append
        // (Hint--is a method of "GeneralPath")
        
        GeneralPath wholeRocket = this.get();
        wholeRocket.append(win1, false);
        wholeRocket.append(win2, false);
        wholeRocket.append(win3, false);
    }    
}
