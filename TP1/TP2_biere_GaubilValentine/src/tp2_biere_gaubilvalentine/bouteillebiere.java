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
    String nom;
    String brasserie;
    double degresalcool;
    boolean ouverte;   
    
    
    public void lireEtiquette() { 
        System.out.println("Bouteille de " + nom +" (" + degresalcool +" degres) \nBrasserie : " + brasserie ) ; 
    } 
    
    
   public bouteillebiere(String unNom, double unDegre, String uneBrasserie) {
    nom = unNom; 
    degresalcool = unDegre; 
    brasserie = uneBrasserie; 
    ouverte = false; 
}

 

    
} {
    nom = unNom; 
    degreAlcool = unDegre; 
    brasserie = uneBrasserie; 
    ouverte = false; 
}

 

    
}
