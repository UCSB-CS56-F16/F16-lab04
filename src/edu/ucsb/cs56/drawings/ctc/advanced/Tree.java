package edu.ucsb.cs56.drawings.ctc.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A Forest Tree (wrapper around a General Path, implements Shape)

   This provides an example of how you can start with the coordinates
   of a hard coded object, and end up with an object that can be
   drawn anywhere, with any width or height.   
      
   @author Chantel Chan
   @version for CS56, F16, UCSB
   
*/
public class Tree extends GeneralPathWrapper implements Shape
{   
    /**
     * Constructor for objects of class Tree
     */
    public Tree(double x, double y, double width, double height)
    {
	
        // Specify the upper left corner, and the 
        //  width and height of the original points used to 
        //  plot the *hard-coded* tree
        
        final double ORIG_ULX = 100.0; 
        final double ORIG_ULY = 100.0; 
        final double ORIG_HEIGHT = 300.0; 
        final double ORIG_WIDTH = 200.0; 
        
        GeneralPath leftSide = new GeneralPath();
	
        // left side of tree
	
        leftSide.moveTo(300,100); //starting point
        leftSide.lineTo(200,250); //     /
        leftSide.lineTo(250,250); //      -
        leftSide.lineTo(150,400); //    /
        leftSide.lineTo(200,400); //     -
	leftSide.lineTo(100,550); //   / 
	
        
        GeneralPath Bottom = new GeneralPath();
        
        Bottom.moveTo(100,550);
        Bottom.lineTo(500,550); // bottom green part of tree

	GeneralPath Trunk = new GeneralPath();

	Trunk.moveTo(250,550);
	Trunk.lineTo(250,700); //left side of trunk
	Trunk.lineTo(350,700); //bottom part of trunk
	Trunk.lineTo(350,550); //right side of trunk
       

	Shape rightSide = ShapeTransforms.horizontallyFlippedCopyOf(leftSide);
       
        // after flipping around the upper left hand corner of the
        // bounding box, we move this over to the right by 400 pixels
       
        rightSide = ShapeTransforms.translatedCopyOf(rightSide, 400.0, 0.0);
	
       
        
        GeneralPath wholeTree = new GeneralPath ();
        wholeTree.append(Bottom, false);
        wholeTree.append(leftSide, false);
        wholeTree.append(rightSide, false);
	wholeTree.append(Trunk, false);

        // translate to the origin by subtracting the original upper left x and y
        // then translate to (x,y) by adding x and y
        
        Shape s = ShapeTransforms.translatedCopyOf(wholeTree, -ORIG_ULX + x, -ORIG_ULY + y);
 
	// scale to correct height and width
        s =  ShapeTransforms.scaledCopyOf(s,
					  width/ORIG_WIDTH,
					  height/ORIG_HEIGHT) ;
	 
	// Use the GeneralPath constructor that takes a shape and returns
	// it as a general path to set our instance variable tree
        
	this.set(new GeneralPath(s));
        
    }

}
