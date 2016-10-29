package edu.ucsb.cs56.drawings.porcher.advanced;
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
      
   @author Devon Porcher
   @version for CS56, F16, UCSB
   
*/
public class ArtFrame extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of outer rec
       @param y y coord of outer rec
       @param width of outer frame
       @param height height of outer frame
    */
    public ArtFrame(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double InnerWidth = width* 8/9;
        double InnerHeight = height* 8/9;
	double HeightDiff = (height-InnerHeight)/2;
	double WidthDiff = (width-InnerWidth)/2;
        
        
        Rectangle2D.Double OuterFrame = 
            new Rectangle2D.Double(x, y ,
				   width, height);
	
        // make the roof.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen

	Rectangle2D.Double InnerFrame = 
            new Rectangle2D.Double(x + WidthDiff, y + HeightDiff ,
				   InnerWidth, InnerHeight);
        
	
        // put the whole house together
	
        GeneralPath wholeFrame = this.get();
        wholeFrame.append(OuterFrame, false);
        wholeFrame.append(InnerFrame, false);   
    }
}
