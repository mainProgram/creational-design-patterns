package com.groupeisi.abstractfactory;

public interface TypeProfesseurFactory {

    Professeur createProfesseur(String nom, String prenom, String diplome, String titreOuEntreprise);

}
