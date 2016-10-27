package edu.ucsb.cs56.drawings.youxinjie.advanced;

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
 * @author Xinjie You 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few phones 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	phone h1 = new phone(30,300,100,160);
	g2.setColor(Color.BLACK); g2.draw(h1);
	
	// Make a green phone that's half the size, 
	// and moved over 140 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,140,0);
	g2.setColor(Color.GREEN); g2.draw(h2);
	
	// Here's a phone that's 4x as big (2x the original)
	// and moved over 100 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,100,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw a phone with AppIcon

	PhoneWithAppIcon pi = new PhoneWithAppIcon(510,100,250,400);
	
	g2.setColor(new Color(0x8F00FF));
	 g2.draw(pi);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few phones by Xinjie You", 20,20);
	
    }
    
    
    // Draw a picture with a few phones
  
    public static void drawPicture2(Graphics2D g2) {

    phone h1 = new phone(30,300,100,160);
	g2.setColor(Color.BLACK); g2.draw(h1);
	
	// Make a green phone that's half the size, 
	// and moved over 140 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,140,0);
	g2.setColor(Color.GREEN); g2.draw(h2);
	
	// Here's a phone that's 4x as big (2x the original)
	// and moved over 100 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,100,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw a phone with AppIcon

	PhoneWithAppIcon pi = new PhoneWithAppIcon(510,100,250,400);
	
	g2.setColor(new Color(0xFF0000));
	g2.draw(pi);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few phones by Xinjie You", 20,20);   
	

	// Rotate the first phone 45 degrees around its center.
	Shape pi4 = ShapeTransforms.rotatedCopyOf(h1, Math.PI/4.0);
	g2.draw(pi4);
	// Rotate the third phone 90 degrees around its center.
	Shape pi5 = ShapeTransforms.rotatedCopyOf(h2, Math.PI/2.0);
	g2.draw(pi5);
	
    }
    
    // Draw a different picture with a few phones
     
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Three different color phones by Xinjie You", 20,20);
	
	
	// Draw some phones.
	Stroke thick = new BasicStroke (2.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL); 
	PhoneWithAppIcon pi = new PhoneWithAppIcon(10,100,240,384);
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0xf73b22));
	g2.draw(pi);

	PhoneWithAppIcon pi2 = new PhoneWithAppIcon(270,100,240,384);
	
	g2.setColor(new Color(0x000000));
	g2.draw(pi2);

	PhoneWithAppIcon pi3 = new PhoneWithAppIcon(530,100,240,384);
	
	g2.setColor(new Color(0xd5bee2));
	g2.draw(pi3);
	
    }

}
