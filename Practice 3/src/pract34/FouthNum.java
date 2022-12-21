package pract34;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class FouthNum {

    public static void InputCheck() {

        Scanner scan = new Scanner(System.in);
        Random rand3 = new Random();

        int n = 0;
        System.out.println("Введите размер массива: ");
        try {
            n = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено не натуральное число! Повторите ввод!");
            InputCheck();
        }

        int[] arr3 = new int[n];
        int numOfEvens = 0;
        int index = 0;

        System.out.println("Полученный массив длинной " + n + ": ");
        for (int i = 0; i < n; i++) {
            arr3[i] = rand3.nextInt(89) + 10;
            if (arr3[i] % 2 == 0) numOfEvens += 1;
            System.out.print(arr3[i] + " ");
        }
        System.out.println('\n' + "Массив из четных:");
        int[] arr3Evens = new int[numOfEvens];
        for (int i = 0; i < n; i++) {
            if (arr3[i] % 2 == 0) {
                arr3Evens[index] = arr3[i];
                index++;
            }
        }
        for (int i = 0; i < arr3Evens.length; i++) {
            System.out.print(arr3Evens[i] + " ");
        }
    }


    public static void main(String[] args) {
        InputCheck();
    }





}

