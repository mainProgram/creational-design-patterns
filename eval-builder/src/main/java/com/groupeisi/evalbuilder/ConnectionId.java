package com.groupeisi.evalbuilder;

public class ConnectionId {
    private String username;
    private String name;

    private ConnectionId(Builder builder) {
        this.username = builder.username;
        this.name = builder.name;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private String username;
        private String name;

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public ConnectionId build() {
            return new ConnectionId(this);
        }

    }
}

