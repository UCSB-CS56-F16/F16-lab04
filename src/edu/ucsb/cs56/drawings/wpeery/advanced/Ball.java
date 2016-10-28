package edu.ucsb.cs56.drawings.wpeery.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
import edu.ucsb.cs56.drawings.wpeery.simple.Circle;


public class Ball extends GeneralPathWrapper implements Shape
{
    /**
     * Constructor for objects of class Ball
     */
    public Ball(double x, double y, double radius)
    {
	Circle shape = new Circle(x,y,radius);
	GeneralPath ball = this.get();
	ball.append(shape,false);

    }

}
