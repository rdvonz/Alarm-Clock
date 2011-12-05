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
	private int xVel;
	private int yVel;
	private int x;
	private int y;
	private int[] coords;

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
		coords[0] = x;
		coords[1] = x+50;
		coords[2] = y;
		coords[3] = y+50;
	}
	public void setLoc(int x, int y){
		this.x = x;
		this.y = y;
		setLoc();
	}
	public int[] getCoords(){
		return coords;
	}
	
}
