package com.Ryseempiremc.RudeEssentials.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BombCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (cmd.getName().equalsIgnoreCase("Bomb")) {
			if (sender instanceof Player) {
				Bukkit.getServer().dispatchCommand(sender,
						(ChatColor.AQUA + "kickall You have been blown up by" + sender.getName() + "!"));
			}

			else {
				sender.sendMessage("Oi you lazy cunt! Login to your server and do this!");
			}
		}
		return true;
	}
}
