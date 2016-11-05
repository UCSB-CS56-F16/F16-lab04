package edu.ucsb.cs56.drawings.qwertyuiop5040.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures.
 * 
 * @author Phill Conrad 
 * @author Hanqing Wang
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a bunch of flags of all shapes and sizes
    	@param g2 the Graphics2D object that draws 2D shapes.
	 */
    
    public static void drawPicture1(Graphics2D g2) {
	Stroke orig=g2.getStroke();
	TriangularFlag tf1=new TriangularFlag(200,200,150,75, 0.03, 4);
	g2.setColor(Color.RED);
	g2.draw(tf1);

	TriangularFlag tf2=new TriangularFlag(100,300,50,200, 0.05, 1.3);
	Shape s2=ShapeTransforms.rotatedCopyOf(tf2,Math.PI/3.0);
	g2.setColor(Color.BLUE);
	g2.draw(s2);

	Stroke thicker=new BasicStroke(6.0f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
	TriangularFlag tf3=new TriangularFlag(20,350,200,100,0.03, 1.7);
	g2.setStroke(thicker);
	g2.setColor(new Color(0xFF33DDA3));
	g2.draw(tf3);

	PirateFlag pf=new PirateFlag(40,80,300,400,0.07,1.2);
	g2.setStroke(orig);
	g2.setColor(new Color(0xFF3F6D8F));
	g2.draw(pf);

	PirateFlag pf2=new PirateFlag(300,100,150,200,0.03,0.8);
	g2.setColor(new Color(0xFFFF0000));
	g2.draw(pf2);

	TriangularFlag tf4=new TriangularFlag(400,300,100,50);
	Shape s=ShapeTransforms.scaledCopyOfLL(tf4,2,3);
	s=ShapeTransforms.translatedCopyOf(s,-200,0);
	g2.setColor(Color.CYAN);
	g2.draw(s);

	TriangularFlag tf5=new TriangularFlag(350,150,125,300,0.08,7);
	g2.setColor(new Color(0xFF662266));
	g2.draw(tf5);

	g2.setColor(Color.BLACK); 
	g2.drawString("Some Crazy Flags by Hanqing Wang", 20,20);
    }
    
    
    /** Draw a picture with a bunch of flags in a circle, and then a bunch of pirate flags in a circle
	@param g2 The graphics2D object that draws 2D shapes.
     */
    public static void drawPicture2(Graphics2D g2) {
	//Drawing inner circle
	TriangularFlag tf=new TriangularFlag(270,140,100,200);
	for(int i=0;i<8;i++){
		Shape s=ShapeTransforms.rotatedCopyOf(tf,Math.PI/4.0*((double)i));
		int r=(255-i*255/8)%256;
		int g=(i*800)%256;
		int b=(i*255/8)%256;
		int color= 0xFF000000 | (r<<16) | (g<<8) | b;
		g2.setColor(new Color(color));
		g2.draw(s);
	}
	//Drawing outer circle
	PirateFlag pf=new PirateFlag(140,0,360,480);
	for(int i=0;i<8;i++){
		Shape s=ShapeTransforms.rotatedCopyOf(pf,Math.PI/4.0*((double)i));
		int r=(i*800)%256;
		int g=(i*255/8)%256;
		int b=(255-i*255/8)%256;
		int color=0xFF000000|(r<<16)|(g<<8)|b;
		g2.setColor(new Color(color));
		g2.draw(s);
	}
	g2.setColor(Color.BLACK); 
	g2.drawString("Flags in a Circle by Hanqing Wang", 20,20);
    }
    
    /** Draws a pirate ship made of flags and pirate flags
	@param g2 The Graphics2D object that draws 2D shapes.
     */
    
    public static void drawPicture3(Graphics2D g2) {
	//Drawing 3 pirate flags
	PirateFlag pf=new PirateFlag(245,100,150,200);
	Shape s=ShapeTransforms.scaledCopyOfLL(pf,0.8,0.6);
	Shape s2=ShapeTransforms.translatedCopyOf(s,-100,0);
	Shape s3=ShapeTransforms.translatedCopyOf(s,220,0);
	g2.setColor(Color.BLACK);
	g2.draw(pf);
	g2.setColor(Color.BLUE);
	g2.draw(s2);
	g2.draw(s3);
	
	//Drawing base of ship
	TriangularFlag tf=new TriangularFlag(270,10,100,480);//centered at 320,250
	Shape s4=ShapeTransforms.rotatedCopyOf(tf,-Math.PI/2.0);
	g2.setColor(new Color(0xFF654321));
	Stroke orig=g2.getStroke();
	Stroke thick=new BasicStroke(2.5f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL);
	g2.setStroke(thick);
	g2.draw(s4);

	s4=ShapeTransforms.scaledCopyOfLL(s4,0.6,1.0);
	s4=ShapeTransforms.translatedCopyOf(s4,96,100);
	g2.draw(s4);

	TriangularFlag tf2=new TriangularFlag(130,270,30,140);
	Shape s5=ShapeTransforms.rotatedCopyOf(tf2, -Math.PI/4.0);
	g2.draw(s5);

	TriangularFlag tf3=new TriangularFlag(510,290,30,140);
	Shape s6=ShapeTransforms.rotatedCopyOf(tf3,Math.PI/4.0);
	g2.draw(s6);

	g2.setStroke(orig);	
	g2.setColor(Color.BLACK);
	g2.drawString("A Pirate Ship Made Of Flags by Hanqing Wang",20,20);
	
    }       
}
