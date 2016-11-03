package edu.ucsb.cs56.drawings.jimvargas.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures of panels 
 * and computer monitors that can be rotated, scaled, translated, etc. 
 * This class implements the classes of Panel and ComputerMonitor as 
 * well as the Shape interface.
 * 
 * @author Jim Vargas
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few panels
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Panel p1 = new Panel(100,50,75,50);
	g2.setColor(Color.ORANGE); g2.draw(p1);
	
	// Make a black panel that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(Color.BLACK); g2.draw(p2);
	
	// Here's a panel that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x456c51)); 
	g2.draw(p2); 
	
	// Draw two panels with frames, stands, and bases
	
      	ComputerMonitor cm1 = new ComputerMonitor(50,150,40,75);
	ComputerMonitor cm2 = new ComputerMonitor(200,150,200,100);
	
	g2.draw(cm1);
	g2.setColor(new Color(0x00C5FF)); g2.draw(cm2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLUE); 
	g2.drawString("A few panels and monitors by Jim Vargas", 20,20);
    }
    
    
    /** Draw a picture with a few panels and monitors with some rotated and scaled 
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some monitors
	
	ComputerMonitor large = new ComputerMonitor(100,50,225,150);
	ComputerMonitor smallCM = new ComputerMonitor(20,50,40,30);
	ComputerMonitor tallSkinny = new ComputerMonitor(20,150,20,40);
	ComputerMonitor shortFat = new ComputerMonitor(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCM);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Panel p1 = new Panel(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(p1);
	
	// Make a black panel that's half the size, 
	// and moved over 150 pixels in x direction
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(Color.BLACK); g2.draw(p2);
	
	// Here's a panel that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(p2); 
	
	// Draw two computer monitors
	
	ComputerMonitor cm1 = new ComputerMonitor(50,350,40,75);
        ComputerMonitor cm2 = new ComputerMonitor(200,350,200,100);
	
	g2.draw(cm1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second monitor 45 degrees around its center.
	Shape cm3 = ShapeTransforms.rotatedCopyOf(cm2, Math.PI/4.0);
	
	g2.draw(cm3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.GRAY); 
	g2.drawString("A bunch of computer montiors and a few panels by Jim Vargas", 20,20);
    }
    
    /** Draw a different picture with a few panels and computer monitors with some translated, rotated, and/or scaled
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	g2.drawString("A variety of computer monitors and panels by Jim Vargas", 20,20); 
	
	ComputerMonitor large = new ComputerMonitor(100,50,225,150);
	ComputerMonitor smallCM = new ComputerMonitor(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.MAGENTA);   g2.draw(smallCM);

	Shape cm1 = ShapeTransforms.rotatedCopyOf(large, Math.PI/2.0);
	cm1 = ShapeTransforms.translatedCopyOf(cm1,275,0);
	g2.setColor(Color.CYAN); g2.draw(cm1);
	
	g2.draw(cm1);

	Panel p1 = new Panel(100,50,75,50);
	g2.setColor(Color.PINK); g2.draw(p1);
		
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(new Color(0x6300FF)); g2.draw(p2);
	
	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x00FFAB)); 
	g2.draw(p2); 




	
	
    }       
}
