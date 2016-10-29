package edu.ucsb.cs56.drawings.vchandran2.advanced;

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
 * @author Veena Chandran 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few bills
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Money m1 = new Money(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(m1);
	
	// Make a black bill that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape m2 = ShapeTransforms.scaledCopyOfLL(m1,0.5,0.5);
	m2 = ShapeTransforms.translatedCopyOf(m2,150,0);
	g2.setColor(Color.BLACK); g2.draw(m2);
	
	// Here's a bill that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	m2 = ShapeTransforms.scaledCopyOfLL(m2,4,4);
	m2 = ShapeTransforms.translatedCopyOf(m2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA9)); 
	g2.draw(m2);

	DollarBill db1 = new DollarBill(50,350,400);
	DollarBill db2 = new DollarBill(200,100,200);

	g2.draw(db1);
	g2.setColor(new Color(0x8F01AF));

        Shape db4 = ShapeTransforms.rotatedCopyOf(db1, Math.PI/6.0);
	Shape db3 = ShapeTransforms.rotatedCopyOf(db2, Math.PI/3.0);

	g2.draw(db3);
	
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Bills by Veena Chandran", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some money!!!!!
	
	Money large = new Money(100,50,225);
	Money smallM = new Money(20,50,40);
	Money tallSkinny = new Money(20,150,20);
	Money shortFat = new Money(20,250,40);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallM);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Money m1 = new Money(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(m1);
	
	// Make a black bill that's half the size, 
	// and moved over 150 pixels in x direction
	Shape m2 = ShapeTransforms.scaledCopyOfLL(m1,0.5,0.5);
	m2 = ShapeTransforms.translatedCopyOf(m2,150,0);
	g2.setColor(Color.BLACK); g2.draw(m2);
	
	// Here's a bill that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	m2 = ShapeTransforms.scaledCopyOfLL(m2,4,4);
	m2 = ShapeTransforms.translatedCopyOf(m2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(m2); 
	
	// Draw two dollar bills
	
	DollarBill db1 = new DollarBill(50,350,40);
	DollarBill db2 = new DollarBill(200,350,200);
	
	g2.draw(db1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second dollar bill 45 degrees around its center.
	Shape db3 = ShapeTransforms.rotatedCopyOf(db2, Math.PI/4.0);
	
	g2.draw(db3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of unidentified bills and some dollars by Veena Chandran", 20,20);
    }
    
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of bills by Veena Chandran", 20,20);
	
	
	// Draw some paper bills.
	
        Money large = new Money(100,50,225);
	Money smallM = new Money(20,50,40);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallM);
	DollarBill db1 = new DollarBill(100,35,40);
	DollarBill db2 = new DollarBill(20,90,210);

	
	g2.setColor(new Color(0x1F00FF));

	// Rotate the second dollar bill 45 degrees around its center.
	Shape db3 = ShapeTransforms.rotatedCopyOf(db2, Math.PI/1.0);
	Shape db4 = ShapeTransforms.rotatedCopyOf(db1, Math.PI/5.0);
	g2.draw(db4);
	g2.draw(db3);
    }       
}
