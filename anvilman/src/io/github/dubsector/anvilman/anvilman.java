package io.github.dubsector.anvilman;

import org.bukkit.plugin.java.JavaPlugin;

public final class anvilman extends JavaPlugin {
	
		@Override
		public void onEnable(){
				getLogger().info("onEnable has been invoked!");
		}
 
		@Override
		public void onDisable() {
    			getLogger().info("onDisable has been invoked!");
		}
}

