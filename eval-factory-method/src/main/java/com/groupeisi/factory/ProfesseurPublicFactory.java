package com.groupeisi.factory;

public class ProfesseurPublicFactory extends ProfesseurFactory {

    @Override
    protected Professeur createProfesseur(String nom, String prenom, String diplome, String titre) {
        return new ProfesseurPublic(nom, prenom, diplome, titre);
    }
}
