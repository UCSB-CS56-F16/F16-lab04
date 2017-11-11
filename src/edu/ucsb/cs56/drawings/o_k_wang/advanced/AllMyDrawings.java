package edu.ucsb.cs56.drawings.o_k_wang.advanced;

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
 * @author Oscar Wang
 * @version for UCSB CS56, W17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few fire pits 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	FirePit h1 = new FirePit(50,200,300,300);
	g2.setColor(Color.CYAN);
	g2.draw(h1);
	
	// Make a black fire pit that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	//h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK);
	g2.draw(h2);
	
	// Here's a fire pit that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	//h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4); 
	h2 = ShapeTransforms.scaledCopyOfLL(h2,2,2);
        //h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
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
       
	
	// Draw two fire pits with camp fires 
	
	//CampFire hw1 = new CampFire(50.0,200,100,200);
       	CampFire hw1 = new CampFire(50.0,200,1000,900);
	CampFire hw2 = new CampFire(200,200,1000,1500);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few fire pits by Oscar Wang", 20,20);
    }
    
    
    /** Draw a picture with a few fire pits  and camp fires
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some camp fires.
	
	CampFire large = new CampFire(100,50,225,150);
	CampFire smallCC = new CampFire(20,50,40,30);
	CampFire tallSkinny = new CampFire(20,150,20,40);
	CampFire shortFat = new CampFire(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	FirePit h1 = new FirePit(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black fire pit that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a fire pit that's 4x as big (2x the original)
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
	
	// Draw two fire pits  with camp fires
	
	CampFire hw1 = new CampFire(50,350,40,75);
	CampFire hw2 = new CampFire(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of camp fires and a few fire pits by Oscar Wang", 20,20);
    }
    
    /** Draw a different picture with a few fire pits and camp fires
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of camp fires by Oscar Wang", 20,20);
	
	
	// Draw some camp fires.
	
	//CampFire large = new CampFire(100,50,225,150);
	CampFire large = new CampFire(100,50,975,900);
	// CampFire smallCC = new CampFire(20,50,40,30);
	CampFire smallCC = new CampFire(20,50,900,800);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }       
}
