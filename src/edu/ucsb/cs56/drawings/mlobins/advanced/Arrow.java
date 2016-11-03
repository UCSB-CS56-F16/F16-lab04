package edu.ucsb.cs56.drawings.mlobins.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;

/**   
   @author Miclos Lobins
   @version for CS56, W16, UCSB
   
*/
public class Arrow extends SquareAngles implements Shape
{
    public Arrow(double x, double y, double side)
    {
	// construct the basic shell
	super(x, y, side);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	//Create the threes lines of the arrow
	Line2D.Double leftLine = new Line2D.Double (x, y + side/2.0, x + side/2.0, y);
	
        Line2D.Double rightLine = new Line2D.Double (x + side/2.0, y, x + side, y + side/2.0);

	Line2D.Double midLine = new Line2D.Double (x + side/2.0, y, x + side/2.0, y + side);


	// add the arrow to the SquareAngle
	
        GeneralPath wholeSquareAngle = this.get();
        wholeSquareAngle.append(leftLine, false);
        wholeSquareAngle.append(rightLine, false);
        wholeSquareAngle.append(midLine, false); 
    }    
}
