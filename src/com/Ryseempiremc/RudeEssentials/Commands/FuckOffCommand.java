package com.Ryseempiremc.RudeEssentials.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FuckOffCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if (cmd.getName().equalsIgnoreCase("FuckOff")) {
			if (sender.hasPermission("RE.Kick")) {
				if (args.length == 0) {
					sender.sendMessage(ChatColor.AQUA + "Please specify a player!");
					return true;
				}
				Player target = Bukkit.getServer().getPlayer(args[0]);
				if (target == null) {
					sender.sendMessage(ChatColor.AQUA + "Could not find player " + args[0] + "!");
					return true;
				}
				target.kickPlayer(ChatColor.RED + "You have been kicked!");
				Bukkit.getServer().getPluginManager().callEvent(new EnforcerEvent(target, Type.KICK));
				Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Player " + target.getName()
						+ " has been kicked by " + sender.getName() + "!");
			}
			else {
				sender.sendMessage(ChatColor.AQUA +("You don't have the required permissions to perform this command!"));
			}
		}
		return true;
	}
}