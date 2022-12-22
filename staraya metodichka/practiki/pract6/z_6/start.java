package z_6;

import java.util.Scanner;

public class start {
    public static void main(String[] args) {
        int n = 10;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество записей: ");
        n = in.nextInt();
        Student[] mas = new Student[n];
        for (int i = 0; i < n; i++) {
            mas[i] = new Student();
        }

        for (int i = 0; i < n; i++) {
            int t = n - i;
            System.out.println("Введите имя и номер студента (осталось ввести " + t + " записей) ");
            String name = in.next();
            int idn = in.nextInt();
            mas[i].setName(name);
            mas[i].setIDnumer(idn);
        }


        for (int left = 0; left < mas.length; left++) {
            int value = mas[left].IDnumer;
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < mas[i].IDnumer) {
                    mas[i + 1] = mas[i];
                } else {
                    break;
                }
            }
            mas[i + 1].IDnumer = value;
        }
        for (int i = 0; i < mas.length; i++){
            System.out.println(mas[i]);
        }

    }
}
