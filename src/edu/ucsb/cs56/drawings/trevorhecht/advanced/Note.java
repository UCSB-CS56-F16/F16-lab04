package edu.ucsb.cs56.drawings.trevorhecht.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a house that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class Note extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param width width of the house
       @param height of house (including first story and second story)
    */
    public Note(double x, double y, double radius) 
    {
        
        double circleradius =  radius;
        double lineheight = radius * 4.5;
	double linewidth = radius * .42;
	double Circle_x = x;
	double line_x = x + radius;
	double Circle_y = y;
	double line_y = y -  4.5*radius; 
        
                
        // Make the first story
         Circle bottomOfNote = 
            new Circle
            (
	     Circle_x,
	     Circle_y,
	     circleradius
	     );
	
        Rectangle2D.Double firstLine = 
            new Rectangle2D.Double(line_x, line_y ,
				   linewidth, lineheight);
	GeneralPath note = this.get();
	note.append(bottomOfNote, false);
	note.append(firstLine, false);
      
    }
}
