package edu.ucsb.cs56.drawings.jordanang.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A drawing of a bob-omb character that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Jordan Ang 
   @version for CS56, F16, UCSB
   
*/

public class BobOmb extends Bomb implements Shape
{
	/**
       Constructor
       
       @param x x coord of lower left corner of bomb
       @param y y coord of lower left corner of bomb
       @param diameter diameter of the bomb size
    */

	public BobOmb(double x, double y, double diameter){
		//construct basic bomb shell
		super(x,y,diameter);

		double totalHeight = diameter/0.825;
		double fuseHeight = 0.175 * totalHeight;

		double eyeHeight = 0.4 * diameter;
		double eyeWidth = 0.2 * diameter;
		double eye1TopLeftX = x + (diameter/2) - (diameter*0.4);
		double eye1TopLeftY = y + fuseHeight + (diameter*0.25);
		double eye2TopLeftX = x + (diameter/2) - (diameter*0.1);
		double eye2TopLeftY = y + fuseHeight + (diameter*0.25);

		double shoeHeight = 0.15 * diameter;
		double shoeWidth = 0.35 * diameter;
		double shoe1TopLeftX = x + (diameter/2) - (diameter*0.4);
		double shoe1TopLeftY = y + totalHeight;
		double shoe2TopLeftX = x + (diameter/2) + (diameter*0.05);
		double shoe2TopLeftY = y + totalHeight;

		Ellipse2D.Double eye1 = new Ellipse2D.Double(eye1TopLeftX, eye1TopLeftY, eyeWidth, eyeHeight);
		Ellipse2D.Double eye2 = new Ellipse2D.Double(eye2TopLeftX, eye2TopLeftY, eyeWidth, eyeHeight);
		Ellipse2D.Double shoe1 = new Ellipse2D.Double(shoe1TopLeftX, shoe1TopLeftY, shoeWidth, shoeHeight);
		Ellipse2D.Double shoe2 = new Ellipse2D.Double(shoe2TopLeftX, shoe2TopLeftY, shoeWidth, shoeHeight);

		GeneralPath wholeBobOmb = this.get();
        wholeBobOmb.append(eye1, false);
        wholeBobOmb.append(eye2, false);
        wholeBobOmb.append(shoe1, false);
        wholeBobOmb.append(shoe2, false);
	}
}