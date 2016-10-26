package edu.ucsb.cs56.drawings.alexanderjbauer.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

/**
   A vector drawing of a pair of snazzy pants that extends Pants and
   implements the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Alexander Bauer
   @version for CS56, F16, UCSB

*/
public class SnazzyPants extends Pants implements Shape
{
    /**
       Constructor

       @param x x coord of upper left corner of pants
       @param y y coord of upper left corner of pants
       @param width width of the waist of the pants
       @param length length of the pants including the waist
    */
    public SnazzyPants(double x, double y, double width, double length)
    {

        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.

	super(x, y, width, length);

	Random r = new Random();

	// Make snazzy rectangles
	Rectangle2D.Double rec1 =
		new Rectangle2D.Double(x - width * .08, y + .2 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);
	Rectangle2D.Double rec2 =
		new Rectangle2D.Double(x + 1 * width / 16, y + .3 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);
	Rectangle2D.Double rec3 =
		new Rectangle2D.Double(x + 3 * width / 16, y + .4 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);
	Rectangle2D.Double rec4 =
		new Rectangle2D.Double(x + 3 * width / 16, y + .5 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);
	Rectangle2D.Double rec5 =
		new Rectangle2D.Double(x + 1 * width / 16, y + .6 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);
	Rectangle2D.Double rec6 =
		new Rectangle2D.Double(x - width * .08, y + .7 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);
	Rectangle2D.Double rec7 =
		new Rectangle2D.Double(x + .5 * width / 16, y + .8 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);
	Rectangle2D.Double rec8 =
		new Rectangle2D.Double(x + 2.5 * width / 16, y + .9 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);
	Rectangle2D.Double rec9 =
		new Rectangle2D.Double(x + 7 * width / 8, y + .2 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);
	Rectangle2D.Double rec10 =
		new Rectangle2D.Double(x + width - 1 * width / 16, y + .3 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);
	Rectangle2D.Double rec11 =
		new Rectangle2D.Double(x + width - 3 * width / 16, y + .4 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);
	Rectangle2D.Double rec12 =
		new Rectangle2D.Double(x + width - 3 * width / 16, y + .5 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);
	Rectangle2D.Double rec13 =
		new Rectangle2D.Double(x + width - 1 * width / 16, y + .6 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);
	Rectangle2D.Double rec14 =
		new Rectangle2D.Double(x + width, y + .7 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);
	Rectangle2D.Double rec15 =
		new Rectangle2D.Double(x + width - .5 * width / 16, y + .8 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);
	Rectangle2D.Double rec16 =
		new Rectangle2D.Double(x + width -2.5 * width / 16, y + .9 * length,
		      r.nextDouble() * width / 8, r.nextDouble() * length / 15);

	//Make snazzy ellipses
	Ellipse2D.Double e1 =
		new Ellipse2D.Double(x + width / 2 - width / 8, y + .25 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);
	Ellipse2D.Double e2 =
		new Ellipse2D.Double(x + width / 2 -  3 * width / 8, y + .3 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);
	Ellipse2D.Double e3 =
		new Ellipse2D.Double(x + width / 2 - 4.7 * width / 8, y + .4 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);
	Ellipse2D.Double e4 =
		new Ellipse2D.Double(x + width / 2 - 4.7 * width / 8, y + .5 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);
	Ellipse2D.Double e5 =
		new Ellipse2D.Double(x + width / 2 - 3 * width / 8, y + .6 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);
	Ellipse2D.Double e6 =
		new Ellipse2D.Double(x + width / 2 - 2.5 * width / 8, y + .7 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);
	Ellipse2D.Double e7 =
		new Ellipse2D.Double(x + width / 2 - 3 * width / 8, y + .8 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);
	Ellipse2D.Double e8 =
		new Ellipse2D.Double(x + width / 2 - 4.7 * width / 8, y + .9 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);
	Ellipse2D.Double e9 =
		new Ellipse2D.Double(x + width - (width / 2 - width / 8), y + .2 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);
	Ellipse2D.Double e10 =
		new Ellipse2D.Double(x + width - (width / 2 -  3 * width / 8), y + .3 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);
	Ellipse2D.Double e11 =
		new Ellipse2D.Double(x + width - (width / 2 - 3.7 * width / 8), y + .4 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);
	Ellipse2D.Double e12 =
		new Ellipse2D.Double(x + width - (width / 2 - 3.7 * width / 8), y + .5 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);
	Ellipse2D.Double e13 =
		new Ellipse2D.Double(x + width - (width / 2 - 3 * width / 8), y + .6 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);
	Ellipse2D.Double e14 =
		new Ellipse2D.Double(x + width - (width / 2 - 2.5 * width / 8), y + .7 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);
	Ellipse2D.Double e15 =
		new Ellipse2D.Double(x + width - (width / 2 - 3 * width / 8), y + .8 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);
	Ellipse2D.Double e16 =
		new Ellipse2D.Double(x + width - (width / 2 - 3.7 * width / 8), y + .9 * length,
		      r.nextDouble() * width / 7, r.nextDouble() * length / 10);

	GeneralPath wholePants = this.get();
	wholePants.append(rec1, false);
	wholePants.append(rec2, false);
	wholePants.append(rec3, false);
	wholePants.append(rec4, false);
	wholePants.append(rec5, false);
	wholePants.append(rec6, false);
	wholePants.append(rec7, false);
	wholePants.append(rec8, false);
	wholePants.append(rec9, false);
	wholePants.append(rec10, false);
	wholePants.append(rec11, false);
	wholePants.append(rec12, false);
	wholePants.append(rec13, false);
	wholePants.append(rec14, false);
	wholePants.append(rec15, false);
	wholePants.append(rec16, false);
	wholePants.append(e1, false);
	wholePants.append(e2, false);
	wholePants.append(e3, false);
	wholePants.append(e4, false);
	wholePants.append(e5, false);
	wholePants.append(e6, false);
	wholePants.append(e7, false);
	wholePants.append(e8, false);
	wholePants.append(e9, false);
	wholePants.append(e10, false);
	wholePants.append(e11, false);
	wholePants.append(e12, false);
	wholePants.append(e13, false);
	wholePants.append(e14, false);
	wholePants.append(e15, false);
	wholePants.append(e16, false);
    }

}
