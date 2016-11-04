package edu.ucsb.cs56.drawings.klong.advanced;

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
	
	TShirt T1 = new TShirt(150,150,50,50,15,15);
	g2.setColor(Color.CYAN); g2.draw(T1);
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape T2 = ShapeTransforms.scaledCopyOfLL(T1,0.5,0.5);
	T2 = ShapeTransforms.translatedCopyOf(T2,150,0);
	g2.setColor(Color.BLACK); g2.draw(T2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	T2 = ShapeTransforms.scaledCopyOfLL(T2,4,4);
	T2 = ShapeTransforms.translatedCopyOf(T2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(T2); 
	
	// Draw two houses with Windows
	
	TShirtWithLogo TWL1 = new TShirtWithLogo(150,150,50,50,7,7);
	TShirtWithLogo TWL2 = new TShirtWithLogo(300,300,50,50,7,7);
	
	g2.draw(TWL1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(TWL2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few shirts by Keith Long", 20,40);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
  
	TShirt large = new TShirt(150,150,100,100,30,30);
	TShirt small = new TShirt(30,30,25,25,8,8);
	TShirt tallSkinny = new TShirt(40,40,20,50,10,10);
	TShirt shortFat = new TShirt(180,180,50,20,10,15);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	TShirt t1 = new TShirt(30,30,25,25,10,10);
	g2.setColor(Color.CYAN); g2.draw(t1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	Shape t2 = ShapeTransforms.scaledCopyOfLL(t1,0.5,0.5);
	t2 = ShapeTransforms.translatedCopyOf(t2,150,0);
	g2.setColor(Color.BLACK); g2.draw(t2);
	
	// Here's a house that's 4x as big (2x the original)
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
	
	// Draw two houses with Windows
	
	TShirtWithLogo hw1 = new TShirtWithLogo(150,150,50,50,7,7);
	TShirtWithLogo hw2 = new TShirtWithLogo(300,300,50,50,7,7);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of T-Shirts by Keith Long", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of T- Shirts by Keith Long", 20,20);
	
	// Draw some coffee cups.	
	TShirt large = new TShirt(150,150,50,50,15,15);
	TShirt small = new TShirt(40,40,25,25,8,8);

	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	
    }       
}
