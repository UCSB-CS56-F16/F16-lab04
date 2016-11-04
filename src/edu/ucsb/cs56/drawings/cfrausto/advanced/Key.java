package edu.ucsb.cs56.drawings.cfrausto.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a key that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Phill Conrad
   @version for CS56, W16, UCSB

*/
public class Key extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param width width of the house
       @param height of house (including first story and second story)
    */
    public Key(double x, double y, double width, double height)
    {

	// Rather than having to scale at the end, we can just
	// draw things the right way to begin with, using the
	// x, y, width and height.   If you haven't already
	// hard coded a particular drawing, this may be an easier
	// way.


	double bowWidth =  width/3;
	double bladeWidth = .66 * width;

	double bladeHeight = .4 * height;

	
	double bLocationX = x + bowWidth;
	double bLocationY = y + (height/4);
	

	// now we add the handle on.
	
	Rectangle2D.Double keyBow =
	    new Rectangle2D.Double(x, y,
				   bowWidth, height);

	// Make the blade of the key
	Rectangle2D.Double keyBlade =
	    new Rectangle2D.Double(bLocationX, bLocationY,
				   bladeWidth, bladeHeight);
	
			
		    // put the key together
		    GeneralPath wholeKey = this.get();
		    wholeKey.append(keyBow, false);
		    wholeKey.append(keyBlade, false);
    }
}
