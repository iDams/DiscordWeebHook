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
package newhook.dams.discordwebhook;

import okhttp3.*;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.json.JSONObject;

import newhook.dams.discordwebhook.loader.Message;

import java.io.IOException;


public class Sender implements Listener
{

    public static void playerJoin(Player player, Server server, String url, Message message)
    {
        if(!(Webhook.checkUrl(url)))
            return;

        try
        {
            JSONObject obj = new JSONObject().put("content", "**"+player.getName()+"** "+message.getPlayerJoin()+" **"+server.getOnlinePlayers().size()+"/"+server.getMaxPlayers()+"**");

            OkHttpClient client = new OkHttpClient();
            RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), obj.toString());
            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();

            Response response = client.newCall(request).execute();
        }
        catch(IOException e)
        {
            Webhook.logError(e);
        }
    }

    public static void playerLeave(Player player, Server server, String url, Message message)
    {
        if(!(Webhook.checkUrl(url)))
            return;

        try
        {
            long count = server.getOnlinePlayers().size()-1;
            JSONObject obj = new JSONObject().put("content", "**"+player.getName()+"** "+message.getPlayerLeave()+" **"+count+"/"+server.getMaxPlayers()+"**");

            OkHttpClient client = new OkHttpClient();
            RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), obj.toString());
            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();

            Response response = client.newCall(request).execute();
        }
        catch(IOException e)
        {
            Webhook.logError(e);
        }
    }

    public static void startup(Server server, String url, Message message)
    {
        if(!(Webhook.checkUrl(url)))
            return;

        try
        {
            JSONObject obj = new JSONObject().put("content", message.getServerIsOnline()+ " **"+server.getMaxPlayers()+"**");

            OkHttpClient client = new OkHttpClient();
            RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), obj.toString());
            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();

            Response response = client.newCall(request).execute();
        }
        catch(IOException e)
        {
            Webhook.logError(e);
        }
    }

    public static void shutdown(Server server, String url, Message message)
    {
        if(!(Webhook.checkUrl(url)))
            return;

        try
        {
            JSONObject obj = new JSONObject().put("content", message.getServerIsOffline()+ " **"+server.getOnlinePlayers().size()+"**");

            OkHttpClient client = new OkHttpClient();
            RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), obj.toString());
            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();

            Response response = client.newCall(request).execute();
        }
        catch(IOException e)
        {
            Webhook.logError(e);
        }
    }
}
