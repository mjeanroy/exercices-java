/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP7;

import java.util.Comparator;

/**
 *
 * @author Massil
 */
public class PersonComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Person && o2 instanceof Person)
        {
            Person p1 = (Person) o1;
            Person p2 = (Person) o2;
            
            String nom1 = p1.getName();
            String nom2 = p2.getName();
            
            return nom1.compareTo(nom2);
            
            /*if(nom1.compareTo(nom2) == 0)
                return prenom1.compareTo(prenom2);
                    */
        }
        else
            return -1;
    }
}
