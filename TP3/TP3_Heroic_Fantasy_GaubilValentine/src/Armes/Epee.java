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
public class Epee extends Arme {
    private int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        this.finesse = finesse;
    }

    public int getFinesse() {
        return finesse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Finesse: " + finesse;
    }
}
