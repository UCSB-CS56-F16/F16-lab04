package edu.ucsb.cs56.drawings.rayouyang.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

/**
	BasketBall and Player
      
   @author Phill Conrad, Ray Ouyang
   @version for CS56, W16, UCSB
   
*/


public class  BallWithPerson extends Basketball implements Shape
{
    /**
     * Constructor for objects of class BasketballHoop
     */
    public BallWithPerson(double x, double y, double width, double height)
    {
	// construct the basic BasketballHoop shell
	super(x,y,width,height);

	
	
	double ballWidth = 0.3 * width;
	double ballHeight = 0.3 * height;
	double ballXLocation = x + .75 * width;
	double ballYLocation = y + .45 * height;
		

	Ellipse2D.Double head = new Ellipse2D.Double(	ballXLocation + (ballWidth * 5 / 4), 
													ballYLocation + (ballHeight * 5 / 4), 
													ballWidth * 3 / 4, ballHeight * 3 / 4);
	
	

	GeneralPath torso = new GeneralPath (); 
	
	Double xStart = ballXLocation + (ballWidth * 1.25) + (ballWidth * 3 / 8);
	Double yStart = ballYLocation + (ballHeight * 2 * 1.041);
	Double yFinish = ballYLocation + (ballHeight * 4.7525);

	torso.moveTo(xStart, 
				yStart);     //Torso
	torso.lineTo(xStart, 
				yFinish);

	torso.moveTo(xStart, yStart + ballHeight);  //give him arm that dunks
	torso.lineTo(ballXLocation + (ballWidth * .75 ), 
				ballYLocation + (ballHeight * .9));
		    
	torso.moveTo(xStart, yStart + ballHeight);  //other arm
	torso.lineTo(ballXLocation + (ballWidth * 5/2), 
				 yStart + (ballHeight * 9/4));
	
	torso.moveTo(xStart, yFinish);    //left leg
	torso.lineTo(ballXLocation + (ballWidth * 3 / 4), 
				 ballYLocation + (ballHeight * 6));
	
	torso.moveTo(xStart, 
				yFinish);    //right leg
	torso.lineTo(ballXLocation + (ballWidth * 5 / 4) + (ballWidth * 5 / 4), 
				ballYLocation + (ballHeight * 6.1));


	GeneralPath personWithBall = this.get();
	personWithBall.append(head, false);
	personWithBall.append(torso, false);
	
	

	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")

    }
}