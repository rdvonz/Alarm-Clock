package clock;

/*Imports from the Slick2d Game library*/
import games.Blocks;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.fills.GradientFill;


public class Main extends BasicGame{
	Blocks blcks;
	Clock clock;
	Color col;
	GradientFill fill;
	
	public Main(){
		super("Clock");
	}

	public void init(GameContainer gc) throws SlickException{


		/*This is a little test case to see if my class works*/
		fill = new GradientFill(0, 0, col.blue, 50, 50, col.blue);
		clock = new Clock();
		blcks = new Blocks(10);


	}

	public void update(GameContainer gc, int delta) throws SlickException{

		//blcks.update();
		clock.update();
		blcks.update();
	}

	public void render(GameContainer gc, Graphics g) throws SlickException{
		clock.render();
		for(int i=0; i<blcks.getNumBlocks(); i++){
			g.fill(blcks.getBlock(i), fill);
		}

	}
	public static void main(String[] args) throws SlickException{
		AppGameContainer app = new AppGameContainer(new Main());
		app.isShowingFPS();
		app.setDisplayMode(640, 480, false);
		app.start();

	}
}
