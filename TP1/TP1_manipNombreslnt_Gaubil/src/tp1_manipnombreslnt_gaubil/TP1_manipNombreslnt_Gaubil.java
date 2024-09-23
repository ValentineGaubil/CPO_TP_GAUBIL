/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombreslnt_gaubil;

import java.util.Scanner;

/**
 *
 * @author vtino
 */
public class TP1_manipNombreslnt_Gaubil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nombre1;
        int nombre2; 
        
         nombre1=0;
         nombre2=0;
         
         System.out.println("Veuillez entrer un 1er nombre:");
         nombre1 = sc.nextInt();
         System.out.println("Veuillez entrer un 2eme nombre:");
         nombre2 = sc.nextInt();
         
         System.out.println("voici la somme des deux nombres:" + (nombre1+nombre2));
         System.out.println("voici la difference des deux nombres:" + (nombre1-nombre2));
         System.out.println("voici le produit des deux nombres:" + (nombre1*nombre2));
         System.out.println("voici le quotient des deux nombres:" + (nombre1/nombre2));
         System.out.println("voici le reste de la division euclidienne des deux nombres:" + (nombre1%nombre2));
         
         
                 
                 
                 
                 
                 
        
       
    }
    
}
