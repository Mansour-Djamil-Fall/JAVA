/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.DaoClasse;
import dao.DaoDetail;
import dao.DaoPersonne;
import java.util.List;
import models.Classe;
import models.Detail;
import models.Etudiant;
import models.Personne;
import models.Professeur;

/**
 *
 * @author Mansour Djamil
 */
public class Service {
    private DaoClasse daoClasse;
    private DaoPersonne daoPersonne;
    private DaoDetail daoDetail;
    
    
    public Service(){
        daoClasse=new DaoClasse();
        daoPersonne=new DaoPersonne();
        daoDetail=new DaoDetail();  
    }
    
    public List<Etudiant> listerEtudiantParClasse(Classe classe){
        return daoPersonne.findByClasse(classe);
    }
    
    
    public boolean creerClasse (Classe classe) {
        int nbreLigne= daoClasse.insert(classe);
        return nbreLigne != 0;

    }
    
    public List<Classe> ListerClasse(){
       return daoClasse.findAll();
    }
    /*
    public boolean creerEtudiant(Etudiant etu){
        return daoPersonne.insert(etu)!=0;
    }
    
    public boolean creerProfesseur(Professeur prof){
        return daoPersonne.insert(prof)!=0;
    }
    */
    public boolean creerPersonne(Personne pers){
        return daoPersonne.insert(pers)!=0;
    }
    
    public Professeur chercherProfesseur(String matricule){
        return daoPersonne.findProfesseurByMatricule(matricule);
        
    }
    public boolean attribuerClasse(Classe classe,Professeur prof,List<String>modules,String annee){
        if (prof.getId()==0){
            int id=daoPersonne.insert(prof);
            prof.setId(id);
        }
        Detail detail=new Detail(annee,modules,classe,prof);
        return daoDetail.insert(detail)!=0;
        
    }
    
    public List<Professeur> listerProfesseur(){
        return daoPersonne.findProfesseur();
    }
    
    public List<String> listerModulesProfesseurParClasse(Classe classe,Professeur professeur){
        Detail detail=new Detail(classe,professeur);
        return daoDetail.findModules(detail);
        
        
    }
    
    public Personne seConnecter(String login, String pwd){
        return daoPersonne.findUserConnect(login, pwd);
        
    } 
}
