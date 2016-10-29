package edu.ucsb.cs56.drawings.jkompella.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A Soccer Player
      
   @author Joseph Kompella 
   @version for CS56, F16, UCSB
   
*/
public class SoccerPlayer extends Person implements Shape
{
    /**
     * Constructor for objects of class SoccerPlayer
     *
     * @param x a double for the lower left corner of the player
     * @param y a double for the lower left corner of the player
     * @param height a double for the height of the player
     */
    public SoccerPlayer(double x, double y, double height)
    {
	// construct the basic person shell
	super(x,y,height);
	
	Rectangle2D.Double jersey =
	    new Rectangle2D.Double(x + (.08)*height, y - (0.55)*height, height/6, height/3-height/10);
	Rectangle2D.Double leftSleeve = 
	    new Rectangle2D.Double(x + (.001)*height, y - (0.55)*height, height*(.079), height/10);
	Rectangle2D.Double rightSleeve =
            new Rectangle2D.Double(x + (.08)*height + height/6, y - (0.55)*height, height*(.079), height/10);		

	Circle ball = new Circle(x+height/2,y,height/9);	

        GeneralPath wholePlayer = this.get();
        wholePlayer.append(jersey, false);
	wholePlayer.append(leftSleeve, false);
	wholePlayer.append(rightSleeve, false);
	wholePlayer.append(ball, false);
    }    
}
