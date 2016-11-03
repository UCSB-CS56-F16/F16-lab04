package edu.ucsb.cs56.drawings.jimvargas.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a computer panel that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Jim Vargas 
   @version for CS56, F16, UCSB
   
*/
public class Panel extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of panel
       @param y y coord of lower left corner of panel
       @param width of the panel
       @param height of panel
    */
    public Panel(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double PanelHeight = height;
        
        double UpperLeftY = y + PanelHeight;
        
        Rectangle2D.Double InitialPanel = 
            new Rectangle2D.Double(x, UpperLeftY ,
				   width, PanelHeight);
	
        // Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
	
        GeneralPath entirePanel = this.get();
        entirePanel.append(InitialPanel, false);

    }
}
