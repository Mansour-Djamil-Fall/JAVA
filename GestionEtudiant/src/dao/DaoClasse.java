/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Classe;

/**
 *
 * @author Mansour Djamil
 */
public class DaoClasse implements IDao <Classe> {
    private final String SQL_INSERT="INSERT INTO `classe` (`libelle`, `nbre`) VALUES (?,?);";
    private final String SQL_SELECT_ALL="select * from classe";
            
    @Override
    public int insert(Classe classe){
        int nbreLigne=0;
        Connection con=null;
        try {
            // 1-Chargement du driver
            Class.forName("com.mysql.jdbc.Driver");
            //ouverture Connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_etudiant","root","");
            System.out.println("Base de données connectée");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erreur de chargement du Driver");
        } catch (SQLException ex) {
            System.out.println("Erreur d'ouverture de la base de données");
        }
        
        return nbreLigne;
    }
    
    public List<Classe> findAll (){
        List<Classe>LClasses=new ArrayList<>();
        
        return LClasses;
    }
}
