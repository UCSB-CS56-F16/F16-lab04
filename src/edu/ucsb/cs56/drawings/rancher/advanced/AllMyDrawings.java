package edu.ucsb.cs56.drawings.rancher.advanced;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;

import java.awt.*;

/**
 * A class with static methods for drawing various pictures
 *
 * @author Phill Conrad
 * @author Yuanqi Li
 * @version for UCSB CS56, F16
 */

public class AllMyDrawings
{
    /**
     * Draw a picture with a few surfaces
     */
    public static void drawPicture1(Graphics2D g2) {

        // draw a small surface
        Surface surface = new Surface(20, 30, 192, 108);
        g2.setBackground(Color.black);
        g2.draw(surface);

        // draw a bigger surface
        Shape s2 = ShapeTransforms.scaledCopyOf(surface, 2.0, 2.0);
        s2 = ShapeTransforms.translatedCopyOf(s2, 200, 0);
        g2.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
        g2.setColor(new Color(0x002FA7));
        g2.draw(s2);

        // draw a apple surface
        SurfaceWithApple s3 = new SurfaceWithApple(20, 30 + 108 + 5, 192, 108);
        g2.setStroke(new BasicStroke());
        g2.setColor(Color.orange);
        g2.draw(s3);

        // draw a longer surface
        Surface s4 = new SurfaceWithApple(20, 30 + 108 * 2 + 10, 192 * 2, 130);
        g2.setColor(Color.red);
        g2.draw(s4);

        // draw a title
        g2.setStroke(new BasicStroke());
        g2.setColor(Color.black);
        g2.drawString("Surfaces by Yuanqi Li", 20, 20);
    }

    /**
     * Draw a picture with a few surfaces
     */
    public static void drawPicture2(Graphics2D g2) {

        // draw a small surface
        Surface surface = new Surface(20, 30, 192, 108);
        g2.setBackground(Color.black);
        g2.draw(surface);

        // draw a bigger surface
        Shape s2 = ShapeTransforms.scaledCopyOf(surface, 2.0, 2.0);
        s2 = ShapeTransforms.translatedCopyOf(s2, 200, 0);
        g2.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
        g2.setColor(new Color(0x002FA7));
        g2.draw(s2);

        // draw a apple surface
        Shape s3 = new SurfaceWithApple(20, 30 + 108 + 5, 192, 108);
        s3 = ShapeTransforms.rotatedCopyOf(s3, 2);
        g2.setColor(Color.orange);
        g2.draw(s3);

        // draw a longer surface
        Shape s4 = new SurfaceWithApple(20, 30 + 108 * 2 + 10, 192 * 2, 130);
        s4 = ShapeTransforms.rotatedCopyOf(s4, 0.2);
        g2.setColor(Color.red);
        g2.draw(s4);

        // draw a title
        g2.setStroke(new BasicStroke());
        g2.setColor(Color.BLACK);
        g2.drawString("A bunch of Surfaces by Yuanqi Li", 20,20);
    }

    /**
     * Draw a different picture with a few surfaces
     */
    public static void drawPicture3(Graphics2D g2) {

        // label the drawing
        g2.drawString("Another bunch of Surfaces by Yuanqi Li", 20, 20);

        // draw some surfaces
        Surface small = new Surface(100, 50, 225, 150);
        Surface large = new SurfaceWithApple(100, 200, 300, 200);

        g2.setColor(Color.RED);
        g2.draw(large);

        g2.setColor(Color.GREEN);
        g2.draw(small);

    }
}
