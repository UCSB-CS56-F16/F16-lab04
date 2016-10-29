package edu.ucsb.cs56.drawings.nrperry.advanced;

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
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	MagicWand mw1 = new MagicWand(50,200,50,75);
	g2.setColor(Color.CYAN); g2.draw(mw1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape mw2 = ShapeTransforms.scaledCopyOfLL(mw1,0.5,0.5);
        mw2 = ShapeTransforms.translatedCopyOf(mw2,150,0);
	g2.setColor(Color.RED); g2.draw(mw2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	mw2 = ShapeTransforms.scaledCopyOfLL(mw2,4,4);
	mw2 = ShapeTransforms.translatedCopyOf(mw2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0xffff00)); 
	g2.draw(mw2); 
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few [uncharged] magic wands by Nick Perry", 20,20);
        
}
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some coffee cups.
	
	MagicWandV2 largeMW = new MagicWandV2(100,50,225,150);
	MagicWandV2 smallMW = new MagicWandV2(20,50,40,30);
	MagicWandV2 tallSkinnyMW = new MagicWandV2(20,150,20,40);
	
	g2.setColor(Color.RED);     g2.draw(largeMW);
	g2.setColor(Color.GREEN);   g2.draw(smallMW);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinnyMW);
	
	// Make a black house that's half the size,
	// Rotate it by pi/2
	// and moved over 150 pixels in x direction
	
	Shape mw1 = ShapeTransforms.scaledCopyOfLL(largeMW,0.5,0.5);
	mw1 = ShapeTransforms.translatedCopyOf(mw1,300,0);
	mw1 = ShapeTransforms.rotatedCopyOf(mw1, Math.PI);
	g2.setColor(Color.BLACK); g2.draw(mw1);


	Shape mw3 = ShapeTransforms.scaledCopyOfLL(tallSkinnyMW, 2, 2);
	mw3 = ShapeTransforms.translatedCopyOf(mw3, 0, 150);
	g2.setColor(Color.YELLOW); g2.draw(mw3);
	
	// Rotate the second house 45 degrees around its center.
	Stroke thick = new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	Stroke orig=g2.getStroke();
	g2.setColor(Color.ORANGE);

	Shape mw2 = ShapeTransforms.rotatedCopyOf(smallMW, Math.PI/3);
	mw2 = ShapeTransforms.translatedCopyOf(mw2, 400, 0);
	g2.setStroke(thick);
	g2.draw(mw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of rotated, transformed and scaled [charged] magic wands by Nick Perry", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A rotated [charged] wand by Nick Perry", 20,20);
	
	
	// Draw some coffee cups.
	
	MagicWandV2 mw = new MagicWandV2(50,50,100,100);
	g2.setColor(Color.RED);     g2.draw(mw);

	Shape s1 = ShapeTransforms.translatedCopyOf(mw, 125, 0);
	s1 = ShapeTransforms.rotatedCopyOf(s1, Math.PI/4);
	g2.setColor(Color.ORANGE); g2.draw(s1);

	Shape s2 = ShapeTransforms.translatedCopyOf(mw, 250, 0);
	s2 = ShapeTransforms.rotatedCopyOf(s2, Math.PI/2);
	g2.setColor(Color.YELLOW); g2.draw(s2);

	Shape s3 = ShapeTransforms.translatedCopyOf(mw, 375, 0);
	s3 = ShapeTransforms.rotatedCopyOf(s3, 3*Math.PI/4);
	g2.setColor(Color.GREEN); g2.draw(s3);
	
    }       
}
