package edu.ucsb.cs56.drawings.jamesy2971.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a phone that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author James Yang 
   @version for CS56, W16, UCSB
   
*/
public class phone extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of phone
       @param y y coord of lower left corner of phone
       @param width width of the phone
       @param height of phone
    */
    public phone(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
	double loc0 = x + (.12 * width);
	double loc1 = y + (height/8);
	double loc2 = .75 * width;
	double loc3 = .6 * height;
	double loc4 = x + (.4 * width);
	double loc5 = y + (.8 * height);
	double loc6 = .2 * width;
	double loc7 = .1 * height;
	
        
	//Make the main phone outline
        
        Rectangle2D.Double mainPhone = 
            new Rectangle2D.Double(x, y ,
				   width, height);
	// Make interior components
	
	Rectangle2D.Double screen =
	    new Rectangle2D.Double(loc0, loc1, loc2, loc3);

	Rectangle2D.Double homebutton =
	    new Rectangle2D.Double(loc4, loc5, loc6, loc7);
	 
        // put the whole phone together
	
        GeneralPath wholePhone = this.get();
        wholePhone.append(mainPhone, false);
        wholePhone.append(screen, false);
	wholePhone.append(homebutton, false);    
    }
}
