package com.groupeisi.abstractfactory;

public class ProfesseurPublic extends Professeur{
    private String titre;

    public ProfesseurPublic(String nom, String prenom, String diplome, String titre) {
        super(nom, prenom, diplome);
        this.titre = titre;
    }

    public ProfesseurPublic() {

    }

    @Override
    void create() {
        System.out.println("Création d'un professeur public : " + getNom() + " " + getPrenom() + ", Diplôme : " + getDiplome() + ", Titre : " + titre);
    }
}
