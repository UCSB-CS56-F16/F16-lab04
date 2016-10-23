package edu.ucsb.cs56.drawings.johnnyzhang.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a sponge that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Johnny Zhang
   @version for CS56, F16, UCSB
   
*/
public class Sponge extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of sponge
       @param y y coord of lower left corner of sponge
       @param width sponge
       @param height of sponge
       @param radius of the holes on the sponge
    */
    public Sponge(double x, double y, double width, double height, double radius)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        // Make the body
        
        Rectangle2D.Double body = 
            new Rectangle2D.Double(x, y ,
				   width, height);
	//create offsets for the holes.
	double x1=(x+Math.random()*(width-radius));
	double y1=(y+.13*height);
	double x2=(x+Math.random()*(width-radius));
	double y2=(y+.68*height);
	
	// make the holes
	Ellipse2D.Double hole1 = new Ellipse2D.Double(x1,y1,radius,radius);
	Ellipse2D.Double hole2 = new Ellipse2D.Double(x2,y2,radius,radius);
	
        // put the whole house together
	
        GeneralPath wholeHouse = this.get();
        wholeHouse.append(body, false);
	wholeHouse.append(hole1, false);
	wholeHouse.append(hole2, false);
    }
}
