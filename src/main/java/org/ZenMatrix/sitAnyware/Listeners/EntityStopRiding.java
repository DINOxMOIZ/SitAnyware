package org.ZenMatrix.sitAnyware.Listeners;

import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDismountEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.util.Vector;

public class EntityStopRiding implements Listener {

    @EventHandler
    public void onEntityStopRiding(EntityDismountEvent event){

        if (event.getDismounted() instanceof ArmorStand){

            Vector velocity = new Vector(0,0.5,0);


            event.getDismounted().remove();

            event.getEntity().setVelocity(velocity);


        }

    }

}
