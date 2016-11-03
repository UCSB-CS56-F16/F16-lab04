
package edu.ucsb.cs56.drawings.ttsherpa.advanced;

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
 * @author Tenzing Sherpa
 * @version for UCSB CS56, W16
 */

public class AllMyDrawings
{
    /** Draw a picture with a few Cars
        @param g2 g2 represents the Graphics2D drawing you are making.
    */


    public static void drawPicture1(Graphics2D g2) {

	Car c1 = new Car(300,300,200,80);
	g2.setColor(Color.GRAY);
	g2.draw(c1);

	Shape h2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);


	CarWithWindowsandAnt c2 = new CarWithWindowsandAnt(200,100,300,150);
	g2.draw(c2);
	g2.setColor(new Color(0x8F0000)); g2.draw(c2);

	// Here's a Car that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4); //fix this
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	    // #002FA7 is "International Klein Blue" according to Wikipedia
	    // In HTML we use #, but in Java (and C/C++) its 0x

	    Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7));
	g2.draw(c2);


	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A few houses by Tenzing Sherpa", 20,20);
    }


    /** Draw a picture with a few cars
     @param g2 g2 represents the Graphics2D drawing you are making.
    */
    public static void drawPicture2(Graphics2D g2) {


	//Draw some cars.
	Car c1 = new Car(100,250,100,75);
	g2.setColor(Color.CYAN); g2.draw(c1);

	// Make a black car that's half the size,
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);

	// Here's a house that's 4x as big (2x the original)
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
	// Draw two cars with Windows

	CarWithWindowsandAnt hw1 = new CarWithWindowsandAnt(50,350,200,75);
	CarWithWindowsandAnt hw2 = new CarWithWindowsandAnt(200,100,200,100);

	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF));

	// Rotate the second car 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);


	g2.draw(hw3);

	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A bunch of Cars by Tenzing Sherpa", 20,20);
    }

    /** Draw a different picture with a few different cars
        @param g2 g2 represents the Graphics2D drawing you are making.
    */

    public static void drawPicture3(Graphics2D g2) {

	// label the drawing

	g2.drawString("A bunch of Coffee Cars by Tenzing Sherpa", 20,20);


	// Draw some coffee cups.


	Car h1 = new Car(300,300,200,80);
	g2.setColor(Color.CYAN);
	g2.draw(h1);
	CarWithWindowsandAnt hw2 = new CarWithWindowsandAnt(100,350,200,100);
	g2.draw(hw2);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);

    }
}


