package edu.ucsb.cs56.drawings.dwchojnacki.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A drawing of a quadrilateral that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Daniel Chojnacki
   @version for CS56, F16, UCSB
   
*/
public class Quadrilateral extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x1 x coord of one far corner of the quadrilateral
       @param y1 y coord of one far corner of the quadrilateral
       @param x2 x coord of the other far corner of the quadrilateral
       @param y2 y coord of the other far corner of the quadrilateral
       @param angle one of the angles in the quadrilateral (in degrees)
    */
    public Quadrilateral(double x1, double y1, double x2, double y2, double angle)
    {
	// find the length of the longest side of the quadrilateral
	// and adjust the angle
	double x3; // x coord of our third point
	double y3; // y coord of our third point
	double x4; // x coord of our fourth point
	double y4; // y coord of our fourth point
	double longestLength; // the length of the longest side of this quadrilateral
	double diffX = Math.abs(x1 - x2);
	double diffY = Math.abs(y1 - y2);
	angle = angle%90;
	angle = Math.toRadians(angle);
	if (diffX > diffY) {
	    longestLength = diffX - (diffY/(Math.tan(angle)));
	    if (x2 > x1) {
		x3 = x1 + longestLength;
		y3 = y1;
		x4 = x2 - longestLength;
		y4 = y2;
	    }
	    else {
		x3 = x2 + longestLength;
		y3 = y2;
		x4 = x1 - longestLength;
		y4 = y1;
	    }
	}
	else {
	    longestLength = diffY - (diffX/(Math.tan(angle)));
	    if (y2 > y1) {
		x3 = x1;
		y3 = y1 + longestLength;
		x4 = x2;
		y4 = y2 - longestLength;
	    }
	    else {
		x3 = x2;
		y3 = y2 + longestLength;
		x4 = x1;
		y4 = y1 - longestLength;
	    }
	}
        
        Line2D.Double firstLine = 
            new Line2D.Double(x1, y1, x3, y3);

	Line2D.Double secondLine =
	    new Line2D.Double(x3, y3, x2, y2);

	Line2D.Double thirdLine =
	    new Line2D.Double(x2, y2, x4, y4);

	Line2D.Double fourthLine =
	    new Line2D.Double(x4, y4, x1, y1);
	
        GeneralPath wholeQuadrilateral = this.get();
        wholeQuadrilateral.append(firstLine, false);
        wholeQuadrilateral.append(secondLine, false);
        wholeQuadrilateral.append(thirdLine, false);
	wholeQuadrilateral.append(fourthLine, false);
    }
}
