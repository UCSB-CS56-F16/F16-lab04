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
	double x = 325;//only need to initialize these values
	double y = 225;
	double r = 200;

	g2.setColor(new Color(0x8F00FF));
	Ball ball = new Ball(x,y,r);
	g2.draw(ball);//draws the shell
	BowlingBall b1 = new BowlingBall(x,y,r/8);
	// put b2 and b3 in the correct positions
	Shape b2 = ShapeTransforms.translatedCopyOf(b1,r/5,-r/2);
	Shape b3 = ShapeTransforms.translatedCopyOf(b1,-r/5,-r/2);
	// Rotate the b3 and b2
	b3 = ShapeTransforms.rotatedCopyOf(b3, Math.PI/4.0);
	b2 = ShapeTransforms.rotatedCopyOf(b2, Math.PI/2.0);
	// draw the bowling balls
	g2.draw(b3);
	g2.draw(b2);
	g2.draw(b1);

	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	Stroke orig=g2.getStroke();
	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("Inception by Wesley Peery", 20,20);
    }

    /** Draw a different picture with a few houses and coffee cups
     */

    public static void drawPicture3(Graphics2D g2) {
	// A bowling ball in motion, with arrows
	Stroke orig=g2.getStroke();
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	g2.setStroke(thick);

	double x = 150;  // initial values (you only need to adjust these values to adjust the drawing)
	double y = 200;
	double r = 50;
	int numBalls = 6;// end initial values

	g2.setColor(new Color(0x3355FF));
	BowlingBall ball = new BowlingBall(x,y,r);
	g2.draw(ball);
	double degree = 0;

	//draw bowling balls
	for(int i=1; i<numBalls; i++){
	    x+= 200;// how far away each ball is from each other
	    degree += 2*Math.PI/numBalls;//The amount each ball is to be rotated through each iteration
	    Shape b = ShapeTransforms.rotatedCopyOf(ball, degree);// rotate the bowling ball
	    b = ShapeTransforms.translatedCopyOf(b,x-150,0);/*the x is subtracted by a flat 150 to get rid 
							      of the initial x value (see line 105)*/
	    g2.draw(b);
	}

	// Using a house as an arrow to show which way the ball is moving
	double arrowY = y - r/2;
	double arrowWidth = r/3;
	double arrowHeight = r;
	double degreeArrow = Math.PI/2;
	x = x - r*17/8;// this makes sure the arrow is in the center of the space between each ball
	for(int i=0; i<numBalls-1; i++){
	    House arrow = new House(x,arrowY,arrowWidth,arrowHeight);
	    Shape arrowRotated = ShapeTransforms.rotatedCopyOf(arrow,degreeArrow);//rotate arrow 90 degrees
	    g2.draw(arrowRotated);
	    x = x - 200;// using the same x as last time so this time it must be decreased
	}

	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("Motion by Wesley Peery", 20,20);
    }
}
