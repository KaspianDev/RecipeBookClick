package com.github.kaspiandev.recipebookclick.listeners;

import com.github.kaspiandev.recipebookclick.event.RecipeBookClickEvent;
import com.github.retrooper.packetevents.event.PacketListenerAbstract;
import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import com.github.retrooper.packetevents.protocol.packettype.PacketType;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientSetRecipeBookState;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class RecipeBookListener extends PacketListenerAbstract {

    @Override
    public void onPacketReceive(PacketReceiveEvent event) {
        if (event.getPacketType() == PacketType.Play.Client.SET_RECIPE_BOOK_STATE) {
            WrapperPlayClientSetRecipeBookState packet = new WrapperPlayClientSetRecipeBookState(event);

            RecipeBookClickEvent recipeBookEvent = new RecipeBookClickEvent((Player) event.getPlayer(), packet.isBookOpen());
            Bukkit.getServer().getPluginManager().callEvent(recipeBookEvent);
        }
    }

}
