/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_mitaut_version_console;

/**
 *
 * @author Barnabé
 */
public class GrilleDeCellules {
    
 private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;
   
    
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes){
        nbLignes=p_nbLignes;
        nbColonnes=p_nbColonnes;
        matriceCellules =new CelluleLumineuse[nbLignes][nbColonnes];
         for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }}}

   
    public void eteindreToutesLesCellules(){
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }}
    }
   
 
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random rand = new Random();
        int choix = rand.nextInt(3);

        if (choix == 0) {
            int ligne = rand.nextInt(nbLignes);
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[ligne][j].activerCellule();
            }
        } else if (choix == 1) {
            int colonne = rand.nextInt(nbColonnes);
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][colonne].activerCellule();
            }
        } else {
                       for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
                matriceCellules[i][i].activerCellule();
            }
        }
    }

 
    public void melangerMatriceAleatoirement(int nbTours){
         eteindreToutesLesCellules();

        Random rand = new Random();

        for (int tour = 0; tour < nbTours; tour++) {
            int choix = rand.nextInt(3);

            if (choix == 0) {
                int ligne = rand.nextInt(nbLignes);
                for (int j = 0; j < nbColonnes; j++) {
                    matriceCellules[ligne][j].activerCellule();
                }
            } else if (choix == 1) {
                int colonne = rand.nextInt(nbColonnes);
                for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][colonne].activerCellule();
                }
            } else {
                for (int i = 0; i < nbLignes && i < nbColonnes; i++) {
                    matriceCellules[i][i].activerCellule();
                }
            }
        }
   
    }
   
  
    public void activerLigneDeCellules(int idLigne){
        if (idLigne >= 0 && idLigne < nbLignes) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[idLigne][j].activerCellule();
            }}
    }
   
   
    public void activerColonneDeCellules(int idColonne){
        if (idColonne >= 0 && idColonne < nbColonnes) {
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][idColonne].activerCellule();
            }
    }}
   
   
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].estEteint()) {
                    return false;
                }
            }
        }
        return true;
    }
   
   
    @Override
    public String toString() {
    StringBuilder grilleString = new StringBuilder();  
    grilleString.append("  ");
    for (int j = 0; j < nbColonnes; j++) {
        grilleString.append(" " + j);
    }
    grilleString.append("\n");
    for (int i = 0; i < nbLignes; i++) {
       grilleString.append(i + " ");
        for (int j = 0; j < nbColonnes; j++) {
            grilleString.append(matriceCellules[i][j].getEtat() ? " X" : " O");
        }
        grilleString.append("\n");
    }  
    return grilleString.toString();
}
   
    
    public void activerDiagonaleMontante(){
        int minDim=Math.min(nbLignes, nbColonnes);
        for (int i=0; i<minDim; i++){
            matriceCellules [i][nbColonnes-1-i].activerCellule();
        }
    }
   
    
    public void activerDiagonaleDescendante(){
        int minDim=Math.min(nbLignes, nbColonnes);
        for (int i=0; i<minDim; i++){
            matriceCellules [i][i].activerCellule();
        }
    }
}