package edu.ucsb.cs56.drawings.jkr.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.awt.Point;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a play button that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author John Rehbein
   @version for CS56, F16, UCSB
   
*/
public class PlayButton extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param radius radius of button
    */
    public PlayButton(int x, int y, int radius)
    {
	// These points are the top, bottom, and right points respectively of the play
	Point[] point = {new Point(x+radius/3.0, y+radius/3.0),
			 new Point(x+radius/3.0, y+radius*2.0/3.0),
			 new Point(x+radius*2.0/3.0, y+radius/2.0)) };
    
         Line2D.Double leftRoof = 
            new Line2D.Double (x, y + roofHeight,
                               x + width/2.0, y);
	
        Line2D.Double rightRoof =
            new Line2D.Double (x + width/2.0, y,
                               x + width, y + roofHeight);
    
        double firstStoryHeight = .75 * height;
        double roofHeight = height - firstStoryHeight;
        
        double firstStoryUpperLeftY = y + roofHeight;
        
        // Make the first story
        
        Rectangle2D.Double firstStory = 
            new Rectangle2D.Double(x, firstStoryUpperLeftY ,
				   width, firstStoryHeight);
	
        // make the roof.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Line2D.Double leftRoof = 
            new Line2D.Double (x, y + roofHeight,
                               x + width/2.0, y);
	
        Line2D.Double rightRoof =
            new Line2D.Double (x + width/2.0, y,
                               x + width, y + roofHeight);
	
        // put the whole house together
	
        GeneralPath wholeHouse = this.get();
        wholeHouse.append(firstStory, false);
        wholeHouse.append(leftRoof, false);
        wholeHouse.append(rightRoof, false);    
    }
}
