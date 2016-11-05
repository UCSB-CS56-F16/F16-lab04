package edu.ucsb.cs56.drawings.arthursilverstein.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a laptop that implements
   the Shape interface.
      
   @author Arthur Silverstein
   @version for CS56, F16, UCSB
   
*/
public class Laptop extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of laptop
       @param y y coord of lower left corner of laptop
       @param width total width of the laptop
       @param height total height of the laptop
    */
    public Laptop(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double bottomEdgeLength = 0.75 * width; //since its 3D
	double perspectiveWidth = 0.25 * width;
	double perspectiveHeight = 0.25 * height;
        double screenEdgeLength = 0.75 * height;
        
        
	// Draw the base
	Line2D.Double foreBottomEdge = new Line2D.Double
		(x, y, x+bottomEdgeLength, y);
	Line2D.Double leftDiagonal = new Line2D.Double
		(x, y, x+perspectiveWidth, y-perspectiveHeight);
	Line2D.Double rightDiagonal = new Line2D.Double
		(x+bottomEdgeLength, y, x+width, y-perspectiveHeight);

	//The rear bottom edge is partially covered by the screen, so we'll draw it shorter
	Line2D.Double rearBottomEdge = new Line2D.Double
		(x+perspectiveWidth, y-perspectiveHeight, 
		x+bottomEdgeLength, y-perspectiveHeight);

	// Draw the screen
	Line2D.Double foreScreenEdge = new Line2D.Double
		(x+bottomEdgeLength, y, x+bottomEdgeLength, y-screenEdgeLength);
	Line2D.Double rearScreenEdge = new Line2D.Double
		(x+width, y-perspectiveHeight, x+width, y-height);
	Line2D.Double topDiagonal = new Line2D.Double
		(x+bottomEdgeLength, y-screenEdgeLength, x+width, y-perspectiveHeight-screenEdgeLength);

	
        // put the whole laptop together
	
        GeneralPath wholeLaptop = this.get();
        wholeLaptop.append(foreBottomEdge, false);
        wholeLaptop.append(leftDiagonal, false);
        wholeLaptop.append(rightDiagonal, false);    
        wholeLaptop.append(rearBottomEdge, false);    
        wholeLaptop.append(foreScreenEdge, false);    
        wholeLaptop.append(rearScreenEdge, false);    
        wholeLaptop.append(topDiagonal, false);    
    }
}
