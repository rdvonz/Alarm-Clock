import javazoom.jl.decoder.Decoder;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.BufferedInputStream;

import javax.swing.JFileChooser;

public class Mp3Player
{
	private String filename;
	private static Player player;
	private static FileInputStream file;
	private static BufferedInputStream bis;
	
	public static void main(String[] args) throws FileNotFoundException, JavaLayerException{
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(null);
		file = new FileInputStream(fc.getSelectedFile());
		bis = new BufferedInputStream(file);
		
		player = new Player(bis);
		
		String path = fc.getSelectedFile().getPath();
		System.out.println(path);
		
		player.play();
		
	}

}