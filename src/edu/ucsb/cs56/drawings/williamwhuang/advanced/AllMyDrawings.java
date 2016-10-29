package edu.ucsb.cs56.drawings.williamwhuang.advanced;
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
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	LightBulb lb1 = new LightBulb(100,250,50,50);
	g2.setColor(Color.CYAN); g2.draw(lb1);
	
	// Make a black house that's one-fourth the size, 
	// and moved over 100 pixels in x direction
	
	Shape lb2 = ShapeTransforms.scaledCopyOfLL(lb1,0.25,0.25);
	lb2 = ShapeTransforms.translatedCopyOf(lb2,100,0);
	g2.setColor(Color.BLACK); g2.draw(lb2);
	
	// Here's a house that's 4x as big (2x the original) with regards to the x direction
	// and moved over 120 more pixels to right.
	lb2 = ShapeTransforms.scaledCopyOfLL(lb2,4,2);
	lb2 = ShapeTransforms.translatedCopyOf(lb2,120,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(lb2); 
	
	// Draw two houses with Windows
	
	ShiningLightBulb slb1 = new ShiningLightBulb(50,350,40,75);
	ShiningLightBulb slb2 = new ShiningLightBulb(200,350,200,100);
	
	g2.draw(slb1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(slb2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few LightBulbs by William Huang", 20,20);
    }
    
    
    /** Draw a picture with a lightbulbs
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some LightBulbs. 
	
	LightBulb mediumBulb = new LightBulb(100,50,25,25);
	LightBulb weirdBulb = new LightBulb(20,50,25,50);
	LightBulb smallBulb = new LightBulb(20,150,10,10);
	LightBulb bigBulb = new LightBulb(20,250,50,50);
	
	g2.setColor(Color.RED);     g2.draw(mediumBulb);
	g2.setColor(Color.GREEN);   g2.draw(weirdBulb);
	g2.setColor(Color.BLUE);    g2.draw(smallBulb);
	g2.setColor(Color.MAGENTA); g2.draw(bigBulb);
	
        LightBulb lb1 = new LightBulb(100,250,50,75);
	g2.setColor(Color.RED); g2.draw(lb1);
	
	// Make a RED Lightbulb that's half the size, 
	// and moved over 50 pixels in y direction
	Shape lb2 = ShapeTransforms.scaledCopyOfLL(lb1,0.5,0.5);
	lb2 = ShapeTransforms.translatedCopyOf(lb2,0,10);
	g2.setColor(Color.RED); g2.draw(lb2);
	
	// Here's a house that's one-sixth as big (2x the original)
	// and moved over 150 more pixels to right.
	lb2 = ShapeTransforms.scaledCopyOfLL(lb2,.1666,.1666);
	lb2 = ShapeTransforms.translatedCopyOf(lb2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(lb2); 
	
	// Draw two SHINING light bulbs
	
	ShiningLightBulb slb1 = new ShiningLightBulb(50,350,40,75);
	ShiningLightBulb slb2 = new ShiningLightBulb(200,350,200,100);
	
	g2.draw(slb1);
	g2.setColor(new Color(0x8F0088)); 
	
	// Rotate the second ShiningLightBulb 90 degrees around its center.
	Shape slb3 = ShapeTransforms.rotatedCopyOf(slb2, Math.PI/2.0);
	
	g2.draw(slb3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of random lightbulbs by William Huang", 20,20);
    }
    
    /** Draw a different picture with a few LightBulbs
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of ShiningLightBulbs by William Huang", 20,20);
	
	
	// Draw some ShiningLightBulbs
	
	ShiningLightBulb MiddleSlb1 = new ShiningLightBulb(100,50,150,150);
	ShiningLightBulb LeftSlb2 = new ShiningLightBulb(20,50,40,30);
	ShiningLightBulb RightSlb3 = new ShiningLightBulb(180, 50, 60, 60);
	
	g2.setColor(Color.BLACK);     g2.draw(MiddleSlb1);
	g2.setColor(Color.BLUE);   g2.draw(LeftSlb2);
	g2.setColor(Color.RED);   g2.draw(RightSlb3);
    }       
}
