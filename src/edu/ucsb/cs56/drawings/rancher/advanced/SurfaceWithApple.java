package edu.ucsb.cs56.drawings.rancher.advanced;

import java.awt.*;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.util.*;

/**
 * A vector drawing of a Microsoft Surface.
 *
 * @author Yuanqi Li
 * @version for CS56, F16, UCSB
 */
public class SurfaceWithApple extends Surface implements Shape
{
    /**
     * Constructor.
     *
     * @param x      x coordinate of lower left corner of surface
     * @param y      y coordinate of lower left corner of surface
     * @param width  width of the surface
     * @param height height of the surface
     */
    public SurfaceWithApple(double x, double y, double width, double height)
    {
        // draw a basic surface
        super(x, y, width, height);

        // draw an apple
        QuadCurve2D.Double apple1 = new QuadCurve2D.Double(
                x + width / 2 - 25, y + height/2,
                x + width / 2 - 25, y + height/2 - 30,
                x + width / 2, y + height/2 - 20
        );
        QuadCurve2D.Double apple2 = new QuadCurve2D.Double(
                x + width / 2 - 25, y + height/2,
                x + width / 2 - 25, y + height/2 + 30,
                x + width / 2, y + height/2 + 20
        );
        QuadCurve2D.Double apple3 = new QuadCurve2D.Double(
                x + width / 2 + 22, y + height/2 + 10,
                x + width / 2 + 22, y + height/2 + 30,
                x + width / 2, y + height/2 + 20
        );
        QuadCurve2D.Double apple4 = new QuadCurve2D.Double(
                x + width / 2 + 22, y + height/2 - 10,
                x + width / 2 + 22, y + height/2 - 30,
                x + width / 2, y + height/2 - 20
        );
        QuadCurve2D.Double apple5 = new QuadCurve2D.Double(
                x + width / 2 + 22, y + height/2 + 10,
                x + width / 2 + 10, y + height/2,
                x + width / 2 + 22, y + height/2 - 10
        );

        // draw a leaf
        QuadCurve2D.Double leaf1 = new QuadCurve2D.Double(
                x + width / 2, y + height/2 - 20,
                x + width / 2 - 5, y + height/2 - 25,
                x + width / 2 + 6, y + height/2 - 30
        );
        QuadCurve2D.Double leaf2 = new QuadCurve2D.Double(
                x + width / 2, y + height/2 - 20,
                x + width / 2 + 5, y + height/2 - 23,
                x + width / 2 + 6, y + height/2 - 30
        );

        // put them together
        this.get().append(apple1, false);
        this.get().append(apple2, false);
        this.get().append(apple3, false);
        this.get().append(apple4, false);
        this.get().append(apple5, false);
        this.get().append(leaf1, false);
        this.get().append(leaf2, false);
    }
}
