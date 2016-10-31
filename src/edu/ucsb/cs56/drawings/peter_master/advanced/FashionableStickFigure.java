package edu.ucsb.cs56.drawings.peter_master.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;

/**
   A Fashionable Stick Figure
      
   @author Peter Master 
   @version for CS56, F16, UCSB
   
*/
public class FashionableStickFigure extends StickFigure implements Shape
{
    /**
     * Constructor for objects of class FashionableStickFigure
     */
    public FashionableStickFigure(double x, double y, double height, double hatHeight) {
		// construct the stick figure
		super(x,y,height);
	
		// get the GeneralPath that we are going to append stuff to
		GeneralPath gp = this.get();

		double hatBrimWidth = hatHeight * .6;
		double hatTopWidth = hatBrimWidth * .7;
	
		Rectangle2D.Double hatTop =
	   	 	new Rectangle2D.Double (x - hatTopWidth/2, y - hatHeight,
	    						hatTopWidth, hatHeight);

		Line2D.Double hatBrim = 
			new Line2D.Double (x - hatBrimWidth/2, y,
							x + hatBrimWidth/2, y);

		// put the whole stick figure together
   		GeneralPath stickFigure = this.get();
    	stickFigure.append(hatTop, false);
    	stickFigure.append(hatBrim, false);
    }    
}
