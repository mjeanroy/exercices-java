package exercice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Massil
 */
public class RechercheDichotomique {
    
    public static void main(String[] args) {
        int[] tab = new int[] {0,15,16,88,199,200};
        System.out.println(search(tab, 199));
    }
    
    public static int search(int[] tableau , int valeur)
    {
        boolean find = false;
        System.out.println(valeur);
        int gauche = 0 , droite = tableau.length-1 ;
        int milieu = (gauche + droite) /2;
        while(!find)
        {
            System.out.println("Gauche: " + gauche  + " Droite: " + droite + " Milieu: " + milieu);
            if(tableau[milieu] == valeur)
            {
                find = true;
                return milieu;
            }
            else if(tableau[milieu]<valeur)
            {
                gauche = milieu;
                milieu = (gauche + droite)/2;
            }
            else
            {
                droite = milieu;
                milieu = (gauche + droite) / 2;
            }
            
            if(milieu == gauche || milieu == droite)
            {
                return -666;
            }
        }
        return -666;
    }
}
