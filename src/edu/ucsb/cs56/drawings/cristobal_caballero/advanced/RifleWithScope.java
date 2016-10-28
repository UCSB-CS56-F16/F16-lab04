package edu.ucsb.cs56.drawings.cristobal_caballero.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import edu.ucsb.cs56.drawings.cristobal_caballero.simple.Circle;

/**
   A Rifle with a scope
      
   @author Cristobal Caballero 
   @version for CS56, F16, UCSB   
*/

public class RifleWithScope extends Rifle implements Shape{
    
    /**
     * Constructor for objects of class RifleWithScope
     */
    public RifleWithScope(double x, double y, double width){
	// construct the basic rifle
		super(x,y,width);

		GeneralPath rifle = this.get();

		GeneralPath scope = new GeneralPath();
		scope.moveTo(x + .5*width, y);
		scope.lineTo(x + .5*width, y - .02*width);
		scope.lineTo(x + .55*width, y - .02*width);
		scope.lineTo(x + .55*width, y);
		scope.moveTo(x + .5*width, y - .04*width);
		scope.lineTo(x + .55*width, y - .04*width);
		Circle c1 = new Circle(x + .5*width, y - .03*width, .01*width);
		Circle c2 = new Circle(x + .55*width, y - .03*width, .01*width);
		scope.append(c1,false);
		scope.append(c2,false);

		rifle.append(scope, false);

    }    
}
