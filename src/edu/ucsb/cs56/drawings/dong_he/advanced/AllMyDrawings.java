package edu.ucsb.cs56.drawings.dong_he.advanced;

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
 * @author Dong He
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few Rockets
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Rocket r1 = new Rocket(100,50,200,600);
	g2.setColor(Color.GREEN); g2.draw(r1);
	
	// Make a black rocket that's half the size,
	// and moved over 500 pixels in x direction
	
	Shape r2 = ShapeTransforms.scaledCopyOfLL(r1,0.5,0.5);
	r2 = ShapeTransforms.translatedCopyOf(r2,500,0);
	g2.setColor(Color.BLACK);
    g2.draw(r2);
	
	// Here's a rocket that's half of the black rocket
	// and moved over 250 more pixels to right of the black rocket.
	Shape r3 = ShapeTransforms.scaledCopyOfLL(r1,.25,.25);
	r3 = ShapeTransforms.translatedCopyOf(r3,750,0);
	
	// We'll draw this with a thicker stroke
    Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig = g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7));
	g2.draw(r3);
	
    //@@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A few rockets by Dong He", 20,20);
    }
    
    
    /** Draw a picture with a few rockets and rocketships
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some rockets.
	
	Rocket large = new Rocket(100,150,200,500);
	Rocket smallR = new Rocket(200,550,50,200);
	Rocket tallSkinny = new Rocket(300,150,100,600);
	Rocket shortFat = new Rocket(500,100,500,200);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallR);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	// Make a black rocket that's half the size of the red rocket,
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(large,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK);
    g2.draw(h2);
	
	// Here's a rocket that's 3/4x as big as the red rocket
	// and moved over 150 more pixels to right.
	Shape h3 = ShapeTransforms.scaledCopyOfLL(large,.75,.75);
	h3 = ShapeTransforms.translatedCopyOf(h3,300,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig = g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7));
	g2.draw(h3);
	
	// Draw two rockets with windows
	
	RocketShip rs1 = new RocketShip(100,100,200,600);
	RocketShip rs2 = new RocketShip(400,100,200,600);
	
	g2.draw(rs1);
	g2.setColor(new Color(0x8F00FF));
    g2.draw(rs2);
        
	// Rotate the second rocket 45 degrees around its center.
	Shape rs3 = ShapeTransforms.rotatedCopyOf(rs2, Math.PI/4.0);
	
	g2.draw(rs3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Rockets and a few Rocketships by Dong He", 20,20);
    }
    
    /** Draw a different picture with a few rocketships only
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Rocketships by Dong He", 20,20);
	
	
	// Draw some rocketships.
    RocketShip rs1 = new RocketShip(100,100,200,600);
    RocketShip rs2 = new RocketShip(300,300,100,400);
    RocketShip rs3 = new RocketShip(500,100,300,300);
    RocketShip rs4 = new RocketShip(700,200,100,300);
    RocketShip rs5 = new RocketShip(800,200,400,400);
        
    g2.setColor(Color.RED);
    g2.draw(rs1);
    g2.setColor(Color.GREEN);
    g2.draw(rs2);
    g2.setColor(Color.BLUE);
    g2.draw(rs3);
    g2.setColor(Color.MAGENTA);
    g2.draw(rs4);
    g2.setColor(Color.CYAN);
    g2.draw(rs5);
    
        
	
    }       
}
