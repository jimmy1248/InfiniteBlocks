package net.jimmy1248.infiniteBlocks;
import org.bukkit.block.Block;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class PlaceBlocks extends BukkitRunnable{
	private final InfiniteBlocks plugin;
	public Block block;
	private int id;
	private byte data;
	private long period;
	private BukkitTask task;
	
		
	public PlaceBlocks(InfiniteBlocks plugin,Block block,int id,byte data,long period) {
		this.plugin = plugin;
		this.block = block;
		this.id = id;
		this.data = data;
		this.period = period;
		plugin.logger.info("Starting timer");
		this.task = this.runTaskTimer(plugin, 0, this.period);
		plugin.logger.info("Timer Started");
	}
	public void run(){
		plugin.getServer().broadcastMessage("Lava placed"); 
		block.setTypeId(id, false);
		if(!(data==0)) block.setData(data);
	}
	public void cancel() {
		this.task.cancel();	
	}
	
}
