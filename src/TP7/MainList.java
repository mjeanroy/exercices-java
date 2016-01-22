/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Massil
 */
public class MainList {
    public static void main(String[] args)
    {
        Person person1 , person2 , person3;
        
        person1 = new Person("Massil" , "KADI");
        person2 = new Person("Serine", "Houhou");
        person3 = new Person("Rafik" , "Tighiouaret");
        
        List listeDePersonne = new ArrayList<String>();
        
        listeDePersonne.add(person1);
        listeDePersonne.add(person2);
        listeDePersonne.add(person3);
        
        System.out.println(listeDePersonne);
        
        Iterator<Person> it = listeDePersonne.iterator();
        int i = 0;
        while(it.hasNext())
        {
            System.out.println(i + ". " + it.next());
            i++;
        }
        
        for(int j = 0 ; j < 3 ; j++)
            listeDePersonne.add(person1);
        
        it = listeDePersonne.iterator();
        i = 0;
        while(it.hasNext())
        {
            System.out.println(i + ". " + it.next());
            i++;
        }
        
        
    }
}
