package edu.ucsb.cs56.drawings.ericvaishnav.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
	Axe is a shape made up of a vertical line with a triangle (made from 3 lines) for the blade.
*/

public class Axe extends GeneralPathWrapper implements Shape
{

/** 
	@param x x is the x coordinate of the top of the axe stick
	@param y y is the coordinate of the top of the axe stick
	@param width width is the width of the entire axe (as if there were 2 blades included)
	@param height height is the height of the entire axe
*/

    public Axe(double x, double y, double width, double height)
    {

	Line2D.Double handle = new Line2D.Double (x, y, x, y + height);

	double bladeConnectionPoint = y + (0.25*height);

	Line2D.Double bladeDiagonalUpwards = new Line2D.Double(x, bladeConnectionPoint, x + width/2, y );
	Line2D.Double bladeDiagonalDownwards = new Line2D.Double(x , bladeConnectionPoint, x + width/2, y + 0.5*height);

	Line2D.Double bladeVerticalLine = new Line2D.Double(x + width/2, y, x + width/2, y + 0.5*height);

	GeneralPath wholeAxe = this.get();
	wholeAxe.append(handle, false);
	wholeAxe.append(bladeDiagonalUpwards, false);
	wholeAxe.append(bladeDiagonalDownwards, false);
	wholeAxe.append(bladeVerticalLine, false);

    }

}


