package com.groupeisi.factory;

public class ProfesseurPrive implements Professeur{

    private String nom;
    private String prenom;
    private String diplome;
    private String entreprise;

    public ProfesseurPrive(String nom, String prenom, String diplome, String entreprise) {
        this.nom = nom;
        this.prenom = prenom;
        this.diplome = diplome;
        this.entreprise = entreprise;
    }

    @Override
    public void create() {
        // Logique de création pour ProfesseurPrive
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
