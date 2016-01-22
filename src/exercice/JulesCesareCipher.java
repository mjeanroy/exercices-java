/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice;

/**
 *
 * @author Massil
 */
public class JulesCesareCipher {
    
    
    public static void main(String[] args) {
        encode("Massil" , 1);
    }
    
    public static String encode(String text , int n)
    {
        String res = "";
        for(int i = 0 ; i < text.length() ; i++)
        {
            res += (char) (text.charAt(i)+n);
        }
        return res;
    }
}
