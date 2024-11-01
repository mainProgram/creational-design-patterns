package com.groupeisi.factory;

public class Main {

    public static void main(String[] args) {
        ProfesseurFactory priveFactory = new ProfesseurPriveFactory();
        Professeur professeurPrive = priveFactory.create(ProfesseurEnum.PRIVE, "Seck", "Ngor", "Master");

        ProfesseurFactory publicFactory = new ProfesseurPublicFactory();
        Professeur professeurPublic = publicFactory.create(ProfesseurEnum.PUBLIC, "Ly", "Aly", "Master");

        // Affichage des informations
        System.out.println("Professeur Prive: " + professeurPrive.getNom() + " " + professeurPrive.getPrenom() + ", Diplome: " + professeurPrive.getDiplome());
        System.out.println("Professeur Public: " + professeurPublic.getNom() + " " + professeurPublic.getPrenom() + ", Diplome: " + professeurPublic.getDiplome());
    }
}
