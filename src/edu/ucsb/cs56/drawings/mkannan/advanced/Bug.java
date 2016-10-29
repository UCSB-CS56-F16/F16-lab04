package edu.ucsb.cs56.drawings.mkannan.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;

import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A drawing of a bug that implements Shape interface. 

   @author Madhumathi Kannan for CS56 F16

*/

public class Bug extends GeneralPathWrapper implements Shape
{

    /** Constructor

	@param x x coord of higher left corner of bug
	@param y y coord of higher left corner of bug
	@param lr longer radius of ellipse; scaling it allows bug to change size because head,body, and leg measurements will depend on this value
	@param legs number of legs can be customized to expand this class; THIS CONSTRUCTOR ASSUMES THAT INPUT FOR LEGS IS AN EVEN INTEGER
    */
    
    public Bug(double x, double y, double lr, int legs){
	Ellipse2D.Double body = new Ellipse2D.Double (x, y, lr, lr*2);
	double legScale = (lr*1.5)/(legs/2);
	double unusedSpace = (lr*0.05);
	GeneralPath wholeBug = this.get();
	wholeBug.append(body, false);
	for (int i = 1; i<=legs/2; i++){
		Line2D.Double leftLeg = new Line2D.Double(x, y+unusedSpace+(legScale*i), x-(0.5*lr), y+unusedSpace+(legScale *i));
		Line2D.Double rightLeg = new Line2D.Double(x+lr, y+unusedSpace+(legScale*i), x+(1.5*lr), y+unusedSpace+(legScale*i));
  	 	wholeBug.append(leftLeg, false);
		wholeBug.append(rightLeg, false);
		/*wholeBug.moveTo(x, y+(legScale*i));
		wholeBug.lineTo(x-lr, y+(legScale*i));
		wholeBug.moveTo(x+lr, y+(legScale*i));
		wholeBug.lineTo(x+(2*lr), y+(legScale*i));*/
    		}
	Ellipse2D.Double head = new Ellipse2D.Double(x, y+(lr*2), lr, lr);
	wholeBug.append(head, false);
	Line2D.Double leftAntennae = new Line2D.Double(x+(lr/2), y+(3*lr), x, y+(3.5*lr));
	wholeBug.append(leftAntennae, false);
	Line2D.Double rightAntennae = new Line2D.Double(x+(lr/2), y+(3*lr), x+lr, y+(3.5*lr));
	wholeBug.append(rightAntennae, false);
	}
}
