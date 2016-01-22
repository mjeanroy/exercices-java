/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice;

import static exercice.Square.diff;

/**
 *
 * @author Massil
 */
public class Staires {
    public static String generate(int steps)
    {
        String rs = "";
        for(int i = 0 ; i < steps ; i++)
        {
            for(int j = 0 ; j <= i ; j++)
            {
                rs += "#";
            }
            rs +='\n';
        }
        return rs;
    }
    public static void main(String[] args) {
        System.out.println(generate(5));      
    }
}
