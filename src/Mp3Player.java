import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.BufferedInputStream;

import javax.swing.JFileChooser;

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
			player.play();
		}
		catch(Exception e){
			ERROR = -1;
		}
	}
}