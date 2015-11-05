/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Massil
 */
public class MainStream {
    public static void main(String[] args){
        
        Person person1 , person2 , person3 , person4;
        
        person1 = new Person("Massil" , "KADI");
        person2 = new Person("Serine", "Houhou");
        person3 = new Person("Rafik" , "Tighiouaret");
        person4 = new Person("Massil" , "KADI");
        
        List<Person> persons = Arrays.asList(person1 , person2 , person3 , person4);
        
        List listeTrie = persons.stream()
                .filter(e -> e.getFirstName().length()>=3)
                .sorted()
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println("Liste: " + listeTrie);
    }
}
