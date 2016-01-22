/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionComptesBancaires;

import java.util.ArrayList;

/**
 *
 * @author Massil
 */
public class Client {
    private String nom;
    private String prenom;
    private ArrayList compte;

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.compte = new ArrayList<AbstractCompte>();
    }
    
    public void addCompte(AbstractCompte compte)
    {
        this.compte.add(compte);
    }
    
    public void afficherListeCompte()
    {
        System.out.println(compte);
    }
    
    public String toString()
    {
        String rs = "Client: " + nom + " " + prenom;
        return rs;
    }
}
