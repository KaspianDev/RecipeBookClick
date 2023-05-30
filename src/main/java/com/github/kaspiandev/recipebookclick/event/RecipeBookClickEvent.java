package com.github.kaspiandev.recipebookclick.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class RecipeBookClickEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final boolean open;

    public RecipeBookClickEvent(@NotNull Player player, boolean open) {
        super(true);
        this.open = open;
        this.player = player;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }

    @NotNull
    @Override
    public String getEventName() {
        return super.getEventName();
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public boolean isOpen() {
        return open;
    }

    @NotNull
    public Player getPlayer() {
        return player;
    }

}
