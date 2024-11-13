/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_gaubilvalentine;

/**
 *
 * @author vtino
 */
public class Baton extends Arme { 
    private int Age;
    
    
 public Baton(int Age,String Nom,int NivAtt) {  
     
     super(Nom,NivAtt);
     this.Age = Age;
     this.NivAtt= Math.min(Age, 100);
 }
 
 public int getAge(){
     return Age;
 }
         
}
