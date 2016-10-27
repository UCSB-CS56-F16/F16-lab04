package edu.ucsb.cs56.drawings.ckoziol.advanced;

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
 * @author Chet Koziol 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	SmileyFace h1 = new SmileyFace(100,250,50);
	g2.setColor(Color.BLACK); g2.draw(h1);

	SmileyFace h2 = new SmileyFace(300,300,10);
	g2.setColor(Color.BLUE); g2.draw(h2);

        SmileyFace h3 = new SmileyFace(350,45,68);
	g2.setColor(Color.ORANGE); g2.draw(h3);
	
	
	g2.drawString("Smiley Face by Chet Koziol", 20,20);
    }
    
    
    public static void drawPicture2(Graphics2D g2) {

	SmileyFaceWithHat h1 = new SmileyFaceWithHat(100,250,50);
	g2.setColor(Color.BLACK); g2.draw(h1);


	SmileyFaceWithHat h2 = new SmileyFaceWithHat(300,300,25);
	g2.setColor(Color.GREEN); g2.draw(h2);

	SmileyFaceWithHat h3 = new SmileyFaceWithHat(400, 400, 75);
	Shape h4 = ShapeTransforms.rotatedCopyOf(h3, Math.PI/2.4);
	g2.setColor(Color.RED); g2.draw(h4);
	
        SmileyFace h5 = new SmileyFace(300,50,10);
	g2.setColor(Color.BLUE); g2.draw(h5);
	
	g2.drawString("Smiley Face With Hat by Chet Koziol", 20,20);	
	
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Coffee Cups by Phill Conrad", 20,20);
	
	
	// Draw some coffee cups.
	
	CoffeeCup large = new CoffeeCup(100,50,225,150);
	CoffeeCup smallCC = new CoffeeCup(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }       
}
