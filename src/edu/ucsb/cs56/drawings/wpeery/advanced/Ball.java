package edu.ucsb.cs56.drawings.wpeery.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
import edu.ucsb.cs56.drawings.wpeery.simple.Circle;
/**
   A Ball (wrapper around a General Path, implements Shape) This class uses
   the circle class to create a ball at a specified coordinate location
   of a certain size.

   @author Wesley Peery
   @version for CS56, F16, UCSB

*/

public class Ball extends GeneralPathWrapper implements Shape
{
    /**
     * Constructor for objects of class Ball
     @param x The x coordinate of the center of the ball
     @param y The y coordinate for the center of the ball
     @param radius The radius of the ball
     */
    public Ball(double x, double y, double radius)
    {
	Circle shape = new Circle(x,y,radius);
	GeneralPath ball = this.get();
	ball.append(shape,false);

    }

}
