package edu.ucsb.cs56.drawings.chvlewis.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;


import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a house that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class Door extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of door
       @param y y coord of lower left corner of door
       @param width width of the door
       @param height of door
    */
    public Door(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
	// Make the door frame
        
        Rectangle2D.Double doorFrame = 
            new Rectangle2D.Double(x, y ,
				   width, height);
	
        // make the roof.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen

	// Make the door outline
	double w = width/20.0;
	double doorOutlineX =  x + w;
	double doorOutlineY = y + w;
	double doorOutlineWidth =  width - 2*w;
	double doorOutlineHeight =  height - w;

        Rectangle2D.Double doorOutline = 
            new Rectangle2D.Double (doorOutlineX, doorOutlineY,
                               doorOutlineWidth, doorOutlineHeight);

	// Make the door knob

	double doorKnobX = x + .95 * doorOutlineWidth;
	double doorKnobY = y + .5 * doorOutlineHeight + w;
	double doorKnobRadius = .08 * doorOutlineWidth;

	Circle doorKnob =
	    new Circle (doorKnobX, doorKnobY, doorKnobRadius);
	
	
	// put the whole door together
	
        GeneralPath wholeDoor = this.get();
        wholeDoor.append(doorFrame, false);
        wholeDoor.append(doorOutline, false);
	wholeDoor.append(doorKnob, false);
    }
}
