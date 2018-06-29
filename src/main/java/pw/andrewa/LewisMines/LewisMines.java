package pw.andrewa.LewisMines;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * ------------------------------
 * Copyright (c) AndrewAubury 2018
 * https://www.andrewa.pw
 * Project: LewisMines
 * ------------------------------
 */
public class LewisMines extends JavaPlugin {

    @Getter private static LewisMines instance;

    @Override
    public void onEnable() {
        instance = this;
        super.onEnable();

    }
}
