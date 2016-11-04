package edu.ucsb.cs56.drawings.irene.advanced;

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
 * @author Phill Conrad
 * @version for UCSB CS56, W16
 */

public class AllMyDrawings
{
    /** Draw a picture with a couple leaves
     */
    
    public static void drawPicture1(Graphics2D g2) {
        
        /*House h1 = new House(100,250,50,75);
        g2.setColor(Color.CYAN); g2.draw(h1);
        
        // Make a black house that's half the size,
        // and moved over 150 pixels in x direction
        
        Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
        h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
        g2.setColor(Color.BLACK); g2.draw(h2);
        
        // Here's a house that's 4x as big (2x the original)
        // and moved over 150 more pixels to right.
        h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
        h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
        
        // We'll draw this with a thicker stroke
        Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
        
        // for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
        // #002FA7 is "International Klein Blue" according to Wikipedia
        // In HTML we use #, but in Java (and C/C++) its 0x
        
        Stroke orig=g2.getStroke();
        g2.setStroke(thick);
        g2.setColor(new Color(0x002FA7));
        g2.draw(h2);
        
        // Draw two houses with Windows
        
        HouseWithWindows hw1 = new HouseWithWindows(50,350,40,75);
        HouseWithWindows hw2 = new HouseWithWindows(200,350,200,100);
        
        g2.draw(hw1);
        g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
        
        // @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
        
        g2.setStroke(orig);
        g2.setColor(Color.BLACK);
        g2.drawString("A few houses by Phill Conrad", 20,20); */
        
        Leaf c1 = new Leaf(300,250,50,75);
        g2.setColor(Color.CYAN);
        g2.draw(c1);
        Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
        g2.setColor(Color.PINK);
        c2 = ShapeTransforms.translatedCopyOf(c2,150,0);
        c2 = ShapeTransforms.rotatedCopyOf(c2, Math.PI/4.0);
        g2.draw(c2);
        g2.setColor(Color.BLACK);
        g2.drawString("Leaves by Irene Pattarachanyakul", 20,20);
    }
    
    
    /** Draw a picture with a few caterpillar on some leaves
     */
    public static void drawPicture2(Graphics2D g2) {
        
        // Draw some coffee cups.
        
        /*CoffeeCup large = new CoffeeCup(100,50,225,150);
        CoffeeCup smallCC = new CoffeeCup(20,50,40,30);
        CoffeeCup tallSkinny = new CoffeeCup(20,150,20,40);
        CoffeeCup shortFat = new CoffeeCup(20,250,40,20);
        
        g2.setColor(Color.RED);     g2.draw(large);
        g2.setColor(Color.GREEN);   g2.draw(smallCC);
        g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
        g2.setColor(Color.MAGENTA); g2.draw(shortFat);
        
        House h1 = new House(100,250,50,75);
        g2.setColor(Color.CYAN); g2.draw(h1);
        
        // Make a black house that's half the size,
        // and moved over 150 pixels in x direction
        Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
        h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
        g2.setColor(Color.BLACK); g2.draw(h2);
        
        // Here's a house that's 4x as big (2x the original)
        // and moved over 150 more pixels to right.
        h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
        h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
        
        // We'll draw this with a thicker stroke
        Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
        
        // for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
        // #002FA7 is "International Klein Blue" according to Wikipedia
        // In HTML we use #, but in Java (and C/C++) its 0x
        
        Stroke orig=g2.getStroke();
        g2.setStroke(thick);
        g2.setColor(new Color(0x002FA7));
        g2.draw(h2);
        
        // Draw two houses with Windows
        
        HouseWithWindows hw1 = new HouseWithWindows(50,350,40,75);
        HouseWithWindows hw2 = new HouseWithWindows(200,350,200,100);
        
        g2.draw(hw1);
        g2.setColor(new Color(0x8F00FF));
        
        // Rotate the second house 45 degrees around its center.
        Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
        
        g2.draw(hw3);
        
        // @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
        
        g2.setStroke(orig);
        g2.setColor(Color.BLACK); 
        g2.drawString("A bunch of Coffee Cups and a few houses by Phill Conrad", 20,20);*/
        
        CaterpillarOnLeaf c1 = new CaterpillarOnLeaf(300,250,50,75);
        Shape c2 = ShapeTransforms.scaledCopyOfLL(c1,0.5,0.5);
        c2 = ShapeTransforms.translatedCopyOf(c2,200,0);
        c2 = ShapeTransforms.rotatedCopyOf(c2, Math.PI/2.0);
        g2.setColor(Color.GREEN);
        g2.draw(c1);
        g2.setColor(Color.RED);
        g2.draw(c2);
        Shape c3 = ShapeTransforms.scaledCopyOfLL(c1,0.2,0.2);
        c3 = ShapeTransforms.translatedCopyOf(c3,100,0);
        c3 = ShapeTransforms.rotatedCopyOf(c3, Math.PI/5.0);
        Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
        Stroke orig=g2.getStroke();
        g2.setStroke(thick);
        g2.setColor(new Color(0x002FA7));
        g2.draw(c3);
        Shape c4 = ShapeTransforms.scaledCopyOfLL(c2,0.2,0.2);
        c4 = ShapeTransforms.translatedCopyOf(c4,-200,0);
        c4 = ShapeTransforms.rotatedCopyOf(c4, Math.PI/5.0);
        g2.setStroke(thick);
        g2.setColor(new Color(0x8F00FF));
        g2.draw(c4);
        g2.drawString("Caterpillars Chilling on Leaves by Irene Pattarachanyakul", 20,20);
    }
    
    /** Draw a different picture with a few leaves and a caterpillar on a leaf
     */
    
    public static void drawPicture3(Graphics2D g2) {
        
        // label the drawing
        
//        g2.drawString("A bunch of Coffee Cups by Phill Conrad", 20,20);
//        
//        
//        // Draw some coffee cups.
//        
//        CoffeeCup large = new CoffeeCup(100,50,225,150);
//        CoffeeCup smallCC = new CoffeeCup(20,50,40,30);
//        
//        g2.setColor(Color.RED);     g2.draw(large);
//        g2.setColor(Color.GREEN);   g2.draw(smallCC);
        
        CaterpillarOnLeaf c1 = new CaterpillarOnLeaf(300,250,50,75);
        g2.setColor(new Color(0x00AD43));
        g2.draw(c1);
        Leaf c2 = new Leaf(300,250,50,75);
        Shape c4 = ShapeTransforms.translatedCopyOf(c2,-150,-150);
        c4 = ShapeTransforms.rotatedCopyOf(c4, Math.PI/2);
        c4 = ShapeTransforms.scaledCopyOfLL(c4,0.5,0.5);
        g2.setColor(Color.YELLOW);
        g2.draw(c4);
        Shape c3 = ShapeTransforms.scaledCopyOfLL(c2,0.4,0.4);
        c3 = ShapeTransforms.translatedCopyOf(c3,200,0);
        c3 = ShapeTransforms.rotatedCopyOf(c3, Math.PI/4.0);
        g2.setColor(Color.RED);
        g2.draw(c3);
        g2.setColor(Color.BLUE);
        g2.drawString("Caterpillars Chilling on Leaves with Other Leaves by Irene Pattarachanyakul", 20,20);
    }       
}






