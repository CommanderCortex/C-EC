package ctx.cec.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FLYCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){sender.sendMessage("Player Command Only"); return true;}
        Player player = (Player) sender;
        if(!player.hasPermission("Cortex.Fly")){sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cError! Permission Node &9Cortex.Fly&c Was not found?")); return true;}
        if(player.isFlying()){ player.setFlying(false);
        player.sendMessage("Flying Set To: False");
        return true;
        }else{ player.setFlying(true); }
        player.sendMessage("Flying Set To: True");
        return false;
    }
}
