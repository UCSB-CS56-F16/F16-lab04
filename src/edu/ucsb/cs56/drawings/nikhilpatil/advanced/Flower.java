package edu.ucsb.cs56.drawings.nikhilpatil.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.util.ArrayList;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a house that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Nikhil Patil
   @version for CS56, F16, UCSB
   
*/
public class Flower extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of bottom of stem
       @param y y coord of bottom of stem
       @param stem length of stem - determines radii of petals and center
    */
    public Flower(double x, double y, double stem_length)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.

	// Defining variables to be used to construct flower
	
	double petalradius = stem_length/2;
        double stemUpperLeftY = y + stem_length;
	double stem_width = stemUpperLeftY/30;

	//radius of the middle circle - will be important for positioning the petals
	double center_radius = petalradius/3;
	//top left corner of center of flower
	double center_loc_x = x + (stem_width/2) - center_radius;
	double center_loc_y = stemUpperLeftY - (2*center_radius);

        // Make the stem
        
        Rectangle2D.Double stem = 
            new Rectangle2D.Double(x, stemUpperLeftY ,
				   stem_width, stem_length * 1.5);
	
        // make the center. Much harder to do than if it was made from the center of the circle
        
        Ellipse2D.Double center = 
            new Ellipse2D.Double (center_loc_x, center_loc_y,
                               2*center_radius, 2*center_radius);

	//Creates other sizes and top left locations based on stem size
	double petal_radius = center_radius * 2;
	double petal_loc_x = x + (stem_width/2) - petal_radius;
	double petal_loc_y = stemUpperLeftY;
	double petal_loc_x1 = x + (stem_width/2) - center_radius - 2*petal_radius;
	double petal_loc_y1 = petal_loc_y - center_radius - petal_radius;

	//ArrayList for all the petals.

	ArrayList<Ellipse2D> petals = new ArrayList<Ellipse2D>();

	//For loop to create each petal. The first ellipse corresponds to the top and bottom petals, while the second corresponds to the left and right ellipses. I use the index to determine which is drawn.
	for(int p = 0; p < 2; p++)
	    {
	Ellipse2D.Double petal =
	    new Ellipse2D.Double (petal_loc_x, petal_loc_y -(p* (2*petal_radius + 2*center_radius)), 2*petal_radius, 2*petal_radius);
	petals.add(petal);

	Ellipse2D.Double petal1 =
	    new Ellipse2D.Double (petal_loc_x1 + (p* (2*(petal_radius+center_radius))) , petal_loc_y1, 2*petal_radius, 2*petal_radius);
	petals.add(petal1);
	    }

	
        // puts the flower together
	
        GeneralPath wholeFlower = this.get();
        wholeFlower.append(stem, false);
        wholeFlower.append(center, false);
	for(Ellipse2D a : petals)
        wholeFlower.append(a, false);    
    }
}
