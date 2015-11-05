/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LIFO;

import java.util.ArrayList;

/**
 *
 * @author Massil
 */
public class Parenthesis {

    public static void main(String[] args)
    {
        Stack stack = new Stack<Character>();
        stack.push("m");
        stack.push("a");
        stack.push("s");
        stack.push("i");
        stack.push("l");
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        
        System.out.println("*************");
        Queue queue = new Queue<Character>();
        queue.enqueue("m");
        queue.enqueue("a");
        queue.enqueue("s");
        queue.enqueue("i");
        queue.enqueue("l");
        
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
        queue.dequeue();
        
    }
    
//    public static boolean check(String text)
//    {
//        Stack stack = new Stack<Character>();
//        for(int i = 0 ; i < text.length() ; i++)
//        {
//            if(stack.isEmpty() && text.charAt(i) == '(')
//            {
//                stack.push(text.charAt(i));
//            }
//            else if(stack.isEmpty() && text.charAt(i) == ')')
//            {
//                return false;
//            }
//            else
//            {
//                stack.push(text.charAt(i));
//                if()
//            }
//        }
//        
//    }
    
}
