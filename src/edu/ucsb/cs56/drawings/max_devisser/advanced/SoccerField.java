package edu.ucsb.cs56.drawings.maxdevisser.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a soccer field that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Max de Visser 
   
*/
public class SoccerField extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of top left corner of the field
       @param y y coord of top left corner of the field
       @param width width of the field
       @param height of the field
    */
    public SoccerField(double x, double y, double width, double height)
    { 
        final double ORIG_HEIGHT = 75.0; 
        final double ORIG_WIDTH = 120.0; 
	
        GeneralPath leftSide = new GeneralPath();

	Rectangle2D.Double sidelines =
	    new Rectangle2D.Double(0.0, 0.0, 60.0, 75.0);
	Rectangle2D.Double goalArea =
	    new Rectangle2D.Double(0.0, 27.5, 6.0, 20.0);
	Rectangle2D.Double penaltyArea =
	    new Rectangle2D.Double(0.0, 15.5, 18.0, 44.0);
	
        leftSide.append(sidelines, false);
	leftSide.append(goalArea, false);
	leftSide.append(penaltyArea, false);

	Shape rightSide = ShapeTransforms.horizontallyFlippedCopyOf(leftSide);
	rightSide = ShapeTransforms.translatedCopyOf(rightSide, 120.0, 0.0);

	Ellipse2D.Double centerCircle =
	    new Ellipse2D.Double(50.0, 27.5, 20.0, 20.0);

	GeneralPath wholeField = new GeneralPath();
	wholeField.append(leftSide, false);
	wholeField.append(rightSide, false);
	wholeField.append(centerCircle, false);

	Shape s = ShapeTransforms.
	    translatedCopyOf(wholeField, x, y);
        s =  ShapeTransforms.
	    scaledCopyOf(s, width / ORIG_WIDTH, height / ORIG_HEIGHT) ;
	 
	// Use the GeneralPath constructor that takes a shape and returns
	// it as a general path to set our instance variable cup
        
	this.set(new GeneralPath(s));
    }
}
