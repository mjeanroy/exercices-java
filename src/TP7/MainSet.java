/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Massil
 */
public class MainSet {
    public static void main(String[] args){
        Person person1 , person2 , person3 , person4;
        
        person1 = new Person("Massil" , "KADI");
        person2 = new Person("Serine", "Houhou");
        person3 = new Person("Rafik" , "Tighiouaret");
        person4 = new Person("Massil" , "KADI");
        
        Set set = new HashSet<Person>();
        
        set.add(person1);
        set.add(person2);
        set.add(person3);
        
        System.out.println(set);
        
        Iterator<Person> it = set.iterator();
        int i = 0;
        while(it.hasNext())
        {
            System.out.println(i + ". " + it.next());
            i++;
        }
        //System.out.println("La");
        for(int j = 0 ; j < 3 ; j++)
        {
            set.add(person1);
        }
        
        it = set.iterator();
        i = 0;
        while(it.hasNext())
        {
            System.out.println(i + ". " + it.next());
            i++;
        }
        
        set.add(person4);
        System.out.println("ici" + set);
    }
}
