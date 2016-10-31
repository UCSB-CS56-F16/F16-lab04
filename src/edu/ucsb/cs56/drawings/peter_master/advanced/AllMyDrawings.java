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
	
	StickFigure s1 = new StickFigure(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(s1);
	
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);

	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);

	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(s2); 
	
	FashionableStickFigure fs1 = new FashionableStickFigure(50,350,40,75);
	FashionableStickFigure fs2 = new FashionableStickFigure(200,150,200,100);
	
	g2.draw(fs1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(fs2);
	
	
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
	
	StickFigure s1 = new StickFigure(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(s1);
	
	Shape s2 = ShapeTransforms.scaledCopyOfLL(s1,0.5,0.5);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	g2.setColor(Color.BLACK); g2.draw(s2);
	
	s2 = ShapeTransforms.scaledCopyOfLL(s2,4,4);
	s2 = ShapeTransforms.translatedCopyOf(s2,150,0);
	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(s2); 
	
	FashionableStickFigure fs1 = new FashionableStickFigure(50,350,40,75);
	FashionableStickFigure fs2 = new FashionableStickFigure(200,350,200,100);
	
	g2.draw(fs1);
	g2.setColor(new Color(0x8F00FF)); 
	Shape fs3 = ShapeTransforms.rotatedCopyOf(fs2, Math.PI/4.0);
	
	g2.draw(fs3);
	
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of stick figures, some with hats some without, by Peter Master", 20,20);
    }
    
    /** Draw a different picture with a stick
        figure with a hat and a stick figure without
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A couple of stick figures by Peter Master", 20,20);
	
	StickFigure hatlessLargePerson = new StickFigure(100,50,225);
	FashionableStickFigure hattedSmallPerson = new FashionableStickFigure(300,200,225,90);
	
	g2.setColor(Color.RED);     g2.draw(hatlessLargePerson);
	g2.setColor(Color.GREEN);   g2.draw(hattedSmallPerson);
	
    }       
}
