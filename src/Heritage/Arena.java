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
public class Arena {
    
    public static void main(String[] args)
    {
        Arena a = new Arena("R2D2", "DATA");
        AbstractFighter vinqueur = a.fight();
        System.out.println(vinqueur + " a gagné!");
    }
    
    private AbstractFighter robot1 , robot2;
    
    public Arena(String nom1 , String nom2)
    {
        robot1 = new Fighter(nom1);
        robot2 = new Fighter(nom2);
    }
    
    public AbstractFighter fight()
    {
        while( !robot1.isDead() && !robot2.isDead())
        {
            robot1.fire(robot2);
            if(robot2.isDead())
                break;
            robot2.fire(robot1);
            if(robot1.isDead())
                break;
        }
        if(robot1.isDead())
            return robot2;
        else if(robot2.isDead()) 
            return robot1;
        else
            return null;
    }
}
