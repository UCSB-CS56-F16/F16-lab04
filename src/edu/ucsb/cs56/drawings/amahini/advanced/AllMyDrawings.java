package edu.ucsb.cs56.drawings.amahini.advanced;

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
 * @author Armin Mahini 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few tables 
	@param g2
    */
    public static void drawPicture1(Graphics2D g2) {
	
	Table t1 = new Table(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(t1);
	
	// Make a black table that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape t2 = ShapeTransforms.scaledCopyOfLL(t1,0.5,0.5);
	t2 = ShapeTransforms.translatedCopyOf(t2,150,0);
	g2.setColor(Color.BLACK); g2.draw(t2);
	
	// Here's a table that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	t2 = ShapeTransforms.scaledCopyOfLL(t2,4,4);
	t2 = ShapeTransforms.translatedCopyOf(t2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(t2); 
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few tables by Armin Mahini", 20,20);
    }
    
    
    /** Draw a picture with a few tables and coffee tabless
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some coffee tables.
	
	CoffeeTable large = new CoffeeTable(100,50,225,150);
	CoffeeTable smallCT = new CoffeeTable(20,50,40,30);
	CoffeeTable tall = new CoffeeTable(20,150,20,40);
	CoffeeTable small = new CoffeeTable(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCT);
	g2.setColor(Color.BLUE);    g2.draw(tall);
	g2.setColor(Color.MAGENTA); g2.draw(small);
	
	Table t1 = new Table(50,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(t1);
	
	// Make a black table that's half the size, 
	// and moved over 150 pixels in x direction
	Shape t2 = ShapeTransforms.scaledCopyOfLL(t1,0.5,0.5);
	t2 = ShapeTransforms.translatedCopyOf(t2,150,0);
	g2.setColor(Color.BLACK); g2.draw(t2);
	
	// Here's a table that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	t2 = ShapeTransforms.scaledCopyOfLL(t2,4,4);
	t2 = ShapeTransforms.translatedCopyOf(t2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(t2); 
	
	// Draw a Table to rotate
	
	Table rotateT1 = new Table(50,300,40,75);
	Table rotateT2 = new Table(200,300,200,100);

	
	g2.draw(rotateT1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second table 45 degrees around its center.
	Shape t3 = ShapeTransforms.rotatedCopyOf(rotateT2, Math.PI/4.0);
	
	g2.draw(t3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Coffee Tables and a few tables by Armin Mahini", 20,20);
    }
    
    /** Draw a different picture with a few tables and coffee tables
     */
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Coffee Tables by Armin Mahini", 20,20);
	
	
	// Draw some coffee tables.
	
	CoffeeTable large = new CoffeeTable(100,50,225,150);
	CoffeeTable smallCT = new CoffeeTable(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCT);
	
    }       
}
