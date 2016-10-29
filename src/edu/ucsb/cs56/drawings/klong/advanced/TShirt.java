package edu.ucsb.cs56.drawings.klong.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a T-Shirt that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Keith Long
   @version for CS56, W16, UCSB
   
*/
public class TShirt extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of shirt
       @param y y coord of lower left corner of shirt
       @param width width of the shirt
       @param heightSleeves height from bottom to sleves
       @param heightTop height from sleeve bottom to top
    */
    public TShirt(double x, double y, double width,
		  double heightSleeves, double heightTop)
    {

	// Rather than having to scale at the end, we can just
	// draw things the right way to begin with, using the
	// x, y, width and height, etc.
	
	        Rectangle2D.Double firstStory =
		    new Rectangle2D.Double(x, firstStoryUpperLeftY ,
					   width, firstStoryHeight);

		// make the roof.   Remember that y goes DOWN the page,
		// so we ADD to y to get a "lower" value on the screen

		        Line2D.Double leftRoof =
			    new Line2D.Double (x, y + roofHeight,
					       x + width/2.0, y);

			        Line2D.Double rightRoof =
				    new Line2D.Double (x + width/2.0, y,
						       x + width, y + roofHeight);

				// put the whole house together

				GeneralPath wholeHouse = this.get();
				wholeHouse.append(firstStory, false);
				wholeHouse.append(leftRoof, false);
				wholeHouse.append(rightRoof, false);
    }
}



