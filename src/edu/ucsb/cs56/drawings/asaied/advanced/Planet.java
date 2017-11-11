package edu.ucsb.cs56.drawings.asaied.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Planet that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Ahmed Saied 
   @version for CS56, F17, UCSB
   
*/
public class Planet extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       @param x top left x coordinate of the drawing
       @param y top left y coordinate of the drawing
       @param radius radius of the planet body, planet ring will be 1.5*radius for width of ring, 0.5*radius for height of ring

   
    */
    public Planet(double x, double y, double radius)
    {
	double ring_height = 0.5* radius;
	double ring_width = 1.5 * radius;

	Ellipse2D.Double body = new Ellipse2D.Double(x,y, radius, radius);

	Ellipse2D.Double ring = new Ellipse2D.Double(x-(0.25*radius), y+(0.25*radius), ring_width, ring_height);

	GeneralPath g = this.get();
	g.append(body, false);
	g.append(ring, false);
    }
}
