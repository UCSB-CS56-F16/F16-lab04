package edu.ucsb.cs56.drawings.jleeong.simple;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

// the four tools things we'll use to draw

import java.awt.geom.Line2D;  // single lines
import java.awt.geom.Rectangle2D; 

/**
   A component that draws a Picture by Phill Conrad
   
   @author Phill Conrad (original drawing)
   @author @@@ ADD YOUR NAME (fixed the snowmans's head)
   @version for UCSB CS56, W16
*/

// Your class should "extend JComponent
// This is "inheritance", which we'll start readina about in Chapter 10
// It means that PictureComponent "is a" JComponent
//   that is, a special type of JComponent that is for a specific purpose

public class PictureComponent extends JComponent
{  
    
    /** The paintComponent method is always required if you want
     * any graphics to appear in your JComponent.    
     * 
     * There is a paintComponent
     * method that is created for you in the JComponent class, but it
     * doesn't do what we want, so we have to "override" that method with
     * our own method.  
     * 
     * This overriding is typical when inheritance is used.
     * In inheritance, you take something that is a "basic" version of
     * what you want, then you "trick it out" with your own custom features.
     * Sort of a "pimp my Java class" kind of thing.
     */
    
    public void paintComponent(Graphics g)
    {  
        // Recover Graphics2D--we always do this.
        // See sections 2.12, p. 60-61 for an explanation
	
        Graphics2D g2 = (Graphics2D) g;
	
        // Now the fun part---we draw stuff!
        // @@@ YOU'LL CUSTOMIZE EVERYTHING BELOW THIS LINE
	
        Rectangle2D.Double house = new Rectangle2D.Double(100, 200, 100, 100);
        g2.draw( house);
	
        // lroof and rroof are the left and right sides of the roof,
        Line2D.Double lroof = new Line2D.Double(100, 200, 150, 150);
        Line2D.Double rroof = new Line2D.Double(150,150, 200,200);
	
        g2.draw(lroof);
        g2.draw(rroof);
	
        // now a snowman: three circles
        // here we use constants, so that if we want to change 
        // the dimensions later, or move the snowman around,
        // it becomes easier.
	
        final double bottomRadius = 20;
        final double middleRadius = 15;
        final double topRadius = 10;
        final double snowManCenterBottomX = 400;
        final double snowManCenterBottomY = 300;
	
        Circle snowManBottomCircle = 
            new Circle
            (
	     snowManCenterBottomX,
	     snowManCenterBottomY - bottomRadius,
	     bottomRadius
	     );
        g2.draw(snowManBottomCircle);
	
        Circle snowManMiddleCircle = 
            new Circle
            (
	     snowManCenterBottomX,
	     snowManCenterBottomY - bottomRadius * 2 - middleRadius,
	     middleRadius
	     );
        g2.draw(snowManMiddleCircle);
	
        // @@@ ADD CODE HERE TO DRAW THE TOP CIRCLE
	Circle snowManTopCircle = new Circle(
		snowManCenterBottomX,
		snowManCenterBottomY - bottomRadius*2 - middleRadius*2 - topRadius,
		topRadius
		);
	g2.draw(snowManTopCircle);


        // @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	// @@@ 20, 20 are suggested coordinates, but you may change them

        g2.drawString("Simple Snowman and House Jared Leeong", 20,20);
	
    }
}
