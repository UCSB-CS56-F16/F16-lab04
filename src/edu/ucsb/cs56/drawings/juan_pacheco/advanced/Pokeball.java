package edu.ucsb.cs56.drawings.juan_pacheco.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Pokeball that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Juan Pacheco
   @version for CS56, F16, UCSB
   
*/
public class Pokeball extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of top left of circle
       @param y y coord of top left of circle
       @param radius radius of circle
    */
    public Pokeball(double x, double y, double radius)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, and radius.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double outerCircle = radius;
        double middleCircle = .25 * outerCircle;
        
        double innerCircle = .75 * middleCircle;

	double horizontalLine = 2 * radius;
	
        // Make outside circle circle
		       
        Ellipse2D.Double  outsideCircle = 
            new Ellipse2D.Double(x, y, 2*outerCircle, 2*outerCircle);

	// Make middle circle

	Ellipse2D.Double  betweenCircle = 
            new Ellipse2D.Double(x+radius-middleCircle, y+radius-middleCircle, 2*middleCircle, 2*middleCircle);

	// make inner circle

	Ellipse2D.Double  insideCircle = 
            new Ellipse2D.Double(x+radius-innerCircle, y+radius-innerCircle , 2*innerCircle, 2*innerCircle);
	
        // make the horizontal line. y does not change, only x
        
        Line2D.Double lineAcross = 
            new Line2D.Double (x, y+radius,
                               x+2*radius, y+radius);
	
        // put the whole house together
	
        GeneralPath pokeball = this.get();
        pokeball.append(outsideCircle, false);
	pokeball.append(betweenCircle, false);
        pokeball.append(insideCircle, false);
	pokeball.append(lineAcross, false);
    }
}
