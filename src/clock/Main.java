package clock;

/*Imports from the Slick2d Game library*/
import games.*;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.fills.GradientFill;


public class Main extends BasicGame{
	Blocks blcks;
	Clock clock;
	Color col;
	GradientFill fill;
	GradientFill playerFill;
	Input input;
	Player player;
	
	public Main(){
		super("Clock");
	}

	public void init(GameContainer gc) throws SlickException{


		/*This is a little test case to see if my class works*/
		fill = new GradientFill(0, 0, Color.blue, 50, 50, col.blue);
		playerFill = new GradientFill(320, 240, Color.red, 640, 480, col.cyan);
		clock = new Clock();
		player = new Player();
		blcks = new Blocks(10);
		input = gc.getInput();


	}

	public void update(GameContainer gc, int delta) throws SlickException{

		//blcks.update();
		clock.update();
		blcks.update();
		player.update(input);
		for(int i=0; i<blcks.getNumBlocks(); i++){
			player.checkCollision((Block) blcks.getBlock(i));
		}
		
	}

	public void render(GameContainer gc, Graphics g) throws SlickException{
		clock.render();
		for(int i=0; i<blcks.getNumBlocks(); i++){
			g.fill(blcks.getBlock(i), fill);
		}
		g.fill(player, playerFill);

	}
	public static void main(String[] args) throws SlickException{
		AppGameContainer app = new AppGameContainer(new Main());
		app.setTargetFrameRate(60);
		app.setDisplayMode(640, 480, false);
		app.start();

	}
}
