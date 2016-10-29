package edu.ucsb.cs56.drawings.williamwhuang.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/** 
    A vector drawing of a lightbulb that implements 
    the Shape interface, and so can be drawn, as well
    as scaled, rotated, etc.

    @author William Huang
    @version for CS56, F16, UCSB
*/
public class LightBulb extends GeneralPathWrapper implements Shape{
    public LightBulb(double x, double y,
		     double width, double height)
    {
	double bulbRadius = .5 * height;
	double bottomRectangleWidth = .2 * width;
	double bottomRectangleHeight = .3 * height;

	Rectangle2D.Double bottomRectangle =
	    new Rectangle2D.Double(x - bottomRectangleWidth / 2.0, y + bulbRadius,
				   bottomRectangleWidth,
				   bottomRectangleHeight);
	Circle bulb =
	    new Circle(x, y, bulbRadius);

	GeneralPath wholeLightBulb = this.get();
	wholeLightBulb.append(bottomRectangle, false);
	wholeLightBulb.append(bulb, false);
    }
}
