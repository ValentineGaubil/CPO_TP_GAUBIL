/*
/*
 * GAUBIL Valentine
 * TDC
 * TP2
 * 16 octobre 2024
 */
package tp2_biere_gaubilvalentine;

/**
 *
 * @author vtino
 */
public class bouteillebiere {
    String nom ;
    String brasserie;
    double degreAlcool;
    boolean ouverte ;
   
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) ");
        System.out.println("Brasserie : " + brasserie ) ;
    }
   
    public bouteillebiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }
   
    public void decapsuler() {
        if (ouverte == false) {
            ouverte = true;
        }
        else if (ouverte == true) {
            System.out.println("erreur : biere deja ouverte");
            ouverte = false;
        }
        System.out.println(ouverte);
    }
   
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degres) Ouverte ? ";
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner;
    }
}
