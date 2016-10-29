package edu.ucsb.cs56.drawings.jkr.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape;

import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

/**
   A Playbutton
      
   @author John Rehbein
   @version for CS56, F16, UCSB
   
*/
public class BetterPlayButton extends PlayButton implements Shape
{
    /**
     Constructor
     
     @param x x coord of lower left corner of house
     @param y y coord of lower left corner of house
     @param radius radius of button
     */
    public BetterPlayButton(int x, int y, int radius)
    {
        super(x, y, radius);
        Point2D.Double[] point = {new Point2D.Double(x+radius/3.0+radius/20.0, y+radius/3.0+radius/20.0),
            new Point2D.Double(x+radius*2.0/3.0-radius/20.0, y+radius/2.0) };
        
        // An extra circle cause it looks cooler
        Ellipse2D.Double innerCircle = new Ellipse2D.Double(x+radius/10.0, y+radius/10.0, radius * 9/10.0, radius * 9/10.0);
        
        
        Line2D.Double accentLine =
        new Line2D.Double (point[0], point[1]);
        
        GeneralPath playButtonPath = this.get();
        playButtonPath.append(innerCircle, false);
        playButtonPath.append(accentLine, false);
    }
}
