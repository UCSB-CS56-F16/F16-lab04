package edu.ucsb.cs56.drawings.andrewlai.advanced;

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
 * @author Andrew Lai
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw some stupid looking speakers in random places
     */
    
    public static void drawPicture1(Graphics2D g2) {
    // draw speakers and studio monitors, with different color and stroke styles
    // one of them should be tilted
	
	Speaker s1 = new Speaker(100,100,100);
	g2.setColor(Color.CYAN); g2.draw(s1);
	
	// Make a black speaker
	
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);
	
	// 4x bigger speaker translated to the right
	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,200,0);
	
	// Drawn with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x011FA1)); 
	g2.draw(s2); 
	
	// Draw studio monitors
	
	StudioMonitor sm1 = new StudioMonitor(50,350,100);
	StudioMonitor sm2 = new StudioMonitor(250,350,150);
	
	g2.draw(sm1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(sm2);

    Shape sm3 = ShapeTransforms.rotatedCopyOf(sm2, Math.PI/4.0);
    sm3 = ShapeTransforms.translatedCopyOf(sm3,200,-100);
	g2.setColor(Color.RED); g2.draw(sm3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Random speakers by Andrew Lai", 20,20);
    }
    
    
    /** Draw two speakers stacked on a studio monitor
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// draw 2 speakers stacked on top of a sideways studio monitor
    Stroke orig=g2.getStroke();
	
	Speaker left = new Speaker(50,50,100);
	Speaker right = new Speaker(117,70,80);
	StudioMonitor base = new StudioMonitor(50,150,140);
    Shape base2 = ShapeTransforms.rotatedCopyOf(base, Math.PI/2.0);
    base2 = ShapeTransforms.translatedCopyOf(base2,20,-25);
	
	g2.setColor(Color.RED);     g2.draw(left);
	g2.setColor(Color.GREEN);   g2.draw(right);
	g2.setColor(Color.BLUE);    g2.draw(base2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A stack of speakers by Andrew Lai", 20,20);
    }
    
    /** Draw 2 studio monitors, one leaning on the other
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	g2.drawString("Two studio monitors by Andrew Lai", 20,20);
	
	
	// Draw some monitors
	
	StudioMonitor left = new StudioMonitor(100,70,200);
	StudioMonitor right = new StudioMonitor(300,70,200);

    Shape right2 = ShapeTransforms.rotatedCopyOf(right, -Math.PI/4.0);
    right2 = ShapeTransforms.translatedCopyOf(right2,-20,-20);
	
	g2.setColor(Color.RED);     g2.draw(left);
	g2.setColor(Color.BLUE);   g2.draw(right2);
	
    }       
}
