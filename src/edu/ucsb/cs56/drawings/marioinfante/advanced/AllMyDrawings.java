package edu.ucsb.cs56.drawings.marioinfante.advanced;

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
    /** Draw a picture with a few stars
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Star s1 = new Star(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(s1);
	
	// Make a black star that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);
	
	// Here's a star that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(s2); 
	
	// Draw two Staryu's
	
	Staryu sy1 = new Staryu(50,350,40,75);
	Staryu sy2 = new Staryu(200,350,200,100);
	
	g2.draw(sy1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(sy2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few stars and Staryu's by Mario Infante", 20,20);
    }
    
    
    /** Draw a picture with a few stars and Staryu's
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some Staryu's.
	
	Staryu large = new Staryu(100,50,225,150);
	Staryu smallCC = new Staryu(20,50,40,30);
	Staryu tallSkinny = new Staryu(20,150,20,40);
	Staryu shortFat = new Staryu(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Star s1 = new Star(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(s1);
	
	// Make a black star that's half the size, 
	// and moved over 150 pixels in x direction
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);
	
	// Here's a star that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(s2); 
	
	// Draw two Staryu's
	
	Staryu sy1 = new Staryu(50,350,40,75);
	Staryu sy2 = new Staryu(200,350,200,100);
	
	g2.draw(sy1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape sy3 = ShapeTransforms.rotatedCopyOf(sy2, Math.PI/4.0);
	
	g2.draw(sy3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Stars and Staryu's by Mario Infante", 20,20);
    }
    
    /** Draw a different picture with a few Stars and Staryu's
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Stars by Mario Infante", 20,20);
	
	
	// Draw some stars,
	
	Star large = new Star(100,50,225,150);
	Star smallCC = new Star(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
	
    }       
}
