package edu.ucsb.cs56.drawings.nrperry.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**

   A fully charged magic wand

   @author Nick Perry
   @version for CS56, F16, UCSB

*/

public class MagicWandV2 extends MagicWand implements Shape {

    public MagicWandV2(double x, double y, double radius, double height) {

	super(x,y,radius,height);

	double midRad = radius * (2.0/3.0);
	double innerRad = radius * (1.0/3.0);

	Ellipse2D.Double wandMidCircle =
	    new Ellipse2D.Double(x + (innerRad/2), y + (innerRad/2), midRad, midRad);
	Ellipse2D.Double wandInnerCircle =
	    new Ellipse2D.Double(x + innerRad, y + innerRad, innerRad, innerRad);

	GeneralPath wholeWand = this.get();
	wholeWand.append(wandMidCircle, false);
	wholeWand.append(wandInnerCircle, false);
	
    }
}
