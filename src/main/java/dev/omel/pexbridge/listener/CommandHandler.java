package dev.omel.pexbridge.listener;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class CommandHandler implements Listener {

    @EventHandler
    public void onCommand(ChatEvent event) {
        if (event.getMessage().startsWith("/pex")) {
            ProxyServer.getInstance().getServers().values().forEach(server -> {
                server.sendData("BungeeCord", "pex reload".getBytes());
            });
        }
    }
}
