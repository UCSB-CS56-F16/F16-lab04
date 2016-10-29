package edu.ucsb.cs56.drawings.amahini.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a coffee table that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Armin Mahini 
   @version for CS56, F16, UCSB
   
*/
public class CoffeeTable extends Table implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of table
       @param y y coord of lower left corner of table
       @param width width of the table
       @param height of table
    */
    public CoffeeTable(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.

	super(x,y,width,height);

	GeneralPath gp = this.get();
	
	double topHeight = .25 * height;
	double legWidth = .1 * width;
        double legHeight = height - (2 * topHeight);
        
        // Make the top
        
        Rectangle2D.Double top = 
            new Rectangle2D.Double(x, y,
				   width, topHeight);
	
        // make the legs.  Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Rectangle2D.Double leg1 = 
            new Rectangle2D.Double (x + legWidth, y + topHeight,
                               legWidth, legHeight);
	
        Rectangle2D.Double leg2 =
            new Rectangle2D.Double (x + (.7 * width), y + topHeight,
                               legWidth, legHeight);
	
        // put the whole table together
	
        GeneralPath wholeTable = this.get();
        wholeTable.append(top, false);
        wholeTable.append(leg1, false);
        wholeTable.append(leg2, false);    
    }
}
