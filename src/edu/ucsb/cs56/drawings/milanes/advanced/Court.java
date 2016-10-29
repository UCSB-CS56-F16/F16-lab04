package edu.ucsb.cs56.drawings.milanes.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A Court

   @author Arturo Milanes
   @version for CS56, F16, UCSB
   
*/
public class Court extends GeneralPathWrapper implements Shape
{   
    /**
     * Constructor for objects of class Court
@param x initial x position
@param y initial y position
@param width width of  court
@param length length of court
     */
    public Court(double x, double y, double width, double length)
    {
        
	Double midLineY = y+length/2.0 ;
        
	//make the boundaries
	Rectangle2D.Double boundaries = new Rectangle2D.Double (x,y,width,length);

	// middle line
	Line2D.Double midLine = new Line2D.Double (x, midLineY, x+width, midLineY);
       
        GeneralPath wholeCourt = this.get();  

	wholeCourt.append(boundaries, false);
	wholeCourt.append(midLine, false);
        
    }

}
