/*
 * Copyright (C) 2020 Dams
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package newhook.dams.discordwebhook.loader;

import org.bukkit.configuration.file.FileConfiguration;

public class Config
{
    private final FileConfiguration config;

    public Config(FileConfiguration config)
    {
        this.config = config;
		config.addDefault("webhookUrl", "https://discordapp.com/api/webhooks");
		config.addDefault("serverIsOnline", "The server is online! Max players:");
		config.addDefault("serverIsOffline", "The server is going offline! Online players:");
		config.addDefault("playerLeave", "Left the server! Online count:");
		config.addDefault("playerJoin", "Joined the server! Online count:");
        config.options().copyDefaults(true);
    }

    public String getUrl()
    {
        return config.getString("webhookUrl");
	}
	


    public Message message()
    {
		Message lang= new  Message();
		lang.setServerIsOnline(config.getString("serverIsOnline"));
		lang.setServerIsOffline(config.getString("serverIsOffline"));
		lang.setPlayerJoin(config.getString("playerJoin"));
		lang.setPlayerLeave(config.getString("playerLeave"));
        return lang;
	}
}