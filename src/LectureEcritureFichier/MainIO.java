/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureEcritureFichier;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Massil
 */
public class MainIO {
    public static void main(String[] args)
    {
        Person p = new Person("KADI", "Massil");
        EcritureFichier e = null;
        LectureFichier l = null;
        try {
            try{
                e = new EcritureFichier("person.txt");
                e.ajouterPersonne(p);
            }
            finally
            {
                e.fermerFichier();
            }
        } 
        catch (IOException ex) {
            Logger.getLogger(MainIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try
        {
            try{
                l = new LectureFichier("person.txt");
                System.out.println(l.getPerson());
            }
            catch (ClassNotFoundException ex) {
                Logger.getLogger(MainIO.class.getName()).log(Level.SEVERE, null, ex);
            }            
            finally
            {
                l.fermerFichier();
            }
        }
        catch (IOException ex) {
            Logger.getLogger(MainIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
