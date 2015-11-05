/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LectureEcritureFichier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Massil
 */
public class File {
    public static void main(String[] args)
    {
        FileWriter fw = null;
        FileReader fs = null;
        try{
            try{
                fw = new FileWriter("D:/Fichier.txt");
                fs = new FileReader("D:/");
                BufferedReader br = new BufferedReader(fs);
                String line;
                while((line = br.readLine()) != null)
                {
                    System.out.println(line);
                }
                fw.write("Coucou");
            } 
            finally{
                fw.close();
                fs.close();
            }
        }
        catch(IOException e)
        {
            
        }
        
        
        //Copie
    }
}
