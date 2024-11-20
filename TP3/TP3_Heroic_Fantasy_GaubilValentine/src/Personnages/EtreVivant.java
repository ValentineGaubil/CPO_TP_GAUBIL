/*GAUBIL Valentine
 * TDC
 * TP2
 * 13 novembre 2024
 */
package Personnages;

/**
 *
 * @author vtino
 */

public class Guerrier extends Personnage {
    private boolean aCheval;

    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
    }

    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    public boolean isACheval() {
        return aCheval;
    }
}

Interfece etrevivant :
package tp3_heroic_fantasy_brillet;


public interface EtreVivant {
    void seFatiguer();
    boolean estVivant();
    void estAttaque(int points);
}
