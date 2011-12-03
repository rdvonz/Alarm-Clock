package clock;

import javazoom.jl.player.Player;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class MP3 extends Thread
{
	private Player player;
	private FileInputStream file;
	private BufferedInputStream bis;
	static int ERROR;

	public MP3(File filename){
		try{
			file = new FileInputStream(filename);
			bis = new BufferedInputStream(file);
			player = new Player(bis);
		}
		catch(Exception e){
			ERROR = -1;
		}
	}
	public void run(){
		try{player.play();
		}
		catch (Exception e) {
			ERROR = -1;
		}
	}
}
