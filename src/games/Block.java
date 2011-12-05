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
	private int prevBlock=0;
	private int[] coords;

	public Block(){
		super(50, 50, 50, 50);
		int vel = 1;
		if(r.nextInt(2)==1){
			vel = vel*-1;
		}
		coords = new int[4];
		xVel = vel;
		yVel = 2;
		x = r.nextInt(650)+prevBlock;
		prevBlock = x;
		System.out.print(x);
		y = 0;
		System.out.println(prevBlock);
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
