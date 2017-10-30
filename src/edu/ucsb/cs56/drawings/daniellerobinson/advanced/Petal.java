package edu.ucsb.cs56.drawings.daniellerobinson.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


/** A Petal
 	This provides an example of how you can create a petal object from hard coded lines
	and create a petal that can be drawn anywhere with any width or height.

	@author Danielle Robinson
	@version for CS56, F17, Lab4
*/

public class Petal extends GeneralPathWrapper implements Shape
{
	/** 
 		Constructor for objects of class Petal
	*/
	public Petal(double x, double y, double width, double height)
	{
		final double ORIG_X = 100.0;
		final double ORIG_Y = 100.0;
		final double ORIG_HEIGHT = 400.0;
		final double ORIG_WIDTH = 150.00;
		
		GeneralPath leftSide = new GeneralPath();
		
		// creates general shape for petal

		leftSide.moveTo(100, 400);
		leftSide.lineTo(125, 400);
		leftSide.lineTo(150, 300);
		leftSide.lineTo(150, 200);
		leftSide.lineTo(100, 100);
		
		//flips leftside copy to create complete shape
		Shape rightSide = ShapeTransforms.horizontallyFlippedCopyOf(leftSide);
		rightSide = ShapeTransforms.translatedCopyOf(rightSide, 0.0, 0.0);

		GeneralPath wholePetal = new GeneralPath ();
		wholePetal.append(leftSide, false);
		wholePetal.append(rightSide, false);
		
		//scale to inputs
		
		Shape s = ShapeTransforms.translatedCopyOf(wholePetal, -ORIG_X + x, -ORIG_Y + y);
		s = ShapeTransforms.scaledCopyOf(s, width/ORIG_WIDTH, height/ORIG_HEIGHT);
	
		this.set(new GeneralPath(s));

	}
}
