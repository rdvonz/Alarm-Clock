package clock;

/*Imports from the Slick2d Game library*/
import java.awt.Window;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.AngelCodeFont;


public class Clock extends BasicGame{
	DateFormat dateFormat;
	Calendar cal;
	AngelCodeFont font;
	int width;
	int height;
	String clockText;
	public Clock(){
		/* Constructor */
		super("Clock");
	}

	@Override
	public void init(GameContainer gc) throws SlickException{
		font = new AngelCodeFont("resources/lcd.fnt", "resources/lcd.png");
		 /*dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");*/
		 dateFormat = new SimpleDateFormat("HH:mm:ss");
		 clockText = ""; // Place holder so it doesn't try to draw nothing.
		 width = font.getWidth("00:00:00")/2;
		 height = font.getHeight("0")/2;

	}

	public void update(GameContainer gc, int delta) throws SlickException{
		cal = Calendar.getInstance();
		clockText = (dateFormat.format(cal.getTime())).toString();


	}

	public void render(GameContainer gc, Graphics g) throws SlickException{
		font.drawString(320-width,240-height, clockText);
	}

	public static void main(String[] args) throws SlickException{
		AppGameContainer app = new AppGameContainer(new Clock());
		app.setDisplayMode(640, 480, false);
		app.start();

	}
}
