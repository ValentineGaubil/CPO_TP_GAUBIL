/*
*GAUBIL Valentine
*TDC
*TP1 exercice 3
* 27 septembre 2024 
*/
package tp1_stats_gaubilvalentine;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vtino
 */
public class TP1_stats_GaubilValentine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
       
        for (int i = 1; i<=5; i++){
            int n = generateurAleat.nextInt(100);
            System.out.print(n + " ");
        }
       
        System.out.println(" ");
        int nb;
        int nombre;
        int compteur;
        int niveau;
       
        System.out.println("1) Facile");
        System.out.println("2) Normal");
        System.out.println("3) Difficile");
        System.out.println("Veuillez saisir le numero du niveau de difficulte que vous avez choisi :");
        niveau = sc.nextInt();
       
        if (niveau == 1){
            nb = generateurAleat.nextInt(70);
            compteur = 1;
            System.out.println("Veuillez saisir un nombre entre 0 et 70 :");
            nombre = sc.nextInt();
            while (nombre != nb) {
                if (nb>(nombre+15)){
                    System.out.println("Beaucoup trop petit");
                    System.out.println("Veuillez saisir un nombre plus grand :");
                    nombre = sc.nextInt();
                    compteur += 1;
                }
               
                else if (nb>nombre){
                    System.out.println("Trop petit");
                    System.out.println("Veuillez saisir un nombre plus grand :");
                    nombre = sc.nextInt();
                    compteur += 1;
                }
               
                else if (nb<(nombre-15)){
                    System.out.println("Beaucoup trop grand");
                    System.out.println("Veuillez saisir un nombre plus petit :");
                    nombre = sc.nextInt();
                    compteur += 1;
                }
                   
                else {
                    System.out.println("Trop grand");
                    System.out.println("Veuillez saisir un nombre plus petit :");
                    nombre = sc.nextInt();
                    compteur += 1;
                }
            }
            System.out.println("Vous avez gagne");
            System.out.println("Vous avez effectue " + compteur + " coups");
        }
       
       
        else if (niveau == 2){
            nb = generateurAleat.nextInt(100);
            compteur = 1;
            System.out.println("Veuillez saisir un nombre entre 0 et 100 :");
            nombre = sc.nextInt();
            while (nombre != nb) {
                if (nb>nombre){
                    System.out.println("Trop petit");
                    System.out.println("Veuillez saisir un nombre plus grand :");
                    nombre = sc.nextInt();
                    compteur += 1;
                }
           
                else {
                    System.out.println("Trop grand");
                    System.out.println("Veuillez saisir un nombre plus petit :");
                    nombre = sc.nextInt();
                    compteur += 1;
                }
            }
            System.out.println("Vous avez gagne");
            System.out.println("Vous avez effectue " + compteur + " coups");
        }
       
       
        else if (niveau == 3){
            nb = generateurAleat.nextInt(200);
            compteur = 1;
            System.out.println("Veuillez saisir un nombre entre 0 et 200 :");
            System.out.println("Vous avez 7 coups");
            nombre = sc.nextInt();
            while (nombre != nb && compteur<7) {
                if (nb>nombre){
                    System.out.println("Trop petit");
                    System.out.println("Veuillez saisir un nombre plus grand :");
                    nombre = sc.nextInt();
                    compteur += 1;
                }
           
                else {
                    System.out.println("Trop grand");
                    System.out.println("Veuillez saisir un nombre plus petit :");
                    nombre = sc.nextInt();
                    compteur += 1;
                }
            }
           
            if (nb == nombre) {
                System.out.println("Vous avez gagne");
                System.out.println("Vous avez effectue " + compteur + " coups");
            }
           
            else if (nb != nombre) {
            System.out.println("Vous avez perdu");
            System.out.println("Vous avez effectue " + compteur + " coups");
            }
        }
       
       
        else {
            System.out.println("La saisie est incorrecte, veuillez recommencer.");
        }
    }
}


