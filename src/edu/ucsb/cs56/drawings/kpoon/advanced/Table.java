package edu.ucsb.cs56.drawings.kpoon.advanced;

import static java.lang.Math.sqrt;

import java.awt.Shape; // general class for shapes
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.Line2D;

import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

// combinations of lines and curves

/**
 * A vector drawing of a table that implements the Shape interface, and so can be drawn, as well as rotated, scaled,
 * etc.
 * 
 * @author Kin Kwan Poon
 * @version for CS56, F16, UCSB
 */
public class Table extends GeneralPathWrapper implements Shape {

	protected double topLeftX;
	protected double topY;
	protected double topRightX;
	// bot left x =x
	// bot y =y
	protected double bottomRightX;

	/**
	 * Constructor
	 * 
	 * @param x
	 *            x coord of lower left corner of table
	 * @param y
	 *            y coord of lower left corner of table
	 * @param width
	 *            width of the table
	 * @param height
	 *            height of the table
	 * @param length
	 *            length of the table
	 */
	public Table(double x, double y, double width, double height, double length) {

		// Rather than having to scale at the end, we can just
		// draw things the right way to begin with, using the
		// x, y, width and height. If you haven't already
		// hard coded a particular drawing, this may be an easier
		// way.
		//

		// Declare the position of the corner here, which easier for debug
		topLeftX = x + width / sqrt(2);
		topY = y - width / sqrt(2);
		topRightX = topLeftX + length;
		// bot left x =x
		// bot y =y
		bottomRightX = x + length;

		// Make the table
		Line2D.Double leftEdge = new Line2D.Double(x, y, topLeftX, topY);
		Line2D.Double topEdge = new Line2D.Double(topLeftX, topY, topRightX, topY);
		Line2D.Double rightEdge = new Line2D.Double(bottomRightX, y, topRightX, topY);
		Line2D.Double bottomEdge = new Line2D.Double(x, y, bottomRightX, y);

		// Make the Stand
		Line2D.Double leftStand = new Line2D.Double(x, y, x, y + height);
		Line2D.Double rightStand = new Line2D.Double(bottomRightX, y, bottomRightX, y + height);
		Line2D.Double topStand = new Line2D.Double(topRightX, topY, topRightX, topY + height);
		Line2D.Double behindStand = new Line2D.Double(topLeftX, topY + width / sqrt(2), topLeftX, topY + height);

		// put the whole table together

		GeneralPath wholeTable = this.get();
		wholeTable.append(topStand, false);
		wholeTable.append(leftStand, false);
		wholeTable.append(rightStand, false);
		// if width/sqrt(2) > height means the table will block the view of the stand,
		// so then we won't draw it to avoid weird drawing.
		if (width / sqrt(2) < height) {
			wholeTable.append(behindStand, false);
		}
		wholeTable.append(leftEdge, false);
		wholeTable.append(topEdge, false);
		wholeTable.append(rightEdge, false);
		wholeTable.append(bottomEdge, false);

	}
}
