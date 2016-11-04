package edu.ucsb.cs56.drawings.marioinfante.advanced;
import java.awt.geom.Line2D;
import java.awt.Shape;
import java.awt.geom.GeneralPath;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a star that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Mario Infante
   @version for CS56, F16, UCSB

*/
public class Star extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of far left corner of star
       @param y y coord of far left corner of star
       @param width width of the star
       @param height of star
    */
    public Star(double x, double y, double width, double height)
    {

	// Rather than having to scale at the end, we can just
	// draw things the right way to begin with, using the
	// x, y, width and height.   If you haven't already
	// hard coded a particular drawing, this may be an easier
	// way.

	// Remember that y goes DOWN the page,
	// so we ADD to y to get a "lower" value on the screen

	Line2D.Double lineOne = new Line2D.Double (x, y, x + width, y);

	Line2D.Double lineTwo = new Line2D.Double (x + width, y,
						   x + width/4.0, y + height*2.0/3.0);

	Line2D.Double lineThree = new Line2D.Double (x + width/4.0, y + height*2.0/3.0,
						     x + width/2.0, y - height/3.0);

	Line2D.Double lineFour = new Line2D.Double (x + width/2.0, y - height/3.0,
						    x + width*3.0/4.0, y + height*2.0/3.0);

	Line2D.Double lineFive = new Line2D.Double (x + width*3.0/4.0, y + height*2.0/3.0,
						    x, y);

	// put the whole star together

	GeneralPath star = this.get();
	star.append(lineOne, false);
	star.append(lineTwo, false);
	star.append(lineThree, false);
	star.append(lineFour, false);
	star.append(lineFive, false);
    }
}
