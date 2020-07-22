package newhook.dams.discordwebhook.loader;
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

public class Message {

    String serverIsOnline;
    String serverIsOffline;
    String playerLeave;
    String playerJoin;

    public Message() {
    }

    public String getServerIsOnline() {
        return serverIsOnline;
    }

    public void setServerIsOnline(String serverIsOnline) {
        this.serverIsOnline = serverIsOnline;
    }

    public String getServerIsOffline() {
        return serverIsOffline;
    }

    public void setServerIsOffline(String serverIsOffline) {
        this.serverIsOffline = serverIsOffline;
    }

    public String getPlayerLeave() {
        return playerLeave;
    }

    public void setPlayerLeave(String playerLeave) {
        this.playerLeave = playerLeave;
    }

    public String getPlayerJoin() {
        return playerJoin;
    }

    public void setPlayerJoin(String playerJoin) {
        this.playerJoin = playerJoin;
    }

    @Override
    public String toString() {
        return "Message [playerJoin=" + playerJoin + ", playerLeave=" + playerLeave + ", serverIsOffline="
                + serverIsOffline + ", serverIsOnline=" + serverIsOnline + "]";
    }

 
    
}