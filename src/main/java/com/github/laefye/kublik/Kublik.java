package com.github.laefye.kublik;

import com.github.laefye.kublik.api.KublikAPI;
import com.github.laefye.kublik.api.Text;
import org.bukkit.plugin.java.JavaPlugin;

public final class Kublik extends KublikAPI {
    private final Text text = new KublikText();

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public Text getText() {
        return text;
    }
}
