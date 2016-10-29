package edu.ucsb.cs56.drawings.seanshelton.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;
import java.lang.Math;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Sean Shelton
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with some envelopes
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
		// Original envelope
		Envelope e1 = new Envelope(50,350,50,75);
		g2.setColor(Color.BLACK); g2.draw(e1);
	
		// Set envelope color to pink, tilted on its right side, shifted to the right 50 pixels,
		// up 100 pixels, and set to be wider.
		//
		// Also making thicker stroke

		Stroke thick = new BasicStroke(4);
		Stroke orig = g2.getStroke();
		g2.setStroke(thick);

		Shape e2 = ShapeTransforms.translatedCopyOf(e1,50,-100);
		e2 = ShapeTransforms.scaledCopyOfLL(e2,4,1);
		e2 = ShapeTransforms.rotatedCopyOf(e2, (Math.PI)/2);
		g2.setColor(Color.PINK); g2.draw(e2);

		// Making a basic sealed letter, right above the original envelope
		SealedLetter sl1 = new SealedLetter(50, 250, 100, 50);
		g2.setColor(Color.BLACK); g2.draw(sl1);

		// Moving this envelope to the right 200 pixels and up 150, then also having it
		// be put diagonally, while painted brown, and scaled up a bit
		Shape sl2 = ShapeTransforms.translatedCopyOf(sl1,200,-150);
		sl2 = ShapeTransforms.rotatedCopyOf(sl2, (Math.PI)/3);
		sl2 = ShapeTransforms.scaledCopyOf(sl2, 3, 2);
		g2.setColor(new Color(0xd2b48c)); g2.draw(sl2);

		// Moving the basic sealed letter to the right even further (350 pixels),
		// putting it vertically, changing the color to orange
		Shape sl3 = ShapeTransforms.translatedCopyOf(sl1, 350, 50);
		sl3 = ShapeTransforms.rotatedCopyOf(sl3, (3*(Math.PI))/2);
		sl3 = ShapeTransforms.scaledCopyOf(sl3, 2, 1.5);
		g2.setColor(Color.ORANGE); g2.draw(sl3);
		
		
		// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
		
		g2.setStroke(orig);
		g2.setColor(Color.BLACK); 
		g2.drawString("Scattered envelopes by Sean Shelton", 20,20);
    }
    
    
    /** Draw a picture with envelopes in strange formations
     */
    public static void drawPicture2(Graphics2D g2) {

		// Original envelope; colored navy, and tilted to the side
		Shape e1 = new Envelope(50,450,75,100);
		e1 = ShapeTransforms.rotatedCopyOf(e1, (7*(Math.PI)/6));
		e1 = ShapeTransforms.translatedCopyOf(e1, 200, -100);
		g2.setColor(new Color(0x000080)); g2.draw(e1);
	
		// Set envelope color to red, tilted a bit to the right, shifted to the right 150 pixels,
		// up 150 pixels, and set to be wider.
		//
		// Also making thicker stroke

		Stroke thick = new BasicStroke(5);
		Stroke orig = g2.getStroke();
		g2.setStroke(thick);

		Shape e2 = ShapeTransforms.translatedCopyOf(e1,-150,-150);
		e2 = ShapeTransforms.scaledCopyOfLL(e2,1,3);
		e2 = ShapeTransforms.rotatedCopyOf(e2, (5*(Math.PI)/3));
		g2.setColor(Color.RED); g2.draw(e2);

		// Making a basic sealed letter, tilted, set to maroon 
		Shape sl1 = new SealedLetter(50, 250, 100, 50);
		sl1 = ShapeTransforms.rotatedCopyOf(sl1, (5*(Math.PI)/4));
		g2.setColor(new Color(0x800000)); g2.draw(sl1);

		// Moving this envelope to the right 300 pixels and up 150,
		// while painted yellow, and scaled up a bit
		Shape sl2 = ShapeTransforms.translatedCopyOf(sl1,300,-150);
		sl2 = ShapeTransforms.scaledCopyOf(sl2, 1.5, 2);
		g2.setColor(Color.YELLOW); g2.draw(sl2);

		// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
		
		g2.setStroke(orig);
		g2.setColor(Color.BLACK); 
		g2.drawString("Completely warped envelopes by Sean Shelton", 20,20);

	}
    
    /** Draw a different picture with the envelopes in a colored theme
     */
    
    public static void drawPicture3(Graphics2D g2) {

		// Original envelope; colored gray, and tilted to the side
		Shape e1 = new Envelope(50,100,100,50);
		e1 = ShapeTransforms.rotatedCopyOf(e1, (4*(Math.PI)/3));
		g2.setColor(Color.GRAY); g2.draw(e1);
	
		// Set envelope color to cyan, tilting the shapes, shifted to the right 100 pixels,
		// up 30 pixels, and set to be wider.
		//
		// Also making thicker stroke

		Stroke thick = new BasicStroke(5);
		Stroke orig = g2.getStroke();
		g2.setStroke(thick);

		Shape e2 = ShapeTransforms.translatedCopyOf(e1,100,-30);
		e2 = ShapeTransforms.scaledCopyOfLL(e2,3,1);
		e2 = ShapeTransforms.rotatedCopyOf(e2, ((Math.PI)/2));
		g2.setColor(Color.CYAN); g2.draw(e2);

		// Making a basic sealed letter, set to lavender 
		Shape sl1 = new SealedLetter(50, 250, 350, 150);
		g2.setColor(new Color(0xcc99cc)); g2.draw(sl1);

		// Moving this envelope to the right 200 pixels and up 150,
		// while painted violet
		// Shape sl2 = ShapeTransforms.translatedCopyOf(sl1,200,-150);
		Shape sl2 = ShapeTransforms.rotatedCopyOf(sl1, ((Math.PI)/2));
		sl2 = ShapeTransforms.translatedCopyOf(sl2,250,-100);
		g2.setColor(new Color(0xEE82EE)); g2.draw(sl2);

		// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
		
		g2.setStroke(orig);
		g2.setColor(Color.BLACK); 
		g2.drawString("Color-themed envelopes by Sean Shelton", 20,20);
	}       
}
