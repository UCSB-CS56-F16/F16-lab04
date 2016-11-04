package edu.ucsb.cs56.drawings.nikhilpatil.advanced;

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
 * @author Nikhil Patil 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
        Flower f1 = new Flower(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(f1);
	
	// Make a black flower that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape f2 = ShapeTransforms.scaledCopyOfLL(f1,0.5,0.5);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	g2.setColor(Color.BLACK); g2.draw(f2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	f2 = ShapeTransforms.scaledCopyOfLL(f2,4,4);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(f2); 
	
	// Draw two Daisies
	
	Daisy d1 = new Daisy(50,350,40);
	Daisy d2 = new Daisy(200,150,90);
	
	g2.draw(d1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(d2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
       
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few flowers by Nikhil!", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some Flowas
	
	Flower f1 = new Flower(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(f1);
	
	// Make a black Daisy that's half the size, 
	// and moved over 150 pixels in x direction
	Shape d2 = ShapeTransforms.scaledCopyOfLL(f1,0.5,0.5);
	d2 = ShapeTransforms.translatedCopyOf(d2,150,0);
	g2.setColor(Color.BLACK); g2.draw(d2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	d2 = ShapeTransforms.scaledCopyOfLL(d2,4,4);
	d2 = ShapeTransforms.translatedCopyOf(d2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(d2); 
	
	// Draw two daisies
	
	Daisy d1 = new Daisy(20,250,40);
	
	g2.draw(d1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape d3 = ShapeTransforms.rotatedCopyOf(d2, Math.PI/4.0);
	
	g2.draw(d3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Some flowers and daisies by Nikhil Patil", 20,20);
    }
    
    public static void drawPicture3(Graphics2D g2) {
	
	
        Flower large = new Flower(100,50,125);
	Daisy small = new Daisy(20,50,40);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	
	}   
}
