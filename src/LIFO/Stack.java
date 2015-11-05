/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIFO;

import java.util.ArrayList;

/**
 *
 * @author Massil
 */
public class Stack<T>{
    private ArrayList<T> liste;

    public Stack() {
        this.liste = new ArrayList<T>();
    }
    
    public void push(T entry) //: permet d'ajouter une entrée dans la Stack.
    {
        liste.add(entry);
    }
            
    public T pop() // : permet de supprimer le dernier élément ajouté dans la Stack et le renvoie.
    {
        return liste.remove(liste.size()-1);
    } 
    public T peek()// : permet de récupérer le dernier élément ajouté dans la Stack sans le supprimer.
    {
        return liste.get(liste.size()-1);
    }
    
    public int size() // : permet de récupérer la taille de la Stack.
    {
        return liste.size();
    }
    
    public boolean isEmpty() // : permet de vérifier si la Stack est vide.
    {
        return liste.isEmpty();
    }
    
    
}
