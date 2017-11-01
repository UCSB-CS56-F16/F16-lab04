package edu.ucsb.cs56.drawings.o_k_wang.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a FirePit that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Oscar Wang 
   @version for CS56, W16, UCSB
   
*/
public class FirePit extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of FirePit
       @param y y coord of lower left corner of FirePit
       @param width width of the FirePit
       @param height of FirePit
    */
    public FirePit(double x, double y, double width, double height)
    {


	final double ORIG_ULX = 100.0; 
        final double ORIG_ULY = 100.0; 
        final double ORIG_HEIGHT = 300.0; 
        final double ORIG_WIDTH = 400.0; 
        

	
       Ellipse2D.Double middleRock = new Ellipse2D.Double(100,100,10,10);
       Ellipse2D.Double mLRock = new Ellipse2D.Double(90,90,10,10);
       Ellipse2D.Double leftRock = new Ellipse2D.Double(80,80,10,10);
       Ellipse2D.Double mRRock = new Ellipse2D.Double(110,90,10,10);
       Ellipse2D.Double rightRock = new Ellipse2D.Double(120,80,10,10);
	
       
       
	
        // put the whole FirePit together
	
        GeneralPath wholeFirePit = this.get();
        wholeFirePit.append(middleRock, false);
        wholeFirePit.append(mLRock, false);
        wholeFirePit.append(leftRock, false);
	wholeFirePit.append(mRRock, false);
        wholeFirePit.append(rightRock, false);

	Shape s = ShapeTransforms.translatedCopyOf(wholeFirePit, -ORIG_ULX + x, -ORIG_ULY + y);
 
	// scale to correct height and width
        s =  ShapeTransforms.scaledCopyOf(s,
					  width/ORIG_WIDTH,
					  height/ORIG_HEIGHT) ;
	 
	// Use the GeneralPath constructor that takes a shape and returns
	// it as a general path to set our instance variable cup
        
	this.set(new GeneralPath(s));
        
    }
}
