package com.dheppner.plugins.grammarly;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * User: Daniel
 * Date: 2/4/12
 * Time: 12:09 AM
 */
public class GrammarlyMain extends JavaPlugin {

    public void onDisable() {
    }

    public void onEnable() {
        getServer().getPluginManager().registerEvents(new GrammarlyPlayerListener(this), this);


    }
}
