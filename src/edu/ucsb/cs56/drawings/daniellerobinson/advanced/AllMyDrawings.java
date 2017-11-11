package edu.ucsb.cs56.drawings.daniellerobinson.advanced;

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
 * @author Danielle Robinson
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few petals and flowers
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Petal p1 = new Petal(100, 200, 50, 50);
	g2.setColor(Color.BLACK);
	g2.draw(p1);

	Petal p2 = new Petal(100,250,50,75);
	g2.setColor(Color.BLACK); g2.draw(p1);
	
	// Make a black petal that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape p3 = ShapeTransforms.scaledCopyOfLL(p2,0.5,0.5);
	p3 = ShapeTransforms.translatedCopyOf(p3,150,0);
	g2.setColor(Color.BLACK); g2.draw(p3);
	
	// Here's a petal that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	p3 = ShapeTransforms.scaledCopyOfLL(p3,4,4);
	p3 = ShapeTransforms.translatedCopyOf(p3,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(p3); 
	
	// Draw two FLowers
	Flower f1 = new Flower(50,350,40,75);
	Flower f2 = new Flower(200,350,200,100);
	
	g2.draw(f1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(f2);
	
	// @@@ Danielle Robinson "A few flowers and petals"
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few Petals and Flowers by Danielle Robinson", 20,20);
    }
    
    
    /** Draw a picture with a few petals and flowers
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some petals.
	
	Petal large = new Petal(100,50,225,150);
	Petal smallP = new Petal(20,50,40,30);
	Petal tallSkinny = new Petal(20,150,20,40);
	Petal shortFat = new Petal(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallP);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Petal p1 = new Petal(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(p1);
	
	// Make a black petal that's half the size, 
	// and moved over 150 pixels in x direction
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(Color.BLACK); g2.draw(p2);
	
	// Here's a petal that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(p2); 
	
	// Draw two flowers
	
	Flower f1 = new Flower(50,350,40,75);
	Flower f2 = new Flower(200,350,200,100);
	
	g2.draw(f1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second flower 45 degrees around its center.
	Shape f3 = ShapeTransforms.rotatedCopyOf(f2, Math.PI/4.0);
	
	g2.draw(f3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Flowers and Petals by Danielle Robinson", 20,20);
    }
    
    /** Draw a different picture with a few petals
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Petals by Danielle Robinson", 20,20);
	
	
	// Draw some petals.
	
	Petal large = new Petal(100,50,225,150);
	Petal smallP = new Petal(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallP);
	
    }       
}
