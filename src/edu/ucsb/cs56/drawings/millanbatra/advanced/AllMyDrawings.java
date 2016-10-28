package edu.ucsb.cs56.drawings.millanbatra.advanced;

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
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Drum d1 = new Drum(50,150,30,40);
	g2.setColor(Color.CYAN); g2.draw(d1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape d2 = ShapeTransforms.scaledCopyOfLL(d1,0.4,0.4);
	d2 = ShapeTransforms.translatedCopyOf(d2,150,0);
	g2.setColor(Color.GREEN); g2.draw(d2);
	
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
	
	// Draw two houses with Windows
	
	/*	HouseWithWindows hw1 = new HouseWithWindows(50,350,40,75);
	HouseWithWindows hw2 = new HouseWithWindows(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);*/
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A drum or two by Millan Batra", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some coffee cups.
	
	
	//g2.setColor(Color.RED);     g2.draw(large);
	//g2.setColor(Color.GREEN);   g2.draw(smallCC);
	//g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	//g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Drum d1 = new Drum(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(d1);
	
	// Make a drum that's half the size, 
	// and moved over 150 pixels in x direction
	Shape d2 = ShapeTransforms.scaledCopyOfLL(d1,0.5,0.5);
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
	
	// Draw two houses with Windows
	
	DrumTwo dtwo1 = new DrumTwo(50,350,40,75);
	//HouseWithWindows hw2 = new HouseWithWindows(200,350,200,100);
	
	g2.draw(dtwo1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	//Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	//g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Drums2 Millan Batra", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Drums1 by Millan Batra", 20,20);
	
	
	// Draw some coffee cups.
	
   
    }       
}
