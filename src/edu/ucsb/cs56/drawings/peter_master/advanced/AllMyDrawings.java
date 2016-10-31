package edu.ucsb.cs56.drawings.peter_master.advanced;

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
 * @author Peter Master
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few stick figures
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	StickFigure h1 = new StickFigure(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);

	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);

	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	FashionableStickFigure hw1 = new FashionableStickFigure(50,350,40,75);
	FashionableStickFigure hw2 = new FashionableStickFigure(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of stick figures by Peter Master", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some stick figures.
	
	StickFigure giant = new StickFigure(100,50,225);
	StickFigure small1 = new StickFigure(20,50,40);
	StickFigure tiny = new StickFigure(20,150,20);
	StickFigure small2 = new StickFigure(20,250,40);
	
	g2.setColor(Color.RED);     g2.draw(giant);
	g2.setColor(Color.GREEN);   g2.draw(small1);
	g2.setColor(Color.BLUE);    g2.draw(tiny);
	g2.setColor(Color.MAGENTA); g2.draw(small2);
	
	StickFigure h1 = new StickFigure(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	FashionableStickFigure hw1 = new FashionableStickFigure(50,350,40,75);
	FashionableStickFigure hw2 = new FashionableStickFigure(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	g2.draw(hw3);
	
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of stick figures, both with hats and not, by Peter Master", 20,20);
    }
    
    /** Draw a different picture with a stick
        figure with a hat and a stick figure without
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A couple of stick figures by Peter Master", 20,20);
	
	StickFigure hatlessLargePerson = new StickFigure(100,50,225);
	FashionableStickFigure hattedSmallPerson = new FashionableStickFigure(20,50,225,90);
	
	g2.setColor(Color.RED);     g2.draw(hatlessLargePerson);
	g2.setColor(Color.GREEN);   g2.draw(hattedSmallPerson);
	
    }       
}
