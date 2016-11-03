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
public class EighthNote extends Note implements Shape
{

    public EighthNote(double x, double y, double radius) //house
    {
	super(x,y,radius);

	double circleradius =  radius;
	double lineheight = radius * 4.5;
	double linewidth = radius * .42;
	double Circle_x = x;
	double line_x = x + radius;
	double Circle_y = y;
	double line_y = y -  4.5*radius;


	      
	  Circle secondcircleOfNote = new Circle
		  (
		   Circle_x + lineheight * .7,
		   Circle_y,
		   circleradius
				 );
	
           Rectangle2D.Double secondLine =
	       new Rectangle2D.Double(line_x + linewidth,  .12* lineheight ,
				      lineheight * .7 - linewidth, linewidth);
	
	   Rectangle2D.Double thirdLine =
	       new Rectangle2D.Double(line_x + lineheight * .7, line_y,
				      linewidth, lineheight);




	   GeneralPath note = this.get();
	   note.append(secondcircleOfNote, false);
	   note.append(secondLine, false);
		      note.append(thirdLine, false);

		      


    }
    
}

