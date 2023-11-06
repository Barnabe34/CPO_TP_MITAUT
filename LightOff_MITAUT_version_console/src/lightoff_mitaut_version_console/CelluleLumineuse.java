/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_mitaut_version_console;

/**
 *
 * @author Barnabé
 */
public class CelluleLumineuse {
    
 private boolean etat;
   
   
    public CelluleLumineuse() {
        etat = false;
    }
   
    
    public void activerCellule(){
      if (etat==true){
          etat=false;
      }
      else {
          etat=true;
      }
  }

    
    public void eteindreCellule(){
              etat = false;
      }
 

  
    public boolean estEteint(){
      return etat == false;
      }
 

   
    public boolean getEtat(){
        return etat;
    }
     
 
   @Override
    public String toString() {
       return etat ? "X" : "O";
    }
 
}

