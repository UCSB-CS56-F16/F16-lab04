package edu.ucsb.cs56.drawings.tcisewski.advanced;

import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;

/**
 * Created by trent on 10/28/2016.
 */
public class IceCreamWithSprinkles extends IceCream {

    /**
     * Constructor for objects of class IceCreamWithSprinkles
     * @param x    x coordinate of center of ice cream
     * @param y    y coordinate of center of ice cream
     * @param r    radius of ice cream
     */

    public IceCreamWithSprinkles(double x, double y, double r){

        super(x, y, r);

        Line2D.Double sprink1 =
                new Line2D.Double (x + (.5 * r), y + (.25 * r),
                        x + (.5 * r), y + (.5 * r));

        Line2D.Double sprink2 =
                new Line2D.Double (x - (.5 * r), y + (.75 * r),
                        x - (.5 * r), y + (.33 * r));


        Line2D.Double sprink3 =
                new Line2D.Double (x + (.75 * r), y + (.5 * r),
                        x + (.25 * r), y + (.5 * r));

        Line2D.Double sprink4 =
                new Line2D.Double (x - (.33 * r), y - (.5 * r),
                        x - (.75 * r), y - (.5 * r));

        Line2D.Double sprink5 =
                new Line2D.Double (x + (.75 * r), y,
                        x + (.75 * r), y + (.25 * r));

        Line2D.Double sprink6 =
                new Line2D.Double (x - (.75 * r), y,
                        x - (.75 * r), y + (.25 * r));


        Line2D.Double sprink7 =
                new Line2D.Double (x, y + (.75 * r),
                        x + (.25 * r), y + (.75 * r));

        Line2D.Double sprink8 =
                new Line2D.Double (x, y - (.75 * r),
                        x + (.25 * r), y - (.75 * r));

        Line2D.Double sprink9 =
                new Line2D.Double (x + (.25 * r), y,
                        x - (.25 * r), y);

        GeneralPath creamWithSprinkles = this.get();
        creamWithSprinkles.append(sprink1, false);
        creamWithSprinkles.append(sprink2, false);
        creamWithSprinkles.append(sprink3, false);
        creamWithSprinkles.append(sprink4, false);
        creamWithSprinkles.append(sprink5, false);
        creamWithSprinkles.append(sprink6, false);
        creamWithSprinkles.append(sprink7, false);
        creamWithSprinkles.append(sprink8, false);
        creamWithSprinkles.append(sprink9, false);

    }
}
