package edu.ucsb.cs56.drawings.zizhuo_lin.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Bathtub that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Zizhuo Lin
   @version CS56, F16, UCSB
   
*/
public class Bathtub extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of Upper left corner of Bathtub
       @param y y coord of Upper left corner of Bathtub
       @param length length of the Bathtub
       @param width width of the Bathtub 
    */
    public Bathtub(double x, double y, double length, double width)
    {
	
        double innerLength = .7 * length;
	double innerWidth = .7 * width;
        double drainR = .075 * width;
        
                
        // Make the outter layer of tub
        
        Rectangle2D.Double outter = 
            new Rectangle2D.Double(x, y ,
				   length, width);
	
        // make the inner layer of tub.
	double innerUpperLeftX = x + .15 * length;
	double innerUpperLeftY = y + .15 * width;
	Rectangle2D.Double inner =
	    new Rectangle2D.Double(innerUpperLeftX, innerUpperLeftY, innerLength, innerWidth);

	// make four lines to join the outter layer and inner layer

	Line2D.Double UL =
	    new Line2D.Double(x, y, innerUpperLeftX, innerUpperLeftY);
	Line2D.Double UR =
	    new Line2D.Double(x + length, y, innerUpperLeftX + innerLength, innerUpperLeftY);
	Line2D.Double LL=
	    new Line2D.Double(x, y + width, innerUpperLeftX, innerUpperLeftY + innerWidth);
	Line2D.Double LR =
	    new Line2D.Double(x + length, y + width, innerUpperLeftX + innerLength,
			      innerUpperLeftY + innerWidth);

	//make the drain
	double drainX = x + length * 0.75;
	double drainY = y + width * 0.5;
	Ellipse2D.Double drain =
	    new Ellipse2D.Double(drainX - drainR, drainY - drainR,
				 drainR * 2, drainR * 2);
	
        // put the whole Bathtub together
	
        GeneralPath wholeBathtub = this.get();
        wholeBathtub.append(outter, false);
        wholeBathtub.append(inner, false);
        wholeBathtub.append(UL, false);
	wholeBathtub.append(UR, false);
	wholeBathtub.append(LL, false);
	wholeBathtub.append(LR, false);
	wholeBathtub.append(drain, false);
    }
}
