package com.groupeisi.factory;

public abstract class ProfesseurFactory {

    public Professeur create(ProfesseurEnum type, String nom, String prenom, String diplome) {
        Professeur professeur = createProfesseur(type, nom, prenom, diplome);
        professeur.create();
        return professeur;
    }
    protected abstract Professeur createProfesseur(ProfesseurEnum type, String nom, String prenom, String diplome);
}
