package edu.ucsb.cs56.drawings.ckoziol.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A SmileyFace
      
   @author Chet Koziol
   @version for CS56, F16, UCSB
   
*/
public class SmileyFaceWithHat extends SmileyFace implements Shape
{
     public SmileyFaceWithHat(double x, double y, double radius)
    {

	/**
	   First create an instance of SmileyFace with the smileyface constructor, so we have a starting point on where to add the hat
	 */
	super(x,y,radius);
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();


	/**
	   The hat is made add adding 2 rectangles on top of the head
	 */
	Rectangle2D.Double bottomHalfOfHat =
     	    new Rectangle2D.Double(x-radius*1.3, y-radius-radius/3, radius*2.6, radius/3);

	Rectangle2D.Double topHalfOfHat =
       	    new Rectangle2D.Double(x-radius/2, y-(radius*3), radius, 2*radius - radius/3);
		
	
        GeneralPath wholeface = this.get();
        wholeface.append(bottomHalfOfHat, false);
	wholeface.append(topHalfOfHat, false);
        }    
}
