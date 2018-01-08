package com.Ryseempiremc.RudeEssentials;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import com.Ryseempiremc.RudeEssentials.Commands.BombCommand;
import com.Ryseempiremc.RudeEssentials.Commands.FuckOffCommand;


public class Main extends JavaPlugin{

    Logger Logger = Bukkit.getLogger();
    ConsoleCommandSender clogger = this.getServer().getConsoleSender(); // must type .sendMessage(colour + "Message") after it
	
	public void onEnable() {
		clogger.sendMessage(ChatColor.AQUA+"[RudeEssentials] Oi Cunt! Rude Essentials has loaded! Jules Did Something Right For Once!");
		this.getCommand("FuckOff").setExecutor((CommandExecutor)new FuckOffCommand());
		this.getCommand("Bomb").setExecutor((CommandExecutor)new BombCommand());
	}
	public void onDisable() {
		System.out.println("(!) Well shit... Did jules restart the fucking server again? What a cunt!");
	}
}
