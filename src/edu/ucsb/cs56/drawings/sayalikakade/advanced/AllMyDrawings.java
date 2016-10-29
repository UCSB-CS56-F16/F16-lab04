package edu.ucsb.cs56.drawings.sayalikakade.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad 
 * @author Sayali Kakade
 * @version for UCSB CS56, F16 
 */

public class AllMyDrawings
{
    /** Draw a picture with stars of different colors, sizes, locations, and orientations. 
	There are four stars; the last three are variations of the first. 
    */

    public static void drawPicture1(Graphics2D g2) {

	//The original star on the page; the others are variations of this one
	Star s1 = new Star(10, 20 ,35, 10);
	g2.setColor(Color.BLACK);
	g2.draw(s1);

	//The star moved over to a new location and color changed to blue
	Shape s2 = ShapeTransforms.translatedCopyOf(s1, 80, 40);
	g2.setColor(Color.BLUE);
	g2.draw(s2);

	//Make a red star under the black one which is
	//three times as large
	Shape s3 = ShapeTransforms.scaledCopyOfLL(s1, 3.0, 3.0); 
	s3 = ShapeTransforms.translatedCopyOf(s3, 200, 300); 
	g2.setColor(Color.RED); 
	g2.draw(s3); 

	//Make a green star that is rotated by 90 degrees
	//and half as small as the first one
	Shape s4 = ShapeTransforms.rotatedCopyOf(s1, Math.PI/2.0); 
	s4 = ShapeTransforms.translatedCopyOf(s4, 100, 200); 	
	s4 = ShapeTransforms.scaledCopyOfLL(s4, 0.5, 0.5); 
	g2.setColor(Color.GREEN); 
	g2.draw(s4); 


	Stroke orig=g2.getStroke();

	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A few regular stars by Sayali Kakade", 20,20);
	
    }


    /** Draw a picture with a few shooting stars 
	scattered throughout the frame
     */
	
    public static void drawPicture2(Graphics2D g2) {

	// Draw some shooting stars, increase inside diameter gradually
	//Draw a shooting magenta shooting star 
	ShootingStar ss1 = new ShootingStar(300, 300, 90, 20);
	g2.setColor(Color.MAGENTA); g2.draw(ss1);

	//Draw a cyan shooting star
	ShootingStar ss2 = new ShootingStar(200, 200, 60, 30);
	g2.setColor(Color.CYAN); g2.draw(ss2);

	//Draw a black shooting star
	ShootingStar ss3 = new ShootingStar(400, 100, 50, 40);
	g2.setColor(Color.BLACK); g2.draw(ss3); 

	//Copy the third shooting star and draw it a little higher
	Shape ss4 = ShapeTransforms.scaledCopyOf(ss3, 0.5, 0.5);
	ss4 = ShapeTransforms.translatedCopyOf(ss4, 50, 100); 
	g2.setColor(Color.BLUE); g2.draw(ss4);

	//Draw a rotated shooting star
	Shape ss5 = ShapeTransforms.rotatedCopyOf(ss2, Math.PI/4);
	ss5 = ShapeTransforms.translatedCopyOf(ss5, -200, 100);  
	g2.draw(ss5);

	//Draw a shooting star with a small outer to inner radius ratio
	ShootingStar ss6 = new ShootingStar(100, 100, 45, 40);
	Shape ss7 = ShapeTransforms.rotatedCopyOf(ss6, Math.PI); 
	g2.setColor(Color.ORANGE); g2.draw(ss7);

	Stroke orig=g2.getStroke();
     	g2.setStroke(orig);
     	g2.setColor(Color.BLACK);
	g2.drawString("A bunch of shooting stars by Sayali Kakade", 20,20);
    }

    /** Draw a picture with a shooting star pinwheel
     */

    public static void drawPicture3(Graphics2D g2) {

	g2.drawString("Shooting star pinwheel by Sayali Kakade", 20,20);

	ShootingStar pin1 = new ShootingStar(200, 200, 50, 30);
	Shape pin2 = ShapeTransforms.rotatedCopyOf(pin1, Math.PI/2);
	pin2 = ShapeTransforms.translatedCopyOf(pin2, 100, -150); 
	Shape pin3 = ShapeTransforms.rotatedCopyOf(pin1, Math.PI);
	pin3 = ShapeTransforms.translatedCopyOf(pin3, 250, 0);
	Shape pin4 = ShapeTransforms.rotatedCopyOf(pin1, 3.0 * Math.PI / 2.0);
	pin4 = ShapeTransforms.translatedCopyOf(pin4, 150, 100);
	g2.setColor(Color.BLUE); g2.draw(pin1);
	g2.setColor(Color.RED); g2.draw(pin2);
	g2.setColor(Color.GREEN); g2.draw(pin3);
	g2.setColor(Color.YELLOW); g2.draw(pin4);
	
    }

}

