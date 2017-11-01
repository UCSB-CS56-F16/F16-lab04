package edu.ucsb.cs56.drawings.asaied.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Planet with Moons that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Ahmed Saied 
   @version for CS56, F17, UCSB
   
*/
public class PlanetWithMoons extends Planet implements Shape
{
    /**
       Constructor
       @param x upper left x coordinate of main drawing plane (includes moons and main planet body
       @param y upper left y coordinate of main drawing plane (includes moons and main planet body
       @param radiusplusmoons size of main planet body and moons (size of drawing plane not counting the rings)
   
    */
    public PlanetWithMoons(double x, double y, double radiusplusmoons)
    {
	super(x, y+ (0.1*radiusplusmoons), (0.9 * radiusplusmoons));

	double moon_radius = 0.1 * radiusplusmoons;

	Ellipse2D.Double m1 = new Ellipse2D.Double(x, y, moon_radius, moon_radius);
	Ellipse2D.Double m2 = new Ellipse2D.Double(x +(0.9*radiusplusmoons), y, moon_radius, moon_radius);

	GeneralPath g = this.get();
	g.append(m1, false);
	g.append(m2, false);
    }
}
