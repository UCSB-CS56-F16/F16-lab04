package edu.ucsb.cs56.drawings.dong_he.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
/**

Size of frame is 640 * 480
width * height

**/

/**
   A modified CoffeeCup class that is used to create a rocket ship. 
      
   @author Dong He 
   @version for CS56, F16, UCSB
   
*/

public class Rocket extends GeneralPathWrapper implements Shape
{   
    /**
     * Constructor for objects of class Rocket
     */
    public Rocket(double x, double y, double width, double height)
    {
	
        // Specify the upper left corner, and the 
        //  width and height of the original points used to 
        //  plot the *hard-coded* rocket
        
        final double ORIG_ULX = 100.0; 
        final double ORIG_ULY = 100.0; 
        final double ORIG_HEIGHT = 600.0;
        final double ORIG_WIDTH = 200.0;
        
        GeneralPath leftSide = new GeneralPath();
	
        // left of the rocket
	
        leftSide.moveTo(100,700);
        leftSide.lineTo(100,100);
        
        GeneralPath topAndBottom = new GeneralPath();
       
        topAndBottom.moveTo(100,100);
        topAndBottom.lineTo(300,100); // top of rocket
        
        topAndBottom.moveTo(100,700);
        topAndBottom.lineTo(300,700); // bottom of rocket
        
        // left fin of the rocket
        
        GeneralPath leftFin = new GeneralPath();
        
        leftFin.moveTo(100, 700);
        leftFin.lineTo(50,750);
        leftFin.lineTo(100,500);
        
        //right fin of the rocket
        Shape rightFin = ShapeTransforms.horizontallyFlippedCopyOf(leftFin);
        
        rightFin = ShapeTransforms.translatedCopyOf(rightFin, 300.0, 0.0);
       
        //top of the rocket
        GeneralPath topOfRocket = new GeneralPath();
        topOfRocket.moveTo(100,100);
        topOfRocket.lineTo(200,0);
        topOfRocket.lineTo(300,100);
        
        //Drawing right side now
        GeneralPath rightSide = new GeneralPath();
       
        rightSide.moveTo(300,700);
        rightSide.lineTo(300,100);
       
        // now we put the whole thing together ino a single path.
       
        GeneralPath wholeRocket = new GeneralPath();
        wholeRocket.append(topAndBottom, false);
        wholeRocket.append(leftSide, false);
        wholeRocket.append(rightSide, false);
        wholeRocket.append(leftFin, false);
        wholeRocket.append(rightFin, false);
        wholeRocket.append(topOfRocket, false);
        

        // translate to the origin by subtracting the original upper left x and y
        // then translate to (x,y) by adding x and y
        
        Shape s = ShapeTransforms.translatedCopyOf(wholeRocket, -ORIG_ULX + x, -ORIG_ULY + y);
 
	// scale to correct height and width
        s =  ShapeTransforms.scaledCopyOf(s,
					  width/ORIG_WIDTH,
					  height/ORIG_HEIGHT);
	 
	// Use the GeneralPath constructor that takes a shape and returns
	// it as a general path to set our instance variable cup
        
	this.set(new GeneralPath(s));
        
    }

}
