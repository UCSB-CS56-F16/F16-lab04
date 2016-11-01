package edu.ucsb.cs56.drawings.rancher.advanced;

import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/**
 * A vector drawing of a Microsoft Surface.
 *
 * @author Yuanqi Li
 * @version for CS56, F16, UCSB
 */
public class Surface extends GeneralPathWrapper implements Shape
{
    /**
     * Constructor.
     *
     * @param x      x coordinate of lower left corner of surface
     * @param y      y coordinate of lower left corner of surface
     * @param width  width of the surface
     * @param height height of the surface
     */
    public Surface(double x, double y, double width, double height)
    {
        // draw the body and screen
        RoundRectangle2D.Double body = new RoundRectangle2D.Double(x, y, width, height, 4, 4);
        RoundRectangle2D.Double screen = new RoundRectangle2D.Double(x + 5, y + 5, width - 10, height - 25, 2, 2);

        // draw a microsoft logo of size 20 pixels.
        Rectangle2D.Double logo1 = new Rectangle2D.Double(x + width / 2 - 8, y + height - 18, 7, 7);
        Rectangle2D.Double logo2 = new Rectangle2D.Double(x + width / 2 + 1, y + height - 18, 7, 7);
        Rectangle2D.Double logo3 = new Rectangle2D.Double(x + width / 2 - 8, y + height - 9, 7, 7);
        Rectangle2D.Double logo4 = new Rectangle2D.Double(x + width / 2 + 1, y + height - 9, 7, 7);

        // put them all together
        GeneralPath surface = this.get();
        surface.append(body, false);
        surface.append(screen, false);
        surface.append(logo1, false);
        surface.append(logo2, false);
        surface.append(logo3, false);
        surface.append(logo4, false);
    }
}
