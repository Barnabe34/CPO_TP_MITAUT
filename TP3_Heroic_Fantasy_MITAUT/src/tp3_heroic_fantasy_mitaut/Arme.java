/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_mitaut;

/**
 *
 * @author Barnabé
 */

public class Arme {
     String nom;
     int niveauAttaque;

    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    public int cocoNiveauAttaque() {
        return niveauAttaque;
    }

    public String cocoNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Nom de l'arme : " + nom + ", Niveau d'attaque : " + niveauAttaque;
    }
}
