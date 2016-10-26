package edu.ucsb.cs56.drawings.alexanderjbauer.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 *
 * @author Alexander Bauer
 * @version for UCSB CS56, F16
 */

public class AllMyDrawings
{
    /** Draw a picture with a few pants
     */

    public static void drawPicture1(Graphics2D g2) {

	Pants h1 = new Pants(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);

	// Make black pants that are half the size,
	// and moved over 150 pixels in x direction

	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);

	// Here's pants that are 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       

	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x

	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7));
	g2.draw(h2);

	// Draw two snazzy pairs of pants

	SnazzyPants hw1 = new SnazzyPants(50,350,40,75);
	SnazzyPants hw2 = new SnazzyPants(200,350,200,100);

	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);

	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A few pants by Alexander Bauer", 20,20);
    }


    /** Draw a picture with a few pants and snazzy pants
     */
    public static void drawPicture2(Graphics2D g2) {
        // Draw some snazzy pants.

        SnazzyPants large = new SnazzyPants(100,50,225,150);
        SnazzyPants smallCC = new SnazzyPants(20,50,40,30);
        SnazzyPants tallSkinny = new SnazzyPants(20,150,20,40);
        SnazzyPants shortFat = new SnazzyPants(20,250,40,20);

        g2.setColor(Color.RED);     g2.draw(large);
        g2.setColor(Color.GREEN);   g2.draw(smallCC);
        g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
        g2.setColor(Color.MAGENTA); g2.draw(shortFat);

        Pants h1 = new Pants(100,250,50,75);
        g2.setColor(Color.CYAN); g2.draw(h1);

        // Make a black pants that's half the size,
        // and moved over 150 pixels in x direction
        Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
        h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
        g2.setColor(Color.BLACK); g2.draw(h2);

        // Here's a pants that's 4x as big (2x the original)
        // and moved over 150 more pixels to right.
        h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
        h2 = ShapeTransforms.translatedCopyOf(h2,150,0);

        // We'll draw this with a thicker stroke
        Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

        // for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
        // #002FA7 is "International Klein Blue" according to Wikipedia
        // In HTML we use #, but in Java (and C/C++) its 0x

        Stroke orig=g2.getStroke();
        g2.setStroke(thick);
        g2.setColor(new Color(0x002FA7));
        g2.draw(h2);

        // Draw two more snazzy pants

        SnazzyPants hw1 = new SnazzyPants(50,350,40,75);
        SnazzyPants hw2 = new SnazzyPants(200,350,200,100);

        g2.draw(hw1);
        g2.setColor(new Color(0x8F00FF));

        // Rotate the second house 45 degrees around its center.
        Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);

        g2.draw(hw3);

        // @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
        g2.setStroke(orig);
        g2.setColor(Color.BLACK);
        g2.drawString("A bunch of Snazzy Pants and a few Pants by Alexander Bauer", 20,20);
    }


    /** Draw a different picture with a few snazzy pants
     */

    public static void drawPicture3(Graphics2D g2) {

	// label the drawing

	g2.drawString("A couple Snazzy Pants by Alexander Bauer", 20,20);

	// Draw some coffee cups.

	SnazzyPants large = new SnazzyPants(100,50,225,150);
	SnazzyPants smallCC = new SnazzyPants(20,50,40,30);

	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);

    }
}
