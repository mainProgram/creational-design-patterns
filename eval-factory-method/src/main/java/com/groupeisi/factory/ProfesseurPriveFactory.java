package com.groupeisi.factory;

public class ProfesseurPriveFactory extends ProfesseurFactory {

    @Override
    protected Professeur createProfesseur(String nom, String prenom, String diplome, String entreprise) {
        return new ProfesseurPrive(nom, prenom, diplome, entreprise);
    }
}
