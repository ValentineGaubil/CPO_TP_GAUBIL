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
public class TP2_biere_GaubilValentine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //BouteilleBiere uneBiere = new BouteilleBiere() ;
        //uneBiere.nom = "Cuvee des trolls";
        //uneBiere.degreAlcool = 7.0 ;
        //uneBiere.brasserie = "Dubuisson";
        //uneBiere.ouverte = false;
        //uneBiere.lireEtiquette();
       
        //BouteilleBiere secondeBiere = new BouteilleBiere() ;
        //secondeBiere.nom = "Leffe";
        //secondeBiere.degreAlcool = 6.6 ;
        //secondeBiere.brasserie = "Abbaye de Leffe";
        //secondeBiere.ouverte = false;
        //secondeBiere.lireEtiquette();
       
        bouteillebiere uneBiere = new bouteillebiere("Cuvee des trolls",7.0 ,"Dubuisson") ;
        uneBiere.lireEtiquette();
        bouteillebiere autreBiere = new bouteillebiere("Leffe", 6.6,"Abbaye de Leffe") ;
        autreBiere.lireEtiquette();
        bouteillebiere troisiemeBiere = new bouteillebiere("Heineken" ,5 ,"Gerard Heineken") ;
        troisiemeBiere.lireEtiquette();
        bouteillebiere quatriemeBiere = new bouteillebiere("Desperados" ,5.9 ,"Alken-Maes") ;
        quatriemeBiere.lireEtiquette();
        bouteillebiere derniereBiere = new bouteillebiere("Corona" ,4.5 ,"Grupo Modelo") ;
        derniereBiere.lireEtiquette();
       
        uneBiere.decapsuler();
        autreBiere.decapsuler();
        quatriemeBiere.decapsuler();
       
        System.out.println(uneBiere);
        System.out.println(autreBiere);
        System.out.println(troisiemeBiere);
        System.out.println(quatriemeBiere);
        System.out.println(derniereBiere);
    }
}