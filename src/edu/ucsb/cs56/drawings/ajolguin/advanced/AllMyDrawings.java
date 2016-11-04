package edu.ucsb.cs56.drawings.ajolguin.advanced;

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
 * @author Adrian Olguin 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Ball b1 = new Ball(100,250,50);
	g2.setColor(Color.RED); g2.draw(b1);
	
	// Make a black ball that's half the size, 
	// and moved over 175 pixels in x direction
	
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,175,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	// Here's a ball that's 5x as big (2x the original)
	// and moved over 100 more pixels to right.
	b2 = ShapeTransforms.scaledCopyOfLL(b2,5,5);
	b2 = ShapeTransforms.translatedCopyOf(b2,100,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #0048BA is "Absolute Zero" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x0048BA)); 
	g2.draw(b2); 
	
	// Draw two beach balls
	
	BeachBall bb1 = new BeachBall(200, 200, 50);
	BeachBall bb2 = new BeachBall(300, 350, 50);
	
	g2.draw(bb1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(bb2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few Balls and Beach Balls by Adrian Olguin", 20,20);
    }
    
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some Beach Balls.
	
	BeachBall large = new BeachBall(200,170,125);
	BeachBall smallBB = new BeachBall(80,80,40);
	BeachBall tallSkinny = new BeachBall(40,150,25);
	BeachBall shortFat = new BeachBall(410,350,100);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallBB);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Ball b1 = new Ball(100,250,50);
	g2.setColor(Color.RED); g2.draw(b1);
	
	// Make a black ball that's half the size, 
	// and moved over 175 pixels in x direction
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,175,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	// Here's a ball that's 5x as big (2x the original)
	// and moved over 100 more pixels to right.
	b2 = ShapeTransforms.scaledCopyOfLL(b2,5,5);
	b2 = ShapeTransforms.translatedCopyOf(b2,100,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #0048BA is "Absolute Zero" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x0048BA)); 
	g2.draw(b2); 
	
	// Draw two Beach Balls
	
	BeachBall hw1 = new BeachBall(150,350,40);
	BeachBall hw2 = new BeachBall(110,350,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second ball 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Balls and Beach Balls by Adrian Olguin", 20,20);
    }
    
    /** Draw a different picture with a Beach Balls
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Beach Balls by Adrian Olguin", 20,20);
	
	
	// Draw some coffee cups.
	
	BeachBall large = new BeachBall(300,200,150);
	BeachBall small = new BeachBall(100,100,40);
	
	g2.setColor(Color.RED); g2.draw(large);
	g2.setColor(Color.GREEN); g2.draw(small);

	Shape hw1 = ShapeTransforms.rotatedCopyOf(large, Math.PI/18);
	Shape hw2 = ShapeTransforms.rotatedCopyOf(large, Math.PI*2/18);
	g2.setColor(Color.BLACK); g2.draw(hw1);
	g2.setColor(Color.ORANGE); g2.draw(hw2);
	Shape hw3 = ShapeTransforms.rotatedCopyOf(large, Math.PI*3/18);
	g2.setColor(Color.BLUE); g2.draw(hw3);
	Shape hw4 = ShapeTransforms.rotatedCopyOf(large, Math.PI*4/18);
	g2.setColor(Color.GREEN); g2.draw(hw4);
	Shape hw5 = ShapeTransforms.rotatedCopyOf(large, Math.PI*5/18);
	g2.setColor(Color.PINK); g2.draw(hw5);
	

	BeachBall b = new BeachBall(110, 350, 40);
	g2.setColor(Color.CYAN);
	g2.draw(b);
	BeachBall x = new BeachBall(500, 350, 40);
	g2.setColor(Color.MAGENTA);
	g2. draw(x);
	BeachBall y = new BeachBall(500, 100, 40);
	g2.setColor(Color.BLACK);
	g2.draw(y);
	
    }       
}
