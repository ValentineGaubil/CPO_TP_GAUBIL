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
        
    //bouteillebiere uneBiere = new bouteillebiere(); 
    //uneBiere.nom = "Cuvée des trolls"; 
    //uneBiere.degresalcool= 7.0; 
    //uneBiere.brasserie="debuisson";
    //uneBiere.ouverte= false;
    //uneBiere.lireEtiquette(); 
       
    
   //bouteillebiere secondeBiere = new bouteillebiere() ; 
    // secondeBiere.nom = "leffe"; 
    //secondeBiere.degresalcool= 6.6; 
    //secondeBiere.brasserie="abbaye de leffe";
    //secondeBiere.ouverte= false;
    //secondeBiere.lireEtiquette();
    
    bouteillebiere autreBiere = new  bouteillebiere("Leffe", 6.6 ,"Abbaye de Leffe") ; 
    autreBiere.lireEtiquette();
    
  
    
    }
    
}
