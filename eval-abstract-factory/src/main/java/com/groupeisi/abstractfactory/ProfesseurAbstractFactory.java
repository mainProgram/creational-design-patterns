package com.groupeisi.abstractfactory;

import static com.groupeisi.abstractfactory.ProfesseurEnum.PRIVE;
import static com.groupeisi.abstractfactory.ProfesseurEnum.PUBLIC;

public class ProfesseurAbstractFactory {

    Professeur professeur;

    public Professeur createProfesseur(ProfesseurEnum type, String nom, String prenom, String diplome, String titreOuEntreprise) {
        TypeProfesseurFactory factory = null;

        switch (type) {
            case PUBLIC:
                factory = new ProfesseurPublicFactory();
                break;
            case PRIVE:
                factory = new ProfesseurPriveFactory();
                break;
        }

        return factory.createProfesseur(nom, prenom, diplome, titreOuEntreprise);
    }
}
