package edu.ucsb.cs56.drawings.mlobins.advanced;

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
 * @author Miclos Lobins 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    
    public static void drawPicture1(Graphics2D g2) {

	/**
	 *   @param g2 input
	 */
	
	SquareAngles s1 = new SquareAngles(50,125,25);
	g2.setColor(Color.PINK); g2.draw(s1);
	
	// Make a blue SquareAngle that is twice the size, 
	// and moved over 250 pixels in x direction
	
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,2,2);
	s2 = ShapeTransforms.translatedCopyOf(s2,250,0);
	g2.setColor(Color.BLUE); g2.draw(s2);
	
	// Here is a SquareAngle that is 0.125 as big (0.25x the original)
	// and moved over 250 more pixels to right.
	s2 = ShapeTransforms.scaledCopyOfLL(s2,0.25,0.25);
	s2 = ShapeTransforms.translatedCopyOf(s2,250,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (8.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0xFF2FA7)); 
	g2.draw(s2); 
	
	// Draw two SquareAngles with Arrows
	
	Arrow a1 = new Arrow(60,175,80);
	Arrow a2 = new Arrow(270,400,150);
	
	g2.draw(a1);
	g2.setColor(new Color(0x8FFFFF)); g2.draw(a2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few Arrows and SquareAngles by Miclos Lobins", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {

       	/**
	 *   @param g2 input
	 */
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (6.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);

	// Draw some Arrow.
	
	Arrow a0 = new Arrow(400,50,100);
	Arrow a1 = new Arrow(20,50,80);
	Arrow a2 = new Arrow(60,150,75);
	Arrow a3 = new Arrow(100,250,120);
	
	g2.setColor(Color.BLUE);     g2.draw(a0);
	g2.setColor(Color.ORANGE);   g2.draw(a1);
	g2.setColor(Color.GREEN);    g2.draw(a2);
	g2.setColor(Color.PINK); g2.draw(a3);
        
	// Rotate an arrow by 90 degrees and change size by 0.5x
	Shape ar1 = ShapeTransforms.rotatedCopyOf(a1, Math.PI/2.0);
	ar1 = ShapeTransforms.scaledCopyOfLL(ar1,0.5,0.5);
	ar1 = ShapeTransforms.translatedCopyOf(ar1,250,0);
	g2.setColor(Color.ORANGE);
	g2.draw(ar1);
	
	//Rotate an arrow by 180 degrees and change size by 0.5x
	Shape ar2 = ShapeTransforms.rotatedCopyOf(a2, Math.PI);
	ar2 = ShapeTransforms.scaledCopyOfLL(ar2,0.5,0.5);
	ar2 = ShapeTransforms.translatedCopyOf(ar2,250,0);
	g2.setColor(Color.GREEN);
	g2.draw(ar2);
	
	//Rotate an arrow by 270 degrees and change size by 0.5x
	Shape ar3 = ShapeTransforms.rotatedCopyOf(a3, Math.PI*1.5);
	ar3 = ShapeTransforms.scaledCopyOfLL(ar3,0.5,0.5);
	ar3 = ShapeTransforms.translatedCopyOf(ar3,250,0);
	g2.setColor(Color.PINK);
	g2.draw(ar3);

	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Arrows and a few SquareAngles by Miclos Lobins", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
     public static void drawPicture3(Graphics2D g2) {

       	/**
	 *   @param g2 input
	 */
	
	
	// label the drawing
	
	g2.drawString("TEST by MICLOS LOBINS", 20,20);
	
	
	// Draw some Arrows.
	
	Arrow test0 = new Arrow(50,50,100);
	Arrow test1 = new Arrow(50,100,100);
	Arrow test2 = new Arrow(50,150,100);
	Arrow test3 = new Arrow(50,200,100);
	Arrow test4 = new Arrow(50,250,100);
	Arrow test5 = new Arrow(50,300,100);

	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	g2.setStroke(thick);
	g2.setColor(Color.RED);     g2.draw(test0);
	g2.setColor(Color.ORANGE);     g2.draw(test1);
	g2.setColor(Color.YELLOW);     g2.draw(test2);
	g2.setColor(Color.GREEN);     g2.draw(test3);
	g2.setColor(Color.BLUE);     g2.draw(test4);
	g2.setColor(Color.MAGENTA);     g2.draw(test5);
	
    }       
}
