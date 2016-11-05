package edu.ucsb.cs56.drawings.jingyi_liao.advanced;

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
 * @author Jingyi Liao
 * @version for UCSB CS56, F16, lab4 
 */

public class AllMyDrawings
{
    /** version1: different color; different size; different position
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	TV t1 = new TV(100,250,50,75);
	g2.setColor(Color.CYAN); 
  g2.draw(t1);
	
	// Make a black TV that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape t2 = ShapeTransforms.scaledCopyOfLL(t1,0.5,0.5);
	t2 = ShapeTransforms.translatedCopyOf(t2,150,0);
	g2.setColor(Color.BLACK); 
  g2.draw(t2);
	
	// Here's a TV that's 4x as big (2x the original)
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
	
	// Draw two TVs with buttons
	
	TVWithButton tb1 = new TVWithButton(50,350,40,75);
	TVWithButton tb2 = new TVWithButton(200,350,200,100);
	
	g2.draw(tb1);
	g2.setColor(new Color(0x8F00FF)); 
  g2.draw(tb2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few TVs by Jingyi Liao, version1: different color; different size; different position", 20,20);
    }
    
    
    /** version2: TV translated; rotated; scaled
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some TVs.
	
	TV t1 = new TV(100,250,225,150);
	TV t2 = new TV(20,250,40,30);
	
	g2.setColor(Color.RED);     g2.draw(t1);
	g2.setColor(Color.GREEN);   g2.draw(t2);
	
	
	// Make a black TV that's half the size, 
	// and moved over 150 pixels in x direction
	Shape t3 = ShapeTransforms.scaledCopyOfLL(t1,0.5,0.7);
	t3 = ShapeTransforms.translatedCopyOf(t3,250,30);
	g2.setColor(Color.BLACK); g2.draw(t3);
	
	// Here's a TV that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	Shape t4 = ShapeTransforms.scaledCopyOfLL(t2,4,4);
	t4 = ShapeTransforms.translatedCopyOf(t4,150,-30);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(t4); 
	
	
	// Rotate the second house 45 degrees around its center.
	Shape t5 = ShapeTransforms.rotatedCopyOf(t2, Math.PI/4.0);
  t5 = 	ShapeTransforms.translatedCopyOf(t5,0,30);
 
	g2.draw(t5);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few TVs by Jingyi Liao, version2: translated; rotated; scaled", 20,20);
    }
    
    /** version3: the same red color TVWithButtons rotated
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	g2.setColor(Color.RED);
	g2.drawString("A few TVWithButtons by Jingyi Liao, version3: red TV with button rotated!", 20,20);
	
	
 	// Draw a TV with buttons
	
	TVWithButton tb1 = new TVWithButton(50,350,40,75);
	
	g2.draw(tb1);
 
 Shape tb2 = ShapeTransforms.rotatedCopyOf(tb1, Math.PI/4.0);
 tb2 = 	ShapeTransforms.translatedCopyOf(tb2,100,-200);
 g2.draw(tb2); 
 
 Shape tb3 = ShapeTransforms.rotatedCopyOf(tb1, Math.PI/2.0);
 tb3 = 	ShapeTransforms.translatedCopyOf(tb3,300,-300);
 g2.draw(tb3);
    }       
}
