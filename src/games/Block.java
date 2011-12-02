package games;
import java.util.Random;

import org.newdawn.slick.geom.Rectangle;
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

	public Block(){
		super(50, 50, 50, 50);
		xVel = 0;
		yVel = (r.nextInt(5)+1);
		x = r.nextInt(640);
		y = 0;
	}
public void setLoc(){
		super.setLocation(x+=xVel, y+=yVel);
	}
}
