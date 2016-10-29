package edu.ucsb.cs56.drawings.nikhilpatil.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;

/**
   A Daisy Flower
      
   @author Nikhil Patil 
   @version for CS56, F16, UCSB
   
*/
public class Daisy extends Flower implements Shape
{
    /**
     * Constructor for objects of class Daisy
     */
    public Daisy(double x, double y, double stem_length)
    {
	// construct the basic Flower with the four circular petals
	super(x,y,stem_length);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	//Defining varius radius and location variables
	
	double stemUpperLeftY = y + stem_length;
	double stem_width = stemUpperLeftY/30;

	double center_radius = stem_length/6;
	double center_loc_x = x + (stem_width/2) - center_radius;
	double center_loc_y = stemUpperLeftY - (2*center_radius);
	double petal_radius = center_radius*2;

	//We need two different radii this time, as one must be longer than the other to look like a daisy.
	double petal_radius_small = center_radius;
	double petal_radius_big = petal_radius * 1.8;

	//These next two doubles store the top left corner for the top and bottom petals. They are used in the for loop
	double petal_loc_bot_x = x + (stem_width/2) - petal_radius_small;
	double petal_loc_bot_y = stemUpperLeftY;
	//These store the top left corner for the left and right petals.
	double petal_loc_left_x = x + (stem_width/2) - center_radius - 2*petal_radius_big;
	double petal_loc_left_y = petal_loc_bot_y - center_radius - petal_radius_small;

	// ArrayList to store each new petal I create
	ArrayList<Ellipse2D> petals1 = new ArrayList<Ellipse2D>();
	// for loop to add new long petals (probably not the most elegant way, had to use a lot of trial and error) The index is used as a multiplier to add petals on the other side of the center of the flower.
	
	for(int p = 0; p < 2; p++)
	    {
		Ellipse2D.Double petal2 =
		    new Ellipse2D.Double (petal_loc_bot_x, petal_loc_bot_y -(p* (2*petal_radius_big + 2*center_radius)), 2*petal_radius_small, 2*petal_radius_big);
		petals1.add(petal2);
		
		Ellipse2D.Double petal3 =
		    new Ellipse2D.Double (petal_loc_left_x + (p* (2*(petal_radius_big+center_radius))) , petal_loc_left_y, 2*petal_radius_big, 2*petal_radius_small);
		petals1.add(petal3);
	    }
	
	// add the longer petals to the flower
	
        GeneralPath wholeFlower = this.get();
        for(Ellipse2D a : petals1)
	    wholeFlower.append(a, false);
    }    
}
