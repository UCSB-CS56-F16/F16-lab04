package edu.ucsb.cs56.drawings.hduransoto.advanced;

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
 * @author Hernan Duran Soto
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    // Draw a picture with a few bears
    public static void drawPicture1(Graphics2D g2) {
	
	Bear b1 = new Bear(100,250,50,75);
	g2.setColor(new Color(0XC46210));
	g2.draw(b1);
	
	// Make a bear that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2       = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.BLACK);
	g2.draw(b2);
	
	// Here's a bear that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick =
	    new BasicStroke
	    (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	/** for hex colors, see (e.g.) 
	    http://en.wikipedia.org/wiki/List_of_colors
	    #002FA7 is "International Klein Blue" according to Wikipedia
	    In HTML we use #, but in Java (and C/C++) its 0x
	*/
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0xA67B5B)); 
	g2.draw(b2); 
	
	// SIGN AND LABEL YOUR DRAWING
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("bears", 20,20);
    }
    

    
    public static void drawPicture2(Graphics2D g2) {
	
	PandaBear big      = new PandaBear(250,450,225,150);
	PandaBear small    = new PandaBear(220,250,40,30);
	PandaBear tallSkinny = new PandaBear(220,350,20,40);
	PandaBear shortFat   = new PandaBear(350,250,40,20);
	
	g2.setColor(Color.BLACK);     g2.draw(big);
	g2.setColor(Color.BLACK);   g2.draw(small);
	g2.setColor(Color.BLACK);    g2.draw(tallSkinny);
	g2.setColor(Color.BLACK); g2.draw(shortFat);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of panda bears by Hernan Duran", 20,20);
    }
    
    /** Draw a different picture with a bear and a panda bear
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Drawing 3: A bunch of bears by Hernan Duran", 20,20);
	
	
	// Draw some bears
	
	Bear large = new Bear(500,400,75,150);
	PandaBear small = new PandaBear(300,300,40,30);
	Bear b3 = new Bear(150,400,50,200);
	Shape b3Twin = ShapeTransforms.rotatedCopyOf(b3, Math.PI/-2.0);
	PandaBear tiny = new PandaBear(150,100,10,10);
	Shape tinyTwin = ShapeTransforms.rotatedCopyOf(tiny, Math.PI/-3.0);	
	
	g2.setColor(new Color(0x964B00)); g2.draw(large);
	g2.setColor(new Color(0x1B1B1B)); g2.draw(small);
	g2.setColor(new Color(0xC2B280)); g2.draw(b3Twin);
	g2.setColor(new Color(0x696969)); g2.draw(tinyTwin);
	
    }       
}
