package edu.ucsb.cs56.drawings.cfrausto.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
   A House

   @author Phill Conrad
   @version for CS56, W16, UCSB

*/
public class BikeKey extends Key implements Shape
{
    /**
     * Constructor for objects of class Key
     */
    public BikeKey(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	// Make three "indents", in the key blade like the way a bike key looks.
 

	double indentWidth = 0.05 * width;
        double indentHeight =  0.05 * height;
	double indBeginX = x + (.4 * width);
	double indY = y + (.5 * height);
	
	        Rectangle2D.Double ind1 =
		    new Rectangle2D.Double(indBeginX,
					   indY, indentWidth, indentHeight);
		Rectangle2D.Double ind2 =
		    new Rectangle2D.Double(indBeginX + 2.0*indentWidth,
					   indY, indentWidth, indentHeight);
		Rectangle2D.Double ind3 =
		    new Rectangle2D.Double(indBeginX + 5.0*indentWidth,
					   indY, indentWidth, indentHeight);
		
		// add the indents to the keys
		
		GeneralPath wholeHouse = this.get();
		wholeHouse.append(ind1, false);
		wholeHouse.append(ind2, false);
		wholeHouse.append(ind3, false);
    }
}

