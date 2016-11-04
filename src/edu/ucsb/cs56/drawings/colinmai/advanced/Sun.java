package edu.ucsb.cs56.drawings.colinmai.advanced;
import edu.ucsb.cs56.drawings.colinmai.simple.Circle;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A Sun (wrapper around a General Path, implements Shape)
      
   @author Colin Mai
   @version for CS56, F16, UCSB
   
*/
public class Sun extends GeneralPathWrapper implements Shape
{   
    /**
     * Constructor for objects of class Sun
     */
    public Sun(double x, double y, double width, double height)
    {

	final double sun_radius = height/2;
        

	
        // circle
	Circle suncircle =
	   new Circle
	    (
	     x,
	     y,
	     sun_radius
	     );

		GeneralPath rays = new GeneralPath();
		rays.moveTo(x,(y+(sun_radius*1.35)));
		rays.lineTo(x,(y+sun_radius*2));
		rays.moveTo(x,(y-(sun_radius*1.35)));
		rays.lineTo(x,(y-sun_radius*2));

		rays.moveTo(x+(sun_radius*1.35),y);
		rays.lineTo(x+sun_radius*2,y);
		rays.moveTo(x-(sun_radius*1.35),y);
		rays.lineTo(x-sun_radius*2,y);

	//	int cos45 = 0.525;
		rays.moveTo(x+(sun_radius),y+sun_radius);
		rays.lineTo(x+sun_radius+(0.525*sun_radius),y+sun_radius+(0.525*sun_radius));
		rays.moveTo(x-(sun_radius),y+sun_radius);
		rays.lineTo(x-sun_radius-(0.525*sun_radius),y+sun_radius+(0.525*sun_radius));
		rays.moveTo(x+(sun_radius),y-sun_radius);
		rays.lineTo(x+sun_radius+(0.525*sun_radius),y-sun_radius-(0.525*sun_radius));
		rays.moveTo(x-(sun_radius),y-sun_radius);
		rays.lineTo(x-sun_radius-(0.525*sun_radius),y-sun_radius-(0.525*sun_radius));

		GeneralPath sun =  this.get();
        sun.append (suncircle,false);
		sun.append (rays,false);

    }

}
