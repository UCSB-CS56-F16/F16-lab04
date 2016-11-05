//
//
// @author Nick Perry
// @version 0.1
//
//
//

package edu.ucsb.cs56.drawings.nrperry.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


public class MagicWand extends GeneralPathWrapper implements Shape {

    /*
      Constructor
      
      @param x x-coord of top left of circle
      @param y y-coord of top left of circle
      @param radius of the circle
      @param wandHeight of the Stick

     */
    public MagicWand(double x, double y, double radius, double wandHeight) {

	double centerX = x + radius/2;
	double edgeY = y + radius;

	double midRad = radius * (2.0/3.0);
	double innerRad = radius * (1.0/3.0);
	
	Ellipse2D.Double wandOutline =
	    new Ellipse2D.Double(x, y, radius, radius);
	
	Line2D.Double wandBase =
	    new Line2D.Double(centerX, edgeY, centerX, edgeY+wandHeight);

	GeneralPath wholeWand = this.get();
	wholeWand.append(wandOutline, false);
	wholeWand.append(wandBase, false);

	
    }


}
