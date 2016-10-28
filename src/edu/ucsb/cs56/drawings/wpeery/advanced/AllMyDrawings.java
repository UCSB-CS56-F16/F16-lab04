package edu.ucsb.cs56.drawings.wpeery.advanced;

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
 * @author Wesley Peery
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	BowlingBall b1 = new BowlingBall(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(b1);
	
	// Make a black ball that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	// Here's a ball that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2); 
	
	// Draw two houses with Windows
	
	Ball ball1 = new Ball(50,350,40);
	Ball ball2 = new Ball(200,350,100);
	
	g2.draw(ball1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(ball2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few balls and bowling balls by Wesley Peery", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// A bowling ball made from bowling balls
	double x = 400;
	double y = 700;
	double r = 200;
	g2.setColor(new Color(0x8F00FF));
	Ball ball = new Ball(x,y,r);
	g2.draw(ball);
	BowlingBall b1 = new BowlingBall(x + r/5, y -r/2, r/8);
	BowlingBall b2 = new BowlingBall(x,y,r/8);
	shape b3 = ShapeTransforms.translatedCopyOf(b1,r,0);
	// Rotate the balls
	Shape b3 = ShapeTransforms.rotatedCopyOf(b3, Math.PI/4.0);
	Shape b1 = ShapeTransforms.rotatedCopyOf(b1, Math.PI/2.0);
	g2.draw(b3);
	g2.draw(b2);
	g2.draw(b1);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Inception by Wesley Peery", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Coffee Cups by Phill Conrad", 20,20);
	
	
	// Draw some coffee cups.
	
	CoffeeCup large = new CoffeeCup(100,50,225,150);
	CoffeeCup smallCC = new CoffeeCup(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }       
}
