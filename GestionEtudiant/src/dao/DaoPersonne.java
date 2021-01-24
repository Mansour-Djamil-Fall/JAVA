/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Classe;
import models.Convert;
import models.Etudiant;
import models.Personne;
import models.Professeur;

/**
 *
 * @author Mansour Djamil
 */
public class DaoPersonne implements IDao <Personne>{
    private final String SQL_SELECT_BY_CLASSE="select p.id,nomComplet,tuteur,classe_id,"
            + " libelle,nbre from personne p,classe cl"
            + " where classe_id=?"
            + "  and cl.id=p.classe_id";
    
    private final String SQL_INSERT="INSERT INTO `personne` (`nomComplet`, `type`, `tuteur`, `module`, `grade`, `classe_id`) VALUES (?,?,?,?,?,?);";
    private final String SQL_SELECT_PROFESSEUR="select * from personne where matricule=?";
    private final String SQL_SELECT_ALL_PROFESSEUR="select * from personne where type='Professeur'";
    private final String SQL_SELECT_CONNECT="select * from personne where login=? and pwd=?";
    private DaoMysql mysql;
    
    public DaoPersonne(){
        mysql=new DaoMysql();
        
    }
    
    public List<Etudiant>findByClasse(Classe classe){
        List<Etudiant>lEtudiants=new ArrayList<>();
        //recuperation
        
        try {
            mysql.ouvrirConnexionBD();
            mysql.preparerRequete(SQL_SELECT_BY_CLASSE);
            mysql.getPs().setInt(1, classe.getId());
            ResultSet rs=mysql.executeSelect();
            while(rs.next()){
                Etudiant etu=new Etudiant();
                etu.setNomComplet(rs.getString("nomComplet"));
                etu.setId(rs.getInt("id"));
                etu.setTuteur(rs.getString("tuteur"));
                Classe cl=new Classe();
                cl.setId(rs.getInt("classe_id"));
                cl.setLibelle(rs.getString("libelle"));
                cl.setNbre(rs.getInt("nbre"));
                etu.setCl(cl);
                lEtudiants.add(etu);
                
                
            }
        } catch (SQLException ex) {
            System.out.println("Erreur d'execution");
        }finally{
            mysql.closeConnexion();
        }
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
        try {
         mysql.ouvrirConnexionBD();
         mysql.preparerRequete(SQL_SELECT_PROFESSEUR);
         mysql.getPs().setString(1, matricule);
         ResultSet rs=mysql.executeSelect();
         if(rs.next()){
             professeur=new Professeur();
             professeur.setId(rs.getInt("id"));
             professeur.setNomComplet(rs.getString("nomComplet"));
             professeur.setGrade(rs.getString("grade"));
             professeur.setMatricule(rs.getString("matricule"));
             professeur.setModules(Convert.StringTolist(rs.getString("module")));
             
         }
        } catch (SQLException ex) {
            Logger.getLogger(DaoPersonne.class.getName()).log(Level.SEVERE, null, ex);
        }
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
