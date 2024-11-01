package com.groupeisi.evaluationsingleton;

public class ConnectionId {

    private String username;
    private String name;

    private static ConnectionId instance;


    private ConnectionId(String username, String name) {
        this.username = username;
        this.name = name;
    }

    public static ConnectionId getInstance(String username, String name) {
        if (instance == null) {
            instance = new ConnectionId(username, name);
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }
}
