/*GAUBIL Valentine
 * TDC
 * TP2
 * 13 novembre 2024
 */
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author vtino
 */

public class Magicien extends Personnage {
    private boolean confirme;

    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    public boolean isConfirme() {
        return confirme;
    }
}

