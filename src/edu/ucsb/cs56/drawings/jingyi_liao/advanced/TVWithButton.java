package edu.ucsb.cs56.drawings.jingyi_liao.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.jingyi_liao.simple.Circle;
/**
   A TV with button
      
   @author Jingyi Liao 
   @version for CS56, F16, UCSB,lab4
   
*/
public class TVWithButton extends TV implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of TV
       @param y y coord of lower left corner of TV
       @param width width of the whole TV
       @param height height of TV inculding the aerial 
    */
    public TVWithButton(double x, double y, double width, double height)
    {
	// construct the basic TV shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make three buttons, with radius (0.1 * height)/2
	// The center of button y will be at innerFrameY + innerFrameHeight + (0.1 * height)/2 
	// The center of button x1 will be at innerFrameX + (0.1 * height)/2 ; 
  // The center of button x2 will be at  x + width/2.0 ; 
  // The center of button x3 will be at innerFrameX + (width - 2 * 0.1 * height) - (0.1 * height)/2 
	double r = (0.1 * height)/2;
	double buttonY = y + 0.1 * height + 0.55 * height + (0.1 * height)/2;
	double buttonX1 =  x + 0.1 * height + (0.1 * height)/2;
	double buttonX2 =  x + width/2.0; 
	double buttonX3 =  x + 0.1 * height + (width - 2 * 0.1 * height) - (0.1 * height)/2;
	
	Circle button1 = new Circle(buttonX1, buttonY, r);
	Circle button2 = new Circle(buttonX2, buttonY, r);
 	Circle button3 = new Circle(buttonX3, buttonY, r);
	
	// add the buttons to the TV
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath TVWithButton = this.get();
        TVWithButton.append(button1, false);
        TVWithButton.append(button2, false);
        TVWithButton.append(button3, false);
    }    
}
