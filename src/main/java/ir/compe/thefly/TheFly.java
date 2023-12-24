package ir.compe.thefly;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class TheFly extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new myevent(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "|");
        getServer().getPluginCommand("CoCoolEvents").setExecutor(new flycmd());
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "||");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "|||");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "||||");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "|||||");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "||||||");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "|||||||");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "||||||||");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "|||||||||");
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Loaded COCOOLEVENTS 1.8 by CompeDevs");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "COCOOLEVENTS 1.8 Disabled");
    }
}
