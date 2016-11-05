package edu.ucsb.cs56.drawings.colingarrett.advanced;

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
 * @author Colin Garrett
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few pumpkins (carved and uncarved) 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Pumpkin p1 = new Pumpkin(100,200,75,100);
	g2.setColor(Color.ORANGE); g2.draw(p1);
	
	// Make a green pumpkin that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(new Color(0x008000)); g2.draw(p2);
	
	// Here's a pumpkin that's 4x as big (2x the original)
	// and moved over 150 more pixels to right, and 50 pixels up.
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,50);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(p2); 
	
	// Draw two Jack O' Lanterns
	
	JackOLantern sp00ky1 = new JackOLantern(50,350,40,75);
	JackOLantern sp00ky2 = new JackOLantern(200,350,200,100);

	g2.setColor(new Color(0xFF9933)); g2.draw(sp00ky1);
	g2.draw(sp00ky1);
	g2.setColor(new Color(0xFF3300)); g2.draw(sp00ky2);
	
	// sign and label the drawing	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Sp00ky scary pumpkins by Colin Garrett", 20,20);
    }
    
    
    /** Draw a picture with a few more festive Halloween pumpkins
     */
    public static void drawPicture2(Graphics2D g2) {
	
	JackOLantern large = new JackOLantern(100,50,225,150);
	JackOLantern smallJack = new JackOLantern(20,50,40,30);
	JackOLantern tallSkinny = new JackOLantern(20,150,20,40);
	JackOLantern shortFat = new JackOLantern(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallJack);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.BLACK); g2.draw(shortFat);
	
	Pumpkin p1 = new Pumpkin(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(p1);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,4,4);
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
	
	// Draw two Jack O' Lanterns
	
	JackOLantern jol1 = new JackOLantern(50,350,40,75);
	JackOLantern jol2 = new JackOLantern(200,350,200,100);
	
	g2.draw(jol1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second Jack O' Lantern 45 degrees around its center.
	Shape jol3 = ShapeTransforms.rotatedCopyOf(jol2, Math.PI/4.0);
	
	g2.draw(jol3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Halloween plants by Colin Garrett", 20,20);
    }
    
    /** Draw a different picture with even more pumpkins and Jack O' Lanterns
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Muchas calabazas de Colin Garrett", 20,20);
	
	
	// draw some plants
	
	Pumpkin large = new Pumpkin(20,50,225,150);
	JackOLantern hughMungus = new JackOLantern(100,200,500,500);
	
	g2.setColor(Color.RED);     g2.draw(large);
	Stroke thick = new BasicStroke (6.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);    
	g2.setStroke(thick);
	g2.setColor(Color.GREEN);   g2.draw(hughMungus);
	
    }       
}
