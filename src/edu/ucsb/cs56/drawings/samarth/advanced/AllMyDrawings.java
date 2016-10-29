package edu.ucsb.cs56.drawings.samarth.advanced;

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
 * @author Phill Conrad, Samarth Goyal 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few shirts 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	TShirt h1 = new TShirt(70,150,100);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black shirt that's half the size, 
	// and moved over 200 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,-50);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	Stroke orig=g2.getStroke();
	
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two Shirts with Buttons
	
	TShirtWithButtons hw1 = new TShirtWithButtons(350,150,100);
	TShirtWithButtons hw2 = new TShirtWithButtons(200,250,130);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	
     
	g2.drawString("A few Tshirts by Samarth Goyal", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some TShirts with Buttons.
	
	TShirtWithButtons big = new TShirtWithButtons(150,50,225);
	TShirtWithButtons small = new TShirtWithButtons(20,50,40);
	TShirtWithButtons medium = new TShirtWithButtons(20,200,100);
	
	
	g2.setColor(Color.RED);     g2.draw(big);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(medium);
	
	//Make a regular TShirt

	TShirt t1 = new TShirt(210,100,50);
	g2.setColor(Color.CYAN); g2.draw(t1);
	
	// Here's a shirt that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	Shape t2 = ShapeTransforms.scaledCopyOfLL(t1,4,4);
	t2 = ShapeTransforms.translatedCopyOf(t2,150,150);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	 
	
	
	// Rotate the second shirt 45 degrees around its center.
	t2 = ShapeTransforms.rotatedCopyOf(t2, Math.PI/4.0);
	g2.draw(t2);
	
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Shirts by Samarth Goyal", 20,20);
    }
    
    /** Draw a picture of a regular shirt reflected with a shirt with buttons.
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A reflection of a shirt by Samarth Goyal", 20,20);
	
	
	// Draw a shirt
	
	TShirt shirt = new TShirt(150,150,100);
	g2.setColor(Color.RED);     g2.draw(shirt);

	Shape shirt2 = new TShirtWithButtons(150,300,100);
	shirt2 = ShapeTransforms.rotatedCopyOf(shirt2, Math.PI);
	g2.setColor(Color.BLUE);    g2.draw(shirt2);
	
    }       
}
