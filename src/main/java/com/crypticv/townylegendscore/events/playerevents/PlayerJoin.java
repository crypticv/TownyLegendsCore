package com.crypticv.townylegendscore.events.playerevents;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    @EventHandler
    void onPlayerJoin(PlayerJoinEvent e) {

        e.setJoinMessage(ChatColor.GREEN + "Welcome back to the server" + e.getPlayer().getDisplayName());


    }


}
