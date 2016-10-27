package edu.ucsb.cs56.drawings.colingarrett.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a pumpkin that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Phill Conrad 
   @author Colin Garrett
   @version for CS56, F16, UCSB
   
*/
public class Pumpkin extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of pumpkin
       @param y y coord of lower left corner of pumpkin
       @param width width of the pumpkin
       @param height of pumpkin (including circle and stem)
    */
    public Pumpkin(double x, double y, double width, double height)
    {
	
        double stemHeight = .25 * height;
        double circleHeight = height - stemHeight;
        double circleUpperLeftY = y + stemHeight;
        
        // make the pumpkin without the stem
        
        Ellipse2D.Double theCircle =
	    new Ellipse2D.Double(x, circleUpperLeftY,
				 width, circleHeight);
            	
        // make the stem

	double w = 0.2 * width;
	
	Rectangle2D.Double theStem =
	    new Rectangle2D.Double(x+2*w, y, w, stemHeight*1.1);
	
        // put the whole pumpkin together
	
        GeneralPath wholePumpkin = this.get();
        wholePumpkin.append(theCircle, false);
        wholePumpkin.append(theStem, false);
    }
}
