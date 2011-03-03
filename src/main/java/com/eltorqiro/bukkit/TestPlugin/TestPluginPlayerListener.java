
package com.eltorqiro.bukkit.TestPlugin;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 * Handle events for all Player related events
 * @author Dinnerbone
 */
public class TestPluginPlayerListener extends PlayerListener {
    private final TestPlugin plugin;

    public TestPluginPlayerListener(TestPlugin instance) {
        plugin = instance;
    }

    @Override
    public void onPlayerJoin(PlayerEvent event) {
        System.out.println(event.getPlayer().getName() + " joined the server! :D");
    }

}
