package edu.ucsb.cs56.drawings.aryamandas.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes


import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A drawing of a wheel that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Aryaman Das 
   @version for CS56, W16, UCSB
   
*/
public class Wheel extends GeneralPathWrapper implements Shape
{
    

    
    /**
       Constructor
       
       @param x x coord of wheel's top left enclosing box
       @param y y coord of wheel's top left enclosing box
       @param h height of the wheel
       @param w width of of the wheel
    */
    public Wheel(double x, double y, double h, double w)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.

	// Create the wheel frame
	Ellipse2D.Double frame = new Ellipse2D.Double(x,y,h,w);
		
	// Create 4 spokes/beams of the wheel
	// tl_br : topleft to bottom right beam
	// bl_tr : bottom left to top right beam
	Line2D.Double top_bottom = new Line2D.Double(x + w/2 , y ,
						x + w/2, y + h);
	Line2D.Double left_right = new Line2D.Double(x, y + h/2,
						 x + w, y + h/2);
	Line2D.Double tl_br = new Line2D.Double(x + w/7, y + w/7,
						x + 6*w/7, y + 6*h/7);
	Line2D.Double bl_tr = new Line2D.Double(x + w/7, y + 6*h/7,
						x + 6*w/7, y + h/7);	
        // assemble the wheel
	
        GeneralPath wholeWheel = this.get();
        wholeWheel.append(frame, false);
        wholeWheel.append(top_bottom, false);
	wholeWheel.append(left_right, false);
	wholeWheel.append(tl_br, false);
	wholeWheel.append(bl_tr, false);
    }
}
