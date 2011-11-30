package clock;

/*Imports from the Slick2d Game library*/
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
	String clockText = "test";
	public Clock(){
		/* Constructor */
		super("Clock");
	}

	@Override
	public void init(GameContainer gc) throws SlickException{
		font = new AngelCodeFont("resources/newfont.fnt", "resources/newfont.png");
		 dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//get current date time with Date()

		//get current date time with Calendar()

	}

	public void update(GameContainer gc, int delta) throws SlickException{
		cal = Calendar.getInstance();
		clockText = (dateFormat.format(cal.getTime())).toString();


	}

	public void render(GameContainer gc, Graphics g) throws SlickException{
		font.drawString(50, 50, clockText);
	}

	public static void main(String[] args) throws SlickException{
		AppGameContainer app = new AppGameContainer(new Clock());
		app.setDisplayMode(640, 480, false);
		app.start();

	}
}
