package edu.ucsb.cs56.drawings.alexanderngo.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.util.ArrayList;
    
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

/**
   A Park Bench
      
   @author Alexander Ngo
   
*/

public class ParkBench extends Bench implements Shape
{

    /**
       Constructor for ParkBench, takes same parameters as Bench, utilizes ArrayList
       to hold Line2D.Double instead of hardcoding each stripe individually.
       @param x, x coordinate of lower left corner of the bench
       @param y, y coordinate of lower left corner of bench
       @param width, width of bench
       @param height, height of bench
    */

    public ParkBench(double x, double y, double width, double height)
    {
	super(x,y,width,height);

	GeneralPath gp = this.get();

	double stripeIncrement = width / 7;
	    
	ArrayList<Line2D.Double> stripes = new ArrayList<Line2D.Double>();
	GeneralPath wholeBench = this.get();
	
	for(int i = 0; i < stripeIncrement; i++) {
	    stripes.add(i, new Line2D.Double(x + i * 7
					     ,y ,x + i * 7
					     ,y + height));
	    wholeBench.append(stripes.get(i), false);
	}
    }
}
