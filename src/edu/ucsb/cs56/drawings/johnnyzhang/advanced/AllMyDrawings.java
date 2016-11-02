package edu.ucsb.cs56.drawings.johnnyzhang.advanced;

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
 * @author Johnny Zhang 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few sponges 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Sponge h1 = new Sponge(100,250,50,75,20);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black sponge that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a sponge that's 4x as big (2x the original)
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
	
	// Draw two spongebobs
	
	SpongeBob hw1 = new SpongeBob(50,350,40,100,20,30);
	SpongeBob hw2 = new SpongeBob(200,350,200,100,20,60);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few Spongebobs by Johnny Zhang", 20,20);
    }
    
    
    /** Draw a picture with a few sponges and spongebobs.
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some sponges.
	
	Sponge large = new Sponge(100,50,225,150,22);
	Sponge smallCC = new Sponge(20,50,40,30,23);
	Sponge tallSkinny = new Sponge(20,150,20,40,10);
	Sponge shortFat = new Sponge(20,250,40,20,15);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Sponge h1 = new Sponge(100,250,50,75,25);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black sponge that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a sponge that's 4x as big (2x the original)
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
	
	// Draw two spongebobs
	
	SpongeBob hw1 = new SpongeBob(50,350,40,75,25,40);
	SpongeBob hw2 = new SpongeBob(200,350,200,100,50,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second spongebob 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of spongebobs hanging out", 20,20);
    }
    
    /** Draw a different picture of spongebob
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Spongebobs by johnny zhang", 20,20);
	
	
	// Draw some coffee cups.
	
	SpongeBob large = new SpongeBob(100,50,225,150,25,100);
	SpongeBob smallCC = new SpongeBob(20,50,40,30,10,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }       
}
