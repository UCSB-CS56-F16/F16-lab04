package edu.ucsb.cs56.drawings.juan_pacheco.advanced;

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
 * @author Phill Conrad, Juan Pacheco 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a pokeballs
	@param g2 takes in g2 to draw shape
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Pokeball p1 = new Pokeball(0,0,10);
	g2.setColor(Color.CYAN); g2.draw(p1);
	
	// Here are pokeballs that get twice as big each time 
	// and moved over diagonally except the last one
	
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,2,2);
	p2 = ShapeTransforms.translatedCopyOf(p2,20,20);
	g2.setColor(Color.BLACK); g2.draw(p2);
		
	p2 = ShapeTransforms.scaledCopyOfLL(p2,2,2);
	p2 = ShapeTransforms.translatedCopyOf(p2,40,40);
	g2.setColor(new Color(0x8B008B)); g2.draw(p2);

	p2 = ShapeTransforms.scaledCopyOfLL(p2,2,2);
	p2 = ShapeTransforms.translatedCopyOf(p2,80,80);
	g2.setColor(Color.RED); g2.draw(p2);
	
	p2 = ShapeTransforms.scaledCopyOfLL(p2,2,2);
	p2 = ShapeTransforms.translatedCopyOf(p2,160,160);
	g2.setColor(Color.GREEN); g2.draw(p2);
	 
	p2 = ShapeTransforms.scaledCopyOfLL(p2,1,1);
	p2 = ShapeTransforms.translatedCopyOf(p2,-300,160);
	g2.setColor(new Color(0x990000)); g2.draw(p2);
		
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setColor(Color.BLACK); 
	g2.drawString("A few pokeballs by Juan Pacheco", 20,20);
    }
    
    
    /** Draw a picture with a few pokeballs and quickballs
	@param g2 takes in g2 to draw shape
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some pokeballs.
	
	Pokeball largeP = new Pokeball(100,50,150);
	Pokeball smallP = new Pokeball(20,50,30);
	Pokeball tallP = new Pokeball(20,150,40);
	Pokeball shortP = new Pokeball(20,250,20);
	
	g2.setColor(Color.RED);     g2.draw(largeP);
	g2.setColor(Color.GREEN);   g2.draw(smallP);
	g2.setColor(Color.BLUE);    g2.draw(tallP);
	g2.setColor(Color.MAGENTA); g2.draw(shortP);
	
	Quickball q1 = new Quickball(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(q1);
	
	// Make a black quickball that's half the size, 
	// and moved over 150 pixels in x direction
	Shape q2 = ShapeTransforms.scaledCopyOfLL(q1,0.5,0.5);
	q2 = ShapeTransforms.translatedCopyOf(q2,150,0);
	g2.setColor(Color.BLACK); g2.draw(q2);
	
	// Here's a quickball that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	q2 = ShapeTransforms.scaledCopyOfLL(q2,4,4);
	q2 = ShapeTransforms.translatedCopyOf(q2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(q2); 
	
	// Draw two quickballs
	
	Quickball q3 = new Quickball(50,350,40);
	Quickball q4 = new Quickball(200,350,20);
	
	g2.draw(q3);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second quickball 45 degrees around its center.
	Shape q5 = ShapeTransforms.rotatedCopyOf(q2, Math.PI/4.0);
	
	g2.draw(q5);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of pokeballs and quickballs by Juan Pacheco", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
	@param g2 takes in g2 to draw shape
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A diamond of Quickballs by Juan Pacheco", 20,20);
	
	
	// Draw some quickballs.
	//first one top
        Quickball q1 = new Quickball(320,10,50);
	g2.setColor(Color.RED);     g2.draw(q1);

	// top right
	Shape q2 = ShapeTransforms.scaledCopyOfLL(q1,1,1);
	q2 = ShapeTransforms.translatedCopyOf(q2,100,100);
	g2.setColor(Color.BLACK);
	Shape q22 = ShapeTransforms.rotatedCopyOf(q2, Math.PI/3.0);
	g2.draw(q22);

	//bottom left
	q2 = ShapeTransforms.scaledCopyOfLL(q2,1,1);
	q2 = ShapeTransforms.translatedCopyOf(q2,0,150);
	g2.setColor(Color.BLUE);
	Shape q3 = ShapeTransforms.rotatedCopyOf(q2, 2*Math.PI/3.0);
	g2.draw(q3);

	//bottom
	q2 = ShapeTransforms.scaledCopyOfLL(q2,1,1);
	q2 = ShapeTransforms.translatedCopyOf(q2,-100,100);
	g2.setColor(new Color(0x014121));
	Shape q4 = ShapeTransforms.rotatedCopyOf(q2, Math.PI);
	g2.draw(q4);

	//bottom left
	q2 = ShapeTransforms.scaledCopyOfLL(q2,1,1);
	q2 = ShapeTransforms.translatedCopyOf(q2,-100,-100);
	g2.setColor(new Color(0x8B008B));
	Shape q5 = ShapeTransforms.rotatedCopyOf(q2, 4*Math.PI/3.0);
	g2.draw(q5);

	//top left
	q2 = ShapeTransforms.scaledCopyOfLL(q2,1,1);
	q2 = ShapeTransforms.translatedCopyOf(q2,0,-150);
	g2.setColor(new Color(0xE25822));
	Shape q6 = ShapeTransforms.rotatedCopyOf(q2, 5*Math.PI/3.0);
	g2.draw(q6);


	
    }       
}
