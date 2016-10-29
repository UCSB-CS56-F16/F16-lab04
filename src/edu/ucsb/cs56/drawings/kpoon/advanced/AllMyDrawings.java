package edu.ucsb.cs56.drawings.kpoon.advanced;

import java.awt.BasicStroke;
import java.awt.Color; // class for Colors
import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Stroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad
 * @author Kin Kwan Poon
 * @version for UCSB CS56, W16
 */

public class AllMyDrawings {
	/**
	 * Draw a picture with a few houses
	 */

	public static void drawPicture1(Graphics2D g2) {

		Table t1 = new Table(50, 200, 50, 65, 100);
		g2.setColor(Color.red);
		g2.draw(t1);

		// Make a black house that's half the size,
		// and moved over 150 pixels in x direction

		Shape t2 = ShapeTransforms.scaledCopyOfLL(t1, 0.5, 0.5);
		t2 = ShapeTransforms.translatedCopyOf(t2, 150, -50);
		g2.setColor(Color.BLACK);
		g2.draw(t2);

		// Here's a house that's 4x as big (2x the original)
		// and moved over 150 more pixels to right.
		t2 = ShapeTransforms.scaledCopyOfLL(t2, 4, 4);
		t2 = ShapeTransforms.translatedCopyOf(t2, 150, 0);

		// We'll draw this with a thicker stroke
		Stroke thick = new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

		// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
		// #002FA7 is "International Klein Blue" according to Wikipedia
		// In HTML we use #, but in Java (and C/C++) its 0x

		Stroke orig = g2.getStroke();
		g2.setStroke(thick);
		g2.setColor(new Color(0x002FA7));
		g2.draw(t2);

		// Draw two houses with Windows

		OfficeTable ot1 = new OfficeTable(50, 350, 40, 75, 80);
		OfficeTable ot2 = new OfficeTable(200, 450, 200, 100, 300);

		g2.setColor(new Color(0xF47742));
		g2.draw(ot1);
		g2.setColor(new Color(0x8F00FF));
		g2.draw(ot2);

		// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

		g2.setStroke(orig);
		g2.setColor(Color.BLACK);
		g2.drawString("A few tables by Kin Poon", 20, 20);
	}

	/**
	 * Draw a picture with a few houses and coffee cups
	 */
	public static void drawPicture2(Graphics2D g2) {

		House h1 = new House(10, 10, 980, 700);

		Stroke thick = new BasicStroke(10.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
		Stroke thin = new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
		g2.setStroke(thick);
		g2.setColor(new Color(0x002FA7));
		g2.draw(h1);

		g2.setStroke(thin);

		Table t1 = new Table(50, 620, 100, 60, 100);
		g2.setColor(Color.BLACK);
		g2.draw(t1);

		Shape t2 = ShapeTransforms.scaledCopyOf(t1, 2, 1.5);
		t2 = ShapeTransforms.translatedCopyOf(t2, 200, -70);
		g2.setColor(new Color(0x699111));
		g2.draw(t2);

		OfficeTable ot1 = new OfficeTable(600, 550, 100, 150, 300);
		g2.setColor(new Color(0xA34608));
		g2.draw(ot1);

		Shape ot2 = ShapeTransforms.scaledCopyOf(ot1, 0.8, 0.8);
		ot2 = ShapeTransforms.translatedCopyOf(ot2, 60, -200);
		g2.setColor(new Color(0x522C13));
		g2.draw(ot2);

		// Draw some coffee cups.

		CoffeeCup large = new CoffeeCup(750, 495, 70, 50);
		CoffeeCup smallCC = new CoffeeCup(110, 570, 40, 30);
		CoffeeCup tallSkinny = new CoffeeCup(400, 500, 20, 40);
		CoffeeCup shortFat = new CoffeeCup(750, 300, 40, 20);

		g2.setColor(Color.RED);
		g2.draw(large);
		g2.setColor(Color.GREEN);
		g2.draw(smallCC);
		g2.setColor(Color.BLUE);
		g2.draw(tallSkinny);
		g2.setColor(Color.MAGENTA);
		g2.draw(shortFat);

		// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

		g2.setColor(Color.BLACK);
		g2.drawString("The morning of a Office by Kin Poon", 20, 20);
	}

	/**
	 * Draw a different picture with a few houses and coffee cups
	 */

	public static void drawPicture3(Graphics2D g2) {

		// label the drawing

		g2.drawString("Table flip by Kin Poon", 20, 20);

		Stroke thin = new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
		g2.setStroke(thin);

		Table t1 = new Table(20, 500, 80, 50, 100);
		g2.draw(t1);
		Shape t2 = ShapeTransforms.rotatedCopyOf(t1, Math.PI / 4.0);

		for (int i = 0; i < 8; i++) {
			int sy;
			if (i < 4)
				sy = -80;
			else
				sy = 80;
			t2 = ShapeTransforms.translatedCopyOf(t2, 100, sy);
			g2.setColor(randomColor());
			g2.draw(t2);
			t2 = ShapeTransforms.rotatedCopyOf(t2, Math.PI / 4.0);
		}

	}

	public static Color randomColor() {
		Color result;
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);

		result = new Color(red, green, blue);
		return result;
	}
}
