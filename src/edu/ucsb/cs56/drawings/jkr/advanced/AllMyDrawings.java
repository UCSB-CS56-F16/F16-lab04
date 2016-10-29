package edu.ucsb.cs56.drawings.jkr.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

// My imports
import edu.ucsb.cs56.drawings.jkr.advanced.PlayButton;
import edu.ucsb.cs56.drawings.jkr.advanced.BetterPlayButton;


/**
 * A class with static methods for drawing various pictures
 * 
 * @author John Rehbein
 * @version for UCSB CS56, F16
 */

public class AllMyDrawings
{
    /** Draw a picture with a few PlayButtons 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	PlayButton h1 = new PlayButton(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black PlayButton that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a PlayButton that's 4x as big (2x the original)
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
	
	// Draw two PlayButtons with Windows
	
	BetterPlayButton hw1 = new BetterPlayButton(50,350,40);
	BetterPlayButton hw2 = new BetterPlayButton(200,350,200);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few PlayButtons by John Rehbein", 20,20);
    }
    
    
    /** Draw a picture with a few PlayButtons and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	PlayButton h1 = new PlayButton(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black PlayButton that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a PlayButton that's 4x as big (2x the original)
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
	
	// Draw two PlayButtons with Windows
	
	BetterPlayButton hw1 = new BetterPlayButton(50,350,40);
	BetterPlayButton hw2 = new BetterPlayButton(200,350,200);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second PlayButton 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Coffee Cups and a few PlayButtons by John Rehbein", 20,20);
    }
    
    /** Draw a different picture with a few PlayButtons and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Coffee Cups by Phill Conrad", 20,20);
	
	
	
    }       
}
