package edu.ucsb.cs56.drawings.zihengsong.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
   A Skateboard

   @author Ziheng Song
   @version for CS56, W16, UCSB

*/
public class DoubleSlideSkateboard extends Skateboard implements Shape
{
    /**
     * Constructor for objects of class DoubleSlideSkateboard
     */
    public DoubleSlideSkateboard(double x, double y, double length, double radius)
    {
	// construct the basic skateboard
	super(x,y,length,radius);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	// Make two slides, spaced like this;
	// \                    /
	//  \__________________/

	double l = 0.2 * length;

	Line2D.Double leftSlide =
	    new Line2D.Double(x - l, y - 0.5 * l, x, y);
	Line2D.Double rightSlide =
	    new Line2D.Double(x + length, y, x + length + l, y - 0.5 * l );
	
	// add the slides to the skateboard
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
	GeneralPath wholeSkateboard = this.get();
	wholeSkateboard.append(leftSlide, false);
	wholeSkateboard.append(rightSlide, false);
    }
}
