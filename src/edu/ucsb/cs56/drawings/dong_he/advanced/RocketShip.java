package edu.ucsb.cs56.drawings.dong_he.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 A RocketShip
 
 @author Phill Conrad
 @author Dong He
 @version for CS56, F16, UCSB
 
 */
public class RocketShip extends Rocket implements Shape
{
    /**
     * Constructor for objects of class RocketShip
     */
    public RocketShip(double x, double y, double width, double height)
    {
        // construct the basic rocket shell
        super(x,y,width,height);
        
        // get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();
        
        double firstWindowX = x + width/3;
        double firstWindowY =  y + height/2;
        double winHt = width/3;
        
        Rectangle2D.Double win1 =
        new Rectangle2D.Double(firstWindowX, firstWindowY, winHt, winHt);
        
        // add the windows to the rocket
        // Look up the meaning of the second parameter of append
        // (Hint--is a method of "GeneralPath")
        
        GeneralPath wholeRocket = this.get();
        wholeRocket.append(win1, false);

        
    }    
}
