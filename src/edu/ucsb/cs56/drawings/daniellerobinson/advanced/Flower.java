package edu.ucsb.cs56.drawings.daniellerobinson.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;

/**
 A Flower

 @author Danielle Robinson
 @version for CS56, F17, UCSB

*/


public class Flower extends Petal implements Shape
{
	/**
  	Constructor for objects of class Flower
  	*/
	
	public Flower(double x, double y, double width, double height)
	{
		super(x, y, width, height);
		GeneralPath gp = this.get();

		//create flower shape
		Petal petal1 = new Petal(x, y, width, height);
		//rotate each petal to create flower
		Shape petal2 = ShapeTransforms.rotatedCopyOf(petal1, 1.26);
		Shape petal3 = ShapeTransforms.rotatedCopyOf(petal1, 2.51);
		Shape petal4 = ShapeTransforms.rotatedCopyOf(petal1, 3.77);		
		Shape petal5 = ShapeTransforms.rotatedCopyOf(petal1, 5.03);
		
		//add all to create flower
		GeneralPath wholeFlower = this.get();
		wholeFlower.append(petal1, false);
		wholeFlower.append(petal2, false);
		wholeFlower.append(petal3, false);
		wholeFlower.append(petal4, false);
		wholeFlower.append(petal5, false);

		
		
	}
}
