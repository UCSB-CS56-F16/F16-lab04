package edu.ucsb.cs56.drawings.cfrausto.advanced;

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
 * @author Clara Frausto
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	Key k1 = new Key(400, 100,75, 50);
	g2.setColor(Color.ORANGE);
	g2.draw(k1);

	//Make a key that is twice the size and moved 200 pixels in the x direction
	//The key is black
	Shape k2 = ShapeTransforms.scaledCopyOfLL(k1, 2, 2);
	k2 = ShapeTransforms.translatedCopyOf(k2, 200, 0);
	g2.setColor(Color.BLACK);
	g2.draw(k2);

	//Here's a tiny cute key that is below the second key.
	k2 = ShapeTransforms.scaledCopyOfLL(k2, 0.1, 0.1);
	k2 = ShapeTransforms.translatedCopyOf(k2, 0, 150);

	//We will make the stroke so thick the key looks filled in
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	Stroke normal = g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7));
	g2.draw(k2);


	g2.setStroke(normal);
	g2.setColor(Color.BLACK);
	g2.drawString("My name is Clara Frausto and this is a few keys", 20,20);
	       
	    	
	// Draw two bike keys
	
	BikeKey bk1 = new BikeKey(350,50,75,40);
	BikeKey bk2 = new BikeKey(10,200,200,100);
	
	g2.draw(bk1);
	g2.setColor(new Color(0x8F00FF));
	g2.draw(bk2);
	
}
    
    
    /** Draw a picture with some more keys
     */
    public static void drawPicture2(Graphics2D g2) {

		
	BikeKey large = new BikeKey(300,50,150,250);
	BikeKey small = new BikeKey(20,30,30,40);
	BikeKey longSkinny = new BikeKey(20,150,100,20);
	BikeKey longerSkinny = new BikeKey(20,250, 200,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(longSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(longerSkinny);
	
	Key k1 = new Key(100,250,75,50);
	g2.setColor(Color.CYAN);
	g2.draw(k1);
	
	//Another key  that's double the size, 
	// and moved over 150 pixels in y direction
	Shape k2 = ShapeTransforms.scaledCopyOfLL(k1, 2, 2);
	k2 = ShapeTransforms.translatedCopyOf(k2,0,150);
	g2.setColor(Color.GREEN);
	g2.draw(k2);
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FFF)); 
	g2.draw(k2); 
	
		
	// Rotate a third key 45 degrees around its center
	Shape k3 = ShapeTransforms.rotatedCopyOf(k2, Math.PI/4.0);
	g2.draw(k3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A lot of keys by Clara Frausto", 20,20);
	
}
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {

	g2.drawString("My name is Clara Frausto and this is even more keys", 20,20);
		
	//A huge Bike key and a small Bike key that are red and green respectively	
	BikeKey huuge = new BikeKey(30,30,220,400);
	BikeKey tiny = new BikeKey(400,300,22,40);
	
	g2.setColor(Color.RED);     
	g2.draw(huuge);
	
	g2.setColor(Color.GREEN);   
	g2.draw(tiny);

	//now make a copy of tiny and rotate 180
	Shape tiny2 = ShapeTransforms.rotatedCopyOf(tiny, Math.PI/1.0);
	g2.draw(tiny2);
	
  

	
    }       
}
