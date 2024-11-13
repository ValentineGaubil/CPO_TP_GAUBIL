/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_gaubilvalentine;

/**
 *
 * @author vtino
 */
public class Arme {
    private Srting Nom;
    private int NivAtt;

public Arme(String Nom,int NivAtt){   
    this.Nom= Nom;
    this.NivAtt= Math.min(NivAtt, 100);
             
}

public String getNom(){
    return Nom;
}
 public int getNivAtt(){
     return Nom;
 }
    
    @Override 
public String toString(){
    return " le nom de l arme est :  " + Nom + "et le niveau d attaque est : " + NivAtt;
}
}