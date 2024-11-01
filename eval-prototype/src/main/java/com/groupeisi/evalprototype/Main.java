package com.groupeisi.evalprototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        ConnectionId connection1 = new ConnectionId("fz", "Fama");

        System.out.println(connection1.getName() + "\n");

        ConnectionId connection2 = connection1.clone();

        System.out.println(connection2.getName());
    }
}
