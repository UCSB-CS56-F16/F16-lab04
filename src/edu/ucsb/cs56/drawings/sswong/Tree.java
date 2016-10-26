package edu.ucsb.cs56.drawings.sswong;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a house that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Simon Wong
   @version for CS56, W16, UCSB
   
*/
public class Tree extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of tree
       @param y y coord of lower left corner of tree
       @param trunk_radius radius of tree leaves
       @param trunk_width width of trunk
       @param trunk_height height of trunk
    */
    public Tree(double x, double y,
		double leaves_radius,
		double trunk_width, double trunk_height,)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
	// Make the leaves

	Ellipse2D.Double leaves =
	    new Ellipse2D.Double(x, y-(2*leaves_radius)-trunk_height,
				 leaves_radius*2, leaves_radius*2);
	
        // Make the trunk
        
        Rectangle2D.Double trunk = 
            new Rectangle2D.Double(x+leaves_radius-(trunk_width/2),
				   y-trunk_height,
				   trunk_width, trunk_height);
	
       // put the whole tree together
	
        GeneralPath wholeTree = this.get();
        wholeTree.append(leaves, false);
        wholeTree.append(trunk, false);
       
    }
}
