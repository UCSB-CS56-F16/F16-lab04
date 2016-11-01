package edu.ucsb.cs56.drawings.hyeminyoo.advanced;

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
 * @author Hyemin Yoo 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with few chairs and rolling chairs 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Chair c1 = new Chair(90,200,50,75);
	g2.setColor(Color.ORANGE); g2.draw(c1);
	
	RollingChair rc1= new RollingChair(150, 250, 100, 150);
	g2.setColor(Color.RED);
	//rc1=ShapeTransforms.rotatedCopyOf(rc1, Math.PI/4.0);
	g2.draw(rc1);

	Shape c2=ShapeTransforms.scaledCopyOfLL(c1,1.5,1.5);
	c2=ShapeTransforms.translatedCopyOf(c2,250,250);
	c2=ShapeTransforms.rotatedCopyOf(c2,Math.PI*7.0/8.0);
	g2.setColor(Color.GREEN);
	g2.draw(c2);	
	
	Shape c3=ShapeTransforms.scaledCopyOfLL(rc1,0.5,0.5);
	c3=ShapeTransforms.translatedCopyOf(c3,275,0);
	c3=ShapeTransforms.rotatedCopyOf(c3,Math.PI/(-4.0));
	g2.setColor(new Color(0x666600));
	g2.draw(c3);
	

	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	/*
	Shape h2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	// Draw two houses with Windows
	RollingChair rc1 = new RollingChair(50,350,40,75);
	RollingChair rc2 = new RollingChair(200,350,200,100);
	g2.draw(rc1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(rc2);
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
*/
//	g2.setStroke(orig);
//	g2.setColor(Color.BLACK);
	Stroke orig=g2.getStroke(); 
	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A few rolling and non-rolling chairs by Hyemin Yoo", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some coffee cups.
	
	/*	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	*/
	Chair c1 = new Chair(100,250,300,175);
	g2.setColor(new Color(0x800000));
	
	g2.draw(c1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.2,0.2);
	c2 = ShapeTransforms.translatedCopyOf(c2,300,100);
	c2=ShapeTransforms.rotatedCopyOf(c2,Math.PI/(-4.0));
	g2.setColor(new Color(0x008080)); g2.draw(c2);
	
	Shape c3=ShapeTransforms.scaledCopyOfLL(c1,1.2,1.2);
	c3=ShapeTransforms.translatedCopyOf(c3,150,0);
	c3=ShapeTransforms.rotatedCopyOf(c3,Math.PI*4.0/3.0);
	g2.setColor(new Color(0xFF00FF));
	g2.draw(c3);
	
	RollingChair rc1= new RollingChair(300,200,100,100);
	Stroke thick= new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	g2.setStroke(thick);
	g2.setColor(new Color(0x808000));
	g2.draw(rc1);
	
	RollingChair rc2= new RollingChair(20,20,50,50);
	g2.setColor(new Color(0xFF0000));
	g2.draw(rc2);
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	/*h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two houses with Windows
	
	HouseWithWindows hw1 = new HouseWithWindows(50,350,40,75);
	HouseWithWindows hw2 = new HouseWithWindows(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	*/
	Stroke orig=g2.getStroke();
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Few rolling chairs and just chairs that overlap by Minnie Yoo", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	Stroke orig=g2.getStroke();
	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("One chair and one rolling chair by Minnie Yoo", 20,20);
	
	Chair c1= new Chair (30,30,30,30);
	Stroke thick=new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	g2.setStroke(thick);
	g2.setColor(new Color(0xE9967A));
	g2.draw(c1);
	
	RollingChair rc1= new RollingChair(450,450,30,30);
	g2.setStroke(thick);
	g2.setColor(new Color(0x6495ED));
	g2.draw(rc1);
	
	// Draw some coffee cups.
	/*
	CoffeeCup large = new CoffeeCup(100,50,225,150);
	CoffeeCup smallCC = new CoffeeCup(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	*/
	
    }       
}
