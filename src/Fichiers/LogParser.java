/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fichiers;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Massil
 */
public class LogParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        // TODO code application logic here
        LogParser log = new LogParser("D:\\Y-NOV\\JAVA\\Exercice\\src\\Fichiers\\logs.txt");
        log.ReadingLog();
    }
    private File file;
    private FileInputStream fis;
    public LogParser(String name)
    {
        file = new File(name);
    }
    
    public void ReadingLog() throws FileNotFoundException, IOException, ClassNotFoundException
    {

        FileReader fr = new FileReader(file);
        //bfs.;
        BufferedReader bfr = new BufferedReader(fr);
        String ligne = "";
        while((ligne = bfr.readLine())!= null)
            System.out.println(ligne);
        bfr.close();
        //bfs.close();
    }
    
    public void ParseAndCreateCvs(String filePath , String cvsPath) throws FileNotFoundException, IOException
    {
        FileWriter fw = new FileWriter(new File(cvsPath));
        FileReader fr = new FileReader(new File(filePath));
        //bfs.;
        BufferedReader bfr = new BufferedReader(fr);
        BufferedWriter bfw = new BufferedWriter(fw);
        String ligne = "";
        while((ligne = bfr.readLine())!= null)
            System.out.println(ligne);
        bfr.close();
    }
}
