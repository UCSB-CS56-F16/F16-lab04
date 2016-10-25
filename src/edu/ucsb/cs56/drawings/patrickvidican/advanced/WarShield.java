package edu.ucsb.cs56.drawings.patrickvidican.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
   A Shield

   @author Patrick Vidican
   @version for CS56, F16, UCSB

*/
public class WarShield extends Shield implements Shape
{
    /**
     * Constructor for objects of class WarShield
     */
    public WarShield(double x, double y, double radius)
    {
      super( x, y, radius );

	    // get the GeneralPath that we are going to append stuff to
	    GeneralPath gp = this.get();

      // add two iron bars to hold the wood together
	    Rectangle2D.Double bar1 =
        new Rectangle2D.Double(x+radius/2-12, y-radius/2, radius/10, radius);
	    Rectangle2D.Double bar2 =
	      new Rectangle2D.Double(x-radius/2, y-radius/2, radius/10, radius);

      Ellipse2D.Double rim =
        new Ellipse2D.Double( (x-radius)+(radius/10), (y-radius)+(radius/10), (2*radius)+(radius/10),  (2*radius)+(radius/10) );


      // rivet the bars onto the shield face
      GeneralPath wholeShield = this.get();
      wholeShield.append(bar1, false);
      wholeShield.append(rim, false);
      wholeShield.append(bar2, false); //false means dont continue the path
    }
}
