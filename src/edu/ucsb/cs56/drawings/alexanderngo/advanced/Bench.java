package edu.ucsb.cs56.drawings.alexanderngo.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a bench that implements the Shape interface
   , so that it can be drawn, as well as rotated, scaled, etc.
*/

public class Bench extends GeneralPathWrapper implements Shape {
    /**
       Constructor for the Bench class, takes 4 arguments
       @param x, x coordinate of lower left corner of the bench
       @param y, y coordinate of lower left corner of bench
       @param width, width of bench
       @param height, height of bench
    */

    public Bench(double x, double y, double width, double height)
    {
	double seatHeight = .60 * height;
	double seatStartWidth = .10 * width;

	Rectangle2D.Double benchBack =
	    new Rectangle2D.Double(x, y , width, height);

	Line2D.Double leftSeat = new Line2D.Double(x + seatStartWidth ,
						   y + height
						   + seatHeight,
						   x, y + height);

	Line2D.Double rightSeat = new Line2D.Double(x + width + seatStartWidth
						    , y + height + seatHeight
						    , x + width
						    , y + height);

        Line2D.Double bottomLine = new Line2D.Double(x + seatStartWidth,
						     y + height + seatHeight,
						     x + seatStartWidth + width
						     , y + height + seatHeight
						     );

	Line2D.Double leftBackLeg = new Line2D.Double(x, y + height, x,
						       y + height * 2
						      );

	Line2D.Double leftFrontLeg = new Line2D.Double(x + seatStartWidth,
							y + height +
							seatHeight,
							x + seatStartWidth,
							y + 2 * height +
							seatHeight);

	Line2D.Double rightBackLeg = new Line2D.Double(x + width, y + height + seatHeight, x + width, y + height * 2);

	Line2D.Double rightFrontLeg = new Line2D.Double(x + width + seatStartWidth,y + height + seatHeight ,x + width + seatStartWidth , y + 2 * height + seatHeight);
						  
						  
	
	GeneralPath wholeBench = this.get();
	wholeBench.append(benchBack, false);
	wholeBench.append(leftSeat, false);
	wholeBench.append(rightSeat,false);
	wholeBench.append(bottomLine,false);
	wholeBench.append(leftBackLeg,false);
	wholeBench.append(leftFrontLeg,false);
	wholeBench.append(rightBackLeg,false);
	wholeBench.append(rightFrontLeg,false);
    }
}
 
