package edu.ucsb.cs56.drawings.vchandran2.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**                                                                                                           
   A vector drawing of money  that implements                                                                
   the Shape interface, and so can be drawn, as well as                                                       
   rotated, scaled, etc.                                                                                      
                                                                                                              
   @author Veena Chandran                                                                                       
   @version for CS56, F16, UCSB                                                                               
                                                                                                              
*/
public class Money extends GeneralPathWrapper implements Shape
{
    /**                                                                                                       
       Constructor                                                                                            
                                                                                                              
       @param x x coord of lower left corner of paper                                                         
       @param y y coord of lower left corner of paper                                                         
       @param width width of the paper                                                                        

    */
    public Money(double x, double y, double height)
    {

	// Rather than having to scale at the end, we can just
	// draw things the right way to begin with, using the
	// x, y, width.   If you haven't already
	// hard coded a particular drawing, this may be an easier
	// way.
	double width = height*2;
	
	Rectangle2D.Double paper =
	    new Rectangle2D.Double(x, y,
				   width, height);
	
	Ellipse2D.Double circle =
	    new Ellipse2D.Double (x + ((3*height)/4), y + ((height)/4),
			       height/2, height/2);
	
	// put the whole paper bill together
	
	GeneralPath wholeBill = this.get();
	wholeBill.append(paper, false);
	wholeBill.append(circle, false);

    }
}


