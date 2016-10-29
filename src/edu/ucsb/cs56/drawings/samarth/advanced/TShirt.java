package edu.ucsb.cs56.drawings.samarth.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A drawing of a basic TShirt.
      
   @author Samarth Goyal 
   @version for CS56, F16, UCSB
   
*/
public class TShirt extends GeneralPathWrapper implements Shape
{

    /**
       Constructor
       @param x x coord of lower left corner of TShirt
       @param y y coord of lower left corner of TShirt
       @param width width of the TShirt
       
    */
    public TShirt(double x, double y, double width)
    {
	double tshirtHeight = width * 1.5;       //Make the height of all shirts 1.5 times the width
	double sleeveDimX = .2 * tshirtHeight;
	double sleeveDimY = .15 * tshirtHeight;
		
	double sHeight = (tshirtHeight-width)/2; //height of the sleeves and pocket
   
        
        // Make the shirt
        
        Rectangle2D.Double shirt = 
            new Rectangle2D.Double(x, y ,
				   width, tshirtHeight);
	
        // make the sleeves
        
        Rectangle2D.Double leftSleeve = 
            new Rectangle2D.Double (x - sleeveDimX, y + sHeight,
                               sleeveDimX, sleeveDimY);
	
        Rectangle2D.Double rightSleeve =
            new Rectangle2D.Double (x + width, y + sHeight,
                               sleeveDimX, sleeveDimY);
	
        // put the whole shirt together
	
        GeneralPath wholeShirt = this.get();
        wholeShirt.append(shirt, false);
        wholeShirt.append(leftSleeve, false);
        wholeShirt.append(rightSleeve, false);
	
    }
}
