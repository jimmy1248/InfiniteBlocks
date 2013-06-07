package net.jimmy1248.infiniteBlocks;

import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class InfiniteLavaCommandExecutor implements CommandExecutor{
	private InfiniteBlocks plugin;
	
	public InfiniteLavaCommandExecutor(InfiniteBlocks plugin){
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command,String label, String[] args) {
		if(command.getName().equalsIgnoreCase("infiniteblocks")){
			if(args[0]=="place"){
				if(!(sender instanceof Player)){
					sender.sendMessage("This command can only be run by a player.");
					return true;
				}
				place((Player)sender,args);
			}else if(args[0]=="list") list();
			else if(args[0]=="remove") remove();
			else sender.sendMessage("Usage /infiniteblocks place|list|remove");
		}
		return false;				
	}

	private void remove() {
		// TODO Auto-generated method stub
		
	}

	private void list() {
		// TODO Auto-generated method stub
		
	}

	private void place(Player player,String[] args) {
		Block block = player.getTargetBlock(null, 20);
		if(args.length==3){
			
		}
	}
	
	
}
