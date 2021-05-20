package Prototype;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Prototype extends JavaPlugin{

    //i
    @Override
    public void onEnable(){

    }

    //i
    @Override
    public void onDisable(){

    }

    @Override
    public boolean onCommand(CommandSender utente, Command comando , String label , String[] args){
        if (comando.getName().equalsIgnoreCase("sitoweb")){
            utente.sendMessage("Il sito è kiritosystems.ddns.net");
            return true;
        }
        return false;
    }

}

