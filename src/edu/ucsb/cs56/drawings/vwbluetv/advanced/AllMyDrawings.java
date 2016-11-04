package edu.ucsb.cs56.drawings.vwbluetv.advanced;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;

/**
 * A class with static methods for drawing various pictures
 *
 * @author Phill Conrad
 * @version for UCSB CS56, W16
 */

public class AllMyDrawings {
	/**
	 * Draw a picture with a few houses
	 */

	public static void drawPicture1(Graphics2D g2) {

		StorkeTower storkeTower1 = new StorkeTower(100, 250, 75);
		g2.setColor(Color.CYAN);
		g2.draw(storkeTower1);

		// Make a black house that's half the size,
		// and moved over 150 pixels in x direction

		Shape h2 = ShapeTransforms.scaledCopyOfLL(storkeTower1, 0.5, 0.5);
		h2 = ShapeTransforms.translatedCopyOf(h2, 150, 0);
		g2.setColor(Color.BLACK);
		g2.draw(h2);

		// Here's a house that's 4x as big (2x the original)
		// and moved over 150 more pixels to right.
		h2 = ShapeTransforms.scaledCopyOfLL(h2, 4, 4);
		h2 = ShapeTransforms.translatedCopyOf(h2, 150, 0);

		// We'll draw this with a thicker stroke
		Stroke thick = new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

		// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
		// #002FA7 is "International Klein Blue" according to Wikipedia
		// In HTML we use #, but in Java (and C/C++) its 0x

		Stroke orig = g2.getStroke();
		g2.setStroke(thick);
		g2.setColor(new Color(0x002FA7));
		g2.draw(h2);

		// Draw two houses with Windows

		StorkeTower hw1 = new StorkeTower(50, 350, 75);
		StorkeTower hw2 = new StorkeTower(200, 350, 100);

		g2.draw(hw1);
		g2.setColor(new Color(0x8F00FF));
		g2.draw(hw2);

		// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

		g2.setStroke(orig);
		g2.setColor(Color.BLACK);
		g2.drawString("A few Storke Towers by Vincent Wang", 20, 20);
	}


	/**
	 * Draw a picture with a few houses and coffee cups
	 */
	public static void drawPicture2(Graphics2D g2) {

		// Draw some coffee cups.

		StorkeTower large = new StorkeTower(100, 50, 150);
		StorkeTower smallCC = new StorkeTower(20, 50, 30);
		StorkeTower tallSkinny = new StorkeTower(20, 150, 40);
		StorkeTower shortFat = new StorkeTower(20, 250, 20);

		g2.setColor(Color.RED);
		g2.draw(large);
		g2.setColor(Color.GREEN);
		g2.draw(smallCC);
		g2.setColor(Color.BLUE);
		g2.draw(tallSkinny);
		g2.setColor(Color.MAGENTA);
		g2.draw(shortFat);

		StorkeTower h1 = new StorkeTower(100, 250, 75);
		g2.setColor(Color.CYAN);
		g2.draw(h1);

		// Make a black house that's half the size,
		// and moved over 150 pixels in x direction
		Shape h2 = ShapeTransforms.scaledCopyOfLL(h1, 0.5, 0.5);
		h2 = ShapeTransforms.translatedCopyOf(h2, 150, 0);
		g2.setColor(Color.BLACK);
		g2.draw(h2);

		// Here's a house that's 4x as big (2x the original)
		// and moved over 150 more pixels to right.
		h2 = ShapeTransforms.scaledCopyOfLL(h2, 4, 4);
		h2 = ShapeTransforms.translatedCopyOf(h2, 150, 0);

		// We'll draw this with a thicker stroke
		Stroke thick = new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

		// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
		// #002FA7 is "International Klein Blue" according to Wikipedia
		// In HTML we use #, but in Java (and C/C++) its 0x

		Stroke orig = g2.getStroke();
		g2.setStroke(thick);
		g2.setColor(new Color(0x002FA7));
		g2.draw(h2);

		// Draw two houses with Windows

		StorkeTower hw1 = new StorkeTower(50, 350, 75);
		StorkeTower hw2 = new StorkeTower(200, 350, 100);

		g2.draw(hw1);
		g2.setColor(new Color(0x8F00FF));

		// Rotate the second house 45 degrees around its center.
		Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI / 4.0);

		g2.draw(hw3);

		// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

		g2.setStroke(orig);
		g2.setColor(Color.BLACK);
		g2.drawString("A bunch of Storke Towers by Vincent Wang", 20, 20);
	}

	/**
	 * Draw a different picture with a few houses and coffee cups
	 */

	public static void drawPicture3(Graphics2D g2) {

		// label the drawing

		g2.drawString("A bunch of Storke Towers by Vincent Wang", 20, 20);


		// Draw some coffee cups.

		StorkeTower large = new StorkeTower(100, 50, 150);
		StorkeTower smallCC = new StorkeTower(20, 50, 30);

		g2.setColor(Color.RED);
		g2.draw(large);
		g2.setColor(Color.GREEN);
		g2.draw(smallCC);

	}
}
