package edu.ucsb.cs56.drawings.brianslee.advanced;

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
 * 
 * @author Brian Lee (revised)
 * @version for UCSB CS56, F16
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	StickFigure f1 = new StickFigure(100,250,50,75, 25, 25);
	g2.setColor(Color.CYAN); g2.draw(f1);
	
	// Make a black stick figure that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape f2 = ShapeTransforms.scaledCopyOfLL(f1,0.5,0.5);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	g2.setColor(Color.BLACK); g2.draw(f2);
	
	// Here's a stick figure that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	f2 = ShapeTransforms.scaledCopyOfLL(f2,4,4);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(f2); 
	
	// Draw two Jedi
	
	Jedi j1 = new Jedi(50,350,40,80,60,60);
	Jedi j2 = new Jedi(200,350,90,180,130,130);
	
	g2.draw(j1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(j2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few stick figures by Brian Lee", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some Jedi.
	
	Jedi largeJedi = new Jedi(100,150,150,200,175,175);
	Jedi smallJedi = new Jedi(20,50,30,40,35,35);
	Jedi tallJedi = new Jedi(250,250,80,100,75,150);
	Jedi shortJedi = new Jedi(300,250,20,50,30,45);
	
	g2.setColor(Color.RED);     g2.draw(largeJedi);
	g2.setColor(Color.GREEN);   g2.draw(smallJedi);
	g2.setColor(Color.BLUE);    g2.draw(tallJedi);
	g2.setColor(Color.MAGENTA); g2.draw(shortJedi);
	
	StickFigure f1 = new StickFigure(100,250,50,75,60,60);
	g2.setColor(Color.CYAN); g2.draw(f1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	Shape f2 = ShapeTransforms.scaledCopyOfLL(f1,0.5,0.5);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	g2.setColor(Color.BLACK); g2.draw(f2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	f2 = ShapeTransforms.scaledCopyOfLL(f2,4,4);
	f2 = ShapeTransforms.translatedCopyOf(f2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(f2); 
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Jedi and Stick Figures by Brian Lee", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A few Stick Figures and Jedi by Brian Lee", 20,20);
	
	
	// Draw some coffee cups.
	
	Jedi large = new Jedi(500,250,225,300,275,290);
	Jedi Yoda = new Jedi(80,70,40,60,50,55);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(Yoda);

	//Draw a stick figure
	StickFigure dude = new StickFigure(250, 50, 10, 20, 15, 15);

	g2.setColor(Color.BLUE);    g2.draw(dude);
	
    }
}
