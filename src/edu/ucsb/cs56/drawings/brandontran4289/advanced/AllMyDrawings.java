package edu.ucsb.cs56.drawings.brandontran4289.advanced;
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
 * @author Brandon Tran
 * @version for UCSB CS56, F17
 */

public class AllMyDrawings
{
    /**
     * Draw a picture with a few clockfaces
     */

    public static void drawPicture1(Graphics2D g2) {
	
	Clockface h1 = new Clockface(100,100,50);
	g2.setColor(Color.RED); g2.draw(h1);
	
	// Make a black house that's twice the size
	// and moved over 150 pixels in x direction
	// and down 200 pixels in the y direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,2,2);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,200);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a house that's half the size
	// and moved over 150 more pixels down.
	h2 = ShapeTransforms.scaledCopyOfLL(h1,.5,.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,0,150);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	

	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of clockfaces by Brandon Tran", 20,20);
    }
    
    /**
     * Draw a picture with a few wristwatches
     */

    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some wristwatches
	
	Wristwatch large = new Wristwatch(400, 200, 100, 100);
	Wristwatch small = new Wristwatch(50, 100, 20, 20);
	Wristwatch longstraps = new Wristwatch(250, 150, 50, 100);
	Wristwatch shortstraps = new Wristwatch(100, 300, 50, 15);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(longstraps);
	g2.setColor(Color.MAGENTA); g2.draw(shortstraps);
	
	
	// Make a wristwatch that's twice the size, 
	// and moved over 500 pixels in x direction
	// 200 pixels in the y direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(small,2, 2);
	h2 = ShapeTransforms.translatedCopyOf(h2,500,200);
	g2.setColor(Color.BLACK);

	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Rotate the longstraps wristwatch 45 degrees around its center.
	g2.setColor(Color.BLACK);
	Shape r1 = ShapeTransforms.rotatedCopyOf(longstraps, Math.PI/4.0);
	g2.draw(r1);

	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Some wristwatches by Brandon Tran", 20,20);
    }
    
    /**
     * Draw a picture with a couple clockfaces and wristwatches
     */

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing	
	g2.drawString("A bunch of clockfaces and wristwatches by Brandon Tran", 20,20);
	
	// Draw some clockfaces
	Clockface c1 = new Clockface(100, 200, 75);
	Clockface c2 = new Clockface(500, 200, 75);

	// Draw some wristwatches
	Wristwatch c3 = new Wristwatch(300, 200, 75, 100);
	Wristwatch c4 = new Wristwatch(700, 200, 75, 100);
	
	g2.setColor(Color.RED);    
	g2.draw(c1);
	g2.setColor(Color.GREEN);   
	g2.draw(c2);
	g2.setColor(Color.CYAN);    
	g2.draw(c3);
     	g2.setColor(Color.BLACK);	
	g2.draw(c4);

    }       
}
