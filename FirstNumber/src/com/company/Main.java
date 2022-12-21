package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int [] array = new int[10];

        System.out.println("Неотсортированный массив: \n");
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
            System.out.println(array[i]);
        }

        System.out.println('\n' + "Отсортированный массив: \n");
        Arrays.sort(array);

        for (int j : array) {
            System.out.println(j);
        }
    }
}