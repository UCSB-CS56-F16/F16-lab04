package edu.ucsb.cs56.drawings.vwbluetv.advanced;

import java.awt.geom.Rectangle2D;

/**
 A drawing of Storke Tower

 @author Vincent Wang
 @version for CS56, F16, UCSB

 */
public class StorkeTower extends Tower {

	/**
	 * Constructor to create Storke Tower
	 * @param x x coordinate of lower left corner of Storke Tower
	 * @param y y coordinate of lower left corner of Storke Tower
	 * @param height height of Storke Tower.
	 */
	public StorkeTower(double x, double y, double height) {
		super(x, y, height);

		// Find the width of the windows
		double windowWidth = towerHeightToWidth(height) / 7;
		double windowHeight = windowWidth * 4;

		// Create windows
		double initialX = x + windowWidth;
		for (int i = 0; i < 3; i++) {
			Rectangle2D.Double window =
					new Rectangle2D.Double
							(
									initialX, y + windowWidth, windowWidth, windowHeight
							);

			this.get().append(window, false);
			initialX += 2 * windowWidth;
		}
	}
}
