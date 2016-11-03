package edu.ucsb.cs56.drawings.lin1995.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape;
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

/**
   A House
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class ShirtWithLogo extends Shirt implements Shape
{
    public ShirtWithLogo(double x, double y)
    {
		super(x,y);
		Rectangle2D.Double rect1 =
		    new Rectangle2D.Double(x+10, y+6, 12, 12);
		Rectangle2D.Double rect2 =
		    new Rectangle2D.Double(x+10, y-6, 12, 12);
		Line2D.Double line1 = new Line2D.Double (x-4, y-6,
                                                 x-16, y-6);
		Line2D.Double line2 = new Line2D.Double (x-16, y+6,
                                                 x-16, y-6);
		Line2D.Double line3 = new Line2D.Double (x-4, y+6,
                                                 x-16, y+6);
		Line2D.Double line4 = new Line2D.Double (x-4, y+6,
                                                 x-4, y+18);
		Line2D.Double line5 = new Line2D.Double (x-4, y+18,
                                                 x-16, y+18);
        GeneralPath wholeShirt = this.get();
        wholeShirt.append(rect1, false);
        wholeShirt.append(rect2, false);
        wholeShirt.append(line1, false);
        wholeShirt.append(line2, false);
        wholeShirt.append(line3, false);
        wholeShirt.append(line4, false);
        wholeShirt.append(line5, false);
    }    
}
