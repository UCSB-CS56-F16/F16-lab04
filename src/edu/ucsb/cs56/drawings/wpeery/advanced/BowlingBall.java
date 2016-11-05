package edu.ucsb.cs56.drawings.wpeery.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
import edu.ucsb.cs56.drawings.wpeery.simple.Circle;

/**
   A Bowling Ball(This class inherits from the ball class and implements shape)
   The bowling ball is one large ball with 3 circles that make up the 
   bowling ball's finger holes. The coordinates and size of the bowlingball
   can be specified.

   @author Wesley Peery
   @version for CS56, F16, UCSB

*/


public class BowlingBall extends Ball implements Shape
{
    /**
     * Constructor for objects of class Bowling Ball
     @param x The x coordinate of the center of the bowling ball
     @param y The y coordinate of the center of the bowling ball
     @param radius The radius of the bowling ball
     */
    public BowlingBall(double x, double y, double radius)
    {
	// construct the basic ball shell
	super(x,y,radius);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();


	double hole1x = x;
	double hole2x = x + 1*radius/5;
	double hole3x = x - 1*radius/5;
	double hole1y = y;
	double hole2y = y - radius/2;
	double hole3y = hole2y;
	double smallRadius = radius/8;

	Circle hole1 = new Circle(hole1x,hole1y,smallRadius);
	Circle hole2 = new Circle(hole2x,hole2y,smallRadius);
	Circle hole3 = new Circle(hole3x,hole3y,smallRadius);
	gp.append(hole1, false);
	gp.append(hole2, false);
	gp.append(hole3, false);
    }
}
