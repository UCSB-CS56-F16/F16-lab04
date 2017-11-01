package edu.ucsb.cs56.drawings.jackjunliu.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape;

import java.lang.Math; // to find root
import java.awt.geom.Ellipse2D;// only need ellipse for swirls

/**
   A Swirly Lollipop
      
   @author Jack Liu
   @version for CS56, F17, UCSB
   
*/
public class SwirlyLollipop extends Lollipop implements Shape
{
    /**
     * Constructor
       @param x x cord of top left of circle
       @param y y coord of top left of circle
       @param diameter diameter of the circle
       @param height height of stick (not used here, but is in super)
     */
    public SwirlyLollipop(double x, double y, double diameter, double height)
    {
	// construct the basic lollipop
	super(x,y,diameter,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	double diameter1 = (1/1.41) * diameter;
	double diameter2 = (1/1.41) * diameter1;
	//double diameter3 = (1/1.41) * diameter2;
	//double diameter4 = (1/1.41) * diameter3;
	
	Ellipse2D.Double swirl1 =
	    new Ellipse2D.Double(x-((diameter-diameter1)/2)*(1/Math.sqrt(2)), y-((diameter-diameter1)/2)*(1/Math.sqrt(2)),
				 diameter1, diameter1);
	Ellipse2D.Double swirl2 =
	    new Ellipse2D.Double(x, y,
				 diameter2, diameter2);
	/*Ellipse2D.Double swirl3 =
	    new Ellipse2D.Double(-(x-((diameter-diameter3)/2)*(1/Math.sqrt(2))), -(y-((diameter-diameter3)/2)*(1/Math.sqrt(2))),
				 diameter3, diameter3);
	Ellipse2D.Double swirl4 =
	    new Ellipse2D.Double(x-((diameter-diameter4)/2)*(1/Math.sqrt(2)), y-((diameter-diameter4)/2)*(1/Math.sqrt(2)),
	    diameter4, diameter4);*/
	
	// put the swirls together to form
	
        GeneralPath wholeSwirl = this.get();
        wholeSwirl.append(swirl1, false);
	wholeSwirl.append(swirl2, false);
	//wholeSwirl.append(swirl3, false);
	//wholeSwirl.append(swirl4, false);	
    }    
}
