package net.archers.config;

import net.spell_engine.api.item.ItemConfig;

import java.util.HashMap;
import java.util.Map;

public class ArchersItemConfig { public ArchersItemConfig() {}
    public Map<String, RangedConfig> weapons = new HashMap();
    public Map<String, ItemConfig.ArmorSet> armor_sets = new HashMap();
}