/*
 * GAUBIL Valentine
 * TDC
 * TP2
 * 13 novembre 2024
 */
package tp3_heroic_fantasy_gaubilvalentine;

import Personnages.Guerrier;
import Armes.Epee;
import Armes.Baton;
import java.util.ArrayList;
import Arme.*;
import personnage.*;
public class TP3_Heroic_Fantasy_GaubilValentine {

  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création des armes
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        // Création des personnages
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Guerrier conan = new Guerrier("Conan", 78, false);

         // Gestion des armes
        gandalf.ajouterArme(chene);
        gandalf.ajouterArme(durandal);
        conan.ajouterArme(excalibur);
        conan.ajouterArme(charme);

        // Sélection d'armes
        gandalf.choisirArme("Chêne");
        conan.choisirArme("Excalibur");

        // Combat
        conan.attaquer(gandalf);
        System.out.println(gandalf);
        System.out.println(conan);

        // Vérifier si les personnages sont vivants après le combat
        System.out.println("Gandalf est vivant? " + gandalf.estVivant());
        System.out.println("Conan est vivant? " + conan.estVivant());
    }
}

