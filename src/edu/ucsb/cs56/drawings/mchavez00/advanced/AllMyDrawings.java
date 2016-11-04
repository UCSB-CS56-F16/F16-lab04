package edu.ucsb.cs56.drawings.mchavez00.advanced;

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
    /** Draw a picture with a few California Helmets deformed really tall or really wide except for one 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	CaliHelmet h1 = new CaliHelmet(100,250,50,352);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black California Helmet that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a California Helmet that's 4x as big (2x the original)
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
	
	// Draw two California Helmets 
	
	CaliHelmet hw1 = new CaliHelmet(50,120,500,75);
	CaliHelmet hw2 = new CaliHelmet(200,250,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few deformed California Helmets by Marco Chavez", 20,20);
    }
    
    
    /** Draw a picture with a few California Helmets include two back to back
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some California Helmets.
	
	CaliHelmet large = new CaliHelmet(100,50,225,150);
	CaliHelmet smallCH = new CaliHelmet(20,50,40,30);
	CaliHelmet tallSkinny = new CaliHelmet(20,150,20,40);
	CaliHelmet shortFat = new CaliHelmet(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCH);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	CaliHelmet h1 = new CaliHelmet(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black California Helmet that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a California Helmet that's 4x as big (2x the original)
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
	
	// Draw two California Helmets back to back 
	
	CaliHelmet hw1 = new CaliHelmet(50,350,40,75);
	CaliHelmet hw2 = new CaliHelmet(200,300,200,100);
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	Shape hw6 = ShapeTransforms.horizontallyFlippedCopyOf(hw2);
	g2.draw(hw2);
	g2.setColor(new Color(0xD3212D)); 
	g2.draw(hw6);
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of California Helmets including a horizontally flipped helmet by Marco Chavez", 20,20);
    }
    
    /** Draw a different picture with a few California Helmets increasing in size
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of California Helmets in increasing size and changing colors by Marco Chavez", 100,20);
	
	
	// Draw some California Helmets.
	CaliHelmet smallCH = new CaliHelmet(50,50,60,40);
	CaliHelmet large   = new CaliHelmet(100,70,100,80);
	CaliHelmet large1   = new CaliHelmet(180,120,200,150);
	CaliHelmet smallCH1 = new CaliHelmet(300,200,300,230);

	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCH);
	g2.setColor(Color.BLUE);     g2.draw(large1);
	g2.setColor(Color.CYAN);   g2.draw(smallCH1);
    }       
}
