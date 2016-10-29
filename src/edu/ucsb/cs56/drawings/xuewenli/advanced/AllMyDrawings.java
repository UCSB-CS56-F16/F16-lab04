package edu.ucsb.cs56.drawings.xuewenli.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Xuewen Sherry Li
 * @version for UCSB CS56, F16
 */

public class AllMyDrawings {
	/**
	 * Draw a picture with a few cakes
	 */

	public static void drawPicture1(Graphics2D g2) {

		Cake c1 = new Cake(100, 250, 200, 200);
		g2.setColor(Color.PINK);
        g2.fill(c1);
        g2.setPaint(Color.WHITE);
		g2.draw(c1);


		// Make a red cake that's 1.5 the size,
		// and moved over 200 pixels right in x direction
        // and 300 pixels down in y direction

		Shape c2 = ShapeTransforms.scaledCopyOfLL(c1, 1.5, 1.5);
		c2 = ShapeTransforms.translatedCopyOf(c2, 200, 300);
		g2.setColor(Color.RED);
        g2.fill(c2);
        g2.setPaint(Color.BLACK);
		g2.draw(c2);

        // Make an aquamarine cake above the red cake
        // and half the size of red cake
        Shape c3 = ShapeTransforms.scaledCopyOfLL(c2, 0.5, 0.5);
        c3 = ShapeTransforms.translatedCopyOf(c3, 100, -400.0);

        // We'll draw this with a thicker stroke
        Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
        g2.setStroke(thick);
        g2.setColor(new Color(0x7FFFD4));
        g2.fill(c3);
        g2.setPaint(new Color(0x4169E1));
        g2.draw(c3);

		g2.setColor(Color.BLACK);
		g2.drawString("A few cakes by Sherry Li", 20, 20);
	}


    /** Draw a picture of birthday cakes only
     */
    public static void drawPicture2(Graphics2D g2) {

        // Draw some birthday cakes.

        // large green cake
        BirthdayCake large = new BirthdayCake(100, 250, 300, 400);
        g2.setColor(Color.GREEN);
        g2.fill(large);
        Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
        g2.setStroke(thick);
        g2.setPaint(Color.WHITE);
        g2.draw(large);

        // falling smaller green cake
        Shape fallingCake = ShapeTransforms.rotatedCopyOf(large, 0.8);
        fallingCake = ShapeTransforms.translatedCopyOf(fallingCake, 50, 150);
        fallingCake = ShapeTransforms.scaledCopyOfLL(fallingCake, 0.4, 0.4);
        g2.setColor(Color.YELLOW);
        g2.fill(fallingCake);
        g2.setColor(Color.WHITE);
        g2.draw(fallingCake);

        // fat cake
        BirthdayCake fatCake = new BirthdayCake(600, 250, 500, 200);
        g2.setColor(Color.CYAN);
        g2.fill(fatCake);
        g2.setPaint(Color.BLACK);
        g2.draw(fatCake);


        // @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

        g2.setColor(Color.BLACK);
        g2.drawString("FALLING CAKES! And normal cakes by Sherry Li", 20,20);
    }

    /** Draw a different picture with a cake vs a birthday cake
     */

    public static void drawPicture3(Graphics2D g2) {

        // label the drawing

        g2.drawString("cake vs birthday cake", 20,20);

        // Draw a cake
        Cake normal = new Cake(300, 300, 400, 300);
        g2.setColor(Color.LIGHT_GRAY);
        g2.fill(normal);
        g2.setColor(Color.YELLOW);
        g2.draw(normal);


        // Draw a birthday cake
        BirthdayCake bday = new BirthdayCake(800, 300, 300, 500);
        g2.setColor(Color.YELLOW);
        g2.fill(bday);
        g2.setColor(Color.LIGHT_GRAY);
        Stroke thick = new BasicStroke (5.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
        g2.setStroke(thick);
        g2.draw(bday);

    }


}
