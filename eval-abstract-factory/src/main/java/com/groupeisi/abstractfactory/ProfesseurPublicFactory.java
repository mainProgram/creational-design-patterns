package com.groupeisi.abstractfactory;

public class ProfesseurPublicFactory implements TypeProfesseurFactory {

    @Override
    public Professeur createProfesseur(String nom, String prenom, String diplome, String titre) {
        return new ProfesseurPublic(nom, prenom, diplome, titre);
    }
}
