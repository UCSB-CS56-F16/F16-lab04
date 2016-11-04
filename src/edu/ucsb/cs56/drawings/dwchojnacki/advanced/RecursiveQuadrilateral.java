package edu.ucsb.cs56.drawings.dwchojnacki.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Polygon;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A drawing of a quadrilateral that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Daniel Chojnacki
   @version for CS56, F16, UCSB
   
*/
public class RecursiveQuadrilateral extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param xpoints x coord along the quadrilateral
       @param ypoints y coord along the quadrilateral
    */
    public RecursiveQuadrilateral(int[] xpoints, int[] ypoints)
    {
	if ((xpoints.length==4)&&(ypoints.length==4)) {
	    Polygon outQuadrilateral =
		new Polygon(xpoints, ypoints, 4);
	
	    GeneralPath wholeQuadrilateral = this.get();
	    wholeQuadrilateral.append(outQuadrilateral, false);
	}
    }

    /** 
	Another Constructor

	@param xbounds the xbounds of the quadrilateral in which we will be recursively printing smaller quadrilaterals
	@param ybounds the ybounds of the quadrilateral in which we will be recursively printing smaller quadrilaterals
	@param degree the degree at which we will be printing these quadrilaterals
    */
    public RecursiveQuadrilateral(int[] xbounds, int[] ybounds, int degree) {
	if ((xbounds.length==4)&&(ybounds.length==4)) {
	    if (degree == 0) {
		RecursiveQuadrilateral outQuadrilateral = new RecursiveQuadrilateral(xbounds, ybounds);
		GeneralPath outputQuadrilateral = this.get();
	        outputQuadrilateral.append(outQuadrilateral, false);
	    }
	    if (degree >= 1) {
		int[] addXPoints = new int[4];
		int[] addYPoints = new int[4];
		for (int i=0; i<4; i++) {
		    addXPoints[i] =  (int) Math.round(xbounds[i] - ((0.333)*(xbounds[i] - xbounds[(i+2)%4])));
		    addYPoints[i] =  (int) Math.round(ybounds[i] - ((0.333)*(ybounds[i] - ybounds[(i+2)%4])));
		}
		RecursiveQuadrilateral addQuadrilateral = new RecursiveQuadrilateral(addXPoints, addYPoints);
		GeneralPath outputQuadrilateral = this.get();
		outputQuadrilateral.append(addQuadrilateral, false);
		if (degree >=2) {
		    int[] addMoreXPoints = new int[4];
		    int[] addMoreYPoints = new int[4];
		    int[] addEvenMoreXPoints = new int[4];
		    int[] addEvenMoreYPoints = new int[4];
		    for (int j=0; j<4; j++) {
		        addMoreXPoints[0] = xbounds[j];
			addMoreYPoints[0] = ybounds[j];
			addMoreXPoints[1] = (int) Math.round(xbounds[j] - ((0.333)*(xbounds[j] - xbounds[(j+1)%4])));
			addMoreYPoints[1] = (int) Math.round(ybounds[j] - ((0.333)*(ybounds[j] - ybounds[(j+1)%4])));
			addMoreXPoints[2] = addXPoints[j];
			addMoreYPoints[2] = addYPoints[j];
			addMoreXPoints[3] = (int) Math.round(xbounds[j] - ((0.333)*(xbounds[j] - xbounds[(j+3)%4])));
			addMoreYPoints[3] = (int) Math.round(ybounds[j] - ((0.333)*(ybounds[j] - ybounds[(j+3)%4])));
			addEvenMoreXPoints[0] = addMoreXPoints[1];
			addEvenMoreYPoints[0] = addMoreYPoints[1];
			addEvenMoreXPoints[1] = (int) Math.round(xbounds[j] - ((0.667)*(xbounds[j] - xbounds[(j+1)%4])));
			addEvenMoreYPoints[1] = (int) Math.round(ybounds[j] - ((0.667)*(ybounds[j] - ybounds[(j+1)%4])));
			addEvenMoreXPoints[2] = addXPoints[(j+1)%4];
			addEvenMoreYPoints[2] = addYPoints[(j+1)%4];
			addEvenMoreXPoints[3] = addMoreXPoints[2];
			addEvenMoreYPoints[3] = addMoreYPoints[2];
			RecursiveQuadrilateral addMoreQuadrilaterals = new RecursiveQuadrilateral(addMoreXPoints, addMoreYPoints, degree-1);
			outputQuadrilateral.append(addMoreQuadrilaterals, false);
			RecursiveQuadrilateral addEvenMoreQuadrilaterals = new RecursiveQuadrilateral(addEvenMoreXPoints, addEvenMoreYPoints, degree-1);
			outputQuadrilateral.append(addEvenMoreQuadrilaterals, false);
		    }
		}
	    }
	}
    }
}
