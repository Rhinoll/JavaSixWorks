package pract33;

import java.util.Random;

public class Massive3 {

    public static void main(String[] args) {

        Random rand = new Random();
        int arr[] = new int[4];

        System.out.println("Полученный массив: \n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(89) + 10;
            System.out.print(arr[i] + " ");
        }

        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] >= arr[i+1]) flag = false;
        }
        if (flag) System.out.println("\nЯвляется строго возрастающей");
        else System.out.println("\nНе является строго возрастающей");
    }
}
