package com.groupeisi.factory;

public class ProfesseurPriveFactory extends ProfesseurFactory {

    @Override
    protected Professeur createProfesseur(ProfesseurEnum type, String nom, String prenom, String diplome) {
        // Remplacez "EntrepriseX" par la valeur appropriée
        return new ProfesseurPrive(nom, prenom, diplome, "Entreprise");
    }
}
