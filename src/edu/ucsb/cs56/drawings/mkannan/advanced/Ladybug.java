package edu.ucsb.cs56.drawings.mkannan.advanced;

import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 * Ladybug, a subclass of Bug
 * @author Madhumathi Kannan for CS56 F16
 */

public class Ladybug extends Bug implements Shape
{
/**
 * Constructor for ladybug object; invokes superclass constructor with FIXED legs variable of 6 because a ladybug can only ever have 6 legs
 *
 * @param x x coord for upper left corner of ladybug
 * @param y y coord for upper left corner of ladybug
 * @param lr longer radius of elliptical body - scaling this allows scaling of entire ladybug, as head, body, and leg measurments depend on this variable
 *
 * 
 */

	public Ladybug(double x, double y, double lr){
		
		//create general bug - leg variable is fixed at 6 because a ladybug must always have 6 legs
		super(x,y,lr,6);
		
		GeneralPath lady = this.get();
		
		//add line down middle for shell
		Line2D.Double shell = new Line2D.Double(x+(lr/2), y, x +(lr/2), y+(lr*2));
		lady.append(shell, false);


		//add 4 circles for spots
		double scaleDown = lr/4;
		Ellipse2D.Double leftSpotOne = new Ellipse2D.Double(x+(0.75*scaleDown), y+(scaleDown), scaleDown, scaleDown);
		lady.append(leftSpotOne, false);
		Ellipse2D.Double rightSpotOne = new Ellipse2D.Double(x+(2.75*scaleDown), y+(1.75*scaleDown), scaleDown, scaleDown);
		lady.append(rightSpotOne, false);
		Ellipse2D.Double leftSpotTwo = new Ellipse2D.Double(x+(.5*scaleDown), y+(4*scaleDown), scaleDown, scaleDown);
		lady.append(leftSpotTwo, false);
		Ellipse2D.Double rightSpotTwo = new Ellipse2D.Double(x+(2.5*scaleDown), y+(4.75*scaleDown), scaleDown, scaleDown);
		lady.append(rightSpotTwo, false);

		}

}

