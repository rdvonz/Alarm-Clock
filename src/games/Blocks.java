package games;
                              
import java.util.ArrayList;
import java.util.Random;

import org.newdawn.slick.geom.Rectangle;
public class Blocks{
	Rectangle rect;
	ArrayList<Block> blocks;
	Random r = new Random();
	Block blck;

	public Blocks(int num){
		blocks = new ArrayList<Block>();
		for(int i=0; i<num; i++){
			blocks.add(new Block());
		}
		}
		
	public Rectangle getBlock(int numBlock){
		return blocks.get(numBlock);
	}
	public int getNumBlocks(){
		return blocks.size();
	}
	
	public void update(){
		for(int i=0; i<getNumBlocks(); i++){
			((Block) getBlock(i)).setLoc();
		}
	}
	
}
