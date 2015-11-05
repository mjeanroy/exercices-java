/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP7;

import java.util.Objects;

/**
 *
 * @author Massil
 */
public class Person implements Comparable{
    private String firstName;
    private String name;
    
    public Person(String personName , String personFirstName){
        firstName = personFirstName;
        name = personName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        String rs = "";
        rs = "[Nom: " + name + ", Prenom: "+ firstName+"]";
        return rs;
    }
    
    @Override
    public boolean equals(Object p)
    {
        if(p instanceof Person)
        {
            Person person = (Person) p;
            if(name.equals(person.getName()) && firstName.equals(person.getFirstName()))
                return true;
            else return false;
        }
        else
            return false;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.firstName);
        hash = 67 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        
        if(name.compareTo(p.getName()) == 0)
            return firstName.compareTo(p.getFirstName());
        else
            return name.compareTo(p.getName());
            
    }
    
}
