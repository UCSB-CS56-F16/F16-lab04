package edu.ucsb.cs56.drawings.millanbatra.advanced;

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
 * @author Millan Batra 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** picture with three drums side by side of increasing size 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Drum d1 = new Drum(10,200,10,10);
	g2.setColor(Color.CYAN); g2.draw(d1);
	//drum one
	//drum 2 is .4 size of drum 1
	Shape d2 = ShapeTransforms.scaledCopyOfLL(d1,2,2);
	d2 = ShapeTransforms.translatedCopyOf(d2,100,0);
	g2.setColor(Color.GREEN); g2.draw(d2);
	
	//drum that's 4 times as big and moved
	// over 200 more pixels to right.
	d2 = ShapeTransforms.scaledCopyOfLL(d2,4,4);
	d2 = ShapeTransforms.translatedCopyOf(d2,100,0);
	
	// thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(d2); 

	
	
	//SIGN AND LABEL
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("3 increasing drums by Millan Batra", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    
    public static void drawPicture2(Graphics2D g2) {
	//lower left drum	
	DrumTwo d1 = new DrumTwo(50,200,10,10);
	g2.setColor(Color.BLACK); g2.draw(d1);
	
	// drum that should be twice as big and put up and to the right
	Shape d2 = ShapeTransforms.scaledCopyOfLL(d1,2,2);
	d2 = ShapeTransforms.translatedCopyOf(d2,40,-20);
	g2.setColor(Color.BLACK); g2.draw(d2);
	
	// drum that's same size as previous and moved right
	d2 = ShapeTransforms.scaledCopyOfLL(d2,1,1);
	d2 = ShapeTransforms.translatedCopyOf(d2,80,0);
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(d2); 
	
	//final drum
       
	//DrumTwo d3 = new DrumTwo(50,50,10,10);
	Shape d4 = ShapeTransforms.translatedCopyOf(d1,200,0);
	g2.draw(d4);
	g2.setColor(new Color(0x8F00FF)); 
	
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Drums on a Stand in a set Millan Batra", 20,20);
    }
    
    public static void drawPicture3(Graphics2D g2) {
	//drum at 150, middle of window in blue
	DrumTwo d1= new DrumTwo(150,50,10,10);
	g2.setColor(Color.BLUE);
	g2.draw(d1);
	//rotate d1 by 180 degrees and put underneath first drumm
        Shape d2= ShapeTransforms.rotatedCopyOf(d1, Math.PI);
	d2= ShapeTransforms.translatedCopyOf(d2, 0, 50);
	g2.setColor(Color.RED);
	g2.draw(d2);
	//shift d1 down by 100
	Shape d3= ShapeTransforms.translatedCopyOf(d1,0,100 );
	g2.setColor(Color.BLUE);
	g2.draw(d3);
	//shift d2, a rotated d1 down by 100.
	Shape d4= ShapeTransforms.translatedCopyOf(d2,0,100); 
	g2.setColor(Color.RED);
	g2.draw(d4);
	
	g2.drawString("Drums on Drums on Drums by Millan Batra", 20,20);
	
	
	
   
    }       
}
