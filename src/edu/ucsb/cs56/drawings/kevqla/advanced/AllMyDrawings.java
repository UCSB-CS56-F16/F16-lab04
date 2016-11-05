package edu.ucsb.cs56.drawings.kevqla.advanced;

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
 * @author Kevin La 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a swords
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Sword h1 = new Sword(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black sword that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a sword that's 4x as big (2x the original)
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
	g2.setColor(new Color(0x33FFDA)); 
	g2.draw(h2); 
	
	// Draw enchantedSword
	

	GreatSword hw2 = new GreatSword(200,350,200,100);
	

	g2.setColor(new Color(0xFF3355)); g2.draw(hw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.GREEN); 
	g2.drawString("Starter Swords, by Kevin La", 20,20);
    }
    
    
    /** Draw a picture with a few swords
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some swords
	
        Sword large = new Sword(100,50,225,150);
	Sword small = new Sword(20,50,40,30);
	Sword tallSkinny = new Sword(20,150,20,40);
	Sword shortFat = new Sword(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
        Sword h1 = new Sword(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black swordthat's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a sword that's 4x as big (2x the original)
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
	g2.setColor(new Color(0x71FF33)); 
	g2.draw(h2); 
	
	// Draw enchantedSword
       
        GreatSword hw2 = new GreatSword(200,350,200,100);
	
	g2.setColor(new Color(0xF6FF33)); 
	
	// Rotate the second sword 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLUE); 
	g2.drawString("Swords of all kind of sizes, with special ones, by Kevin La", 20,20);
    }
    
    /** Draw a different picture with simple swords
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Swords by Kevin La", 20,20);
	
	
	// Draw some Swords.
	
	Sword LongSword = new Sword(100,50,225,150);
	Sword smallSword = new Sword(20,50,40,30);
	
	g2.setColor(Color.YELLOW);     g2.draw(LongSword);
	g2.setColor(Color.PINK);   g2.draw(smallSword);
	
    }       
}
