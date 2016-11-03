package edu.ucsb.cs56.drawings.sswong.advanced;

import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**

   A Tree with Fruits

   @author Simon Wong
   @version for CS56, F16, UCSB

*/

public class TreeWithFruits extends Tree implements Shape{

    /**
       Constructor
       
       @param x x coord of top left corner of tree
       @param y y coord of top left corner of tree
       @param leaves_radius radius of tree leaves
       @param trunk_width width of trunk
       @param trunk_height height of trunk
    */
    public TreeWithFruits(double x, double y,
			  double leaves_radius,
			  double trunk_width,
			  double trunk_height)
    {
	// create the tree
	    
	super(x,y,leaves_radius,trunk_width,trunk_height);

	// add three round fruits on the leaves, placed in a triangular fashion
	    
	Ellipse2D.Double fruit1 =
	    new Ellipse2D.Double(x+(0.667*leaves_radius),
				 y+(0.667*leaves_radius),
				 leaves_radius/5,
				 leaves_radius/5);
	Ellipse2D.Double fruit2 =
	    new Ellipse2D.Double(x+leaves_radius,
				 y+(1.333*leaves_radius),
				 leaves_radius/5,
				 leaves_radius/5);
	Ellipse2D.Double fruit3 =
	    new Ellipse2D.Double(x+(1.333*leaves_radius),
				 y+(0.667*leaves_radius),
				 leaves_radius/5,
				 leaves_radius/5);

	// add fruit to the tree

	GeneralPath wholeTree = this.get();
	wholeTree.append(fruit1,false);
	wholeTree.append(fruit2,false);
	wholeTree.append(fruit3,false);
    }
}
