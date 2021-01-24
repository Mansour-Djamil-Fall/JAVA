/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mansour Djamil
 */
public class Convert {
    public static String listToString(List<String> modules){
        String stringModules="";
        for(String elt:modules){
           stringModules+=elt+";"; 
        }
        return stringModules;
        
    }
    
    public static List<String> StringTolist(String modules){
        List<String> lModules=new ArrayList<>();
        String tab[]=modules.split(";");
        for(String elt :tab){
            lModules.add(elt);
        }
         return lModules;
    }
    
}
