package com.crypticv.townylegendscore;

import com.crypticv.townylegendscore.events.playerevents.PlayerJoin;
import com.crypticv.townylegendscore.events.playerevents.OnDeath;
import org.bukkit.plugin.java.JavaPlugin;

public final class TownyLegendsCore extends JavaPlugin implements Listener{

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Towny Legends Core Has started up!");


        //event registration
        getServer().getPluginManager().registerevents(new OnDeath(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeave(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerMove(), this);




        //command registration
        getCommand("god").setExecutor(new god());
        getCommand("die").setExecutor(new die());
        getCommand("heal").setExecutor(new heal());
        getCommand("feed").setExecutor(new feed());
        getCommand("serverip").setExecutor(new serverip());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Towny Legends Core has shut down!");
    }
}
