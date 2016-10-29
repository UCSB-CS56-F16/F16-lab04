package edu.ucsb.cs56.drawings.jkompella.advanced;

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
 * @author Joseph Kompella
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few people 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Person p1 = new Person(100,250,100);
	g2.draw(p1);
	
	Person p2 = new Person(400,400,200);
	
	g2.setColor(new Color(0x8F00FF)); g2.draw(p2);
	
	Person p3 = new Person(50,100,80);
	g2.setColor(new Color(0x7C22A6)); g2.draw(p3);
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setColor(Color.BLACK); 
	g2.drawString("A few people by Joseph Kompella", 20,20);
    }
    
    
    /** Draw a picture with a few people and soccer players
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some people.
	
	Person tall = new Person(100,300,225);
	Person small = new Person(400,100,50);
	
	g2.setColor(Color.RED);     g2.draw(tall);
	g2.setColor(Color.GREEN);   g2.draw(small);
	
	
	// Make a blue person that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(small,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLUE); g2.draw(h2);
	
	// Here's a person that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	SoccerPlayer sp1 = new SoccerPlayer(0,100,50);
	SoccerPlayer sp2 = new SoccerPlayer(20,200,80);
	g2.setColor(Color.MAGENTA);	g2.draw(sp2);

	Shape h3 = ShapeTransforms.scaledCopyOfLL(sp1,2,2);
	h3 = ShapeTransforms.rotatedCopyOf(h3, Math.PI);
	h3 = ShapeTransforms.translatedCopyOf(h3,200,0);
	g2.setColor(Color.GRAY);	g2.draw(h3);
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setColor(Color.BLACK); 
	g2.drawString("A few people and soccer players by Joseph Kompella", 20,20);
    }
    
    /** Draw a different picture with a couple of soccer players
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	SoccerPlayer sp1 = new SoccerPlayer(100,250,80);
	g2.setColor(Color.BLACK);	g2.draw(sp1);
	SoccerPlayer sp2 = new SoccerPlayer(400,150,60);
	g2.setColor(Color.YELLOW);	g2.draw(sp2);	
	SoccerPlayer sp3 = new SoccerPlayer(200,200,150);
	g2.setColor(Color.CYAN);	g2.draw(sp3);
	// label the drawing
	
	g2.setColor(Color.BLACK);	
	g2.drawString("Some soccer players by Joseph Kompella", 20,20);	
    }
}
