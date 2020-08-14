package ctx.cec;

import ctx.cec.Commands.FLYCMD;
import ctx.cec.Commands.GMCMD;
import org.bukkit.plugin.java.JavaPlugin;

public final class CEC extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
    }
    public void registerCommands(){
        getServer().getPluginCommand("gm").setExecutor(new GMCMD());
        getServer().getPluginCommand("fly").setExecutor(new FLYCMD());
    }
}
