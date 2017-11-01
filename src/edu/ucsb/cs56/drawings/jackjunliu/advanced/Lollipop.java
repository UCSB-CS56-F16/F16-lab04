package edu.ucsb.cs56.drawings.jackjunliu.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a lollipop that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Phill Conrad, Jack Liu
   @version for CS56, F17, UCSB
   
*/
public class Lollipop extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of top left of circle
       @param y y coord of top left of circle
       @param radius radius of the circle
       @param height height of the stick
    */
    public Lollipop(double x, double y, double diameter, double height)
    {
        
        //Draw the circle of lollipop
        
        Ellipse2D.Double pop = 
            new Ellipse2D.Double(x, y,
				 diameter, diameter);
	//Ellipse requires rectWidth and rectHeight, thus we can simply
	//call it twice to recognize that rectWidth=rectHeight=daimeter
        
        Line2D.Double stick = 
            new Line2D.Double (x+diameter/2, y+2*diameter,
                               x+diameter/2, y + height);
	//Since x is the corner, you must set stick to be middle
	//so we add radius to x. y is harder, as you would want to
	//have a longer stick so 2*diameter, and have end point
	//be at the bottom of the circle. flipping the y also works
	//I did this simply to be "different".
	
        GeneralPath wholePop = this.get();
        wholePop.append(pop, false);
        wholePop.append(stick, false);   
    }
}
