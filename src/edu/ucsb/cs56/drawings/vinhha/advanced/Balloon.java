package edu.ucsb.cs56.drawings.vinhha.advanced;
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
public class Balloon extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param width width of the house
       @param height of house (including first story and second story)
    */
    public Balloon(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
	Circle balloon = new Circle(x, y, 80);
	Line2D.Double leftTie =
	    new Line2D.Double (x, y + 80,
			       x - 20, y + 100);

	Line2D.Double rightTie =
	    new Line2D.Double (x, y + 80,
			       x + 20, y + 100);
	Line2D.Double bottomTie =
	    new Line2D.Double (x - 20, y + 100,
			       x + 20, y + 100);

	Line2D.Double balloonString =
	    new Line2D.Double (x, y + 100,
			       x, y + 200);
	
	GeneralPath path = this.get();
	path.append(balloon, false);
	path.append(leftTie, false);
	path.append(rightTie, false);
	path.append(bottomTie, false);
	path.append(balloonString, false);
    }
}
