package edu.ucsb.cs56.drawings.tcisewski.advanced;

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
 * @author Trenton Cisewski
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few icecreams
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	IceCream i1 = new IceCream(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(i1);
	
	Shape i2 = ShapeTransforms.scaledCopyOfLL(i1,0.5,0.5);
	i2 = ShapeTransforms.translatedCopyOf(i2,250,0);
	g2.setColor(Color.BLACK); g2.draw(i2);

	i2 = ShapeTransforms.scaledCopyOfLL(i2,4,4);
	i2 = ShapeTransforms.translatedCopyOf(i2,150,0);

	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(i2);
	
	IceCreamWithSprinkles is1 = new IceCreamWithSprinkles(650,350,40);
	IceCreamWithSprinkles is2 = new IceCreamWithSprinkles(200,350,50);
	
	g2.draw(is1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(is2);

	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few ice cream cones by Trenton Cisewski", 20,20);
    }
    
    
    /** Draw a picture with a few icecreams with sprinkles
     */
    public static void drawPicture2(Graphics2D g2) {

		g2.drawString("Some cones with and without sprinkles by Trenton Cisewski", 20,20);

		IceCream i1 = new IceCream(100,100,50);
		Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
		g2.setStroke(thick);
		g2.setColor(new Color(0x002FA7));
		g2.draw(i1);

		IceCreamWithSprinkles is1 = new IceCreamWithSprinkles(250,100,50);
		g2.setColor(new Color(0xE81B28));
		g2.draw(is1);

		Shape is2 = ShapeTransforms.rotatedCopyOf(is1, Math.PI);
		is2 = ShapeTransforms.translatedCopyOf(is2,0,210);
		g2.setColor(new Color(0x17BA21));
		g2.draw(is2);

		IceCreamWithSprinkles is3 = new IceCreamWithSprinkles(350,250,25);
		g2.setColor(new Color(0xFF5733));
		g2.draw(is3);

	}
    
    /** Draw 4 icecreams all touching cones
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
		g2.drawString("4 ice cream cones by Trenton Cisewski", 20,20);

		IceCream i1 = new IceCream(250,100,50);
		Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
		g2.setStroke(thick);
		g2.setColor(new Color(0x002FA7));
		g2.draw(i1);

		Shape i2 = ShapeTransforms.rotatedCopyOf(i1, Math.PI);
		i2 = ShapeTransforms.translatedCopyOf(i2,0,210);
		g2.setColor(new Color(0xE81B28));
		g2.draw(i2);

		Shape i3 = ShapeTransforms.rotatedCopyOf(i1, Math.PI/2.0);
		i3 = ShapeTransforms.translatedCopyOf(i3,110,110);
		g2.setColor(new Color(0xFFFF00));
		g2.draw(i3);

		Shape i4 = ShapeTransforms.rotatedCopyOf(i1, Math.PI/-2.0);
		i4 = ShapeTransforms.translatedCopyOf(i4,-110,110);
		g2.setColor(new Color(0x17BA21));
		g2.draw(i4);

    }       
}
