package com.company;

import java.util.Scanner;

public class Recurisve {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Задание 7\nВведите натуральное число n > 1: ");
        int n = scan.nextInt();
        Recursion1(n);

        System.out.println("\nЗадание 8\nВведите строку: ");
        String pal = scan.next();
        Recursion2(pal);

        System.out.println("\nЗадание 9\nВведите два числа: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(Recursion3(a,b));

        System.out.println("\nЗадание 10\nДва числа: ");
        int m = scan.nextInt();
        int n1 = scan.nextInt();
        System.out.println(Recursion4(m, n1));
    }

    public static void Recursion1(int n) {
        int a = 2;
        while (a <= n) {
            if ((n % a) == 0) {
                if (a != n) {
                    System.out.print(a + " ");
                    Recursion1(n / a);
                } else {
                    System.out.print(a);
                }
                return;
            }
            a++;
        }
    }

    public static void Recursion2(String pal) {
            StringBuffer buff = new StringBuffer(pal);
            buff.reverse();
            String isPal = buff.toString();
            if (pal.equals(isPal)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
    }

    public static int Recursion3(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return Recursion3(a, b - 1) + Recursion3(a - 1, b - 1);
    }

    public static int Recursion4(int n, int m) {
        if (n == 0) {
            return m;
        }
        else {
            return Recursion4(n/10, m*10 + n%10);
        }
    }
}