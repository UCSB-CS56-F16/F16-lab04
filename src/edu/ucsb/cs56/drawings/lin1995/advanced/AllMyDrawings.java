package edu.ucsb.cs56.drawings.lin1995.advanced;

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
 * @author Xingyuan Lin
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /**
		a method to draw a picture of three shirts<br/>
		one is in the color cyan and without logo, one is in the green and with a logo, one is in the black and without a logo
    */
    public static void drawPicture1(Graphics2D g2) {
    	Shirt shirt1 = new Shirt(200,200);
    	g2.setColor(Color.CYAN);
    	g2.draw(shirt1);

    	ShirtWithLogo shirt2 = new ShirtWithLogo(400,200);
    	g2.setColor(Color.GREEN);
    	g2.draw(shirt2);
		
		Shape shirt3 = ShapeTransforms.scaledCopyOfLL(shirt1,2.0,2.0);
		shirt3 = ShapeTransforms.translatedCopyOf(shirt3,100,220);
		g2.setColor(Color.BLACK); g2.draw(shirt3);
		
		Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
		
		Stroke orig=g2.getStroke();
		g2.setStroke(thick);
		g2.setColor(new Color(0x002FA7)); 
		g2.draw(shirt3); 
		
		g2.setStroke(orig);
		g2.setColor(Color.BLACK); 
		g2.drawString("Some Shirts by Xingyuan Lin", 20,20);
    }

    /**
		a method to draw a picture of an array of shirts<br/>
    */ 
    public static void drawPicture2(Graphics2D g2) {
    	Shirt shirt1 = new Shirt(100,100);
    	g2.setColor(Color.MAGENTA);
    	g2.draw(shirt1);

    	for(int i = 1; i < 5; i++){
			Shape shirt2 = ShapeTransforms.rotatedCopyOf(shirt1, Math.PI/6.0*i);
			shirt2 = ShapeTransforms.translatedCopyOf(shirt2,100*i,50*i);
	    	g2.setColor(Color.RED);
	    	g2.draw(shirt2);
    	}

		Stroke thick = new BasicStroke (2.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
    	ShirtWithLogo shirt3 = new ShirtWithLogo(600,300);
    	Stroke orig=g2.getStroke();
		g2.setStroke(thick);
		g2.setColor(new Color(0x002FA7)); 
		g2.draw(shirt3);

		g2.setStroke(orig);
		g2.setColor(Color.BLACK); 
		g2.drawString("Some Shirts by Xingyuan Lin", 20,20);
    }
    
    /**
		a method to draw a picture of an array of shirts<br/>
    */ 
    public static void drawPicture3(Graphics2D g2) {
		Shirt shirt1 = new Shirt(0,0);
    	for(int i = 1; i < 5; i++){
	    	Shape shirt2 = ShapeTransforms.scaledCopyOfLL(shirt1, 0.5*i, 0.5*i);
	    	shirt2 = ShapeTransforms.translatedCopyOf(shirt2, 100*i, 100*i);
	    	g2.setColor(Color.GREEN);
	    	g2.draw(shirt2);
    	}

		Stroke thick = new BasicStroke (8.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
    	ShirtWithLogo shirt3 = new ShirtWithLogo(300,300);
    	Stroke orig=g2.getStroke();
		g2.setStroke(thick);
		g2.setColor(Color.RED); 
		g2.draw(shirt3); 

		g2.setStroke(orig);
		g2.setColor(Color.BLACK); 
		g2.drawString("Some Shirts by Xingyuan Lin", 20,20);
    }       
}
