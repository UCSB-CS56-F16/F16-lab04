package edu.ucsb.cs56.drawings.maxdevisser.advanced;

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
 * @author Max de Visser 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few empty soccer fields
     */
    
    public static void drawPicture1(Graphics2D g2) {

	SoccerField f1 = new SoccerField(100, 100, 120, 75);
	SoccerField f2 = new SoccerField(300, 100, 220, 200);
	SoccerField f3 = new SoccerField(400, 350, 150, 50);

	g2.setColor(Color.RED);     g2.draw(f1);
	g2.setColor(Color.GREEN);   g2.draw(f2);

	Stroke thick = new BasicStroke
	    (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(f3);

	g2.setColor(new Color(0x8F00FF));
	Shape fr = ShapeTransforms.rotatedCopyOf(f1, Math.PI/4.0);
	fr = ShapeTransforms.translatedCopyOf(fr,0,150);
	g2.draw(fr);
        
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Some soccer fields by Max de Visser", 20,20);
	
    }
    
    
    /** Draw a picture with full soccer fields
     */
    public static void drawPicture2(Graphics2D g2) {
	SoccerFieldKickoff f1 = new SoccerFieldKickoff(100, 100, 100, 65);
	SoccerFieldKickoff f2 = new SoccerFieldKickoff(400, 100, 220, 200);
	SoccerFieldKickoff f3 = new SoccerFieldKickoff(200, 350, 350, 200);

	g2.setColor(Color.BLACK);     g2.draw(f1);
	g2.setColor(Color.ORANGE);   g2.draw(f2);

	Stroke thick = new BasicStroke
	    (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(Color.BLUE); 
	g2.draw(f3);

	g2.setColor(Color.RED);
	Shape fr = ShapeTransforms.rotatedCopyOf(f1, Math.PI/4.0);
	fr = ShapeTransforms.translatedCopyOf(fr,0,150);
	g2.draw(fr);
        
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Some soccer fields with players by Max de Visser", 20,20);
	
    }
    
    /** Draw a different picture with a few empty fields and full fields
     */
    
    public static void drawPicture3(Graphics2D g2) {
	SoccerField f1 = new SoccerField(100, 100, 250, 165);
	SoccerFieldKickoff f2 = new SoccerFieldKickoff(375, 25, 100, 100);
	SoccerFieldKickoff f3 = new SoccerFieldKickoff(400, 350, 150, 50);

	g2.setColor(Color.BLUE);    g2.draw(f1);
	g2.setColor(Color.GREEN);   g2.draw(f2);

	Stroke thick = new BasicStroke
	    (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(f3);

	g2.setStroke(orig);
	g2.setColor(Color.ORANGE);
	Shape fr = ShapeTransforms.rotatedCopyOf(f1, Math.PI/4.0);
	fr = ShapeTransforms.translatedCopyOf(fr,0,150);
	g2.draw(fr);
        
	
	g2.setColor(Color.BLACK); 
	g2.drawString("A mix of empty fields and full fields by Max de Visser", 20,20);
    }       
}
