package com.groupeisi.abstractfactory;

public class ProfesseurPriveFactory implements TypeProfesseurFactory {

    @Override
    public Professeur createProfesseur(String nom, String prenom, String diplome, String entreprise) {
        return new ProfesseurPrive(nom, prenom, diplome, entreprise);
    }
}
