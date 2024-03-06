package fr.sparta.warssystem;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println(getPluginMeta().getLoggerPrefix()+" Plugin Enabled");

    }

    @Override
    public void onDisable() {
        System.out.println(getPluginMeta().getLoggerPrefix()+" Plugin Disabled");
    }
}
