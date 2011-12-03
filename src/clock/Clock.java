package clock;

/*Imports from the Slick2d Game library*/
import gui.window;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.newdawn.slick.Color;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.AngelCodeFont;

public class Clock extends AngelCodeFont{
	DateFormat dateFormat;
	Calendar cal;
	AngelCodeFont font;
	int width;
	int height;
	String clockText;
	Color col;
	private static String alarm;
	private static boolean alarm_on = false;

	public Clock() throws SlickException{
		super("resources/lcd.fnt", "resources/lcd.png");

		/*dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");*/

		dateFormat = new SimpleDateFormat("HH:mm:ss");
		clockText = ""; // Place holder so it doesn't try to draw nothing and crash.

		//Make this a little smarter
		width = getWidth("00:00:00")/2;
		height = getHeight("0")/2;

		/*This is a little test case to see if my class works*/

	}

	public void update(){
		cal = Calendar.getInstance();
		clockText = (dateFormat.format(cal.getTime())).toString();

		checkAlarm();
	}
	public void render(){
		super.drawString(320-width,0+height, clockText, Color.orange);
	}

	public static void setAlarm(String alrm){
		alarm = alrm;
	}
	public String getAlarm(){
		return alarm;
	}

	public void checkAlarm(){
		if(alarm.equals(clockText) && alarm_on == false){ 
			alarm_on=true;
			MP3 mp3 = new MP3(gui.window.getSong());
			System.out.print("winning");
		}
	}
}