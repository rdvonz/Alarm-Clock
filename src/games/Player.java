package games;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.Color;
public class Player extends Rectangle{
	Color col;
	private int xVel=5;
	Input input;
	private int x=320;
	private int y=420;
	public Player(){
		super(50, 50, 50, 50);
	}

	public void update(Input input){
		if(input.isKeyDown(Input.KEY_RIGHT)){
			x+=xVel;
			
		}
		if(input.isKeyDown(Input.KEY_LEFT)){
			x-=xVel;
		}
		setLocation(x,y);
		
	}
	public int getxVel() {
		return xVel;
	}
	public void setxVel(int xVel) {
		this.xVel = xVel;
	}
	public int getPosition() {
		return (x);
	}
	public void setPosition(int x) {
		this.x = x;
	}

}
