package games;

import java.util.ArrayList;
import java.util.Random;

import org.newdawn.slick.fills.GradientFill;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
public class Blocks{
	Rectangle rect;
	ArrayList<Block> blocks;
	Random r = new Random();
	Color col;
	GradientFill fill;
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
			if(((Block) getBlock(i)).getCoords()[3]>480){
				((Block) getBlock(i)).setLoc(r.nextInt(480),0);
			}
			((Block) getBlock(i)).setLoc();
		}
	}	
}
