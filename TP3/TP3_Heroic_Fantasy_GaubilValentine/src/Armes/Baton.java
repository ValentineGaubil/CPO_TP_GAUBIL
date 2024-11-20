/*GAUBIL Valentine
 * TDC
 * TP2
 * 13 novembre 2024
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author vtino
 */
  
public class Baton extends Arme {
    private int age;

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString() + ", Âge: " + age;
    }
}

Personnage : 
package Personnages;
import TP3_Heroic_Fantasy_GaubilValentine
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import java.util.ArrayList;
