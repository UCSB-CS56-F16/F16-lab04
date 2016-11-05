package edu.ucsb.cs56.drawings.cristobal_caballero.advanced;

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
 * @author Cristobal Caballero
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{

    public static void drawPicture1(Graphics2D g2) {
	
	Rifle r1 = new Rifle(20,30,100);
	g2.setColor(Color.RED); g2.draw(r1);

	Shape h2 = ShapeTransforms.scaledCopyOfLL(r1,2,2);
	h2 = ShapeTransforms.translatedCopyOf(h2,0,40);
	g2.setColor(Color.ORANGE); g2.draw(h2);

	h2 = ShapeTransforms.scaledCopyOfLL(r1,3,3);
	h2 = ShapeTransforms.translatedCopyOf(h2,0,98);
	Stroke thick = new BasicStroke (2.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(Color.YELLOW); 
	g2.draw(h2);
	
	h2 = ShapeTransforms.scaledCopyOfLL(r1,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,0,172);
        Stroke thick2 = new BasicStroke (3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	g2.setStroke(thick2);
	g2.setColor(Color.GREEN); 
	g2.draw(h2);

	h2 = ShapeTransforms.scaledCopyOfLL(r1,5,5);
	h2 = ShapeTransforms.translatedCopyOf(h2,0,265);
        Stroke thick3 = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	g2.setStroke(thick3);
	g2.setColor(Color.BLUE); 
	g2.draw(h2);

	h2 = ShapeTransforms.scaledCopyOfLL(r1,6,6);
	h2 = ShapeTransforms.translatedCopyOf(h2,0,380);
        Stroke thick4 = new BasicStroke (5.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	g2.setStroke(thick4);
	g2.setColor(new Color(150,0,200)); 
	g2.draw(h2);

	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("'Rainbow Rifles' by Cristobal Caballero", 15,15);
    }
    
    
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some rifles with scopes.

	RifleWithScope large = new RifleWithScope(100,100,300);
	RifleWithScope medium = new RifleWithScope(180,180,200);
	RifleWithScope small = new RifleWithScope(325,325,100);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(medium);
	g2.setColor(Color.BLUE);    g2.draw(small);
	
	RifleWithScope rs1 = new RifleWithScope(100,250,200);
	g2.setColor(Color.CYAN); g2.draw(rs1);

	Shape rs2 = ShapeTransforms.scaledCopyOfLL(rs1,0.5,0.5);
	rs2 = ShapeTransforms.translatedCopyOf(rs2,150,0);
	g2.setColor(Color.BLACK); g2.draw(rs2);

	rs2 = ShapeTransforms.scaledCopyOfLL(rs2,4,4);
	rs2 = ShapeTransforms.translatedCopyOf(rs2,150,0);

	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(rs2); 

	RifleWithScope rs3 = new RifleWithScope(10,300,200);
	RifleWithScope rs4 = new RifleWithScope(310,60,200);

	g2.draw(rs3);
	g2.setColor(new Color(0x8F00FF));
		Shape rs5 = ShapeTransforms.translatedCopyOf(rs4,0,90);
		rs5 = ShapeTransforms.rotatedCopyOf(rs4, Math.PI/4.0);
	g2.draw(rs5);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Rifles with scopes by Cristobal Caballero", 20,20);
    }
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
		g2.drawString("A Rifle insignia by Cristobal Caballero", 20,20);

		Stroke thick = new BasicStroke (1.3f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
		g2.setStroke(thick);
		RifleWithScope rs1 = new RifleWithScope(200,55,180);
		g2.setColor(Color.RED);     g2.draw(rs1);

		Shape rs2 = ShapeTransforms.scaledCopyOfLL(rs1,1,1);
		rs2 = ShapeTransforms.translatedCopyOf(rs2,155,57);
		rs2 = ShapeTransforms.rotatedCopyOf(rs2, Math.PI/3.0);
		g2.setColor(Color.GREEN);	g2.draw(rs2);

		rs2 = ShapeTransforms.translatedCopyOf(rs2,33,160);
		rs2 = ShapeTransforms.rotatedCopyOf(rs2, Math.PI/3.0);
		g2.setColor(Color.YELLOW);	g2.draw(rs2);

		rs2 = ShapeTransforms.translatedCopyOf(rs2,-128,113);
		rs2 = ShapeTransforms.rotatedCopyOf(rs2, Math.PI/3.0);
		g2.setColor(new Color(150,0,200));	g2.draw(rs2);

		rs2 = ShapeTransforms.translatedCopyOf(rs2,-154,-58);
		rs2 = ShapeTransforms.rotatedCopyOf(rs2, Math.PI/3.0);
		g2.setColor(Color.BLUE);	g2.draw(rs2);

		rs2 = ShapeTransforms.translatedCopyOf(rs2,-31,-161);
		rs2 = ShapeTransforms.rotatedCopyOf(rs2, Math.PI/3.0);
		g2.setColor(Color.ORANGE);	g2.draw(rs2);
    }       
}
