package edu.ucsb.cs56.drawings.alexanderngo.advanced;

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
 * @author Alexander Ngo
 */

public class AllMyDrawings
{
    /** Draw a picture with a few benches
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Bench h1 = new Bench(20,150,100,35);
	g2.setColor(Color.BLACK); g2.draw(h1);
	
	// Make a black bench that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.GREEN); g2.draw(h2);
	
	// Bench that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// Draw with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw one bench with stripes
	
	Bench hw1 = new ParkBench(150,300,300,75);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few benches by Alexander Ngo", 20,20);
    }
    
    
    /** Draw a picture with a lot of benches and park benchs (and chairs)
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some more benches
	Bench longBench = new Bench(50, 50, 100, 20);
	Bench smallBench = new Bench(100, 100, 30, 5);
	Bench bigBench	= new Bench(150, 150, 200, 100);
	Bench chairlikeBench = new Bench(500,300, 40,70);

	g2.setColor(Color.RED);     g2.draw(longBench);
	g2.setColor(Color.GREEN);   g2.draw(smallBench);
	g2.setColor(Color.BLUE);    g2.draw(bigBench);
	g2.setColor(Color.MAGENTA); 
	
	// Rotate 270 degrees 
 	Shape b5 = ShapeTransforms.rotatedCopyOf(chairlikeBench, Math.PI*1.5);
	g2.draw(b5);
	
	// Make a black bench thats 1.5x the smallBench, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(smallBench,1.5,1.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// 4x as big bench
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
	
	// Draw three benches with stripes
	
	Bench hw1 = new ParkBench(50,200,40,75);
	Bench hw2 = new ParkBench(400,100,150,85);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second bench 90 degrees around its center.
	Shape hw4 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/2.0);
	
	g2.draw(hw4);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Benches and a few Park Benches by Alexander Ngo", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	g2.drawString("A bunch of Rotated and Translated Benches by Alexander Ngo", 20,20);
	
	Bench b1 = new Bench(250, 100, 125, 50); g2.draw(b1);
	Bench pb1 = new ParkBench(250, 300, 125, 50);

	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1, .4, .4);
	b2 = ShapeTransforms.translatedCopyOf(b2,-150,0);
	b2 = ShapeTransforms.rotatedCopyOf(b2,Math.PI * 9/13);
	g2.setColor(new Color(0xFF99FF));
	Stroke Thick = new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	Stroke orig = g2.getStroke();
	g2.setStroke(Thick);
	g2.draw(b2);

	Shape b3 = ShapeTransforms.scaledCopyOfLL(b1, .4 ,.4);
	b3 = ShapeTransforms.translatedCopyOf(b2, 375, 0);
	b3 = ShapeTransforms.rotatedCopyOf(b3, Math.PI/2.0);
	g2.setColor(new Color(0x3300CC));
	g2.draw(b3);

	g2.setStroke(orig);
	g2.setColor(new Color(0x333300));
	Shape pb4 = ShapeTransforms.rotatedCopyOf(pb1, Math.PI);
	g2.draw(pb4);

	Shape pb2 = ShapeTransforms.scaledCopyOfLL(pb1, .4, .4);
	pb2 = ShapeTransforms.translatedCopyOf(pb2, -150, 0);
	pb2 = ShapeTransforms.rotatedCopyOf(pb2, Math.PI/4);
	g2.setColor(new Color(0xCCff00));
	g2.draw(pb2);

	Shape pb3 = ShapeTransforms.scaledCopyOfLL(pb1, .4 , .4);
	pb3 = ShapeTransforms.translatedCopyOf(pb2, 375, 0);
	pb3 = ShapeTransforms.rotatedCopyOf(pb3, Math.PI*1.5);
	g2.setColor(new Color(0x66FF33)); 
	g2.draw(pb3);
	
    }       
}
