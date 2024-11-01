package com.groupeisi.evaluationsingleton;

public class Main {

    public static void main(String[] args) {

        ConnectionId connection1 = ConnectionId.getInstance("fz", "Fama");
        System.out.println("Username: " + connection1.getUsername());
        System.out.println("Name: " + connection1.getName());

        ConnectionId connection2 = ConnectionId.getInstance("sb", "said");

        System.out.println("Username: " + connection2.getUsername());
        System.out.println("Name: " + connection2.getName());
    }
}
