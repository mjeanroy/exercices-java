/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stream;

import java.lang.reflect.Array;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Massil
 */
public class Cours {
    //Exemple 1 sur les stream
    
    public static void main(String[] args)
    {
//        List myList = new Array.toList("ab" , "cde" , "fghi");
//        Stream sequentialStream = myList.stream();//Stream séquentiel
//        Stream parallelStream = myList.parallelStream(); //Stream parallélisé

        //Method map

        /**
         * forEach effecctue une action sur chaque élément du stream
         * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
         * !!!!!!!!!!!!!ATTENTION!!! NE JAMAIS MODIFIER LES ELEMENTS VIA UN FOREACH!!!!!!!!!!!!!
         * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
         */
        Stream.of("ab" , "bc").forEach(System.out::println);
        //Stream.of(2,8,4).mapToInt().max();
        /**
         * Cette methode ne marche pas
         */
        
        Stream number = Stream.of(2,4);
        //int nombre = number.mapToInt().max();
        
        
        /**
         * Aggregation des resultats
         */
        String concatenation = Stream.of("Chaine" , "de" , "texte").reduce("", (acc,item)->acc+" " + item);
        System.out.println(concatenation);
        
        int a = Stream.of(1,2,3).reduce(new Integer(0) , (acc,item)->acc + item);
        
        /**
         * collect accumule les éléments filtrés et mappés au cours dustream
         */
        
        List strings = Stream.of("Chaine" , "de" , "texte").filter(s->s.length()>2).collect(Collectors.toList());
        System.out.println(strings);
        
        //peek permet d'appliquer une opération sur les éléments du stream mais ne peut pas modifier l'élément
        //filter permet d'appliquer un filtre
        //map permet d'appliquer une fonction de modification sur les éléments
        Stream myStream = Stream.of("Ab" , "CD" , "EfG").map(s->s.toLowerCase()).peek(e -> System.out.println(e));
        //System.out.println(myStream);
    }
    
}
