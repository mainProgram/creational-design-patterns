package com.groupeisi.abstractfactory;

public abstract class Professeur {

    String nom;

    String prenom;

    String diplome;

    public Professeur(){}
    public Professeur(String nom, String prenom, String diplome) {
        this.nom = nom;
        this.prenom = prenom;
        this.diplome = diplome;
    }

    abstract void create();

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDiplome() {
        return diplome;
    }
}
