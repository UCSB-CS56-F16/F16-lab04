package edu.ucsb.cs56.drawings.artem.advanced;

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
    
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a watch that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Artem Jivotovski
   @version CS56, F16, UCSB

*/

public class Watch extends Clock implements Shape
{
    /**
     * Constructor
       
       @param x x coord of upper left corner of watch
       @param y y coord of upper left corner of watch
       @param width width of the watch face
       @param height height of the watch face
     */
    public Watch(double x, double y, double width, double height)
    {
	super(x, y + height * 2, width, height); 
	
	if (width != height) 
	    width = height;

	Rectangle2D.Double strap =
	    new Rectangle2D.Double(x, y + .5 * height, width, height * 4);

	Ellipse2D.Double hole1 =
	    new Ellipse2D.Double (x + .5 * width, y + height,
				  width * .05, height * .05);
	Ellipse2D.Double hole2 =
	    new Ellipse2D.Double (x + .5 * width, y + 1.2 * height,
				  width * .05, height * .05);
	Ellipse2D.Double hole3 =
	    new Ellipse2D.Double (x + .5 * width, y + 1.4 * height,
				  width * .05, height * .05);
	Ellipse2D.Double pin1 =
	    new Ellipse2D.Double (x + .5 * width, y + 3.5 * height,
				  width * .05, height * .05);
	Ellipse2D.Double pin2 =
	    new Ellipse2D.Double (x + .5 * width, y + 3.7 * height,
				  width * .05, height * .05);
	Ellipse2D.Double pin3 =
	    new Ellipse2D.Double (x + .5 * width, y + 3.9 * height,
				  width * .05, height * .05);


	
	GeneralPath wholeWatch = this.get();
	wholeWatch.append(strap, false);
        wholeWatch.append(hole1, false);
	wholeWatch.append(hole2, false);
	wholeWatch.append(hole3, false);
	wholeWatch.append(pin1, false);
	wholeWatch.append(pin2, false);
	wholeWatch.append(pin3, false);
						    
    }
}
