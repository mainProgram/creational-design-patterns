package com.groupeisi.factory;

public abstract class ProfesseurFactory {

    public Professeur create(String nom, String prenom, String diplome, String titreOuEntreprise) {
        Professeur professeur = createProfesseur(nom, prenom, diplome, titreOuEntreprise);
        professeur.create();
        return professeur;
    }
    protected abstract Professeur createProfesseur(String nom, String prenom, String diplome, String titreOuEntreprise);
}
