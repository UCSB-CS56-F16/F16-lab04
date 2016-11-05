package edu.ucsb.cs56.drawings.ajolguin.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.lang.Math;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


public class BeachBall extends Ball implements Shape{
    public BeachBall(double x, double y, double r)
    {
	super(x,y,r);
	//GeneralPath gp = this.get();

	GeneralPath path = new GeneralPath();
	path.moveTo(x + r*Math.cos(0), y - r*Math.sin(0));
	path.lineTo(x + r*.15, y);
	path.moveTo(x + r*Math.cos(Math.PI/3), y - r*Math.sin(Math.PI/3));
	path.lineTo(x + r*.15*Math.cos(Math.PI/3), y - r*.15*Math.sin(Math.PI/3));
	path.moveTo(x + r*Math.cos(Math.PI*2/3), y - r*Math.sin(Math.PI*2/3));
	path.lineTo(x + r*.15*Math.cos(Math.PI*2/3), y - r*.15*Math.sin(Math.PI*2/3));
	path.moveTo(x + r*Math.cos(Math.PI), y - r*Math.sin(Math.PI));
	path.lineTo(x - r*.15, y);
	path.moveTo(x + r*Math.cos(Math.PI*4/3), y - r*Math.sin(Math.PI*4/3));
	path.lineTo(x + r*.15*Math.cos(Math.PI*4/3), y - r*.15*Math.sin(Math.PI*4/3));
	path.moveTo(x + r*Math.cos(Math.PI*5/3), y - r*Math.sin(Math.PI*5/3));
	path.lineTo(x + r*.15*Math.cos(Math.PI*5/3), y - r*.15*Math.sin(Math.PI*5/3));
	

	Ellipse2D.Double smallCircle = new Ellipse2D.Double(x - r*.15,y - r*.15, r*.3, r*.3);

	GeneralPath wholeBall = this.get();
	wholeBall.append(smallCircle, false);
	wholeBall.append(path, false);
    }
}
