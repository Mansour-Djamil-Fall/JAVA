/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours.Liste;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mansour Djamil
 */
public class Exercice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1-creer une liste de string
        2-ajouter des elements
        3-affichage de la liste 
        supprimer des elements
        modifier un element de la liste
        rechercher un element de la liste
        */
        
        //1-creer une liste de string
        List<String> lString=new ArrayList();
        
       // 2-ajouter des elements
       lString.add("Bonjour");
       lString.add("Au Revoir");
       lString.add("Les etudiants de la Liage3");
       
       //3-affichage de la liste 
        //Method1
        
        for(String elt: lString)
        {
            System.out.println(elt);
                    
        }
        
        lString.add(0, "Debut");
        lString.forEach((elt)-> {
        
                System.out.println(elt);
                
            });
        
        //4-supprimer des elements
        lString.remove("Debut");
        lString.remove(2);
        System.out.println("Affichage apres Supression");
        lString.forEach((elt)->{
        System.out.println(elt);
    });
        
         //5-Modifier des elements
        lString.set(0,"Bonsoir");
        System.out.println("Affichage apres Modification");
        lString.forEach((elt)->{
        System.out.println(elt);
    });
        
        //5-Rechercher un element de la liste
        if(lString.contains("Bonjour")==true){
            System.out.println("Element existe");
        }
            else{
                    System.out.println("Element n'existe pas");
                    }
        
        
        
    }
    
}
