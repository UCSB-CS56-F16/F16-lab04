package edu.ucsb.cs56.drawings.diegosegundo.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing a pizza made up of a 
   triangle and a rectangle crust
      
   @author Diego Segundo 
   @version for CS56, F16, UCSB
   
*/
public class Pizza extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param width is width of the pizza and other dimensions
       based off this size
       @param x x-coordinate of bottm left part of pizza
       @param y y-coordinate of bottom left part of pizza
    */
    public Pizza(double x, double y, double width)
    {
        
        double pizzaW = width;
        double pizzaH = (width)*(1.7320508);  //  *sqrt(3)
        
        double crustH = (width)*(0.2);
        
        // Make the crust
        
        Rectangle2D.Double crust = 
            new Rectangle2D.Double(x, y-crustH , pizzaW, crustH);
     
        // make the trianle part of the pizza
        
        Line2D.Double leftSide = 
            new Line2D.Double (x, y,
                               x + (pizzaW/2.0), y + pizzaH);
	
        Line2D.Double rightSide =
            new Line2D.Double (x + pizzaW, y,
                               x + (pizzaW/2.0), y + pizzaH);
	
        // put the whole house together
	
        GeneralPath wholePizza = this.get();
        wholePizza.append(crust, false);
        wholePizza.append(leftSide, false);
        wholePizza.append(rightSide, false);    
    }
}
