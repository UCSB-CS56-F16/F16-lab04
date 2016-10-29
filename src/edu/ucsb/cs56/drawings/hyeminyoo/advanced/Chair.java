package edu.ucsb.cs56.drawings.hyeminyoo.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a chair that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Hyemin Yoo 
   @version for CS56, F16, UCSB
   
*/
public class Chair extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of chair
       @param y y coord of lower left corner of chair
       @param width width of the chair
       @param height of chair (including first story and second story)
    */
    public Chair(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
	double seatHeight=height/6;
	double backWidth=width/4;
	double seatWidth= width-backWidth;
	double legHeight=height/2-seatHeight;
	double legWidth=width/4;
         	
        Rectangle2D.Double back = 
            new Rectangle2D.Double(x, y ,
				   backWidth, height);
	Rectangle2D.Double seat=
	    new Rectangle2D.Double(x+width/4,y+height/2,seatWidth,seatHeight);	
	Rectangle2D.Double leg=
	    new Rectangle2D.Double(x+3*width/4,y+2*height/3,legWidth,legHeight);


        
	
        // put the whole chair together
	
        GeneralPath wholeChair = this.get();
        wholeChair.append(back, false);
        wholeChair.append(seat, false);
        wholeChair.append(leg, false);    
    }
}
