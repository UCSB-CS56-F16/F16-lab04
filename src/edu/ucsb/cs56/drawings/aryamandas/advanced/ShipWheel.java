package edu.ucsb.cs56.drawings.aryamandas.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A drawing of a ship wheel that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class ShipWheel extends Wheel implements Shape
{
    /**
       Constructor
       
       @param x x coord of wheel's top left enclosing box
       @param y y coord of wheel's top left enclosing box
       @param h height of the wheel
       @param w width of the wheel
    */
    public ShipWheel(double x, double y, double w, double h)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
	// Call the super class constructor
	super(x,y,w,h); // Creates original wheel...
	
        // Create the wheel handles
 
	Ellipse2D.Double top = new Ellipse2D.Double(x + w/2 - 15/2 ,y - 50,15,50);
	Ellipse2D.Double left = new Ellipse2D.Double(x  - 50, y + h/2 - 15/2 , 50, 15);
	Ellipse2D.Double right = new Ellipse2D.Double(x + w, y + h/2 - 15/2, 50, 15);
	Ellipse2D.Double bottom = new Ellipse2D.Double(x + w/2 - 15/2, y + h, 15, 50);

	Ellipse2D.Double tl = new Ellipse2D.Double(x, y - 15,15,55);
	Shape tiltTL = ShapeTransforms.rotatedCopyOf(tl, (3* Math.PI/4.0));
						   
	Ellipse2D.Double br = new Ellipse2D.Double(x + 0.9*w, y + 7*h/8 - 15, 15, 55);
	Shape tiltBR = ShapeTransforms.rotatedCopyOf(br, (3*Math.PI/4.0));

	Ellipse2D.Double bl = new Ellipse2D.Double(x, y + 7*h/8 - 15, 15, 55);
	Shape tiltBL = ShapeTransforms.rotatedCopyOf(bl, Math.PI/4.0);
	

	Ellipse2D.Double tr = new Ellipse2D.Double(x + 0.9*w, y-15 , 15, 55);
	Shape tiltTR = ShapeTransforms.rotatedCopyOf(tr, Math.PI/4.0);
           
	
	// assemble the Ship Wheel
	
        GeneralPath wholeShipWheel = this.get();
	wholeShipWheel.append(top, false);
	wholeShipWheel.append(left, false);
	wholeShipWheel.append(right, false);
	wholeShipWheel.append(bottom, false);
	wholeShipWheel.append(tiltTL, false);
	wholeShipWheel.append(tiltBR, false);
	wholeShipWheel.append(tiltBL, false);
	wholeShipWheel.append(tiltTR, false);
    }
}
