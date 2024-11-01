package com.groupeisi.factory;

public class ProfesseurPublicFactory extends ProfesseurFactory {

    @Override
    protected Professeur createProfesseur(ProfesseurEnum type, String nom, String prenom, String diplome) {
        // Remplacez "TitreX" par la valeur appropriée
        return new ProfesseurPublic(nom, prenom, diplome, "TitreX");
    }
}
