package edu.ucsb.cs56.drawings.zihengsong.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad, Ziheng Song 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few skateboards 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Skateboard s1 = new Skateboard(100,250,100,10);
	g2.setColor(Color.CYAN); g2.draw(s1);
	
	// Make a black skateboard that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);
	
	// Here's a skateboard that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(s2); 
	
	// Draw two houses with Windows
	
	DoubleSlideSkateboard ds1 = new DoubleSlideSkateboard(50,350,40,4);
	DoubleSlideSkateboard ds2 = new DoubleSlideSkateboard(200,350,200,20);
	
	g2.draw(ds1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(ds2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few skateboardss by Ziheng Song", 20,20);
    }
    
    
    /** Draw a picture with a few skateboards and double slide skateboards
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some coffee cups.
	
	Skateboard large = new Skateboard(100,50,300,30);
	Skateboard small = new Skateboard(20,50,50,5);
	Skateboard tallShort = new Skateboard(20,150,200,50);
	Skateboard shortLong = new Skateboard(20,450,700,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(tallShort);
	g2.setColor(Color.MAGENTA); g2.draw(shortLong);
	
	Skateboard s1 = new Skateboard(100,250,50,5);
	g2.setColor(Color.CYAN); g2.draw(s1);
	
	// Make a black skateboard that's half the size, 
	// and moved over 150 pixels in x direction
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);
	
	// Here's a skateboard that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(s2); 
	
	// Draw two houses with Windows
	
	DoubleSlideSkateboard ds1 = new DoubleSlideSkateboard(50,350,40,4);
        DoubleSlideSkateboard ds2 = new DoubleSlideSkateboard(200,350,200,20);
	
	g2.draw(ds1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second skateboard 45 degrees around its center.
	Shape ds3 = ShapeTransforms.rotatedCopyOf(ds2, Math.PI/4.0);
	
	g2.draw(ds3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of skateboards and double slide skateboardsby Ziheng Song", 20,20);
    }
    
    /** Draw a different picture with a few skateboards
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of skateboards by Ziheng Song", 20,20);
	
	
	// Draw some skateboards.
	
	Skateboard large = new Skateboard(100,50,300,30);
	Skateboard small = new Skateboard(20,50,60,6);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	
    }       
}
