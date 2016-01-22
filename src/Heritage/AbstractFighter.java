/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heritage;

/**
 *
 * @author Massil
 */
public abstract class AbstractFighter {
    
    private String nom;
    private int pointVie;

    public AbstractFighter(String nom)
    {
        this.nom = nom;
        this.pointVie = 10;
    }
    public boolean isDead()
    {
        if(this.pointVie > 0 )
        {
            return false;
        }
        else return true;
    }
    
    protected abstract int rollDice();
    
    public void receiveAttack()
    {
        this.pointVie -= 2;
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public final void fire(AbstractFighter b)
    {
        if(!b.isDead()){
            int i = rollDice();
            System.out.println(i);
            if(i == 0)
            {
                b.receiveAttack();
            }
        }
        else
            System.err.println(b + " est déjà mort!");
        System.out.println(b + " a été touché par " + this);
    }
}
