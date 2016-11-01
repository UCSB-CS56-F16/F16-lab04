package edu.ucsb.cs56.drawings.rancher.simple;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

// the four tools things we'll use to draw

/**
 * A component that draws a Picture by Phill Conrad
 *
 * @author Phill Conrad (original drawing)
 * @author Yuanqi Li (fixed the snowmans's head)
 * @version CS56, Fall 2016, UCSB
 */

public class PictureComponent extends JComponent
{
    /**
     * The paintComponent method is always required if you want any graphics to appear in your JComponent.
     * 
     * There is a paintComponent method that is created for you in the JComponent class, but it doesn't do what
     * we want, so we have to *override* that method with our own method.
     * 
     * This overriding is typical when inheritance is used. In inheritance, you take something that is a "basic"
     * version of what you want, then you "trick it out" with your own custom features. Sort of a "pimp my Java
     * class" kind of thing.
     */
    
    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D)g;

        // draw a title

        g2.drawString("Snowman by Yuanqi Li", 20,20);

        // draw a house

        g2.draw(new Rectangle2D.Double(100, 200, 100, 100));    // house
        g2.draw(new Line2D.Double(100, 200, 150, 150));         // left sides of the roof
        g2.draw(new Line2D.Double(150,150, 200,200));           // right sides of the roof
	
        // draw a snowman
	
        final double bottomRadius = 20;
        final double middleRadius = 15;
        final double topRadius = 10;
        final double snowManCenterBottomX = 400;
        final double snowManCenterBottomY = 300;

        // bottom circle
        g2.draw(new Circle(
                snowManCenterBottomX,
                snowManCenterBottomY - bottomRadius,
                bottomRadius
        ));

        // middle circle
        g2.draw(new Circle(
                snowManCenterBottomX,
                snowManCenterBottomY - bottomRadius * 2 - middleRadius,
                middleRadius
        ));

        // top circle
        g2.draw(new Circle(
                snowManCenterBottomX,
                snowManCenterBottomY - bottomRadius * 2 - middleRadius * 2 - topRadius,
                topRadius
        ));
    }
}
