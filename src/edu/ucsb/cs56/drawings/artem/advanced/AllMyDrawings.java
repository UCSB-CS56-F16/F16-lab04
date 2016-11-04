package edu.ucsb.cs56.drawings.artem.advanced;

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
 * @author Artem Jivotovski
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few clocks and watches
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Clock h1 = new Clock(100,250,50,50);
	g2.setColor(Color.BLUE);
	g2.draw(h1);
	
	// Make a black clock that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK);
	g2.draw(h2);
	
	// Here's a clock that's 4x as big (2x the original)
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
	
	// Draw two watches
	
	Watch w1 = new Watch(30, 80, 40, 40);
	Watch w2 = new Watch(290, 20, 30, 75);
	
	g2.draw(w1);
	g2.setColor(new Color(0x8F00FF));
	g2.draw(w2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig); 
	g2.setColor(Color.BLACK); 
	g2.drawString("A few watches by Artem Jivotovski", 20,20);
    }
    
    
    /** Draw another picture with a few clocks and watches
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some clocks
	
	Clock c1 = new Clock(175,60,75,75);
	g2.setColor(Color.GREEN);
	g2.draw(c1);
	
	// Make a black clock that's a quarter the size, 
	// and moved over 150 pixels in x direction, and 200 in the y direction
	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.25,0.25);
	c2 = ShapeTransforms.translatedCopyOf(c2,150,200);
	g2.setColor(Color.ORANGE);
	g2.draw(c2);
	
	// Here's a clock that's 5x as big (2.5x the original)
	// and moved over 100 more pixels to right, and 70 down
	c2 = ShapeTransforms.scaledCopyOfLL(c2,5,5);
        c2 = ShapeTransforms.translatedCopyOf(c2,100,70);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x82DC7)); 
	g2.draw(c2); 
	
	// Draw two watches
	
	Watch w1 = new Watch(350,30,40,40);
	Watch w2 = new Watch(100,100,75,75);
	
	g2.draw(w1);
	g2.setColor(new Color(0x7FABCF)); 
	
	// Rotate the second watch 45 degrees around its center.
	Shape w3 = ShapeTransforms.rotatedCopyOf(w2, Math.PI/4.0);
	
	g2.draw(w3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of clocks and watches by Artem Jivotovski", 20,20);
    }
    
    /** Draw a picture of nested clocks
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Clockception by Artem Jivotovski", 20,20);
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	
	// Draw some clocks.
	
	Clock c1 = new Clock(50,50,400,400);
	Clock c2  = new Clock(70,130,170,170);
	Shape c3 = ShapeTransforms.rotatedCopyOf(c2, Math.PI/4.0);
	Clock c4 = new Clock(80, 170, 65, 65);
	Shape c5 = ShapeTransforms.rotatedCopyOf(c4, Math.PI/3.0);
	
	g2.setColor(Color.RED);
	g2.setStroke(thick);
	g2.draw(c1);
	g2.setColor(Color.GREEN);
	g2.draw(c3);
	g2.setColor(Color.BLUE);
	g2.draw(c5);
	
    }       
}
