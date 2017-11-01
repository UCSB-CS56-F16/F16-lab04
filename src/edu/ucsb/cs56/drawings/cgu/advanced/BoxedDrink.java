package edu.ucsb.cs56.drawings.cgu.advanced;
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
      
   @author Charles Gu
   @version for CS56, F17, UCSB
   
*/
public class BoxedDrink extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of boxed drink
       @param y y coord of lower left corner of boxed drink
       @param width width of the drink
       @param height of drink
    */
    public BoxedDrink(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double firstStoryHeight = height;
        double roofHeight = height - firstStoryHeight;
        
        double UpperLeftY = y + roofHeight;
        
        // Make the first story
        
        Rectangle2D.Double firstStory = 
            new Rectangle2D.Double(x, UpperLeftY,
				   width, firstStoryHeight);
	
        Line2D.Double lidSeparation = 
            new Line2D.Double (x, UpperLeftY + (UpperLeftY/6),
                               (x + width), UpperLeftY + (UpperLeftY/6));
        // make the roof.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        // put the whole house together
	
        GeneralPath wholeBoxedDrink = this.get();
        wholeBoxedDrink.append(firstStory, false);
	wholeBoxedDrink.append(lidSeparation, false);
    }
}
