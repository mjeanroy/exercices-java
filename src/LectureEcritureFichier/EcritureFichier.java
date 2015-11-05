/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureEcritureFichier;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Massil
 */
public class EcritureFichier {
    FileOutputStream fos;
    ObjectOutputStream os ;
    public EcritureFichier(String nomFichier) throws FileNotFoundException, IOException
    {
        
        fos = new FileOutputStream(nomFichier);
        os =  new ObjectOutputStream(fos);
    }
    
    public void ajouterPersonne(Person p) throws IOException
    {
        os.writeObject(p);
    }
    
    public void fermerFichier() throws IOException
    {
        os.close();
        fos.close();
    }
}
