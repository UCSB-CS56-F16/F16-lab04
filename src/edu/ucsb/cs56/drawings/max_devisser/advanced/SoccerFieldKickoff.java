package edu.ucsb.cs56.drawings.maxdevisser.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
   A soccer field with two teams on it ready to play
      
   @author Max de Visser
   
*/
public class SoccerFieldKickoff extends SoccerField implements Shape
{
    /**
       Constructor
       @param x x coord of top left corner of the field
       @param y y coord of top left corner of the field
       @param width width of the field
       @param height height of the field
    */
    public SoccerFieldKickoff(double x, double y, double width, double height)
    {
	super(x,y,width,height);
	
	// Make two teams (11 players each, set up in a 433)
	// Players are circles with a width of height / 10
	// Line gaps are the distance between each line of players


	double playerWidth = height / 10.0;
	double lineGap = ((width / 2) - (4 * playerWidth)) / 5.0;
	double threePersonGaps = (height - (3 * playerWidth)) / 4.0;
	double fourPersonGaps = (height - (4 * playerWidth)) / 5.0;

	int cl = 1; // current line
	Ellipse2D.Double goalie =
	    new Ellipse2D.Double(x + (cl * lineGap) + ((cl - 1) * playerWidth),
			  y + ((height - playerWidth) / 2),
			  playerWidth, playerWidth);
        cl++;
	GeneralPath defense = new GeneralPath();
	for (int i = 1; i <= 4; i++) {
	    Ellipse2D.Double defender = new Ellipse2D.Double
		(x + (cl * lineGap) + ((cl - 1) * playerWidth),
		 y + (i * fourPersonGaps) + (i - 1) * playerWidth,
		 playerWidth, playerWidth);
	    defense.append(defender, false);
	}
        cl++;
	GeneralPath midfield = new GeneralPath();
	for (int i = 1; i <= 3; i++) {
	    Ellipse2D.Double midfielder = new Ellipse2D.Double
		(x + (cl * lineGap) + ((cl - 1) * playerWidth),
		 y + (i * threePersonGaps) + (i - 1) * playerWidth,
		 playerWidth, playerWidth);
	    midfield.append(midfielder, false);
	}
	cl++;
	GeneralPath attack = new GeneralPath();
	for (int i = 1; i <= 3; i++) {
	    Ellipse2D.Double attacker = new Ellipse2D.Double
		(x + (cl * lineGap) + ((cl - 1) * playerWidth),
		 y + (i * threePersonGaps) + (i - 1) * playerWidth,
		 playerWidth, playerWidth);
	    attack.append(attacker, false);
	}

	GeneralPath leftLineup = new GeneralPath();
	leftLineup.append(goalie, false);
	leftLineup.append(defense, false);
	leftLineup.append(midfield, false);
	leftLineup.append(attack, false);

	Shape rightLineup = ShapeTransforms.horizontallyFlippedCopyOf(leftLineup);
	rightLineup = ShapeTransforms.translatedCopyOf
	    (rightLineup, width - lineGap - playerWidth / 2, 0.0);
	
        GeneralPath gp = this.get();
        gp.append(leftLineup, false);
        gp.append(rightLineup, false);
    }    
}
