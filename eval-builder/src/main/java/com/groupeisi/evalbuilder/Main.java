package com.groupeisi.evalbuilder;

public class Main {

    public static void main(String[] args) {
        ConnectionId connection = new ConnectionId.Builder()
                .username("fz")
                .name("fama")
                .build();


        System.out.println("username: " + connection.getUsername());
        System.out.println("nom: " + connection.getName());
    }
}
