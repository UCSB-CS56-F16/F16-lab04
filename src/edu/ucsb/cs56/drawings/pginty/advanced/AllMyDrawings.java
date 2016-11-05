package edu.ucsb.cs56.drawings.pginty.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
import sun.security.provider.SHA;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /**
	 * Demonstrates how buses can be used in a pattern.
	 * Alternates thick stroke buses with regular stroke buses
     */
    
    public static void drawPicture1(Graphics2D g2) {
		// label the drawing
		g2.setColor(Color.black);
		g2.drawString("Alternating double-decker buses by Peter Ginty", 20,20);

		//save the normal stroke, create a thick stroke
		Stroke normal = g2.getStroke();
		Stroke thick = new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

		//create a double-decker bus
		DoubleDeckerBus d1 = new DoubleDeckerBus(50, 150, 60, 50);

		//Shape used to hold transformations of the bus
		Shape s1;

		//Repeat 3 times: draw a thick bus then a normal bus, incrementing the x coordinate each time
		int xoffset = 0;
		for (int i = 0; i < 3; ++i) {
			s1 = ShapeTransforms.translatedCopyOf(d1, xoffset, 0);
			g2.setStroke(thick);
			g2.draw(s1);
			xoffset += 80;
			s1 = ShapeTransforms.translatedCopyOf(d1, xoffset, 0);
			g2.setStroke(normal);
			g2.draw(s1);
			xoffset += 80;

		}

    }
    
    
    /**
	 * Demonstrates Shape properties of Bus and DoubleDeckerBus objects.
	 * Creates new buses as translated, rotated, and resized copies.
     */
    public static void drawPicture2(Graphics2D g2) {
		// label the drawing

		g2.setColor(Color.black);
		g2.drawString("Lots of double-decker buses by Peter Ginty", 20,20);

		// make a double-decker bus

		DoubleDeckerBus d1 = new DoubleDeckerBus(50, 300, 200, 150);
		g2.draw(d1);

		//make another double-decker bus, half the size, and moved 225 pixels to the right

		Shape d2 = ShapeTransforms.scaledCopyOf(d1, 0.5, 0.5);
		d2 = ShapeTransforms.translatedCopyOf(d2, 225, 0);
		g2.draw(d2);

		//make another double-decker bus, this time rotated 180deg (upside-down) and translated vertically

		Shape d3 = ShapeTransforms.rotatedCopyOf(d2,Math.toRadians(180));
		d3 = ShapeTransforms.translatedCopyOf(d3, 0, 150);
		g2.draw(d3);

		//make a normal bus, then create a larger bus around it (double dimensions) in a different color

		Bus b1 = new Bus(425, 150, 50, 50);
		Shape b2 = ShapeTransforms.scaledCopyOf(b1, 2, 2);
		g2.draw(b1);  g2.setColor(Color.green); g2.draw(b2);
    }
    
    /**
	 * Most simple example - declaring and drawing some buses and double-decker buses in different colors
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
		// label the drawing

		g2.drawString("Some buses in different colors by Peter Ginty", 20,20);


		// Draw some buses.

		Bus large = new Bus(50,250,300,150);
		Bus little = new Bus(220,50,40,30);

		g2.setColor(Color.red);     g2.draw(large);
		g2.setColor(Color.green);   g2.draw(little);

		//Draw some double decker buses.

		DoubleDeckerBus bigDouble = new DoubleDeckerBus(400, 300, 150, 150);
		DoubleDeckerBus bigDouble2 = new DoubleDeckerBus(400, 450, 150, 150);
		g2.setColor(Color.blue);   g2.draw(bigDouble);
		g2.setColor(Color.magenta);   g2.draw(bigDouble2);
    }


}
