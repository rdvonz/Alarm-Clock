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
	public Clock(){
		/* Constructor */
		super("Avoid the blocks!");
	}

	@Override
	public void init(GameContainer gc) throws SlickException{
		 dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//get current date time with Date()
		Date date = new Date();
		System.out.println(dateFormat.format(date));

		//get current date time with Calendar()

	}

	public void update(GameContainer gc, int delta) throws SlickException{
		cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));


	}

	public void render(GameContainer gc, Graphics g) throws SlickException{
	}

	public static void main(String[] args) throws SlickException{
		AppGameContainer app = new AppGameContainer(new Clock());
		app.setDisplayMode(640, 480, false);
		app.start();

	}
}
