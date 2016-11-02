package edu.ucsb.cs56.drawings.ctc.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
   A House
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/

public class ChristmasTree extends Tree implements Shape
{
    /**
     * Constructor for objects of class Tree
     */
public ChristmasTree(double x, double y, double width, double height)
    {
	// construct the basic Tree shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// make three ornaments
	//
	// will use ellipses instead of circles cause they could be compressed
	
	double t = 0.10 * width;
	double treeHt =  0.25 * height;

	
	Ellipse2D.Double orna1 =
	    new Ellipse2D.Double(x + width, y + 0.3 * height, 2.0 * t, treeHt);
	Ellipse2D.Double orna2 =
	    new Ellipse2D.Double(x + 0.6 * width, y + 0.7 * height, 2.0 * t, treeHt);
	Ellipse2D.Double orna3 =
	    new Ellipse2D.Double(x + 1.3 * width ,y + 1.1 * height, 2.0 * t, treeHt);
	
	// add the ornaments to the tree
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeTree = this.get();
        wholeTree.append(orna1, false);
        wholeTree.append(orna2, false);
        wholeTree.append(orna3, false);

    }
}






    /*
    public ChristmasTree(double x, double y, double width, double height)
    {
	// construct the basic tree shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// make christmas tree have four ornaments
	//
	//
	// 	
	     
	double radius = 25;
	
	Circle2 orna1 =
	    new Circle2(width, height, 0.5 * radius);
	Circle2 orna2 =
	    new Circle2(0.3875 * width, 0.5357 * height, radius);
	Circle2 orna3 =
	    new Circle2(0.9375 * width, 0.75 * height, radius);
	
	// add the ornaments to the tree
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")


        GeneralPath wholeTree = this.get();
        wholeTree.append(orna1, false);
        wholeTree.append(orna2, false);
        wholeTree.append(orna3, false); 
    }    
}
*/
