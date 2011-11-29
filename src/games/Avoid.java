package games;

/*Imports from the Slick2d Game libary*/
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Avoid extends BasicGame{

	public Avoid(){
		/* Constructor */
		super("Avoid the blocks!");
	}
	
	@Override
	public void init(GameContainer gc) throws SlickException{

	}
	
	public void update(GameContainer gc, int delta) throws SlickException{

	}
	
	public void render(GameContainer gc, Graphics g) throws SlickException{
	}
	
	public static void main(String[] args) throws SlickException{
		AppGameContainer app = new AppGameContainer(new Avoid());
		app.setDisplayMode(640, 480, false);
		app.start();

	}
}
