package edu.ucsb.cs56.drawings.gildun.advanced;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {

	Cow h1 = new Cow(50, 200, 100, 50);
	g2.setColor(Color.GREEN); g2.draw(h1);

	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.3,0.3);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,20);
	g2.setColor(Color.ORANGE); g2.draw(h2);

	h2 = ShapeTransforms.scaledCopyOfLL(h2,5,3);
	h2 = ShapeTransforms.translatedCopyOf(h2,75,75);

	g2.setColor(new Color(0x0AAAAA));
	g2.draw(h2); 

	
	Cow c1 = new Cow(300, 200, 200, 50);
	Cow c2 = new Cow(350, 250, 100, 50);
	
	g2.draw(c1);
	g2.setColor(new Color(0x0ABCDEF)); g2.draw(c2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	g2.setColor(Color.BLACK);
	g2.drawString("Many cows hanging out by Richard Young", 20,20);
    }
    
    
    /** Draw a picture of a brown spotted cow, and a black cow facing away  from each other.
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw a brown spotted cow, and a black cow facing away from other.
		Color brn = new Color(0x8B4513);
		g2.setColor(brn);
		CowSpots brnCow = new CowSpots(100, 100, 100, 50);
		g2.draw(brnCow);

		Shape blkCow = ShapeTransforms.horizontallyFlippedCopyOf(brnCow);
		blkCow = ShapeTransforms.translatedCopyOf(blkCow, 400, 25);
		blkCow = ShapeTransforms.scaledCopyOf(blkCow, .75, .75);

		g2.setColor(Color.black);
		g2.draw(blkCow);


	g2.setColor(Color.BLACK); 
	g2.drawString("Brown Spot and Black looking away, By Richard Young", 20,20);
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
