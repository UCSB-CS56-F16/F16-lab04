package edu.ucsb.cs56.drawings.aryamandas.advanced;

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
 * @author Phill Conrad, Aryaman Das 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few wheels 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Wheel w1 = new Wheel(100,100,50,50);
	g2.setColor(Color.CYAN); g2.draw(w1);
	Wheel w2 = new Wheel(200,200,50,50);
  
	// Make a black wheel that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(w1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a wheel that's 4x as big (2x the original)
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
	
	// Draw two wheels 
	
	Wheel w3 = new Wheel(50,150,175,175);
	Wheel w4 = new Wheel(200,300,125,125);
	
	g2.draw(w3);
	g2.setColor(new Color(0x8F00FF)); g2.draw(w4);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Couple of Wheels by Mr.Das", 20,20);
    }
    
    
    /** Draw a picture with a few wheels and ship wheels
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some wheels
	
	Wheel w1 = new Wheel(100,50,225,150);
	Wheel w2 = new Wheel(20,50,40,30);
	Wheel w3= new Wheel(20,150,20,40);
	Wheel w4 = new Wheel(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(w1);
	g2.setColor(Color.GREEN);   g2.draw(w2);
	g2.setColor(Color.BLUE);    g2.draw(w3);
	g2.setColor(Color.MAGENTA); g2.draw(w4);
	
	Wheel w5 = new Wheel(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(w5);
	
	// Make a black wheel that's half the size, 
	// and moved over 150 pixels in x direction

	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(w5,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a wheel that's 4x as big (2x the original)
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
	
	// Draw two Ship Wheels
	
	ShipWheel sw1 = new ShipWheel(50,350,110,110);
	ShipWheel sw2 = new ShipWheel(200,350,200,200);
	
	g2.draw(sw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second wheel 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(sw2, Math.PI/4.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Wheels and Ship Wheels by Aryaman Das", 20,20);
    }
    
    /** Draw a different picture with a few basic wheels and ship wheels
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Wheels and Ship Wheels by Aryaman Das", 20,20);
	
	
	// Draw some wheels.
	
	Wheel large = new Wheel(50,50,100,100);
	ShipWheel pirate = new ShipWheel(400,100,200,200);
	ShipWheel round = new ShipWheel(200,200,150,150);
 
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.BLUE);   g2.draw(pirate);
	g2.setColor(Color.ORANGE); g2.draw(round);
	
    }       
}
