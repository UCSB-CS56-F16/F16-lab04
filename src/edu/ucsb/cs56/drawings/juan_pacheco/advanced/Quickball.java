package edu.ucsb.cs56.drawings.juan_pacheco.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;

/**
   A Quickball
      
   @author Juan Pacheco 
   @version for CS56, F16, UCSB
   
*/
public class Quickball extends Pokeball implements Shape
{
    /**
     * Constructor for objects of class Quickball
     @param x x coordinate
     @param y y coordinate
     @param radius radius of pokeball
     */
    public Quickball(double x, double y, double radius)
    {
	// construct the basic pokeball
	super(x,y,radius);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
		
	//double mSquare = 0.10 * radius;
	double sSquare = 0.5 * radius;
	double hRadius =  0.5 * radius;
	
	Rectangle2D.Double mSquare1 =
	    new Rectangle2D.Double(x + .55*radius, y+.55*radius, .9*radius, .9*radius);

	Shape mS = ShapeTransforms.rotatedCopyOf(mSquare1, Math.PI/4.0);
	
	Rectangle2D.Double sSquare1 =
	    new Rectangle2D.Double(x + .25*radius , y + 1.25*radius , sSquare, sSquare);

	Shape sS1 = ShapeTransforms.rotatedCopyOf(sSquare1, Math.PI/4.0);
	
	Rectangle2D.Double sSquare2 =
	    new Rectangle2D.Double(x + 1.25*radius, y + 1.25*radius, sSquare, sSquare);

	Shape sS2 = ShapeTransforms.rotatedCopyOf(sSquare2, Math.PI/4.0);
	
	Rectangle2D.Double sSquare3 =
	    new Rectangle2D.Double(x + 1.25*radius, y + .25*radius, sSquare, sSquare);

	Shape sS3 = ShapeTransforms.rotatedCopyOf(sSquare3, Math.PI/4.0);

	Rectangle2D.Double sSquare4 =
	    new Rectangle2D.Double(x + .25*radius, y + .25*radius, sSquare, sSquare);

	Shape sS4 = ShapeTransforms.rotatedCopyOf(sSquare4, Math.PI/4.0);
	
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeDesign = this.get();
        wholeDesign.append(mS, false);
        wholeDesign.append(sS1, false);
        wholeDesign.append(sS2, false);
	wholeDesign.append(sS3, false);
	wholeDesign.append(sS4, false);
    }    
}
