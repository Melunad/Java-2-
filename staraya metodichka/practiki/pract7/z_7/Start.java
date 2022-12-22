package z_7;

import z_6.Student;

import java.util.Scanner;
import java.util.Stack;

public class Start {
    public static void main(String[] args){
        Stack<Integer> obj1 = new Stack<>();
        Stack<Integer> obj2 = new Stack<>();
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.print("Введите число от 0 до 9 числа не должы повторяться: ");
            int n = in.nextInt();
            if(n >= 0 && n < 10){
                obj1.push(n);
            }
            else {System.out.print("вы ввели ytrjhtrnyst lfyyst  "); break;}
        }

        for(int i = 0; i < 5; i++){
            System.out.print("Введите число от 0 до 9 числа не должы повторяться: ");
            int n = in.nextInt();
            if(n >= 0 && n < 10){
                obj2.push(n);
            }
            else {System.out.print("вы ввели ytrjhtrnyst lfyyst  "); break;}
        }
        int iter = 0;
       while((iter < 256) && (obj1.size() != 0) && (obj2.size() != 0)){
           int n1 = obj1.pop();
           int n2 = obj2.pop();
           if(n1 == 0 && n2 == 9){
               obj2.push(n1);
               obj2.push(n2);
           }
           if(n1 == 9 && n2 == 0){
               obj1.push(n1);
               obj1.push(n2);
           }
           else if(n1 == n2){
               obj1.push(n1);
               obj2.push(n2);
           }
           else if(n1 < n2) {
               obj2.push(n1);
               obj2.push(n2);
           }
           else if(n1 > n2) {
               obj1.push(n1);
               obj1.push(n2);
           }
           iter++;
    }
        System.out.println("iter = " + iter);
       if(obj1.size() == 0){
           System.out.print("Win player 2 ");
       }
       else if(obj2.size() == 0){
           System.out.print("Win player 1 ");
       }
       else{
           System.out.print("botva ");
       }
    }
}
