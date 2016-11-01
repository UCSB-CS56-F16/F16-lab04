package edu.ucsb.cs56.drawings.jingyi_liao.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a TV that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Jingyi Liao 
   @version for CS56, F16, Lab4
   
*/
public class TV extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of TV
       @param y y coord of lower left corner of TV
       @param width width of the whole TV
       @param height height of TV inculding the aerial 
    */
    public TV(double x, double y, double width, double height)
    {
        
        double outFrameHeight = .75 * height;
        double innerFrameHeight = .55 * height;
        double aerialHeight = height - outFrameHeight;
        double innerFrameY = y + 0.1 * height;
        double innerFrameX = x + 0.1 * height;
        
        // Make the outFrame
        Rectangle2D.Double ourFrame = new Rectangle2D.Double(x, y , width , outFrameHeight);
        // Make the innerFrame	
        Rectangle2D.Double innerFrame = new Rectangle2D.Double(innerFrameX, innerFrameY , width - 2 * 0.1 * height, innerFrameHeight);
        // Make the aerial
        Line2D.Double leftAerial = new Line2D.Double (x + width/2.0, y , x , y - aerialHeight);
        Line2D.Double rightAerial = new Line2D.Double (x + width/2.0, y , x + width , y - aerialHeight);	
        	
        // put the whole TV together	
        GeneralPath wholeTV = this.get();
        wholeTV.append(ourFrame, false);
        wholeTV.append(innerFrame, false);
        wholeTV.append(leftAerial, false);
        wholeTV.append(rightAerial, false);   
    }
}
