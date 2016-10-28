package edu.ucsb.cs56.drawings.davidtsu19.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Line2D;

/**
   A Mask
      
   @author David Tsu 
   @version for CS56, F16, UCSB
   
*/
public class MardiGrasMask extends Mask implements Shape
{
    /**
     * Constructor for objects of class MardiGrasMask
     */
    public MardiGrasMask(double x, double y, double width, double height)
    {
	// construct the basic mask shell
	super(x,y,width,height);
	double heightUnit = 0.125 * height;
	double widthUnit = 0.125 * width;
	double featherBaseX = x + 7 * widthUnit;
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make the feather
	Line2D.Double featherBase = 
            new Line2D.Double (featherBaseX, y,
                               featherBaseX + 4 * widthUnit, y - 4 * heightUnit);
	Line2D.Double feather1a =
	    new Line2D.Double (featherBaseX + 0.5 * widthUnit, y - 0.5 * heightUnit,
			       featherBaseX + widthUnit, y - 0.5 * heightUnit);
	Line2D.Double feather1b =
	    new Line2D.Double (featherBaseX + 0.5 * widthUnit, y - 0.5 * heightUnit,
			       featherBaseX + 0.5 * widthUnit, y - heightUnit);
	Line2D.Double feather2a =
	    new Line2D.Double (featherBaseX + widthUnit, y - heightUnit,
			       featherBaseX + 2 * widthUnit, y - heightUnit);
	Line2D.Double feather2b =
	    new Line2D.Double (featherBaseX + widthUnit, y - heightUnit,
			       featherBaseX + widthUnit, y - 2 * heightUnit);
	Line2D.Double feather3a =
	    new Line2D.Double (featherBaseX + 1.5 * widthUnit, y - 1.5 * heightUnit,
			       featherBaseX + 3 * widthUnit, y - 1.5 * heightUnit);
	Line2D.Double feather3b =
	    new Line2D.Double (featherBaseX + 1.5 * widthUnit, y - 1.5 * heightUnit,
			       featherBaseX + 1.5 * widthUnit, y - 3 * heightUnit);
	Line2D.Double feather4a =
	    new Line2D.Double (featherBaseX + 2 * widthUnit, y - 2 * heightUnit,
			       featherBaseX + 3.5 * widthUnit, y - 2 * heightUnit);
	Line2D.Double feather4b =
	    new Line2D.Double (featherBaseX + 2 * widthUnit, y - 2 * heightUnit,
			       featherBaseX + 2 * widthUnit, y - 3.5 * heightUnit);
	Line2D.Double feather5a =
	    new Line2D.Double (featherBaseX + 2.5 * widthUnit, y - 2.5 * heightUnit,
			       featherBaseX + 4 * widthUnit, y - 2.5 * heightUnit);
	Line2D.Double feather5b =
	    new Line2D.Double (featherBaseX + 2.5 * widthUnit, y - 2.5 * heightUnit,
			       featherBaseX + 2.5 * widthUnit, y - 4 * heightUnit);
	Line2D.Double feather6a =
	    new Line2D.Double (featherBaseX + 3 * widthUnit, y - 3 * heightUnit,
			       featherBaseX + 4 * widthUnit, y - 3 * heightUnit);
	Line2D.Double feather6b =
	    new Line2D.Double (featherBaseX + 3 * widthUnit, y - 3 * heightUnit,
			       featherBaseX + 3 * widthUnit, y - 4 * heightUnit);
	Line2D.Double feather7a =
	    new Line2D.Double (featherBaseX + 3.5 * widthUnit, y - 3.5 * heightUnit,
			       featherBaseX + 4 * widthUnit, y - 3.5 * heightUnit);
	Line2D.Double feather7b =
	    new Line2D.Double (featherBaseX + 3.5 * widthUnit, y - 3.5 * heightUnit,
			       featherBaseX + 3.5 * widthUnit, y - 4 * heightUnit);
	
	// add the feather to the mask
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeMask = this.get();
        wholeMask.append(featherBase, false);
        wholeMask.append(feather1a, false);
        wholeMask.append(feather1b, false);
	wholeMask.append(feather2a, false);
        wholeMask.append(feather2b, false);
	wholeMask.append(feather3a, false);
        wholeMask.append(feather3b, false);
	wholeMask.append(feather4a, false);
        wholeMask.append(feather4b, false);
	wholeMask.append(feather5a, false);
        wholeMask.append(feather5b, false);
	wholeMask.append(feather6a, false);
        wholeMask.append(feather6b, false);
	wholeMask.append(feather7a, false);
        wholeMask.append(feather7b, false); 
    }    
}
