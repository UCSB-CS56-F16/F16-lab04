package edu.ucsb.cs56.drawings.adorotheo.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Arc2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Mushroom that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Austin Dorotheo 
   @version for CS56, F16, UCSB
   
*/
public class Mushroom extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x: x coord of center of mushroom
       @param y: y coord of center of mushroom
       @param width: width of mushroom
       @param height: height of mushroom
    */
    public Mushroom(double x, double y, double width, double height)
    {
	Arc2D.Double cap = new Arc2D.Double(x-width/2, y-height/2, width, height, 0, 180, Arc2D.CHORD);
	Rectangle2D.Double base = new Rectangle2D.Double(x-width/4, y, width/2, height/2);
	GeneralPath wholeMushroom = this.get();
	wholeMushroom.append(cap, false);
	wholeMushroom.append(base, false);
    }
}
