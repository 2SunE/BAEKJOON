package stack;

import java.util.Scanner;
import java.util.Stack;

public class Q_10828_time_over {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      Stack<Integer> s = new Stack<>(); // Stack
      
      int N = sc.nextInt();
      int x = 0;

      while(N-->0) {
         String arr = sc.next();
         switch (arr) {
         case "push":
            s.push(sc.nextInt());
            break;
         case "top":
            if(!s.isEmpty()) {
               System.out.println(s.peek());
            }else
               System.out.println("-1");
            break;
         case "size":
            System.out.println(s.size());
            break;
         case "pop":
            if(!s.isEmpty()) {
               System.out.println(s.pop());
            }else
               System.out.println("-1");
            break;
         case "empty":
            if(!s.empty()) {
               System.out.println("0");
            }else
               System.out.println("1");
            break;
         }
      }
   }
}