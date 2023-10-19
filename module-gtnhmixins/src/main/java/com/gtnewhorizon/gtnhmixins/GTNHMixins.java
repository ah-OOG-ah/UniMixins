package com.gtnewhorizon.gtnhmixins;

import cpw.mods.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.legacymoddingmc.unimixins.gtnhmixins.Tags;

@Mod(modid = GTNHMixins.MODID, version = GTNHMixins.VERSION, name = GTNHMixins.NAME, acceptableRemoteVersions = "*")
@net.minecraftforge.fml.common.Mod(modid = GTNHMixins.MODID, version = GTNHMixins.VERSION, name = GTNHMixins.NAME, acceptableRemoteVersions = "*")
public class GTNHMixins {
    public static final String NAME = "GTNHMixins";
    public static final String MODID = "gtnhmixins";
    public static final String VERSION = Tags.VERSION;
    public static final Logger LOGGER = LogManager.getLogger(NAME);
}