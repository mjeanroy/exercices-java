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
public class Robot extends AbstractFighter{
    
    public Robot (String nom)
    {
        super(nom);
    }
    
    @Override
    public int rollDice()
    {
        return 0;
    }
    @Override
    public String toString()
    {
        String rs = "";
        rs = "Robot " + this.getNom();
        return rs;
    }

}
