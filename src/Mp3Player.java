
import javazoom.jl.player.Player;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class Mp3Player
{
	private static Player player;
	private static FileInputStream file;
	private static BufferedInputStream bis;
	static int ERROR;

	public Mp3Player(File filename){
		try{
			file = new FileInputStream(filename);
			bis = new BufferedInputStream(file);
			player = new Player(bis);
		}
		catch(Exception e){
			ERROR = -1;
		}
	}
	public void play(){
		try{
		player.play();
		}
		catch(Exception e){
			ERROR = -1;
		}
	}
}       