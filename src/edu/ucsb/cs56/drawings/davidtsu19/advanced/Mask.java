package edu.ucsb.cs56.drawings.davidtsu19.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a mask that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author David Tsu 
   @version for CS56, F16, UCSB
   
*/
public class Mask extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of upper left corner of mask
       @param y y coord of upper left corner of mask
       @param width of the mask
       @param height of mask
    */
    public Mask(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double heightUnit = 0.125 * height;
        double widthUnit = 0.125 * width;
                
        // Make the stick.
        
        Rectangle2D.Double stick = 
            new Rectangle2D.Double(x + widthUnit, y + 4 * heightUnit,
				   0.5 * widthUnit, 4 * heightUnit);
	
        // Make the mask.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Line2D.Double topMask = 
            new Line2D.Double (x + widthUnit, y,
                               x + 7 * widthUnit, y);
	Line2D.Double topLeftAngleMask = 
            new Line2D.Double (x + widthUnit, y,
                               x, y + heightUnit);
	Line2D.Double topRightAngleMask = 
            new Line2D.Double (x + 7 * widthUnit, y,
                               x + 8 * widthUnit, y + heightUnit);
	Line2D.Double leftMask = 
            new Line2D.Double (x, y + heightUnit,
                               x, y + 3 * heightUnit);
	Line2D.Double rightMask = 
            new Line2D.Double (x + 8 * widthUnit, y + heightUnit,
                               x + 8 * widthUnit, y + 3 * heightUnit);
	Line2D.Double bottomLeftAngleMask = 
            new Line2D.Double (x, y + 3 * heightUnit,
                               x + widthUnit, y + 4 * heightUnit);
	Line2D.Double bottomRightAngleMask = 
            new Line2D.Double (x + 8 * widthUnit, y + 3 * heightUnit,
                               x + 7 * widthUnit, y + 4 * heightUnit);
	Line2D.Double bottomLeftMask = 
            new Line2D.Double (x + widthUnit, y + 4 * heightUnit,
                               x + 3 * widthUnit, y + 4 * heightUnit);
	Line2D.Double bottomRightMask = 
            new Line2D.Double (x + 7 * widthUnit, y + 4 * heightUnit,
                               x + 5 * widthUnit, y + 4 * heightUnit);
	Line2D.Double midLeftMask = 
            new Line2D.Double (x + 3 * widthUnit, y + 4 * heightUnit,
                               x + 4 * widthUnit, y + 3 * heightUnit);
	Line2D.Double midRightMask = 
            new Line2D.Double (x + 4 * widthUnit, y + 3 * heightUnit,
                               x + 5 * widthUnit, y + 4 * heightUnit);
	Ellipse2D.Double leftEye =
	    new Ellipse2D.Double (x + widthUnit, y + heightUnit,
				  2 * widthUnit, 2 * heightUnit);
	Ellipse2D.Double rightEye =
	    new Ellipse2D.Double (x + 5 * widthUnit, y + heightUnit,
				  2 * widthUnit, 2 * heightUnit);
	
        // put the whole mask together
	
        GeneralPath wholeMask = this.get();
        wholeMask.append(stick, false);
        wholeMask.append(topMask, false);
        wholeMask.append(topLeftAngleMask, false);
	wholeMask.append(topRightAngleMask, false);
	wholeMask.append(leftMask, false);
	wholeMask.append(rightMask, false);
	wholeMask.append(bottomLeftAngleMask, false);
	wholeMask.append(bottomRightAngleMask, false);
	wholeMask.append(bottomLeftMask, false);
	wholeMask.append(bottomRightMask, false);
	wholeMask.append(midLeftMask, false);
	wholeMask.append(midRightMask, false);
	wholeMask.append(leftEye, false);
	wholeMask.append(rightEye, false);
    }
}
