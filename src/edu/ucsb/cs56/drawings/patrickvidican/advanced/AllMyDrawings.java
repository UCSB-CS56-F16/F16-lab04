package edu.ucsb.cs56.drawings.patrickvidican.advanced;

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
 * @author Patrick Vidican
 * @version for UCSB CS56, F16
 */

public class AllMyDrawings
{
    /** Draw a picture with a few Shields
     */

    public static void drawPicture1(Graphics2D g2) {
      WarShield s1 = new WarShield( 100, 240, 80 );
      g2.setColor( Color.BLACK ); g2.draw(s1);

      WarShield s2 = new WarShield( 440, 240, 120 );
      g2.setColor( Color.BLACK ); g2.draw(s2);
    }
    public static void drawPicture2(Graphics2D g2) {
      //stub
    }
    public static void drawPicture3(Graphics2D g2) {

    }
}
