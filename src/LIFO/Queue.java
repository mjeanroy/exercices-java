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
public class Queue<T> {
    private ArrayList<T> liste;
    
    public Queue()
    {
        liste = new ArrayList();
    }
    
    public void enqueue(T entry) // : permet d'ajouter une entrée dans la Queue.
    {
        liste.add(entry);
    }
    
    public T dequeue() // : permet de supprimer le premier élément ajouté dans la Queue et le renvoie.
    {
        return liste.remove(0);
    }
    
    public T peek()  //: permet de récupérer le premier élément ajouté dans la Queue sans le supprimer.
    {
        return liste.get(0);
    }
    
    public int size() //: permet de récupérer la taille de la Queue.
    {
        return liste.size();
    }
    
    public boolean isEmpty() // : permet de vérifier si la Queue est vide.
    {
        return liste.isEmpty();
    }
}
