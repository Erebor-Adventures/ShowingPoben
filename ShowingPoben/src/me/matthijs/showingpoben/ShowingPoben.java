package me.matthijs.showingpoben;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ShowingPoben extends JavaPlugin {
	
	@Override
	public void onEnable(){
		getLogger().info("ENABLED");
	}
	
	@Override
	public void onDisable(){
		getLogger().info("DISABLED");
	}
	
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	
}
	
	
return false	

}

