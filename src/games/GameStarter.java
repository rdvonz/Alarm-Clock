package games;

/*Imports from the Slick2d Game library*/
import gui.window;
import org.newdawn.slick.Color;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.AngelCodeFont;

import clock.Clock;

public class GameStarter extends AngelCodeFont{
	AngelCodeFont font;
	private int width;
	private int height;
	String startText;
	private static int score;
	private static boolean gameStart = false;

	public GameStarter() throws SlickException{
		super("resources/lcd.fnt", "resources/lcd.png");
		startText = "Clear 100 to win! Press Spacebar to start";
		//Make this a little smarter
		width = getWidth(startText)/2;
		height = getHeight(startText)/2;

	}

	public void update(Input input){	
		checkStart(input);
		checkWin();
	}
	public void render(){
		if(Clock.getAlarmState() && !gameStart){
			super.drawString(320-width,240+height, startText, Color.white);
		}
		else if(Clock.getAlarmState() && gameStart){
			super.drawString(50, 50, "Cleared: " + Integer.toString(score), Color.white);
		}
	}

	public boolean checkStart(Input input){
		if(input.isKeyDown(Input.KEY_SPACE)){
			gameStart=true;
		}
		return false;
	}
	public static boolean checkGameState(){
		return gameStart;
	}
	public static void setScore(){
		score++;
	}
	public static void delScore(){
		score = 0;
	}
	public static int getScore(){
		return score;
	}
	private void checkWin(){
		if(score>=100){
			System.exit(0);
		}
	}
}