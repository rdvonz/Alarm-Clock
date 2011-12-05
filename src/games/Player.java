package games;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.Input;

public class Player extends Rectangle{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int xVel=5;
	private int yVel=5;
	private int x=450;
	private int y=320;
	private int[] coords;
	Input input;
	public Player(){
		super(50, 50, 50, 50);
		coords = new int[4];
	}

	public void update(Input input){
		coords[0] = x-25;
		coords[1] = x+25;
		coords[2] = y-25;
		coords[3] = y+25;

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
	public void checkCollision(Block obj){	
		if(coords[0] < obj.getCoords()[0] && coords[1] > obj.getCoords()[0]){
			//System.out.println("x-hit");
			if(coords[2]-25 < obj.getCoords()[2]+25){
				//System.out.print("1");
				if(coords[3]+25 > obj.getCoords()[3]-25){;
					GameStarter.delScore();
				}
			}
		}
		//System.out.println(coords[2]+" "+obj.coords[2]);
	}
}