package edu.ucsb.cs56.drawings.ckoziol.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a house that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Chet Koziol 
   @version for CS56, F16, UCSB
   
*/
public class SmileyFace extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of smiley face
       @param y y coord of lower left corner of smiley face
       @param radius radius of the smiley face
    */
    public SmileyFace(double x, double y, double radius)
    {
	double eyeheight = y - radius/2.5;
	double lefteyex = x - radius/3;
	double righteyex = x + radius/3;
	double eyesize = radius/6;
	double smilesize = radius/4;
	double leftsmile = x - radius/2;
	//	double rightsmile = x + radius/2;
	double smileheight = y + radius/3.3;

	Circle head = new Circle (x,y,radius);
	Circle lefteye = new Circle(lefteyex, eyeheight, eyesize);
	Circle righteye = new Circle(righteyex, eyeheight, eyesize);

	GeneralPath smile = new GeneralPath();
	smile.moveTo(leftsmile, smileheight);
	leftsmile += smilesize/2;
	smileheight += smilesize/2;
	smile.lineTo(leftsmile, smileheight);
	leftsmile += smilesize/2;
	smileheight += smilesize/3;
	smile.lineTo(leftsmile, smileheight);
	leftsmile += smilesize;
	smile.lineTo(leftsmile, smileheight);


	/**
	   The smile is made by drawing 3 lines making the left side of the smile, then copying that path, flipping it and moving it over to the right side to complete the smile
	 */
	Shape rightSide = ShapeTransforms.horizontallyFlippedCopyOf(smile);
	rightSide = ShapeTransforms.translatedCopyOf(rightSide, 4*smilesize, 0.0);
	
	
	GeneralPath wholeface = this.get();
	wholeface.append(smile, false);
	wholeface.append(rightSide, false);
	wholeface.append(head, false);
	wholeface.append(lefteye, false);
	wholeface.append(righteye, false);
	
    }
}
