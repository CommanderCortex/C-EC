package ctx.cec.Commands;

import ctx.cec.Utils.GlobalMSGS;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GMCMD implements CommandExecutor {
    GlobalMSGS globalMSGS;
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){ sender.sendMessage(globalMSGS.PlayerCommand); return true;}
        if(!sender.hasPermission("Cortex.GM")){ sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cError! Permission Node &9Cortex.GM&c Was not found?")); return true;}
        Player player = (Player) sender;
        if(player.getGameMode().equals(GameMode.CREATIVE)){
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage(ChatColor.GREEN + "Your GameMode Has Been Updated to Survival");
            return true;
        }else{
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage(ChatColor.GREEN + "Your GameMode Has Been Updated to Creative");
        }
        return true;
    }
}
