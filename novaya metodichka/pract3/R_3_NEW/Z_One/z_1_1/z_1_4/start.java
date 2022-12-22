package R_3_NEW.Z_One.z_1_1.z_1_4;

import java.util.Random;
import java.util.Scanner;

public class start {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        double v;
        do {
            System.out.println("введите натуральное число больше нуля");
            v = in.nextDouble();
        }while (v != (int)v || (int)v <= 0);
        System.out.println("----------------------------------------------");
        int n = (int)v;
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = rand.nextInt(n);
        for(int i = 0; i < n; i++)
            System.out.println(a[i]);
        int k = 0;
        int[] b = new int[n];
        for(int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b[k] = a[i];
                k++;
            }
        }
        System.out.println("четные числа  --------------------------------------------------------------");
        for(int i = 0; i < k; i++)
            System.out.println(b[i]);

    }
}
