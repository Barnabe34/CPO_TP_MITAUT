/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_mitaut;

/**
 *
 * @author Barnabé
 */

public class Epee extends Arme {
    int Finesse;

    public Epee(String nom, int niveauAttaque, int Finesse) {
        super(nom, niveauAttaque);
        this.Finesse = Finesse;
    }

    public int getIndiceFinesse() {
        return Finesse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Finesse : " + Finesse;
    }
}
