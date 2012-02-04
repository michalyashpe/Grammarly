package com.dheppner.plugins.grammarly;

import org.bukkit.configuration.file.FileConfiguration;

/**
 * User: Daniel
 * Date: 2/4/12
 * Time: 12:37 AM
 */
public class GrammarlyConfigManager {
    final GrammarlyMain plugin;

    public GrammarlyConfigManager(GrammarlyMain plugin) {
        this.plugin = plugin;
    }

    public void loadConfiguration() {
        plugin.getConfig().options().copyDefaults(true);
        plugin.saveConfig();
    }

    public void reloadConfig() {
        plugin.reloadConfig();
    }

    public void setDefaults() {
        FileConfiguration config = plugin.getConfig();
        config.addDefault("Fixes.Capitalization", "true");
        config.addDefault("Fixes.Punctuation", "true");
    }
}
