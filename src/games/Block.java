package games;
import java.util.ArrayList;
import java.util.Random;

import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.fills.GradientFill;
import org.newdawn.slick.Color;
public class Block extends Rectangle{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Random r = new Random();
	int xVel;
	int yVel;
	int x;
	int y;
	int[] coords;

	public Block(){
		super(50, 50, 50, 50);
		coords = new int[4];
		xVel = 0;
		yVel = (r.nextInt(2)+1);
		x = r.nextInt(640);
		y = 0;
	}
public void setLoc(){
		super.setLocation(x+=xVel, y+=yVel);
		//Update the coordinates
		coords[0] = x-25;
		coords[1] = x+25;
		coords[2] = y-25;
		coords[3] = y+25;
	}
public int[] getCoords(){
	int[] coords = new int[3];
	coords[0] = x-25;
	coords[1] = x+25;
	coords[2] = y-25;
	coords[3] = y+25;
	return coords;
}
}
