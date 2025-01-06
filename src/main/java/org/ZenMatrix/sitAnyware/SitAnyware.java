package org.ZenMatrix.sitAnyware;

import org.ZenMatrix.sitAnyware.Commands.SitCommand;
import org.ZenMatrix.sitAnyware.Listeners.EntityStopRiding;
import org.ZenMatrix.sitAnyware.Listeners.PlayerDieEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SitAnyware extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new EntityStopRiding(), this);
        getServer().getPluginManager().registerEvents(new PlayerDieEvent(), this);
        getCommand("Sit").setExecutor(new SitCommand());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
