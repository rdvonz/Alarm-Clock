package clock;

/*Imports from the Slick2d Game library*/
import games.Blocks;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;


public class Main extends BasicGame{
	Blocks blcks;
	Clock clock;
	
	public Main(){
		super("Clock");
	}

	public void init(GameContainer gc) throws SlickException{


		/*This is a little test case to see if my class works*/
		clock = new Clock();
		blcks = new games.Blocks(20);

	}

	public void update(GameContainer gc, int delta) throws SlickException{

		blcks.update();
		clock.update();
	}

	public void render(GameContainer gc, Graphics g) throws SlickException{
		for(int i=0; i<blcks.getNumBlocks(); i++){
			g.draw(blcks.getBlock(i));
		}
		clock.render();

	}
	public static void main(String[] args) throws SlickException{
		AppGameContainer app = new AppGameContainer(new Main());
		app.setDisplayMode(640, 480, false);
		app.start();

	}
}
