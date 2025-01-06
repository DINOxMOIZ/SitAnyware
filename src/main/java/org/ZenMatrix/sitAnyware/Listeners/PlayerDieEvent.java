package org.ZenMatrix.sitAnyware.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Skull;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class PlayerDieEvent implements Listener {

    @EventHandler
    public void onPlayerDied(PlayerDeathEvent event){

        Player player = event.getEntity();

        Block deathLocation = player.getLocation().getBlock();

        ItemStack playerHead = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta playerHeadSkullMeta = (SkullMeta) playerHead.getItemMeta();

        if (playerHeadSkullMeta != null){
            playerHeadSkullMeta.setOwningPlayer(Bukkit.getOfflinePlayer(player.getName()));
        }

        deathLocation.setType(Material.PLAYER_HEAD);
        BlockState state = deathLocation.getState();
        if (state instanceof Skull) {
            Skull skull = (Skull) state;
            skull.setRotation(org.bukkit.block.BlockFace.NORTH);  // You can set the skull's rotation if needed
            skull.setOwningPlayer(player);  // Optional: set the skull's owner to the player
            skull.update();
        }



    }

}
