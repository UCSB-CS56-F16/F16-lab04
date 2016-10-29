package edu.ucsb.cs56.drawings.edwardguardado.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 


import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of an empty martini glass with that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Edward Guardado III
   @version for CS56, W16, UCSB
   
*/
public class MartiniGlass extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of upper left corner of the glass
       @param y y coord of upper right corner of the glass
       @param width width of the glass
       @param height of the glass
    */
    public MartiniGlass(double x, double y, double width, double height)
    {
        
        // Make glass
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double heightAdjust = height/2.0;
        double widthAdjust = width/2.0;
        
        // make the left slant of the glass.   
        
        Line2D.Double leftTilt = 
            new Line2D.Double (x+widthAdjust, y+ heightAdjust,
                               x , y);

	    //make right slant of glass
        Line2D.Double rightTilt = 
            new Line2D.Double (x+widthAdjust, y+ heightAdjust,
                               x+width , y);

        //make the pole between base and glass
        Line2D.Double pole = 
            new Line2D.Double (x+widthAdjust, y+height,
                              x+widthAdjust, y+ heightAdjust);
        
        //make the base of the glass
        Line2D.Double base = 
            new Line2D.Double (x+width/4, y+height,
                               x+3*width/4 , y+height);
        // put the glass together
	
        GeneralPath wholeGlass = this.get();
        wholeGlass.append(pole, false);
        wholeGlass.append(base, false);
        wholeGlass.append(leftTilt, false);   
        wholeGlass.append(rightTilt, false);   
 
    }
}
