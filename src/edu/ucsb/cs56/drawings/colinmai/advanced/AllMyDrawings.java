package edu.ucsb.cs56.drawings.colinmai.advanced;

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
 * @author Colin Mai
 * @version for UCSB CS56, F16
 */

public class AllMyDrawings
{
    /** Draw a picture with a few suns 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Sun h1 = new Sun(100,250,100,100);
	g2.setColor(Color.BLACK); g2.draw(h1);
	SunWithFace h2= new SunWithFace(500,250,100,100);
		g2.setColor(Color.PINK); g2.draw(h2);

		Shape h3 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
		h3 = ShapeTransforms.translatedCopyOf(h3,300,0);
		g2.setColor(Color.GREEN); g2.draw(h3);
		g2.drawString("Colin Mai and his suns)", 20,20);
    }
    
    
    /** Draw a picture with a few suns
     */
    public static void drawPicture2(Graphics2D g2) {

		SunWithFace h1 = new SunWithFace(100,150,200,200);
		g2.setColor(Color.RED); g2.draw(h1);
		SunWithFace h2= new SunWithFace(500,350,150,150);
		g2.setColor(Color.BLACK); g2.draw(h2);

		Shape h3 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
		h3 = ShapeTransforms.translatedCopyOf(h3,200,100);
		g2.setColor(Color.GREEN); g2.draw(h3);

		Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
		SunWithFace h4 = new SunWithFace(400,150,150,150);
		Stroke orig=g2.getStroke();
		g2.setStroke(thick);
		g2.setColor(new Color(0x002FA7));
		g2.draw(h4);
		//g2.setColor(Color.BLUE); g2.draw(h4);

		g2.drawString("Colin Mai and his suns)", 20,20);

	}
    
    /** Draw a different picture with a few suns
     */
    
    public static void drawPicture3(Graphics2D g2) {

		SunWithFace h1 = new SunWithFace(200,150,50,50);
		g2.setColor(Color.RED); g2.draw(h1);
		SunWithFace h2= new SunWithFace(500,350,50,50);
		SunWithFace h4= new SunWithFace(400,250,50,50);
		SunWithFace h5= new SunWithFace(100,300,50,50);
		SunWithFace h7= new SunWithFace(50,100,50,50);
		SunWithFace h8= new SunWithFace(550,50,50,50);

		Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
		Stroke orig=g2.getStroke();
		g2.setStroke(thick);

		g2.setColor(Color.BLACK);
		g2.draw(h8);

		g2.setColor(Color.MAGENTA);
		//g2.draw(h2);


		g2.draw(h7);
		g2.setColor(Color.ORANGE);
		Shape hw3 = ShapeTransforms.rotatedCopyOf(h2, Math.PI/4.0);
		g2.draw(hw3);

		g2.setColor(Color.CYAN);
		Shape hw5 = ShapeTransforms.rotatedCopyOf(h4, Math.PI/1.2);
		g2.draw(hw5);

		g2.setColor(Color.GREEN);
		Shape hw6 = ShapeTransforms.rotatedCopyOf(h5, Math.PI/2.1);
		g2.draw(hw6);

		g2.drawString("Colin Mai and his suns)", 20,20);


    }       
}
