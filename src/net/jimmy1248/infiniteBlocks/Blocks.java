package net.jimmy1248.infiniteBlocks;


import java.util.HashMap;
import java.util.Set;

import org.bukkit.block.Block;

public class Blocks {
	InfiniteBlocks plugin;
	private HashMap<String, PlaceBlocks> blocks;
	
	public Blocks(InfiniteBlocks plugin){
		this.plugin = plugin;    
	}	
	public void add(Block block,int id,byte data,long period){
		blocks.put(createKey(getLocation(block)),
				new PlaceBlocks(plugin, block, id, data, period));
	}
	
	public Set<String> list(){
		Set<String> s = blocks.keySet();
		return s;
		
	}	
	public void remove(String key){
		blocks.get(key).cancel();
		blocks.remove(key);
	}	
	public int size(){
		return blocks.size();
	}	
	public void load() {
				
	}	
	public void save() {
						
	}
	
	private String createKey(int[] location){
		int loc0 = location[0];
		int loc1 = location[1];
		int loc2 = location[2];
		return Integer.toString(loc0) + "_" + Integer.toString(loc1) + "_" + Integer.toString(loc2);
	}
	
	public int[] getLocation(Block block){
		int[] location = new int[3];
		location[0] = (int)block.getX();
		location[1] = (int)block.getY();
		location[2] = (int)block.getZ();
		return location;
	}
}
