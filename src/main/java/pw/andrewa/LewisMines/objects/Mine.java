package pw.andrewa.LewisMines.objects;

import org.bukkit.Location;
import org.bukkit.Material;

import java.util.HashMap;

/**
 * ------------------------------
 * Copyright (c) AndrewAubury 2018
 * https://www.andrewa.pw
 * Project: LewisMines
 * ------------------------------
 */
public class Mine {
    String name;
    HashMap<Material, Integer> mineBlocks;
    Location mineSpawn;
    long secsTillReload;
    ResetType type; //ResetType.NORMAL ResetType.PER_FLOOR ResetType.TNT ResetType.SMITE


    public Mine(String configname) {

    }
}
