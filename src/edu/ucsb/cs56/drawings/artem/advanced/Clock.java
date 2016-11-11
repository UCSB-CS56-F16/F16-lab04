package edu.ucsb.cs56.drawings.artem.advanced;

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
    
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a clock that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Artem Jivotovski
   @version CS56, F16, UCSB

*/

public class Clock extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of upper left corner of clock
       @param y y coord of upper left corner of clock
       @param width width of the clock
       @param height height of clock
    */
    public Clock(double x, double y, double width, double height)
    {
	if (width != height) 
	    width = height;
	
	double minuteHandX = .5 * width + x;
       	double minuteHandStartY = .5 * height + y;
	double minuteHandEndY = .1 * height + y;
	
	double hourHandStartX = .5 * width + x;
	double hourHandEndX = .725 * width + x;
	double hourHandY = .5 * height + y;
	
       Ellipse2D.Double enclosingCircle = new
	   Ellipse2D.Double(x, y, width, height);

       Line2D.Double minuteHand =
	   new Line2D.Double(minuteHandX, minuteHandStartY,
			    minuteHandX, minuteHandEndY);

       Line2D.Double hourHand =
	   new Line2D.Double(hourHandStartX, hourHandY,
			     hourHandEndX, hourHandY);

       GeneralPath wholeClock = this.get();
       wholeClock.append(enclosingCircle, false);
       wholeClock.append(minuteHand, false);
       wholeClock.append(hourHand, false);
    }
}
