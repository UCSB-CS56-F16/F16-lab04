package edu.ucsb.cs56.drawings.vwbluetv.advanced;

import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 A vector drawing of a tower that implements
 the Shape interface, and so can be drawn, as well as
 rotated, scaled, etc.

 @author Vincent Wang
 @version for CS56, F16, UCSB

 */
public class Tower extends GeneralPathWrapper implements Shape
{
	/**
	 Constructor

	 @param x x coord of lower left corner of tower
	 @param y y coord of lower left corner of tower
	 @param height of tower
	 */
	public Tower(double x, double y, double height)
	{
		double width = towerHeightToWidth(height);
		Rectangle2D.Double tower = new Rectangle2D.Double(x, y, width, height);
		GeneralPath fullTower = this.get();
		fullTower.append(tower, false);
	}

	/**
	 * Computes the width that the tower should be so that the drawing
	 * actually resembles a tower
	 *
	 * @param height of tower
	 * @return suggested width for tower
	 */
	protected static double towerHeightToWidth(double height) {
		return height / 4;
	}
}
