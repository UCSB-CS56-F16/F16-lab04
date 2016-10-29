package edu.ucsb.cs56.drawings.g_whiter.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a drawer that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Gregory Whiter
   @version for CS56, W16, UCSB
   
*/
public class Drawer extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of drawer
       @param y y coord of lower left corner of drawer
       @param width width of the drawer
       @param height of drawer 
    */
    public Drawer(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        // Make the drawer outer outline
        
        Rectangle2D.Double outerOutline = 
            new Rectangle2D.Double(x, y ,
				   width, height);
	
        // make the inner outline
        
        Rectangle2D.Double innerOutline = 
            new Rectangle2D.Double (x + .05 * width, y + .05 * height,
                               .90 * width, .90 * height);
	
        Ellipse2D.Double handle =
            new Ellipse2D.Double (x + .875*width/2.0, y + .94*height/2,
                               .15 * width, .15 * height);
							   
	
        // put the whole drawer together
	
        GeneralPath newDrawer = this.get();
		newDrawer.append(outerOutline, false);
		newDrawer.append(innerOutline, false);
		newDrawer.append(handle, false);
         
    }
}
