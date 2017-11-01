package edu.ucsb.cs56.drawings.andrewlai.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a speaker that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Phill Conrad
   @author Andrew Lai 
   @version for CS56, F17, UCSB
   
*/
public class Speaker extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of speaker
       @param y y coord of lower left corner of speaker
       @param height speaker, width scales with 2/3 height
    */
    public Speaker(double x, double y, double height)
    {
	
        // set the dimensions
        
        double width = .64 * height;
        double wooferCenterY = .67 * height;
        double wooferRadius = .25 * height;
        double wooferDiameter = wooferRadius * 2.0;


        
        // draw the box
        
        Rectangle2D.Double box = new Rectangle2D.Double(x, y, width, height);
	
        // draw the woofer
	
        Ellipse2D.Double woofer = new Ellipse2D.Double (x + width/2.0 - wooferRadius, y + wooferCenterY - wooferRadius, wooferDiameter, wooferDiameter);
	
        // put the whole house together
	
        GeneralPath wholeSpeaker = this.get();
        wholeSpeaker.append(box, false);
        wholeSpeaker.append(woofer, false);   
    }
}
