/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.DaoClasse;
import dao.DaoPersonne;
import java.util.List;
import models.Classe;
import models.Etudiant;
import models.Personne;

/**
 *
 * @author Mansour Djamil
 */
public class Service {
    private DaoClasse daoClasse;
    private DaoPersonne daoPersonne;
    
    public Service(){
        daoClasse=new DaoClasse();
        daoPersonne=new DaoPersonne();
        
    }
    
    public List<Personne> listerEtudiantParClasse(Classe classe){
        return daoPersonne.findByClasse(classe);
    }
    
    
    public boolean creerClasse (Classe classe) {
        int nbreLigne= daoClasse.insert(classe);
        return nbreLigne != 0;

    }
    
    public List<Classe> ListerClasse(){
       return daoClasse.findAll();
    }
    
    public boolean creerEtudiant(Etudiant etu){
        return daoPersonne.insert(etu)!=0;
    }
    
    
}
