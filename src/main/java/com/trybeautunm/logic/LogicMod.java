package com.trybeautunm.logic;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogicMod implements ModInitializer {
    public static final String MOD_ID = "logic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world from Logic! Initialized for 1.21.11.");
	}
}