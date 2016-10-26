package edu.ucsb.cs56.drawings.adorotheo.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * @author Austin Dorotheo
 * 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    public static void drawPicture1(Graphics2D g2) {
	
        Mushroom h1 = new Mushroom(100,250,75,75);
	g2.setColor(new Color(0xFF033E)); g2.draw(h1);
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(new Color(0xFFBF00)); g2.draw(h2);
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x6F00FF)); 
	g2.draw(h2); 
	
	Mushroom h3 = new Mushroom(200, 200, 100, 100);
	g2.setColor(new Color(0x008000)); g2.draw(h3);
	Mushroom h4 = new Mushroom (25, 200, 125, 125);
	g2. setColor(new Color(0xFF5800)); g2.draw(h4);
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A Few Mushrooms by Austin Dorotheo", 20,20);
    }
    
    
    public static void drawPicture2(Graphics2D g2) {
	
	Stroke orig = g2.getStroke();
	Mushroom a = new Mushroom(50,50,100,100);
	MarioMushroom b = new MarioMushroom(150, 50, 100, 100);
	Mushroom c = new Mushroom(250, 50, 100, 100);
	MarioMushroom d = new MarioMushroom(350, 50, 100, 100);
	Mushroom e = new Mushroom(450, 50, 100, 100);
	MarioMushroom f = new MarioMushroom(50, 150, 100, 100);
	Mushroom g = new Mushroom(150, 150, 100, 100);
	MarioMushroom h = new MarioMushroom(250, 150, 100, 100);
	Mushroom i = new Mushroom(350, 150, 100, 100);
	MarioMushroom j = new MarioMushroom(450, 150, 100, 100);
	Mushroom k = new Mushroom(50, 250, 100, 100);
	MarioMushroom l = new MarioMushroom(150, 250, 100, 100);
	Mushroom m = new Mushroom( 250, 250, 100, 100);
	MarioMushroom n = new MarioMushroom(350, 250, 100, 100);
	Mushroom o = new Mushroom (450, 250, 100, 100);
	MarioMushroom p = new MarioMushroom(50, 350, 100, 100);
	Mushroom q = new Mushroom(150, 350, 100, 100);
	MarioMushroom r = new MarioMushroom(250, 350, 100, 100);
	Mushroom s = new Mushroom(350, 350, 100, 100);
	MarioMushroom t = new MarioMushroom(450, 350, 100, 100);
	g2.setColor(new Color(0x191970));
	g2.draw(a);
	g2.draw(c);
	g2.draw(e);
	g2.draw(g);
	g2.draw(i);
	g2.draw(k);
	g2.draw(m);
	g2.draw(o);
	g2.draw(q);
	g2.draw(s);
	g2.setColor(new Color(0xCF1020));
	g2.draw(b);
	g2.draw(d);
	g2.draw(f);
	g2.draw(h);
	g2.draw(j);
	g2.draw(l);
	g2.draw(n);
	g2.draw(p);
	g2.draw(r);
	g2.draw(t);
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Super Mushroom and Mushroom Checkerboard by Austin Dorotheo", 20,20);
    }
 
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Super Mushrooms and Mushrooms Diagonally by Austin Dorotheo", 20,20);
	MarioMushroom large = new MarioMushroom(50, 50, 200, 200);
	MarioMushroom med = new MarioMushroom(250, 250, 100, 100);
	MarioMushroom small = new MarioMushroom(350,350, 50, 50);
	Mushroom large2 = new Mushroom(250, 50, 200, 200);
	Mushroom med2 = new Mushroom(350, 250, 100, 100);
	Mushroom small2 = new Mushroom(400, 350, 50, 50);
	MarioMushroom large3 = new MarioMushroom(450, 50, 200, 200);
	MarioMushroom med3 = new MarioMushroom(450, 250, 100, 100);
	MarioMushroom small3 = new MarioMushroom(450, 350, 50, 50);
	g2.setColor(new Color(0xCF1020));
	g2.draw(large);
	g2.draw(med);
	g2.draw(small);
	g2.setColor(new Color(0x191970));
	g2.draw(large2);
	g2.draw(med2);
	g2.draw(small2);
	g2.setColor(new Color(0x1A1110));
	g2.draw(large3);
	g2.draw(med3);
	g2.draw(small3);
    }       
}
