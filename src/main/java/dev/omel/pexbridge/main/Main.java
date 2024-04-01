package dev.omel.pexbridge.main;

import dev.omel.pexbridge.listener.CommandHandler;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {

    @Override
    public void onEnable(){
        registerCommands();
        registerListener();

    }

    public void onDisable(){}

    private void registerCommands(){
    }

    private void registerListener() {

        getProxy().getPluginManager().registerListener(this, new CommandHandler());

    }

}