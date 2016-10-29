package edu.ucsb.cs56.drawings.patrickvidican.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.geom.Line2D;
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
      g2.setColor(Color.BLACK);
      Stroke orig = g2.getStroke();
      Stroke thick =
        new BasicStroke (2.0f,
                           BasicStroke.CAP_BUTT,
                           BasicStroke.JOIN_BEVEL);
      g2.setStroke(thick);
      WarShield s1 = new WarShield( 70+37.5, 240+3, 60 );
        g2.setColor(new Color(0x663300)); g2.draw(s1);

      WarShield s2 = new WarShield( 210+37.5, 240-5, 60 );
        g2.setColor(new Color(0x993300)); g2.draw(s2);

      WarShield s3 = new WarShield( 350+37.5, 240+4, 60 );
        g2.setColor(new Color(0x663333)); g2.draw(s3);

//      WarShield s4 = new WarShield( 490+37.5, 240-6, 60 );
//      g2.setColor(new Color(0x333333)); g2.draw(s4);
      Shape s4 = ShapeTransforms.rotatedCopyOf(s1, Math.PI/16.0);
      Shape s5 = ShapeTransforms.translatedCopyOf(s4,420,0);
        g2.draw(s5);

      g2.setStroke(orig);
      g2.setColor(Color.BLACK);
      g2.drawString("Shieldwall! by Patrick Vidican", 20,20);
    }
    public static void drawPicture2(Graphics2D g2) {
      Stroke orig = g2.getStroke();
      Stroke thinner =
        new BasicStroke (2.0f,
                           BasicStroke.CAP_BUTT,
                           BasicStroke.JOIN_BEVEL);
      g2.setStroke(thinner);
      Shield s1 = new Shield( 420, 240, 80 );
        g2.setColor(new Color(0x663300)); g2.draw(s1);

        Stroke thin =
          new BasicStroke (3.0f,
                             BasicStroke.CAP_BUTT,
                             BasicStroke.JOIN_BEVEL);
      g2.setStroke(thin);
      WarShield s2 = new WarShield(520, 100, 80);
      Shape bashed = ShapeTransforms.rotatedCopyOf(s2, Math.PI/8.0);
        g2.setColor(new Color(0x993300)); g2.draw( bashed );

      Line2D.Double whoosh1 =
          new Line2D.Double(420-50, 240-80,
                            250, 240-80);
      Line2D.Double whoosh2 =
          new Line2D.Double(420-50, 240+80,
                            250, 240+80);
      Line2D.Double whoosh3 =
          new Line2D.Double(420-100, 240,
                            250-80, 240);

      g2.setStroke(orig);
      g2.setColor(Color.BLACK);
      g2.draw(whoosh1); g2.draw(whoosh2); g2.draw(whoosh3);
      g2.drawString("Shield Bash! by Patrick Vidican", 20,20);
    }
    public static void drawPicture3(Graphics2D g2) {
      // stub
    }
}
