/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureEcritureFichier;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Massil
 */
public class LectureFichier {
    FileInputStream fi;
    ObjectInputStream oi ;
    
    public LectureFichier(String nomFichier) throws FileNotFoundException, IOException
    {
        fi = new FileInputStream(nomFichier);
        oi = new ObjectInputStream(fi);
    }
    
    public Person getPerson() throws IOException, ClassNotFoundException
    {
        return (Person) oi.readObject();
    }
    
    public void fermerFichier() throws IOException
    {
        oi.close();
        fi.close();
    }
}
