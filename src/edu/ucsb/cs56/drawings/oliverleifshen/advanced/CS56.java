package edu.ucsb.cs56.drawings.oliverleifshen.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A simple drawing of the term "CS56" using lines 
      
   @author Oliver Shen

*/
public class CS56 extends GeneralPathWrapper implements Shape
{   
    /**
     * Constructor for objects of class CS56
     */
    public CS56(double x, double y, double width, double height)
    {
	
        // Specify the upper left corner, and the 
        //  width and height of the original points

	final double ORIG_ULX = 100.0; 
        final double ORIG_ULY = 100.0; 
        final double ORIG_HEIGHT = 600.0; 
        final double ORIG_WIDTH = 980.0;

	GeneralPath TopC = new GeneralPath();

	TopC.moveTo(300,200);
	TopC.lineTo(240,100);
	TopC.lineTo(160,100);
	TopC.lineTo(100,300);
	TopC.lineTo(100,400);

	Shape BottomC = ShapeTransforms.verticallyFlippedCopyOf(TopC);
	BottomC = ShapeTransforms.translatedCopyOf(BottomC, 0, 600);

	GeneralPath TopS = new GeneralPath();

	TopS.moveTo(560,300);
	TopS.lineTo(560,200);
	TopS.lineTo(460,100);
	TopS.lineTo(360,200);
	TopS.lineTo(360,300);
	TopS.lineTo(460,400);

	Shape BottomS = ShapeTransforms.horizontallyFlippedCopyOf(ShapeTransforms.verticallyFlippedCopyOf(TopS));
	BottomS = ShapeTransforms.translatedCopyOf(BottomS, 200, 600);

	GeneralPath FIVE = new GeneralPath();

	FIVE.moveTo(820,100);
	FIVE.lineTo(620,100);
	FIVE.lineTo(620,400);
	FIVE.lineTo(720,300);
	FIVE.lineTo(820,400);
	FIVE.lineTo(820,600);
	FIVE.lineTo(720,700);
	FIVE.lineTo(620,600);

	GeneralPath SIX = new GeneralPath();

	SIX.moveTo(1080,200);
	SIX.lineTo(980,100);
	SIX.lineTo(880,200);
	SIX.lineTo(880,400);
	SIX.lineTo(980,300);
	SIX.lineTo(1080,400);
	SIX.lineTo(1080,600);
	SIX.lineTo(980,700);
	SIX.lineTo(880,600);
	SIX.lineTo(880,400);

	GeneralPath cs56 = new GeneralPath();
	cs56.append(TopC,false);
	cs56.append(BottomC,false);
	cs56.append(TopS,false);
	cs56.append(BottomS,false);
	cs56.append(FIVE,false);
	cs56.append(SIX,false);
	
        // translate to the origin by subtracting the original upper left x and y
        // then translate to (x,y) by adding x and y
        
        Shape s = ShapeTransforms.translatedCopyOf(cs56, -ORIG_ULX + x, -ORIG_ULY + y);
 
	// scale to correct height and width
        s =  ShapeTransforms.scaledCopyOf(s,
					  width/ORIG_WIDTH,
					  height/ORIG_HEIGHT) ;
	 
	// Use the GeneralPath constructor that takes a shape and returns
	// it as a general path to set our instance variable cup
        
	this.set(new GeneralPath(s));
        
    }

}
