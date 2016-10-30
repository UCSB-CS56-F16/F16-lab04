package edu.ucsb.cs56.drawings.dwchojnacki.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a pokeball that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Daniel Chojnacki
   @version for CS56, F16, UCSB
   
*/
public class PokeBall extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of the center of the pokeball
       @param y y coord of the center of the pokeball
       @param innerRadius the radius of the inner circle of the pokeball
       @param outerRadius the difference in length between the radius of the inner circle of the pokeball and the radius of the outer circle
    */
    public PokeBall(double x, double y, double innerRadius, double outerRadius)
    {
	outerRadius = Math.abs(outerRadius);
	Ellipse2D.Double innerCircle = new Ellipse2D.Double(x-innerRadius, y-innerRadius, innerRadius*2, innerRadius*2);
	Ellipse2D.Double outerCircle =
	    new Ellipse2D.Double(x-innerRadius-outerRadius, y-innerRadius-outerRadius,(innerRadius+outerRadius)*2, (innerRadius+outerRadius)*2);
	Line2D.Double leftLine =
	    new Line2D.Double(x-innerRadius, y, x-innerRadius-outerRadius, y);
	Line2D.Double rightLine =
	    new Line2D.Double(x+innerRadius, y, x+innerRadius+outerRadius, y);
	
        GeneralPath wholePokeBall = this.get();
        wholePokeBall.append(innerCircle, false);
        wholePokeBall.append(outerCircle, false);
        wholePokeBall.append(leftLine, false);
	wholePokeBall.append(rightLine, false);
    }
}
