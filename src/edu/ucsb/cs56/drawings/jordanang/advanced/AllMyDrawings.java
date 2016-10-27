package edu.ucsb.cs56.drawings.jordanang.advanced;

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
 * @author Jordan Ang (Changed Methods)
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    
    public static void drawPicture1(Graphics2D g2) {
	
	//Draw two large BobOmbs
	BobOmb hw1 = new BobOmb(300,150,200);
	BobOmb hw2 = new BobOmb(300,150,200);
	
	g2.setColor(new Color(0x000000));
	Shape flippedhw1 = ShapeTransforms.horizontallyFlippedCopyOf(hw1);
	g2.draw(flippedhw1);
	g2.setColor(new Color(0x0C8A1F));
	g2.draw(hw2);

	//Make smaller bombs for the background

	//Make yellow bomb with diameter of 75 pixels
	Bomb h1 = new Bomb(300,50,75);
	Shape h1Copy = ShapeTransforms.rotatedCopyOf(h1, Math.toRadians(-10));
	g2.setColor(Color.YELLOW); g2.draw(h1Copy);
	
	//Make a blue bomb scaled 0.5 and shift 150 pixels right
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	h2 = ShapeTransforms.rotatedCopyOf(h2, Math.toRadians(30));
	g2.setColor(Color.BLUE); g2.draw(h2);
	
	// Make a bomb 2x as big and shift it 200 pixels right and 200 down
	Shape h3 = ShapeTransforms.scaledCopyOfLL(h1,2,2);
	h3 = ShapeTransforms.translatedCopyOf(h3,200,200);
	h3 = ShapeTransforms.rotatedCopyOf(h3, Math.toRadians(-30));
	g2.setColor(Color.RED); g2.draw(h3);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Power Bombers by Jordan Ang", 20,20);
    }
    
    
    /** Draw a picture with a bombs and Bob-ombs
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some Bob-ombs
	
	BobOmb large = new BobOmb(100,50,225);
	BobOmb smallCC = new BobOmb(20,50,40);
	BobOmb tallSkinny = new BobOmb(20,150,20);
	BobOmb shortFat = new BobOmb(20,250,130);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Bomb h1 = new Bomb(100,250,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a bob-omb that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a bob-omb that's 4x as big (2x the original)
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
	
	// Draw two Bob-omb
	
	BobOmb hw1 = new BobOmb(50,350,40);
	BobOmb hw2 = new BobOmb(200,350,200);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second Bob-omb 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("If Bob-Omb had a Music Video by Jordan Ang", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("King Bob-omb and Friends by Jordan Ang", 20,20);
	
	//Draw a large bob-omb
	BobOmb large = new BobOmb(150,50,300);

	Bomb small1 = new Bomb(20,50,40);
	Bomb small2 = new Bomb(100,50,100);
	Bomb small3 = new Bomb(20,200,80);
	Bomb small4 = new Bomb(500,250,100);
	Bomb small5 = new Bomb(360,50,70);
	Bomb small6 = new Bomb(500,60,80);
	Bomb small7 = new Bomb(450,150,40);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.BLUE);   g2.draw(small1);
	g2.setColor(Color.YELLOW);   g2.draw(small2);
	g2.setColor(Color.ORANGE);   g2.draw(small3);
	g2.setColor(Color.CYAN);   g2.draw(small4);
	g2.setColor(Color.MAGENTA);   g2.draw(small5);
	g2.setColor(Color.PINK);   g2.draw(small6);
	g2.setColor(Color.GREEN);   g2.draw(small7);
	
    }       
}
