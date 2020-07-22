package newhook.dams.discordwebhook.loader;

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