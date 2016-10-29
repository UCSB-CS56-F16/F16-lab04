package edu.ucsb.cs56.drawings.williamwhuang.advanced;

import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

public class ShiningLightBulb extends LightBulb implements Shape{
    public ShiningLightBulb(double x, double y,
			    double width, double height){
	super(x,y,width,height);
	double radius = .5 * height;
	GeneralPath originalGP = this.get();

	Line2D.Double upperVerticalLine =
	    new Line2D.Double (x, y + 1.5 * radius,
			       x, y + 1.1 * radius);
	Line2D.Double leftHorizontalLine =
	    new Line2D.Double (x + -1.5 * radius, y + -.1 * radius,
			       x + -2 * radius, y + -.1*radius);
	Line2D.Double rightHorizontalLine =
	    new Line2D.Double (x + 1.5 * radius, y + -.1* radius,
			       x + 2 * radius, y + -.1* radius);
	Line2D.Double bottomVerticalLine =
	    new Line2D.Double ( x, y + -3 * radius,
				x, y + -3.4 * radius);
	originalGP.append(upperVerticalLine, false);
	originalGP.append(leftHorizontalLine, false);
	originalGP.append(rightHorizontalLine, false);
	originalGP.append(bottomVerticalLine, false);
    }
}
