package edu.ucsb.cs56.drawings.sswong.advanced;

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
 * @author Simon Wong 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few trees
     */
    
    public static void drawPicture1(Graphics2D g2) {
		
	// labeling the drawing
	g2.drawString("Some trees by Simon Wong",20,20);

	// draw three trees
	Tree t1 = new Tree(20,50,100,25,50);
	Tree t2 = new Tree(250,75,75,20,30);
	Tree t3 = new Tree(200,220,50,40,25);
	    
	// rotated 45 degrees around center
	Shape t4 = ShapeTransforms.rotatedCopyOf(t2, Math.PI/4.0);
	g2.setColor(Color.GREEN);
	g2.draw(t1);
	g2.setColor(Color.BLUE);
	g2.draw(t2);
	g2.setColor(Color.RED);
	g2.draw(t3);
	g2.setColor(Color.BLACK);
	g2.draw(t4);
	    
	
	// Make a black tree that's half the size of t4, 
	// and moved over 150 pixels in x direction
	
	Shape t5 = ShapeTransforms.scaledCopyOfLL(t4,0.5,0.5);
	t5 = ShapeTransforms.translatedCopyOf(t5,150,0);
	g2.setColor(Color.BLACK); 
	g2.draw(t5);
	
	// Here's a tree that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	t5 = ShapeTransforms.scaledCopyOfLL(t5,4,4);
	t5 = ShapeTransforms.translatedCopyOf(t5,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(t5); 
    }
    
    
    /** Draw a picture with some trees with fruits
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// labeling the drawing
	g2.drawString("Some trees with fruits by Simon Wong",20,20);

	// draw three trees with fruits
	TreeWithFruits twf1 = new TreeWithFruits(20,50,100,25,50);
	TreeWithFruits twf2 = new TreeWithFruits(250,75,75,20,30);
	TreeWithFruits twf3 = new TreeWithFruits(200,220,50,40,25);
	g2.setColor(Color.GREEN);
	g2.draw(twf1);
	g2.setColor(Color.BLACK);
	g2.draw(twf2);
	g2.setColor(Color.PINK);
	g2.draw(twf3);
	
	// Make an orange tree that's half the size of twf3, 
	// and moved over 150 pixels in x direction
	Shape twf4 = ShapeTransforms.scaledCopyOfLL(twf3,0.5,0.5);
	twf4 = ShapeTransforms.translatedCopyOf(twf4,150,0);
	g2.setColor(Color.ORANGE); g2.draw(twf4);
	
	// Here's a tree that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	twf4 = ShapeTransforms.scaledCopyOfLL(twf4,4,4);
	twf4 = ShapeTransforms.translatedCopyOf(twf4,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(twf4); 
	
	// draw a 180 rotated twf4
	Shape twf5 = ShapeTransforms.rotatedCopyOf(twf4, Math.PI/2.0);
	g2.draw(twf5);
	
    }
    
     /** Draw a picture with some trees, some with fruit
     */
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Some green trees by Simon Wong", 20,20);
	
	// Draw some trees.
	
	Tree t1 = new Tree(50,50,100,25,50);
	Tree t2 = new TreeWithFruits(250,50,100,25,50);
	Tree t3 = new Tree(450,50,100,25,50);
	Tree t1 = new TreeWithFruits(50,150,100,25,50);
	Tree t2 = new Tree(250,150,100,25,50);
	Tree t3 = new TreeWithFruits(450,150,100,25,50);
	
	g2.setColor(Color.GREEN);   
	g2.draw(t1);
	g2.draw(t2);
	g2.draw(t3);
	g2.draw(t4);
	g2.draw(t5);
	g2.draw(t6);
    }    
}
