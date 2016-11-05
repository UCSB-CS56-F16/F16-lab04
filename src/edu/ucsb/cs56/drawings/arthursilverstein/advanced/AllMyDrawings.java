package edu.ucsb.cs56.drawings.arthursilverstein.advanced;

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
 * @author Arthur Silverstein
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw laptops 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Laptop l1 = new Laptop(100,250,80,75);
	g2.setColor(Color.CYAN); g2.draw(l1);
	
	// Make a black laptop that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(l1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a laptop that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thinner stroke
	Stroke thick = new BasicStroke (1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two windows laptops
	
	WindowsLaptop hw1 = new WindowsLaptop(50,350,40,75);
	WindowsLaptop hw2 = new WindowsLaptop(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Laptops, digital media, Arthur Silverstein(2016)", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some laptops.
	
	Laptop large = new Laptop(50,250,200,200);
	Laptop medium = new Laptop(300,250,150,150);
	Laptop small = new Laptop(500,250,100,100);
	Laptop tiny = new Laptop(650,250,50,50);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(medium);
	g2.setColor(Color.BLUE);    g2.draw(small);
	g2.setColor(Color.MAGENTA); g2.draw(tiny);
	
	// Draw two houses with Windows
	
	WindowsLaptop hw1 = new WindowsLaptop(50,350,40,75);
	WindowsLaptop hw2 = new WindowsLaptop(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	Stroke orig=g2.getStroke();
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Laptops by Arthur Silverstein", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Windows laptops by Arthur S", 20,20);
	
	
	// Draw some laptops.
	
	WindowsLaptop large = new WindowsLaptop(100,500,225,400);
	WindowsLaptop small = new WindowsLaptop(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	
	//draw some rotated ones
	Shape wl3 = ShapeTransforms.rotatedCopyOf(small, Math.PI/2.0);
	Shape wl4 = ShapeTransforms.translatedCopyOf(wl3, 200, 50);
	g2.draw(wl3);
	g2.draw(wl4);

    }       
}
