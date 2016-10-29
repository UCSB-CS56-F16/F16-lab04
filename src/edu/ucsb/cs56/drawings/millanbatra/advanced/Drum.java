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
	
        double wide=4*height;
	//eliptical portion of the drum (the top)
	Ellipse2D.Double drumportion= new Ellipse2D.Double(x, y, wide, height/2);        
	//left right and bottom part of drum skin support 
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
