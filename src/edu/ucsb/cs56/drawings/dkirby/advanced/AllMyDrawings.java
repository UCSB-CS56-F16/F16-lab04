package edu.ucsb.cs56.drawings.dkirby.advanced;

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
 * @author Phill Conrad 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few peanuts 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Peanut p1 = new MrPeanut(250,250,50);
	g2.setColor(Color.CYAN); g2.draw(p1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(Color.BLACK); g2.draw(p2);
	
	// Here's a house that's 4x as big (2x the original)
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
	
	// Draw two houses with Windows
	
	Peanut p3 = new MrPeanut(150,350,40);
	Peanut p4 = new MrPeanut(200,350,200);
	
	g2.draw(p3);
	g2.setColor(new Color(0x8F00FF)); g2.draw(p4);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few MrPeanuts by Dominic Kirby", 20,20);
    }
    
    
    /** Draw a picture with a bunch of MrPeanuts
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some coffee cups.
	
	MrPeanut large = new MrPeanut(150,50,225);
	MrPeanut smallMP = new MrPeanut(120,50,40);
	MrPeanut tallSkinny = new MrPeanut(120,150,20);
	MrPeanut shortFat = new MrPeanut(120,250,40);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallMP);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	MrPeanut p1 = new MrPeanut(200,250,50);
	g2.setColor(Color.CYAN); g2.draw(p1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(Color.BLACK); g2.draw(p2);
	
	// Here's a house that's 4x as big (2x the original)
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
	
	// Draw two houses with Windows
	
	MrPeanut mp1 = new MrPeanut(150,350,40);
	MrPeanut mp2 = new MrPeanut(250,350,200);
	
	g2.draw(mp1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape mp3 = ShapeTransforms.rotatedCopyOf(mp2, Math.PI/4.0);
	
	g2.draw(mp3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of MrPeanuts by Dominic Kirby", 20,20);
    }
    
    /** Draw a different picture with a few Mr Peanuts
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of MrPeanuts by Dominic Kirby", 20,20);
	
	
	// Draw some coffee cups.
	
	MrPeanut large = new MrPeanut(150,50,225);
	MrPeanut smallCC = new MrPeanut(120,50,40);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }       
}
