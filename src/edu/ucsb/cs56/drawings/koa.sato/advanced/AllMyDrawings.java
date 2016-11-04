package edu.ucsb.cs56.drawings.koa.sato.advanced;

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
 * @author Koa Sato 
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few Cars and RaceCars. 
 *
     *  @param g2 Graphics2D reference to draw pictures.
     */

    public static void drawPicture1(Graphics2D g2) {

        Car c1 = new Car(0,200,250,100);
        g2.setColor(Color.BLUE);
	
		
        // Here's a Car that's 3x as big (3x the original)
        // and moved over 25 pixels to right.
        Shape c2;
        c2 = ShapeTransforms.scaledCopyOfLL(c1,3,3);
        c2 = ShapeTransforms.translatedCopyOf(c1,25,0);

        // We'll draw this with a thicker stroke
        Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

        // for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
        // #002FA7 is "International Klein Blue" according to Wikipedia
        // In HTML we use #, but in Java (and C/C++) its 0x

        Stroke orig=g2.getStroke();
        g2.setStroke(thick);
        g2.setColor(new Color(0x002FA7));
        g2.draw(c2);

        // Draw two houses with Windows

        RaceCar rc1 = new RaceCar(400,200,100,75);
        RaceCar rc2 = new RaceCar(200,350,200,100);

        g2.draw(rc1);
        g2.setColor(new Color(0x8F00FF)); g2.draw(rc2);

        // @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

        g2.setStroke(orig);
        g2.setColor(Color.BLACK);
        g2.drawString("A few Cars and RaceCars by Koa Sato", 20,20);
    }


    /** Draw another picture with a few Cars and RaceCars
     *
     * @param g2 Graphics2D reference to draw pictures.
     */
    
    public static void drawPicture2(Graphics2D g2) {

        // Draw some RaceCars.

        RaceCar smallCC = new RaceCar(20,50,40,30);
        RaceCar tallSkinny = new RaceCar(20,150,50,100);
        RaceCar shortFat = new RaceCar(20,250,40,20);

        g2.setColor(Color.GREEN);   g2.draw(smallCC);
        g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
        g2.setColor(Color.MAGENTA); g2.draw(shortFat);

        Car c1 = new Car(100,250,100,75);
        g2.setColor(Color.CYAN); g2.draw(c1);

        // Make a black house that's half the size, 
        // and moved over 150 pixels in x direction, and 50 pixels up
        Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
        c2 = ShapeTransforms.translatedCopyOf(c2,150,-50);
        g2.setColor(Color.BLACK); g2.draw(c2);

        // Here's a house that's 4x as big (2x the original)
        // and moved over 150 more pixels to right.
        c2 = ShapeTransforms.scaledCopyOfLL(c2,4,4);
        c2 = ShapeTransforms.translatedCopyOf(c2,150,0);

        // We'll draw this with a thicker stroke
        Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);

        // for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
        // #002FA7 is "International Klein Blue" according to Wikipedia
        // In HTML we use #, but in Java (and C/C++) its 0x

        Stroke orig=g2.getStroke();
        g2.setStroke(thick);
        g2.setColor(new Color(0x002FA7));
        g2.draw(c2);

        // Draw two houses with Windows

        RaceCar rc1 = new RaceCar(50,350,40,75);
        RaceCar rc2 = new RaceCar(200,350,200,100);

        g2.draw(rc1);
        g2.setColor(new Color(0x8F00FF));

        // Rotate the second house 45 degrees around its center.
        Shape rc3 = ShapeTransforms.rotatedCopyOf(rc2, Math.PI/4.0);

        g2.draw(rc3);

        // @@@ FINALLY, SIGN AND LABEL YOUR DRAWING

        g2.setStroke(orig);
        g2.setColor(Color.BLACK);
        g2.drawString("A bunch of RaceCars and Cars by Koa Sato", 20,20);
    }

    /** Draw a different picture with RaceCars
     *
     *  @param g2 Graphics2D reference to draw pictures.
     */

    public static void drawPicture3(Graphics2D g2) {

        // label the drawing

        g2.drawString("A couple RaceCars by Koa Sato", 20,20);

        // Draw some coffee cups.

        RaceCar large = new RaceCar(25,350,350,250);
        RaceCar smallRC = new RaceCar(20,50,40,30);
        RaceCar mediumRC = new RaceCar(400,200,200,100);
        
        g2.setColor(Color.RED);     g2.draw(large);
        g2.setColor(Color.GREEN);   g2.draw(smallRC);
        g2.setColor(Color.BLUE);    g2.draw(mediumRC);

    }
}
