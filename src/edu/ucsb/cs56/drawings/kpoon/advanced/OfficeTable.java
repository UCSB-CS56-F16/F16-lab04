package edu.ucsb.cs56.drawings.kpoon.advanced;

import static java.lang.Math.sqrt;

import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 * A Table with Drawers
 * 
 * @author Kin Kwan Poon
 * @version for CS56, F16, UCSB
 */
public class OfficeTable extends Table implements Shape {
	/**
	 * Constructor of OfficeTable
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
	public OfficeTable(double x, double y, double width, double height, double length) {
		// construct the basic table shell
		super(x, y, width, height, length);

		// Drawer uses 1/3 of the length, and located at the right side of the table
		double drawerX = x + 2 * length / 3;
		double drawerWidth = length / 3;
		// Construct 3 Drawer, the first one is 1/6 of height, second is 2/6, and thrid is 3/6.
		// So declare the height with 1/6
		double drawerHeight = height / 6;

		Rectangle2D.Double dra1 = new Rectangle2D.Double(drawerX, y, drawerWidth, drawerHeight);
		Rectangle2D.Double dra2 = new Rectangle2D.Double(drawerX, y + drawerHeight, drawerWidth, 2 * drawerHeight);
		Rectangle2D.Double dra3 = new Rectangle2D.Double(drawerX, y + 3 * drawerHeight, drawerWidth, 3 * drawerHeight);

		// Make bottom lines so they look like table with a board on each side.
		Line2D.Double rightLine = new Line2D.Double(bottomRightX, y + height, topRightX, topY + height);
		Line2D.Double leftLine;
		// Again, to deal with the view of the behindStand
		if (width / sqrt(2) <= height) {
			leftLine = new Line2D.Double(x, y + height, topLeftX, topY + height);
		} else {
			leftLine = new Line2D.Double(x, y + height, x + height, y);
		}

		// add the drawer to the table

		GeneralPath wholeTable = this.get();
		wholeTable.append(dra1, false);
		wholeTable.append(dra2, false);
		wholeTable.append(dra3, false);
		wholeTable.append(rightLine, false);
		wholeTable.append(leftLine, false);
	}
}
