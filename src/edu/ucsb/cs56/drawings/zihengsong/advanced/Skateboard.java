package edu.ucsb.cs56.drawings.zihengsong.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a house that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class Skateboard extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord left side of skateboard
       @param y y coord left side of skateboard
       @param length length of skateboard
       @param radius radius of wheels
    */
    public Skateboard(double x, double y, double length, double radius)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        // make the board.
        
        Line2D.Double board = 
            new Line2D.Double (x, y,
                               x + length, y);

	// make the wheels.
	
	Circle rightWheel = new Circle
	    (
	     x + 0.2 * length,
	     y + radius,
	     radius
	     );
	
	Circle leftWheel = new Circle
	    (
	     x + 0.8 * length,
	     y + radius,
	     radius
	     );
	
        // put the whole skateboard together
	
        GeneralPath wholeSkateboard = this.get();
        wholeSkateboard.append(board, false);
        wholeSkateboard.append(leftWheel, false);
        wholeSkateboard.append(rightWheel, false);    
    }
}
