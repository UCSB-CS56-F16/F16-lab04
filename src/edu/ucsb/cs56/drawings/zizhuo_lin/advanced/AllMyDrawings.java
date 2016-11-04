package edu.ucsb.cs56.drawings.zizhuo_lin.advanced;

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
 * @author Zizhuo Lin 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few Bathtubs 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Bathtub b1 = new Bathtub(100,100,100,75);
	g2.setColor(Color.CYAN); g2.draw(b1);
	
	// Make a black bathtub that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	// Here's a Bathtub that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2); 
	
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few bathtub by Zizhuo Lin", 20,20);
    }
    
    
    /** Draw a picture with a few SpaBathtubs
     */
    public static void drawPicture2(Graphics2D g2) {
	
	SpaBathtub b1 = new SpaBathtub(100,100,100,75);
	g2.setColor(Color.CYAN); g2.draw(b1);
	
	//Make a second SpaBathtub with different ratio
	SpaBathtub b2 = new SpaBathtub(250, 50, 150, 75);
	g2.setColor(Color.BLACK); g2.draw(b2);
	

	
	//Rotate the second SpaBathtub 90 degrees around its center.
	Shape b3 = ShapeTransforms.rotatedCopyOf(b2, Math.PI/2.0);
	b3 = ShapeTransforms.translatedCopyOf(b3, 0 , 300);
	g2.setColor(Color.RED);
	g2.draw(b3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setColor(Color.BLACK); 
	g2.drawString("A few Bathtubs by Zizhuo Lin", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A combination of Bathtub and SpaBatub by Zizhuo Lin", 20,20);
	
	
	// Draw a Bathtub and a SpaBathtub.
	Bathtub bt = new Bathtub(100, 100, 300, 160);
	SpaBathtub sbt = new SpaBathtub(100 , 300 , 200, 110);  
	g2.setColor(Color.RED);     g2.draw(bt);
	g2.setColor(Color.GREEN);   g2.draw(sbt);
	
    }       
}
