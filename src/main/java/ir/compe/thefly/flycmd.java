package ir.compe.thefly;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class flycmd implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3) {

        sender.sendMessage(ChatColor.GREEN + "You Are Using CoCoolEvents Version 1.8 By CompeDevs");

        return false;
    }
}
