
package edu.ucsb.cs56.drawings.ericvaishnav.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;

/**
   A Double Axe is a shape that extends Axe by creating another blade to the side of the first one (mirrors it)

   @author Eric Vaishnav
*/
public class DoubleAxe extends Axe implements Shape
{

/**
	@param x x is the x coordinate of the entire axe
	@param y y is the y coordinate of the entire axe
	@param width width is the width of the entire axe (including the two blades)
	@param height height is the height of the entire axe

*/

    public DoubleAxe(double x, double y, double width, double height)
    {
        // construct the basic axe shell
        super(x,y,width,height);

        // get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();

	double bladeConnectionPoint = y + 0.25*height;

	Line2D.Double bladeDiagonalUpwardsBack = new Line2D.Double(x, bladeConnectionPoint, x - width/2, y);
	Line2D.Double bladeDiagonalDownwardsBack = new Line2D.Double(x, bladeConnectionPoint, x - width/2, y + 0.5*height);
	Line2D.Double bladeVerticalLine = new Line2D.Double(x - width/2, y, x - width/2, y + 0.5*height);


        gp.append(bladeDiagonalUpwardsBack, false);
	gp.append(bladeDiagonalDownwardsBack, false);
	gp.append(bladeVerticalLine, false);
    }
}

