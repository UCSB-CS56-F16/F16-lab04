package edu.ucsb.cs56.drawings.xinyuanzhang.advanced;

import java.awt.Shape;
import java.awt.Rectangle;
import java.awt.geom.GenaralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.PathIterator;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


/**
   @author Xinyuan Zhang

   @version for CS56,F16,UCSB
*/

public class ToothBrushWithCup extends ToothBrush implements Shape{

    /**
       Constructor
       @param x the coordinate of the left edge
       @param y the coordinate of the top
       @param width width of the ToothBrush 
       @param height  height of the ToothBrush
    */

    public ToothBrushWithCup (double x, double y,double width, double height){
	super(x,y,width,height);

	Point2D.Double upper = new Point2D.Double(x,0.5*y);
	Point2D.Double lower = new Point2D.Double(x,0);
	Point2D.Double right = new Point2D.Double(x+0.2*y,0.4 * y);
	Point2D.Double left = new Point2D.Double(x-0.2*y,0.1*y);
	
	Line2D.Double cupTop = new Line2D.Double(upper,right);
	Line2D.Double cupRight = new Line2D.Double(right,lower);
	Line2D.Double cupBottom = new Line2D.Double(lower,left);
	Line2D.Double cupLeft = new Line2D.Double(left,upper);

	//put all components together
	GeneralPath toothBrushWithCup = this.get();
	toothBrushWithCup.append(cupTop, false);
	toothBrushWithCup.append(cupRight, false);
	toothBrushWithCup.append(cupBottom, false);
	toothBrushWithCup.append(cupLeft, false);
    }
}
