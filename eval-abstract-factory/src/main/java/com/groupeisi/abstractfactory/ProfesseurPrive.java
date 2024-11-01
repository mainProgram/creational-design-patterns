package com.groupeisi.abstractfactory;

public class ProfesseurPrive extends Professeur{

    private String entreprise;

    public ProfesseurPrive(String nom, String prenom, String diplome, String entreprise) {
        super(nom, prenom, diplome);
        this.entreprise = entreprise;
    }

    public String getEntreprise() {
        return entreprise;
    }

    @Override
    void create() {
        System.out.println("Création d'un professeur privé : " + getNom() + " " + getPrenom() + ", Diplôme : " + getDiplome() + ", Entreprise : " + entreprise);
    }

}
