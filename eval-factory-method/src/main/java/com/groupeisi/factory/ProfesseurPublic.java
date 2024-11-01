package com.groupeisi.factory;

public class ProfesseurPublic implements Professeur{

    private String nom;
    private String prenom;
    private String diplome;
    private String titre;

    public ProfesseurPublic(String nom, String prenom, String diplome, String titre) {
        this.nom = nom;
        this.prenom = prenom;
        this.diplome = diplome;
        this.titre = titre;
    }

    @Override
    public void create() {
        System.out.println("Professeur Public: " + getNom() + " " + getPrenom() + ", Diplome: " + getDiplome());
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public String getDiplome() {
        return diplome;
    }
}
