package edu.ucsb.cs56.drawings.ctc.advanced;

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
 * @author Chantel Chan
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few trees 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Tree h1 = new Tree(100,200,50,75);
	g2.setColor(new Color(0x194D00)); g2.draw(h1); //dark green regular tree
	
	// Make a red tree that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(new Color(0x990000)); g2.draw(h2); //red tree
	
	// Here's a tree that's 4x as big (2x the original)
	// and moved over 200 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,200,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x00E673)); //green tree
	g2.draw(h2); 
	
	// Draw two Xmas Trees
	
	ChristmasTree hw1 = new ChristmasTree(50,350,40,75);
	ChristmasTree hw2 = new ChristmasTree(200,300,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0xFF9999)); g2.draw(hw2); //pink Xmas Tree
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(new Color(0xFF9933)); //orange font
	g2.drawString("Premature Christmas decorating is an epidemic. -Chantel Chan", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some irregular sized trees.
	
	Tree large = new Tree(100,50,225,150);
	Tree small = new Tree(20,50,40,30);
	Tree tallSkinny = new Tree(20,150,20,40);
	Tree shortFat = new Tree(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Tree h1 = new Tree(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black tree that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a tree that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw Xmas Trees
	
	ChristmasTree hw1 = new ChristmasTree(50,350,40,75);
	ChristmasTree hw2 = new ChristmasTree(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x3D5C43)); //Dark Green
	
	// Rotate the first and second trees 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	Shape hw4 = ShapeTransforms.rotatedCopyOf(hw1, 7.0 * Math.PI/4.0);
	g2.draw(hw3);
	g2.draw(hw4);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Santa accidentally rode his sleigh through the forest, by Chantel Chan", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A regular ol' primary trees", 20,20);
	
	
	// Draw some different sized trees
	
	Tree large = new Tree(100, 100, 150, 250);
	Tree medium = new Tree(70, 70, 50, 100);
	Tree small = new Tree(20,20,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.YELLOW);  g2.draw(medium);
	g2.setColor(Color.BLUE);   g2.draw(small);
	
    }       
}
