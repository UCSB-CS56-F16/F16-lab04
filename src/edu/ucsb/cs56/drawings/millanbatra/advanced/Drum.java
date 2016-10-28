package edu.ucsb.cs56.drawings.millanbatra.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Arc2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a drum that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Millan Batra
   @version for CS56, W16, UCSB
   
*/
public class Drum extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of upper left corner of drum
       @param y y coord of upper left corner of drum
       @param width width of the drum
       @param height of drum
    */
    public Drum(double x, double y, double width, double height)
    {	
	// Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        double wide=4*height;
        //double firstStoryUpperLeftY = y + roofHeight;
        // Make the first story
        
	Ellipse2D.Double drumportion= new Ellipse2D.Double(x, y, wide, height/2);
	
        // make the drum   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        

	Line2D.Double leftportion = new Line2D.Double (x, y+height/4, x, y+2.5*height);
	 Line2D.Double rightportion =new Line2D.Double (x+wide, y+height/4, x+wide, y+2.5*height);
	 Line2D.Double bottompart=new Line2D.Double (x, y+2.5*height,x+wide, y+2.5*height);
        // put the whole drum together
	
        GeneralPath Drum = this.get();
        Drum.append(drumportion, false);
        Drum.append(rightportion, false);
	Drum.append(leftportion, false);
	Drum.append(bottompart, false);
    }
}
