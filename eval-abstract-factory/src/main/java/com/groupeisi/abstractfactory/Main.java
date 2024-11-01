package com.groupeisi.abstractfactory;

public class Main {

    public static void main(String[] args) {

        ProfesseurAbstractFactory factory = new ProfesseurAbstractFactory();

        Professeur professeurPrive = factory.createProfesseur(ProfesseurEnum.PRIVE, "Ly", "Aly", "Master", "ATOS");
        professeurPrive.create();

        Professeur professeurPublic = factory.createProfesseur(ProfesseurEnum.PUBLIC, "Seck", "Ngor", "Master", "Professeur");
        professeurPublic.create();

    }
}
