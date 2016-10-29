package edu.ucsb.cs56.drawings.klong.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a T-Shirt that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Keith Long
   @version for CS56, W16, UCSB
   
*/
public class TShirt extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of shirt
       @param y y coord of lower left corner of shirt
       @param width width of the shirt
       @param heightSleeves height from bottom to sleves
       @param sleeveHeight height of the sleeves themselves
       @param heightTop height from sleeve bottom to top
       @param sleeveLength length of the sleeve
    */
    public TShirt(double x, double y, double width,
	 double heightSleeves, double sleeveHeight, double heightTop, double sleeveLength)
    {	
    	//create the sides and bottom of shirt
    	Line2D.Double leftSide = new 
		Line2D.Double(x, y, x , y + heightTop);
    	Line2D.Double Base = new 
		Line2D.Double(x, y, x + width, y);
    	Line2D.Double rightSide = new 
		Line2D.Double(x +width, y, x, y+ heightTop);	
	//create the sleeves
	Line2D.Double leftSleeveBase = new 
		Line2D.Double(x, y+ heightTop, x -sleeveLength, y);
	Line2D.Double rightSleeveBase = new 
		Line2D.Double(x +width, y+ heightTop, x+width+sleeveLength, y+ heightTop);
	//sleeveRise
	Line2D.Double leftSleeveRise = new 
		Line2D.Double(x-sleeveLength, y+ heightTop, x -sleeveLength, y+ heightTop+sleeveHeight);
	Line2D.Double rightSleeveRise = new 
		Line2D.Double(x +width+sleeveLength, y+ heightTop, x+width+sleeveLength, y+ heightTop+sleeveHeight);		
	//TopLine
	Line2D.Double top = new 
		Line2D.Double(x-sleeveLength, y+ heightTop+sleeveHeight, 
				x+width+sleeveLength, y+ heightTop+sleeveHeight);
		
	GeneralPath wholeShirt = this.get();
	wholeShirt.append(leftSide, false);
	wholeShirt.append(Base, false);
	wholeShirt.append(rightSide, false);
	wholeShirt.append(leftSleeveBase, false);
	wholeShirt.append(rightSleeveBase, false);
	wholeShirt.append(leftSleeveRise, false);
	wholeShirt.append(rightSleeveRise, false);
	wholeShirt.append(top, false);
    }
}



