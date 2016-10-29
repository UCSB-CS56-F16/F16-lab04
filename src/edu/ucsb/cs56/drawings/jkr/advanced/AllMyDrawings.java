package edu.ucsb.cs56.drawings.jkr.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

// My imports
import edu.ucsb.cs56.drawings.jkr.advanced.PlayButton;
import edu.ucsb.cs56.drawings.jkr.advanced.BetterPlayButton;


/**
 * A class with static methods for drawing various pictures
 * 
 * @author John Rehbein
 * @version for UCSB CS56, F16
 */

public class AllMyDrawings
{
    /**
     Returns Random Color
     */
    public static Color randomColor() {
        int r = (int) (255.0 * Math.random());
        int g = (int) (255.0 * Math.random());
	int b = (int) (255.0 * Math.random());
        return new Color(r, g, b);
    }
    /** Draw a picture with a few PlayButtons descending in a linear path
     */
    public static void drawPicture1(Graphics2D g2) {
        Shape playButton = new PlayButton(0,0,50);
        for(int i = 0; i < 20; i++) {
            g2.setColor(AllMyDrawings.randomColor());
            g2.draw(playButton);
            playButton = ShapeTransforms.translatedCopyOf(playButton,38,38);
            playButton = ShapeTransforms.rotatedCopyOf(playButton, Math.PI/8.0);
            
        }
        g2.setColor(AllMyDrawings.randomColor());
        g2.draw(new BetterPlayButton(0, 480-100, 100));
	
	g2.setColor(Color.BLACK); 
	g2.drawString("PlayButtons by John Rehbein", 20,20);
    }
    
    
    /** Draw a picture with a few PlayButtons following a sine wave path
     */
    public static void drawPicture2(Graphics2D g2) {
        Stroke thickStroke = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
        Stroke originalStroke = g2.getStroke();
        
        for(int i = 0; i < 20; i++) {
            if(i%2 == 0) {
                g2.setStroke(thickStroke);
                g2.setColor(AllMyDrawings.randomColor());
                g2.draw(new PlayButton(i * 50, (int) (200.0*Math.sin(i*3.1415/20.0)), 50));
            } else {
                g2.setStroke(originalStroke);
                g2.setColor(new Color(0xFF0000));
                g2.draw(new BetterPlayButton(i * 50, (int) (200.0*Math.sin(i*3.1415/20.0)), 50));
            }
            
        }
	
	g2.setStroke(originalStroke);
	g2.setColor(Color.BLACK); 
	g2.drawString("PlayButtons again by John Rehbein", 20,20);
        
    }
    
    /** Draw a different picture with a few PlayButtons
     */
    
    public static void drawPicture3(Graphics2D g2) {
        
        BetterPlayButton playButton = new BetterPlayButton(50,350,40);
        BetterPlayButton playButton2 = new BetterPlayButton(200,350,200);
        
        g2.draw(playButton);
        g2.setColor(new Color(0x8F00FF));
        
        // Rotate the second PlayButton 45/2 degrees around its center.
        Shape playButton3 = ShapeTransforms.rotatedCopyOf(playButton2, Math.PI/8.0);
        
        g2.draw(playButton3);
        
        g2.drawString("PlayButtons again again by John Rehbein", 20,20);
	
	
	
    }       
}
