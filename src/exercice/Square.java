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
public class Square {
    public static void main(String[] args) {
        int[][] a = new int[][] {{ 1,1,1} ,{1,1,1},{1,1,1}};
        System.out.println("Diff: " + diff(a));        
    }
    public static int diff(int[][] matrix)
    {
        int diag1 = 0 , diag2 = 0;
        for(int i = 0 ; i < matrix.length ; i++)
        {
            diag1+= matrix[i][i];
            diag2+=matrix[i][matrix.length-1-i];
        }
        return diag1 - diag2;
    }
}
