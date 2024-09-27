/*
*GAUBIL Valentine
*TDC
*TP1 exercice 3
* 27 septembre 2024 
 */
package tp1_guessmynumber_gaubil;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vtino
 */
public class TP1_guessMyNumber_Gaubil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random(); 
        Scanner sc = new Scanner(System.in);
       
        for(int i=1; i<=5; i++){
            int n = generateurAleat.nextInt(100); 
            System.out.print(n + " ");
        }
       
        int nb = generateurAleat.nextInt(100); 
        System.out.println("saisissez une valeur entre 0 et 100:");
        int nombre= sc.nextInt();
       
        while (nombre != nb) {
            if (nb>nombre){ 
                System.out.println("trop petit");
                System.out.println("saisissez une valeur plus grande:");
                nombre= sc.nextInt();
                com
            }
            
            else if (nb<nombre){
                System.out.println("trop  grand");
                System.out.println("saisissez une valeur plus petite:");
                nombre= sc.nextInt();
            }
            
            else {
                System.out.println("gagne");  
            }
        }
    }   
}
