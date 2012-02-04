package com.dheppner.plugins.grammarly;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

/**
 * User: Daniel
 * Date: 2/4/12
 * Time: 12:11 AM
 */
public class GrammarlyPlayerListener implements Listener {
    
    protected final GrammarlyMain plugin;
    
    public GrammarlyPlayerListener(GrammarlyMain plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerChat(final PlayerChatEvent event) {
        
    }
    
    private int getReputationDamage(GrammarMistake mistake) {
        switch (mistake) {
            case CAPITALIZATION:
                return 1;
                break;
            case PUNCTUATION:
                return
                break;
            case SPELLING:
                break;
            case HAVEGOT:
                break;
            case BRITISH:
                break;
        }
    }
}
