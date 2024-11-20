/*GAUBIL Valentine
 * TDC
 * TP2
 * 13 novembre 2024
 */
package Armes;

/**
 *
 * @author vtino
 */


public abstract class Arme {
    protected String nom;
    protected int niveauAttaque;

    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom + " (Attaque: " + niveauAttaque + ")";
    }
}
