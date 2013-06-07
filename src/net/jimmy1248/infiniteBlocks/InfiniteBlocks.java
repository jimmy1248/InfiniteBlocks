package net.jimmy1248.infiniteBlocks;


import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;



public class InfiniteBlocks extends JavaPlugin{
	Blocks infiniteBlocks;
	public int max = 0;
    Logger logger;
	@Override
	public void onEnable() {
		 logger = getLogger();
		getCommand("infiniteblocks").setExecutor(new InfiniteBlockCommandExecutor(this));
	}
	@Override
	public void onDisable() {	
	}
	
	
}
