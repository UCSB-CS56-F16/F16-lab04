package edu.ucsb.cs56.drawings.silvershark17.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Cube that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Eric Xiao 
   @version for CS56, F16, UCSB
   
*/
public class Cube extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of top left corner of cube
       @param y y coord of top left corner of cube
       @param length length of one side of the cube
    */
    public Cube(double x, double y, double length) {
	
	Rectangle2D.Double frontSquare =
	    new Rectangle2D.Double(x, y, length, length);
	Line2D.Double topLeft =
	    new Line2D.Double(x, y, x + 0.5*length, y-0.4*length);
        Line2D.Double topRight =
            new Line2D.Double(x+length, y, x + 1.5*length, y-0.4*length);
	Line2D.Double joinTop =
	    new Line2D.Double(x+0.5*length, y-0.4*length, x+1.5*length,
			      y-0.4*length);
	Line2D.Double bottomRight =
	    new Line2D.Double(x+length, y+length, x+1.5*length,y+0.6*length);
	Line2D.Double joinRight =
	    new Line2D.Double(x+1.5*length, y-0.4*length, x+1.5*length,
			      y+0.6*length);
	GeneralPath wholeCube = this.get();
	wholeCube.append(frontSquare, false);
	wholeCube.append(topLeft, false);
	wholeCube.append(topRight, false);
	wholeCube.append(joinTop, false);
	wholeCube.append(bottomRight, false);
	wholeCube.append(joinRight, false);

    }




}
