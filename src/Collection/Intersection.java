/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Massil
 */
public class Intersection {
    
    public static void main(String[] args)
    {
        count("Massil");
        
    }
    
    public static LinkedList<String> intersection(ArrayList<String> list1 , HashSet<String> list2)
    {
        LinkedList res = new LinkedList();
        res.addAll(list1);
        res.retainAll(list2);
        
        return res;
    }
    
    public static void count(String text)
    {
        Map s = new HashMap<String,Integer>();
        for (char e: text.toCharArray())
        {
            if(s.containsKey(e))
            {
                int i = (Integer)s.get(e)+1;
                s.put(e , i);
            }
            else{
                s.put(e,1);
            }
        }
    }
}
