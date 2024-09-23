
import java.util.Scanner;

/* 
*GAUBIL Valentine
*TDC
*TP1_convertisseur
* 23 septembre 2024 
package tp1_convertisseur_gaubilvalentine;

/**
 *
 * @author vtino
 */
public class TP1_convertisseur_GaubilValentine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        double nombre1;
        
        nombre1=0;
         
        System.out.println("Veuillez entrer un nombre:");
        nombre1 = sc.nextDouble();
        
        System.out.println("Vous avez saisi :"+ nombre1);
        System.out.println("Voici la temperature en degre kelvin : "+ (nombre1+273.15) + " K");
    }
    
    public static double CelciusVersKelvin (double tCelcius) { 
        double tKelvin;
        tKelvin=tCelcius + 273.15;
        return tKelvin;
    } 
    
    
    public static double KelvinVersCelcius (double tKelvin) { 
        double tCelcius;
        tCelcius= tKelvin - 273.15;
        return tCelcius;
    }
        
    public static double FarenheitVersCelcius (double tFarenheit ) { 
        double tCelcius;
        tCelcius= (tFarenheit - 32)/1.8;
        return tCelcius;
    }   
        
        
}

