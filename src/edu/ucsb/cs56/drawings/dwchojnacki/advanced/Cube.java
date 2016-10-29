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
      
   @author Daniel Chojnacki
   @version for CS56, F16, UCSB
   
*/
public class Cube extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of top left corner of the cube
       @param y y coord of top left corner of the cube
       @param length length of one side of the cube
       @param angle between the line that extends from the front face of the cube to the back face of the cube and the x axis (in degrees)
    */
    public Cube(double x, double y, double length, double angle)
    {

	// make the front face of the cube
	double xVertex;
	double yVertex;
	double x1Reference;
	double y1Reference;
	double x2Reference;
	double y2Reference;
	angle = angle%360;
	
        Quadrilateral frontFace = 
            new Quadrilateral (x, y, x+length, y+length);

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
        
        Quadrilateral secondFace =
	    new Quadrilateral (x1Reference, y1Reference, quadSharedX, quadSharedY);
            
        Quadrilateral thirdFace =
            new Quadrilateral (x2Reference, y2Reference, quadSharedX, quadSharedY);
	
        // put the cube together
	
        GeneralPath wholeCube = this.get();
        wholeCube.append(frontFace, false);
        wholeCube.append(secondFace, false);
        wholeCube.append(thirdFace, false);    
    }
    
}
