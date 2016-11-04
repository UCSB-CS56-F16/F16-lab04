package edu.ucsb.cs56.drawings.vinhha.advanced;

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
 * @author Charles Lewis
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few doors 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Balloon b1 = new Balloon(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(b1);
	
	// Make a black door that's half the size, 
	// and moved over 200 pixels in x direction
	
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,200,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	// Here's a door that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2); 
	
	// Draw two OrnateDoors
	
	BirthdayBalloon BB1 = new BirthdayBalloon(100,350,20,75);
	BirthdayBalloon BB2 = new BirthdayBalloon(200,300,200,100);
	
	g2.draw(BB1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(BB2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.ORANGE); 
	g2.drawString("Balloons, By Vinh Ha", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some coffee cups.
	
	Balloon large = new Balloon(100,50,225,150);
	Balloon smallCC = new Balloon(20,50,40,30);
	Balloon tallSkinny = new Balloon(20,150,20,40);
	Balloon shortFat = new Balloon(20,250,40,20);
	
	g2.setColor(Color.MAGENTA);  g2.draw(large);
	g2.setColor(Color.CYAN);    g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.RED);     g2.draw(shortFat);
	
	Balloon b1 = new Balloon(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(b1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,20);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,10,200);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2); 
	
	// Draw two houses with Windows
	
	BirthdayBalloon BB1 = new BirthdayBalloon(50,350,40,75);
	BirthdayBalloon BB2 = new BirthdayBalloon(200,350,200,100);
	
	g2.draw(BB1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape BB3 = ShapeTransforms.rotatedCopyOf(BB2, Math.PI/3.0);
	
	g2.draw(BB3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of balloons by Vinh Ha", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of balloons by Vinh Ha", 20,20);
	
	
	// Draw some coffee cups.
	
	Balloon large = new Balloon(100,50,225,150);
	Balloon smallCC = new Balloon(20,50,40,30);
	Balloon a = new Balloon(300,350,200,150);
	Balloon b = new Balloon(20,50,40,30);
	Shape c = ShapeTransforms.rotatedCopyOf(b, Math.PI/5.0);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(a);
	g2.setColor(Color.YELLOW);  g2.draw(b);
	g2.setColor(Color.BLACK);   g2.draw(c);
    }       
}
