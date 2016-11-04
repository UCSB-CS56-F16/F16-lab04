package edu.ucsb.cs56.drawings.dwchojnacki.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A drawing of a cube that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
   It is able to draw various degrees of a Menger Sponge
   
   Incomplete, WIP
      
   @author Daniel Chojnacki
   @version for CS56, F16, UCSB
   
*/
public class Cube extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param inputX x coord of top left corner of the cube
       @param inputY y coord of top left corner of the cube
       @param inputLength length of one side of the cube
       @param angle between the line that extends from the front face of the cube to the back face of the cube and the x axis (in degrees)
       @param degree the degree at which you would like to recursively create quadrilaterals (for creating a Menger Sponge's face)
    */
    public Cube(double inputX, double inputY, double inputLength, double angle, int degree)
    {
	// make the front face of the cube
	int x = (int) inputX;
	int y = (int) inputY;
	int length = (int) inputLength;
	/*
	int x1Reference;
	int y1Reference;
	int x2Reference;
	int y2Reference;
	angle = angle%360;
	*/
	int [] frontFaceXCoordinates = new int[]{x,x+length,x+length,x};
	int [] frontFaceYCoordinates = new int[]{y,y,y+length,y+length};
        RecursiveQuadrilateral frontFace = 
            new RecursiveQuadrilateral(frontFaceXCoordinates, frontFaceYCoordinates, degree);
	/*
	double hypotenuse = (0.75*length);
	if (((angle>=0)&&(angle<90))||((angle>=180)&&(angle<270))) {
	    
	    x1Reference = x;
	    y1Reference = y;
	    x2Reference = x+length;
	    y2Reference = y+length;
	    if ((angle>=0)&&(angle<90)) {
		xVertex = x+length;
		yVertex = y;
	    }
	    else {
		xVertex = x;
		yVertex = y+length;
	    }
	}
	else {
	    x1Reference = x+length;
	    y1Reference = y;
	    x2Reference = x;
	    y2Reference = y+length;
	    if ((angle>=90)&&(angle<180)) {
		xVertex = x;
		yVertex = y;
	    }
	    else {
		xVertex = x+length;
		yVertex = y+length;
	    }
	}
	double hypotenuse = (0.75 * length);
	angle = Math.toRadians(angle);
	double quadSharedX = xVertex + (hypotenuse * (Math.cos(angle)));
	double quadSharedY = yVertex - (hypotenuse * (Math.sin(angle)));
	int [] secondFaceXCoordinates = new int[4];
	int [] thirdFaceYCoordinates = new int[4];
        RecursiveQuadrilateral secondFace =
	    new RecursiveQuadrilateral (secondFaceXCoordinates, secondFaceYCoordinates, degree);
        RecursiveQuadrilateral thirdFace =
            new RecursiveQuadrilateral (thirdFaceXCoordinates, thirdFaceYCoordinates, degree);
	*/
        // put the cube together
        GeneralPath wholeCube = this.get();
        wholeCube.append(frontFace, false);
	/*
        wholeCube.append(secondFace, false);
        wholeCube.append(thirdFace, false);   
	*/
    }
    
}
