/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fichiers;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;


/**
 *
 * @author Massil
 */
public class InfosFichiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InfosFichiers info = new InfosFichiers("D:\\Y-NOV\\JAVA\\Exercice\\src\\LectureEcritureFichier");
        for(File f : info.printFiles("P"))
        {
            System.out.println(f.getName());
        }
        System.out.println(info.totalSizeOfFiles());
        System.out.println("Recent: " +info.recentFile());
    }
    
    private File fi;
    
    public InfosFichiers(String str)
    {
        fi = new File(str);
    }
    
    public File[] printFiles(String debut)
    {        
        return fi.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith(debut);
            }
        });
    }
    
    public long totalSizeOfFiles()
    {
        long taille = 0;
        for (File f : fi.listFiles())
        {
            taille+= f.length();
        }
        return taille;
    }
    
    public File recentFile() throws IOException
    {
        if(printFiles("").length == 0)
            return null;
        else 
        {
            long lastModified = 0;
            File last = null;
            for(File f : fi.listFiles())
            {
                System.out.println(f.getCanonicalPath()+ " " +f.lastModified());
                if(f.lastModified() > lastModified)
                {
                    lastModified = f.lastModified();
                    last = f;
                }
            }
            return last;
        }
    }
    
    
    
}
