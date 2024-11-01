package com.groupeisi.evalprototype;

public class ConnectionId implements Cloneable {
    private String username;
    private String name;

    public ConnectionId(String username, String name) {
        this.username = username;
        this.name = name;
    }

    @Override
    protected ConnectionId clone() throws CloneNotSupportedException {
        return (ConnectionId) super.clone();
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }
}
