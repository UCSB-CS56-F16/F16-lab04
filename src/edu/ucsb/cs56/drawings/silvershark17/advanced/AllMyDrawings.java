package edu.ucsb.cs56.drawings.silvershark17.advanced;

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
 * @author Eric Xiao 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with several cubes 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Cube c1 = new Cube(100,250,100);
	g2.setColor(Color.RED); g2.draw(c1);
	
	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1, 1.5, 1.5);
	c2 = ShapeTransforms.translatedCopyOf(c2, 200, 0);
	g2.setColor(Color.GREEN); g2.draw(c2);

	Shape c3 = ShapeTransforms.scaledCopyOfLL(c2, 0.7, 0.7);
	c3 = ShapeTransforms.translatedCopyOf(c3, 50, -150);
	g2.setColor(Color.BLACK); g2.draw(c3);

	g2.drawString("Several cubes hanging out by Eric Xiao", 20,20);
    }    
    /** Draw a picture with several tilted Rubik's cubes
     */
	
    public static void drawPicture2(Graphics2D g2) {
	g2.drawString("A bunch of tilted Rubik's Cubes by Eric Xiao", 20, 20);
	RubiksCube r1 = new RubiksCube(100, 140, 120);
	Shape r2 = ShapeTransforms.rotatedCopyOf(r1, Math.PI/8);
	g2.setColor(Color.BLUE);
	g2.draw(r2);

	Shape r3 = ShapeTransforms.translatedCopyOf(r2, 0, 125*Math.sqrt(2));
	g2.setColor(Color.ORANGE);
	g2.draw(r3);

	RubiksCube r4 = new RubiksCube(300, 140, 120);
	Shape r5 = ShapeTransforms.rotatedCopyOf(r4, Math.PI/8);
	g2.setColor(Color.RED);
	g2.draw(r5);

	Shape r6 = ShapeTransforms.translatedCopyOf(r5, 0, 125*Math.sqrt(2));
        g2.setColor(Color.PINK);
	g2.draw(r6);
    }
    
    /** Draw a different picture with a few cubes and Rubik's cubes
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	g2.drawString("A few cubes and Rubik's cubes by Eric Xiao", 20,20);
	Cube r1 = new Cube(100, 300, 100);
	g2.setColor(Color.BLACK);
	g2.draw(r1);

	RubiksCube r2 = new RubiksCube(100, 100, 100);
	g2.setColor(Color.BLUE);
	g2.draw(r2);

	Shape r3 = ShapeTransforms.translatedCopyOf(r1, 300, -200);
	g2.setColor(Color.GREEN);
	g2.draw(r3);

	Shape r4 = ShapeTransforms.translatedCopyOf(r2, 300, 200);
	g2.setColor(Color.RED);
	g2.draw(r4);
    }       
}
