/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heritage;

import java.util.Random;

/**
 *
 * @author Massil
 */
public class Fighter extends AbstractFighter{
    
    public static void main(String[] args)
    {
        
    }
    
    public Fighter(String nom)
    {
        super(nom);
    }
    
    @Override
    public String toString()
    {
        String rs ="";
        rs = "Fighter " + getNom();
        return rs;
    }
    
    @Override
    public int rollDice()
    {
        Random r = new Random();
        return r.nextInt(2);
    }
}
