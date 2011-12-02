package clock;

/*Imports from the Slick2d Game library*/
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
	String alarm;

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
	}
	public void render(){
		super.drawString(320-width,0+height, clockText, Color.orange);
	}

	public void setAlarm(String alarm){
		this.alarm = alarm;
	}
	public String getAlarm(){
		return alarm;
	}
	
	public Boolean checkAlarm(){
		if(alarm.equals(clockText)){
			return true;
		}
		return false;
	}
}
