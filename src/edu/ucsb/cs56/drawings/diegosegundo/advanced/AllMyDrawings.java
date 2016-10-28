package edu.ucsb.cs56.drawings.diegosegundo.advanced;

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
 * @author Diego Segundo 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few pizzas
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Pizza p1 = new Pizza(100, 40, 15 );
	g2.setColor(Color.CYAN); g2.draw(p1);
	
	// Make a pizza that's half the size and blue, 
	// and moved over 150 pixels in x direction
	
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(Color.BLUE); g2.draw(p2);
	
	// Here's a pizza that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(p2); 
	
	// Draw two houses with Windows
	
	PizzaWithPep pizza1 = new PizzaWithPep(50,350,20);
	PizzaWithPep pizza2 = new PizzaWithPep(200,350,50);
	
	g2.draw(pizza1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(pizza2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few Pizzas by Diego Segundo", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some pizzas.
	
	Pizza a = new Pizza(300,50,225);
	Pizza b = new Pizza(20,50,5);
	Pizza c = new Pizza(20,150,20);
	
	g2.setColor(Color.RED);     g2.draw(a);
	g2.setColor(Color.GREEN);   g2.draw(b);
	g2.setColor(Color.BLUE);    g2.draw(c);

	
	Pizza p1 = new Pizza(100,400,25);
	g2.setColor(Color.CYAN); g2.draw(p1);
	
	// Make a Black Pizza that's half the size, 
	// and moved over 150 pixels in x direction
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(Color.BLACK); g2.draw(p2);
	

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(p2); 
	
	// Draw a pizza with pepporoni 
	
	PizzaWithPep pep1 = new PizzaWithPep(50,350,40);
	
	g2.draw(pep1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the pizza 45 degrees around its center.
	Shape pep2 = ShapeTransforms.rotatedCopyOf(pep1, Math.PI/4.0);
	pep2 = ShapeTransforms.translatedCopyOf(pep2,150,0);
	
	g2.draw(pep2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Pizzas by Diego Segundo", 20,20);
    }
    
    /** Draw a different picture with a few Pizzas
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Pizzas by Diego Segundo", 20,20);
	
	
	// Draw some pizzas.
	
	PizzaWithPep large = new PizzaWithPep(100,50,225);
	Pizza smallCC = new Pizza(20,50,40);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }       
}
