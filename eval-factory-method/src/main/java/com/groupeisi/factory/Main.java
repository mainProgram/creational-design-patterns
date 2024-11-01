package com.groupeisi.factory;

public class Main {

    public static void main(String[] args) {
        ProfesseurFactory priveFactory = new ProfesseurPriveFactory();
        Professeur professeurPrive = priveFactory.create("Seck", "Ngor", "Master", "ATOS");

        ProfesseurFactory publicFactory = new ProfesseurPublicFactory();
        Professeur professeurPublic = publicFactory.create("Ly", "Aly", "Master", "Professeur");

    }
}
