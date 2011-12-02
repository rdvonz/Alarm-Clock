package clock;

/*Imports from the Slick2d Game library*/
import games.Blocks;

import java.awt.Window;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.AngelCodeFont;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;


public class Clock extends BasicGame{
	DateFormat dateFormat;
	Calendar cal;
	AngelCodeFont font;
	int stateID = -1;
	int width;
	int height;
	String clockText;
	Color col;
	Blocks blcks;
	public Clock(){
		super("Clock");
	}

	public void init(GameContainer gc) throws SlickException{
		font = new AngelCodeFont("resources/lcd.fnt", "resources/lcd.png");
		/*dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");*/
		dateFormat = new SimpleDateFormat("HH:mm:ss");
		clockText = ""; // Place holder so it doesn't try to draw nothing.
		width = font.getWidth("00:00:00")/2;
		height = font.getHeight("0")/2;

		/*This is a little test case to see if my class works*/
		blcks = new games.Blocks(20);
		System.out.print(blcks.getBlock(9));

	}

	public void update(GameContainer gc, int delta) throws SlickException{
		cal = Calendar.getInstance();

		clockText = (dateFormat.format(cal.getTime())).toString();
		
		blcks.update();


	}

	public void render(GameContainer gc, Graphics g) throws SlickException{
		font.drawString(320-width,0+height, clockText, Color.orange);
		for(int i=0; i<blcks.getNumBlocks(); i++){
			g.draw(blcks.getBlock(i));
		}

	}
	public static void main(String[] args) throws SlickException{
		AppGameContainer app = new AppGameContainer(new Clock());
		app.setDisplayMode(640, 480, false);
		app.start();

	}
}
