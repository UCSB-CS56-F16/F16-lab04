package edu.ucsb.cs56.drawings.g_whiter.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a drawer that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Gregory Whiter
   @version for CS56, W16, UCSB
   
*/
public class ChestOfDrawers extends Drawer implements Shape
{
    /**
       Constructor for a collection of 3 drawers in a chest with feet
       
       @param x x coord of lower left corner of drawer
       @param y y coord of lower left corner of drawer
       @param width width of the drawer
       @param height of drawer 
    */
    public ChestOfDrawers(double x, double y, double width, double height)
    {
		super(x,y,width,height);
		final double handleY = .94*height;
		final double handleX = x + .875 * width /2;
		Rectangle2D.Double outerOutline2 = 
            new Rectangle2D.Double(x, y + height ,
				   width, height);
	
        // make the inner outline
        
        Rectangle2D.Double innerOutline2 = 
            new Rectangle2D.Double (x + .05 * width, y + 1.05 * height,
                               .90 * width, .90 * height);
	
        Ellipse2D.Double handle2 =
            new Ellipse2D.Double (handleX, y + 3*handleY/2,
                               .15 * width, .15 * height);
							   
		Rectangle2D.Double outerOutline3 = 
            new Rectangle2D.Double(x, y + 2*height ,
				   width, height);
	
       
        
        Rectangle2D.Double innerOutline3 = 
            new Rectangle2D.Double (x + .05 * width, y + 2.05 * height,
                               .90 * width, .90 * height);
	
        Ellipse2D.Double handle3 =
            new Ellipse2D.Double (handleX, y + 5*handleY/2,
                               .15 * width, .15 * height);
		
		Rectangle2D.Double chest = 
            new Rectangle2D.Double(.95*x, .985*y ,
				   width * 1.1 , height * 3.1);
	
        // make the feet
        
        Rectangle2D.Double foot1 = 
            new Rectangle2D.Double (.95*x + .9*width, .985*y + 3.1 * height,
                               .2 * width, .2 * height);
		  Rectangle2D.Double foot2 = 
            new Rectangle2D.Double (.95*x, .985*y + 3.1 * height,
                               .2 * width, .2 * height);	
		 GeneralPath newChest = this.get();
		 newChest.append(outerOutline2, false);
		newChest.append(innerOutline2, false);
		newChest.append(handle2, false);
		 newChest.append(outerOutline3, false);
		newChest.append(innerOutline3, false);
		newChest.append(handle3, false);
		 newChest.append(chest, false);
		newChest.append(foot1, false);
		newChest.append(foot2, false); 
							   }}							   