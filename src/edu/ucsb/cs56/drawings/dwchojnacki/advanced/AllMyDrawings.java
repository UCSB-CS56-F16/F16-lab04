package edu.ucsb.cs56.drawings.dwchojnacki.advanced;

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
 * @author Daniel Chojnacki
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    
    public static void drawPicture1(Graphics2D g2) {
	
	PokeBall p1 = new PokeBall(100, 250, 25, 50);
	g2.setColor(Color.RED); g2.draw(p1);

	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,0.5,0.5);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	g2.setColor(Color.BLUE); g2.draw(p2);

	p2 = ShapeTransforms.scaledCopyOfLL(p2,4,4);
	p2 = ShapeTransforms.translatedCopyOf(p2,150,0);
	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(p2);

	MasterBall mb1 = new MasterBall(50,350,50);
	MasterBall mb2 = new MasterBall(200,350,75);
	
	g2.draw(mb1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(mb2);

	int [] ex1 = new int[]{30, 90, 60, 30};
	int [] ey1 = new int[]{40, 40, 75, 70};
	RecursiveQuadrilateral rq1 = new RecursiveQuadrilateral(ex1, ey1);
	g2.setColor(Color.RED); g2.draw(rq1);

	Shape rq2 = ShapeTransforms.scaledCopyOfLL(rq1,0.5,0.5);
	rq2 = ShapeTransforms.translatedCopyOf(rq2,150,0);
	g2.setColor(Color.GREEN); g2.draw(rq2);

	rq2 = ShapeTransforms.scaledCopyOfLL(rq2,4,4);
	rq2 = ShapeTransforms.translatedCopyOf(rq2,150,0);
	
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(rq2);

	Cube rc1 = new Cube(350,50,50,45,0);
	Cube rc2 = new Cube(40,75,75,45,1);
	
	g2.draw(rc1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(rc2);
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few shapes by Daniel Chojnacki", 20,20);
    }

    public static void drawPicture2(Graphics2D g2) {

	PokeBall poke = new PokeBall(300, 150, 30, 40);
	PokeBall great = new PokeBall(60, 150, 40, 50);
	PokeBall ultra = new PokeBall(60, 450, 50, 60);
	PokeBall dusk = new PokeBall(60, 750, 60, 70);
	
	g2.setColor(Color.RED);     g2.draw(poke);
	g2.setColor(Color.BLUE);   g2.draw(great);
	g2.setColor(Color.BLACK);    g2.draw(ultra);
	g2.setColor(Color.CYAN); g2.draw(dusk);
	
	MasterBall mb1 = new MasterBall(300,750,100);
	g2.setColor(Color.MAGENTA); g2.draw(mb1);

	Shape mb2 = ShapeTransforms.scaledCopyOfLL(mb1,0.5,0.5);
	mb2 = ShapeTransforms.translatedCopyOf(mb2,150,0);
	g2.setColor(Color.BLACK); g2.draw(mb2);
	
	mb2 = ShapeTransforms.scaledCopyOfLL(mb2,4,4);
	mb2 = ShapeTransforms.translatedCopyOf(mb2,150,0);
	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(Color.YELLOW); 
	g2.draw(mb2); 
	
	MasterBall mb3 = new MasterBall(250,800,100);
	MasterBall mb4 = new MasterBall(800,250,300);
	
	g2.draw(mb3);
	g2.setColor(new Color(0x8F00FF)); 
	
	Shape mb5 = ShapeTransforms.rotatedCopyOf(mb4, Math.PI/4.0);
	
	g2.draw(mb5);
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of pokeballs by Daniel Chojnacki", 20,20);
    }
    
    public static void drawPicture3(Graphics2D g2) {
	
	g2.drawString("PokeBalls by Daniel Chojnacki", 20,20);

	PokeBall poke = new PokeBall(100, 100, 9, 27);
	PokeBall great = new PokeBall(250, 100, 15, 25);
	PokeBall ultra = new PokeBall(400, 100, 30, 30);
	PokeBall love = new PokeBall(100, 250, 23, 23);
	PokeBall safari = new PokeBall(250, 250, 40, 10);
	PokeBall dive = new PokeBall(400, 250, 10,60);
	MasterBall masterBall1 = new MasterBall(100, 400, 30);
	MasterBall masterBall2 = new MasterBall(250, 400, 50);
	MasterBall masterBall3 = new MasterBall(400, 400, 70);
	g2.setColor(Color.RED);
	g2.draw(poke);
	g2.setColor(Color.BLUE);
	g2.draw(great);
	g2.setColor(Color.BLACK);
	g2.draw(ultra);
	g2.setColor(Color.PINK);
	g2.draw(love);
	g2.setColor(Color.GREEN);
	g2.draw(safari);
	g2.setColor(Color.BLUE);
	g2.draw(dive);
	g2.setColor(new Color(0x8F00FF));
	g2.draw(masterBall1);
	g2.draw(masterBall2);
	g2.draw(masterBall3);
    }       
}
