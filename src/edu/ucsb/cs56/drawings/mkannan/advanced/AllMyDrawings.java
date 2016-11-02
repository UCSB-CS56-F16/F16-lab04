package edu.ucsb.cs56.drawings.mkannan.advanced;

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
 * @author Edited for Bug class drawings by Madhu Kannan, CS56, F16
 */

public class AllMyDrawings
{
    /** Draw a picture with a few basic bugs. 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Bug b1 = new Bug(100,50,50,6);
	g2.setColor(Color.BLACK); 
	g2.draw(b1);
	
	// Make a magenta bug that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.MAGENTA); 
	g2.draw(b2);
	
	// Here's a bug that's 4x as big (2x the original)
	// and moved over 150 more pixels to right and 170 pixels down
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,170);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	//Madhu Kannan edit: new color set, NOT International Klein Blue
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(000, 102, 153)); 
	g2.draw(b2); 
	
	// Draw two more bugs, just because we can. 
	
	Bug b3  = new Bug(50,230,40,8);
	Bug b4 = new Bug(200,250,20,10);
	
	g2.draw(b3);
	g2.setColor(new Color(153, 102, 102)); 
	g2.draw(b4);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Bugs! A Study Of Creepy Crawlies That I Am Not Particularly Fond Of, by Madhu Kannan", 20,20);
    }
    
    
    /** Draw a picture with a few ladybugs
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some ladybugs.
	
	Ladybug large = new Ladybug(400,50,60);
	Ladybug small = new Ladybug(20,50,40);
	Ladybug tall = new Ladybug(200,150,20);
	Ladybug shorty = new Ladybug(325,250,40);
	
	g2.setColor(Color.RED);    
	g2.draw(large);
	g2.setColor(Color.GREEN);   
	g2.draw(small);
	g2.setColor(Color.BLUE);    
	g2.draw(tall);
	g2.setColor(Color.MAGENTA); 
	g2.draw(shorty);
	
	/*Ladybug b1 = new Ladybug(100,250,50,6);
	g2.setColor(Color.CYAN); 
	g2.draw(h1);*/
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	/*Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);*/
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	/*h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);*/       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	//g2.setStroke(thick);
	//g2.setColor(new Color(0x002FA7)); 
	//g2.draw(h2); 
	
	// Draw two houses with Windows
	
	/*HouseWithWindows hw1 = new HouseWithWindows(50,350,40,75);
	HouseWithWindows hw2 = new HouseWithWindows(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF));*/ 
	
	// Rotate the second house 45 degrees around its center.
	Ladybug redRotate = new Ladybug(200, 350, 40);
	Shape hw3 = ShapeTransforms.rotatedCopyOf(redRotate, Math.PI/4.0);
	
	g2.setColor(Color.RED);
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A whole party of ladybugs - not all are ladies, but they're certainly all bugs. By Madhu Kannan", 20,20);
    }
    
    /** Draw a different picture with ladybugs and bugs together.
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Bug Family Portrait,", 20, 20);
	g2.drawString("With Illegitmate Ladybug Child and Legitimate Bug Child (Parent Bugs Not Happy)", 20,40);
	g2.drawString("By Madhu Kannan", 20, 60);	
	
	// Draw some coffee cups.
	
	Bug father = new Bug(200,50,60,8);
	Bug mother = new Bug(400,50,50,6);
	
	g2.setColor(Color.GREEN);     
        g2.draw(father);
	g2.setColor(Color.MAGENTA);  
	g2.draw(mother);

	Bug child = new Bug(250,300,30,6);
	Ladybug notChild = new Ladybug(350, 300, 30);
	
	g2.setColor(Color.BLACK);
	g2.draw(child);
	g2.setColor(Color.RED);
	g2.draw(notChild);
	
    }       
}
