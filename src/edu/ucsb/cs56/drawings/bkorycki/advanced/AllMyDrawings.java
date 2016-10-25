package edu.ucsb.cs56.drawings.bkorycki.advanced;

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
 * @author Barbara Korycki
 * @version for UCSB CS56,F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with only regular pencils
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Pencil p1 = new Pencil(100,100,500,75);
	g2.setColor(Color.RED); g2.draw(p1);
	
	// Make a black pencil that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,0,150);
	g2.setColor(Color.BLACK); g2.draw(p2);
	
	// Here's a pencil that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,250);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0xFFC0CB)); 
	g2.draw(p2); 
    
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few regular pencils by yours truly, Barbara. xoxo", 20,20);
    }
    
    
    /** Draw a picture with a few pencils and striped pencils
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some pencils.
	
	Pencil big = new Pencil(100,50,600,80);
	Pencil small = new Pencil(20,50, 50,5);
	Pencil skinny  = new Pencil(20,150,500,40);
	
	g2.setColor(Color.RED);     g2.draw(big);
	g2.setColor(Color.PINK);   g2.draw(small);
	g2.setColor(Color.ORANGE);    g2.draw(skinny);
	
	StripedPencil p1 = new StripedPencil(100,400,250,75);
	g2.setColor(Color.CYAN); g2.draw(p1);
	
	// Make a black striped pencil that's quarter the size, 
	// and moved over 150 pixels in x direction
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.25,0.25);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,80);
	g2.setColor(Color.BLACK); g2.draw(p2);
	
	// Here's a striped pencil that's 2x the original
	// and moved over 150 more pixels to right.
	p2 = ShapeTransforms.scaledCopyOfLL(p1,2,2);
	p2 = ShapeTransforms.translatedCopyOf(p1,150,-200);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(p2); 
      
	
	// Rotate the second striped pencil 45 degrees around its center.
	Shape p3 = ShapeTransforms.rotatedCopyOf(p2, Math.PI/4.0);
	
	g2.draw(p3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A variety of pencils and striped pencils by Barbara Korycki", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString(
	"Some lovely pencils created by Barbara Korycki to grace your screen", 20,20);
	
	
	// The pencils
	
	Pencil large = new Pencil(30,30,450,100);
	Pencil small = new Pencil(30,400,225,50);
	Pencil skinny = new Pencil(100, 150, 600, 25);
	Pencil hefty = new Pencil(100, 250, 200, 75);
	
	//	g2.setColor(Color.RED);     g2.draw(large);
       	g2.setColor(Color.PINK);   g2.draw(small);
	g2.setColor(Color.ORANGE);   g2.draw(skinny);
	g2.setColor(Color.YELLOW);   g2.draw(hefty);

	StripedPencil stripes = new StripedPencil(300, 300, 225, 50);
	StripedPencil smalls = new StripedPencil(300, 400, 600, 70);
	StripedPencil norm = new StripedPencil(150,300, 450, 100);
	g2.setColor(Color.RED);     g2.draw(norm);
	g2.setColor(Color.BLUE);     g2.draw(stripes);
       	g2.setColor(Color.GREEN);     g2.draw(smalls);
	
    }       
}
