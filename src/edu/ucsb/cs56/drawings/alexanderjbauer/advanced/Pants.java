package edu.ucsb.cs56.drawings.alexanderjbauer.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a pair of pants that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Alexander Bauer
   @version for CS56, F16, UCSB

*/
public class Pants extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of upper left corner of pants
       @param y y coord of upper left corner of pants
       @param width width of the waist of the pants
       @param length length of the pants including the waist
    */
    public Pants(double x, double y, double width, double length)
    {

        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.

	double beltHeight = .03 * length;
	double legDividerLength = .3 * length;
	double zip = .0535 * (legDividerLength - beltHeight);
	double legSHeight = y + beltHeight;
	double afterPocketHeight = y + legDividerLength * .66;
        // Make the belt segment

        Rectangle2D.Double waistStrip =
            new Rectangle2D.Double(x, y,
				   width, beltHeight);

	// Make the leg divider line
	Line2D.Double legDividerLine =
		new Line2D.Double (x + width / 2, y,
				   x + width / 2, y + legDividerLength);

	//Make belt buckle
	Ellipse2D.Double zipperButton =
		new Ellipse2D.Double(x + 3.2 * (width / 8), y + .0075 * y,
				   beltHeight / 1.2 , beltHeight / 1.2);
	//Make zipper contours
	Line2D.Double zipperContour1 =
		new Line2D.Double (x + 3 * (width / 8), y + beltHeight,
				   x + 3 * (width / 8), y + beltHeight + zip);
	Line2D.Double zipperContour2 =
		new Line2D.Double (x + 3 * (width / 8), y + 2 * zip + beltHeight,
			      x + 3 * (width / 8), y + 2 * zip + beltHeight + zip);
	Line2D.Double zipperContour3 =
		new Line2D.Double (x + 3 * (width / 8), y + 4 * zip + beltHeight,
			      x + 3 * (width / 8), y + 4 * zip + beltHeight + zip);
	Line2D.Double zipperContour4 =
		new Line2D.Double (x + 3 * (width / 8), y + 6 * zip + beltHeight,
			      x + 3 * (width / 8), y + 6 * zip + beltHeight + zip);
	Line2D.Double zipperContour5 =
		new Line2D.Double (x + 3 * (width / 8), y + 8 * zip + beltHeight,
			      x + 3 * (width / 8), y + 8 * zip + beltHeight + zip);
	Line2D.Double zipperContour6 =
		new Line2D.Double (x + 3 * (width / 8), y + 10 * zip + beltHeight,
			      x + 3 * (width / 8), y + 10 * zip + beltHeight + zip);
	Line2D.Double zipperContour7 =
		new Line2D.Double (x + 3.1 * (width / 8), y + 11.8 * zip + beltHeight,
			      x + 6.8 * (width / 16), y + 12.4 * zip + beltHeight);
	Line2D.Double zipperContour8 =
		new Line2D.Double (x + 7.2 * (width / 16), y + 13 * zip + beltHeight,
			      x + 4 * (width / 8), y + 13 * zip + beltHeight);
	//Make Pant legs
	Line2D.Double pantLegs1 =
		new Line2D.Double (x, legSHeight,
				   x - .1 * width, afterPocketHeight);
	Line2D.Double pantLegs2 =
		new Line2D.Double (x - .1 * width, afterPocketHeight,
				   x - .175 * width, y + length);
	Line2D.Double pantLegs3 =
		new Line2D.Double (x - .175 * width, y + length,
				   x + .3 * width, y + length);
	Line2D.Double pantLegs4 =
		new Line2D.Double (x + .3 * width, y + length,
				   x + width / 2, y + legDividerLength);
	Line2D.Double pantLegs5 =
		new Line2D.Double (x + width / 2, y + legDividerLength,
				   x + width - .3 * width, y + length);
	Line2D.Double pantLegs6 =
		new Line2D.Double (x + width - .3 * width, y + length,
				   x + width + .175 * width, y + length);
	Line2D.Double pantLegs7 =
		new Line2D.Double (x + width + .175 * width, y + length,
				   x + width + .1 * width, afterPocketHeight);
	Line2D.Double pantLegs8 =
		new Line2D.Double (x + width + .1 * width, afterPocketHeight,
				   x + width, y + beltHeight);

	//Make pockets
	Line2D.Double pocket1 =
		new Line2D.Double (x, y + beltHeight,
				    x, y + legDividerLength *.4);
	Line2D.Double pocket2 =
		new Line2D.Double (x, y + legDividerLength * .4,
				    x - .1 * width, afterPocketHeight);
	Line2D.Double pocket3 =
		new Line2D.Double (x + width, y + beltHeight,
				    x + width, y + legDividerLength * .4);
	Line2D.Double pocket4 =
		new Line2D.Double (x + width, y + legDividerLength * .4,
				    x + width + .1 * width, afterPocketHeight);

	// Make fancy lines
	Line2D.Double fancy1 =
		new Line2D.Double (x + 1.05 * width / 4, y + beltHeight,
			 x + 2.9 * width / 16, y + 8.7 * legDividerLength / 10);
	Line2D.Double fancy2 =
		new Line2D.Double (x + 2.7 * width / 16, y + 8.7 * legDividerLength / 10,
			 x + 2.7 * width / 16, y + 7.4 * legDividerLength / 10);
	Line2D.Double fancy3 =
		new Line2D.Double (x + 2.8 * width / 16, y + beltHeight,
			 x + 1.4 * width / 16, y + 5.8 * legDividerLength / 10);
	Line2D.Double fancy4 =
		new Line2D.Double (x + 1.35 * width / 16, y + 5.8 * legDividerLength / 10,
			 x + 1.35 * width / 16, y + 4.9 * legDividerLength / 10);
	Line2D.Double fancy5 =
		new Line2D.Double (x + width - 1.05 * width / 4, y + beltHeight,
			 x + width - 2.9 * width / 16, y + 8.7 * legDividerLength / 10);
	Line2D.Double fancy6 =
		new Line2D.Double (x + width - 2.7 * width / 16, y + 8.7 * legDividerLength / 10,
			 x + width - 2.7 * width / 16, y + 7.4 * legDividerLength / 10);
	Line2D.Double fancy7 =
		new Line2D.Double (x + width - 2.8 * width / 16, y + beltHeight,
			 x + width - 1.4 * width / 16, y + 5.8 * legDividerLength / 10);
	Line2D.Double fancy8 =
		new Line2D.Double (x + width - 1.35 * width / 16, y + 5.8 * legDividerLength / 10,
			 x + width - 1.35 * width / 16, y + 4.9 * legDividerLength / 10);

        // put the whole house together

        GeneralPath wholePants = this.get();
        wholePants.append(waistStrip, false);
	wholePants.append(legDividerLine, false);
	wholePants.append(zipperButton, false);
	wholePants.append(zipperContour1, false);
	wholePants.append(zipperContour2, false);
	wholePants.append(zipperContour3, false);
	wholePants.append(zipperContour4, false);
	wholePants.append(zipperContour5, false);
	wholePants.append(zipperContour6, false);
	wholePants.append(zipperContour7, false);
	wholePants.append(zipperContour8, false);
	wholePants.append(pantLegs1, false);
	wholePants.append(pantLegs2, false);
	wholePants.append(pantLegs3, false);
	wholePants.append(pantLegs4, false);
	wholePants.append(pantLegs5, false);
	wholePants.append(pantLegs6, false);
	wholePants.append(pantLegs7, false);
	wholePants.append(pantLegs8, false);
	wholePants.append(pocket1, false);
	wholePants.append(pocket2, false);
	wholePants.append(pocket3, false);
	wholePants.append(pocket4, false);
	wholePants.append(fancy1, false);
	wholePants.append(fancy2, false);
	wholePants.append(fancy3, false);
	wholePants.append(fancy4, false);
	wholePants.append(fancy5, false);
	wholePants.append(fancy6, false);
	wholePants.append(fancy7, false);
	wholePants.append(fancy8, false);
    }
}
