package edu.ucsb.cs56.drawings.ajolguin.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a ball that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Adrian Olguin 
   @version for CS56, F16, UCSB
   
*/
public class Ball extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of ball
       @param y y coord of lower left corner of ball
       @param width width of the ball
       @param height of ball
    */
    public Ball(double x, double y, double r)
    {

	// Rather than having to scale at the end, we can just
	// draw things the right way to begin with, using the
	// x, y, r.   If you haven't already
	// hard coded a particular drawing, this may be an easier
	// way.
	
	Ellipse2D.Double myBall = new Ellipse2D.Double(x-r, y-r, r*2, r*2);
	Ellipse2D.Double inflate = new Ellipse2D.Double(x-r*.15, y-r*.15, r*.3, r*.3);
	GeneralPath DrawBall = new GeneralPath();
	
	// put the whole ball together
	
	GeneralPath wholeBall = this.get();
	wholeBall.append(myBall, false);
	wholeBall.append(inflate, false);
	}
}
