package edu.ucsb.cs56.drawings.jleeong.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Line2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
	A drawing of a simple cup that implements the Shape interface
	allowing it to be drawn, rotated, scaled, etc.
	
	@author Jared Leeong
	@version for CS56, F16, UCSB
*/
public class Cup extends GeneralPathWrapper implements Shape{
	
	/**
		Constructor
		@param x x coord of lower left corner of cup
		@param y y coord of lower left corner of cup
		@param width width of cup
		@param height height of cup
	*/
	public Cup(double x, double y, double width, double height){
		double topwidth = width;
		double bottomwidth = .8*width;
		double bx = 1*width;

		Line2D.Double bottom =
			new Line2D.Double(bx, y, bx+width, y);
		Line2D.Double top =
			new Line2D.Double(x, y+height, x+width,
			y+height);
		
		Line2D.Double leftside =
			new Line2D.Double(bx, y, x, y+height);
		Line2D.Double rightside = 
			new Line2D.Double(bx+bottomwidth, y,
			x+width, y+height);

		//assemble Cup componenets
		GeneralPath cup = this.get();
		cup.append(bottom,false);
		cup.append(top,false);
		cup.append(leftside,false);
		cup.append(rightside,false);
	}
}
