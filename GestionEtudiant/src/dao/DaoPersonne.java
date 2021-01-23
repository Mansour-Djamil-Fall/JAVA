/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Classe;
import models.Personne;
import models.Professeur;

/**
 *
 * @author Mansour Djamil
 */
public class DaoPersonne implements IDao <Personne>{
    private final String SQL_SELECT_BY_CLASSE="select * from personne where type='Etudiant'and classe_id=?";
    
    private final String SQL_INSERT="INSERT INTO `personne` (`nomComplet`, `type`, `tuteur`, `module`, `grade`, `classe_id`) VALUES (?,?,?,?,?,?);";
    private final String SQL_SELECT_Professeur="select * from personne where matricule=?";
    private final String SQL_SELECT_ALL_Professeur="select * from personne where type='Professeur'";
    private final String SQL_SELECT_CONNECT="select * from personne where login=? and pwd=?";
    
    public List<Personne>findByClasse(Classe classe){
        List<Personne>lEtudiants=new ArrayList<>();
        //recuperation
        return lEtudiants;            
    }
    
    @Override
    public int insert(Personne pers){
        int nbreLigne=0;
                //Traitement
        return nbreLigne;
                
    }
    
    public Professeur findProfesseurByMatricule (String matricule){
        Professeur professeur=null;
        //Recherche
        return professeur;
        
      }
    
    public List<Professeur> findProfesseur(){
        List<Professeur> lProfesseurs=new ArrayList();
        return lProfesseurs;
    }
    
    public Personne findUserConnect(String login,String pwd){
        Personne pers=null;
        return pers;
        
    }
    
 
    /*INSERT INTO `personne` (`id`, `nomComplet`, `type`, `tuteur`, `module`, `grade`, `classe_id`, `matricule`) VALUES (NULL, 'Birane Baila Wane', 'Professeur', NULL, 'Webmastering;Java;C#;UML', 'Ingenieur', NULL, 'MAT20212');*/
}
