package z_7;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Start2 {
    public static void main(String[] args){
        PriorityQueue<Integer> obj1 = new PriorityQueue<>();
        PriorityQueue<Integer> obj2 = new PriorityQueue<>();
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.print("Введите число от 0 до 9 числа не должы повторяться: ");
            int n = in.nextInt();
            obj1.add(n);
        }
        for(int i = 0; i < 5; i++){
            int n = obj1.poll();
            System.out.println(n);
        }

    }
}
