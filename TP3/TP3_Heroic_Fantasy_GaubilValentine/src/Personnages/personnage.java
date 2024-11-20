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

public abstract class Personnage implements EtreVivant {
    protected String nom;
    protected int niveauVie;
    protected ArrayList<Arme> inventaireArmes = new ArrayList<>();
    protected Arme armeEnMain;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public void ajouterArme(Arme arme) {
        if (inventaireArmes.size() < 5) {
            inventaireArmes.add(arme);
            System.out.println(arme.getNom() + " ajouté à l'inventaire de " + nom);
        }
    }

    public void choisirArme(String nomArme) {
        for (Arme arme : inventaireArmes) {
            if (arme.getNom().equals(nomArme)) {
                armeEnMain = arme;
                System.out.println(nom + " a choisi l'arme: " + armeEnMain);
                return;
            }
        }
        System.out.println(nomArme + " n'est pas dans l'inventaire de " + nom);
    }

    public void attaquer(Personnage cible) {
        int degats = (armeEnMain != null) ? armeEnMain.getNiveauAttaque() : 0;

        if (this instanceof Magicien && armeEnMain instanceof Baton) {
            degats *= ((Baton) armeEnMain).getAge();
        } else if (this instanceof Guerrier && armeEnMain instanceof Epee) {
            degats *= ((Epee) armeEnMain).getFinesse();
        }

        cible.estAttaque(degats);
        this.seFatiguer();
        System.out.println(nom + " attaque " + cible.nom + " et inflige " + degats + " dégâts.");
    }

    @Override
    public void seFatiguer() {
        this.niveauVie -= 10;
    }

    @Override
    public boolean estVivant() {
        return this.niveauVie > 0;
    }

    @Override
    public void estAttaque(int points) {
        this.niveauVie -= points;
    }

    @Override
    public String toString() {
        return nom + " (Vie: " + niveauVie + ")" + 
               (armeEnMain != null ? ", Arme en main: " + armeEnMain : "");
    }
}
