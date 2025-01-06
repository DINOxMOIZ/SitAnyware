package org.ZenMatrix.sitAnyware.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import javax.swing.text.PlainDocument;
import java.util.List;

public class SitCommand implements CommandExecutor, TabExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player player){
            ArmorStand sitEntity = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0 , -2, 0), EntityType.ARMOR_STAND);

            sitEntity.setBasePlate(false);
            sitEntity.setArms(false);
            sitEntity.setInvisible(true);
            sitEntity.setVisible(false);
            sitEntity.setVisualFire(false);
            sitEntity.setInvulnerable(true);
            sitEntity.setGravity(false);
            sitEntity.setPassenger(player);

            return true;

        }
        else {
            commandSender.sendMessage("Only Players Can Use This Command");
            return false;
        }

    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return List.of();
    }
}
