package pract31;

import java.util.Arrays;
import java.util.Random;


public class MassiveSorter {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] array = new int[10];
        double[] array2 = new double[10];

        System.out.print("Неотсортированный массив, сгенерированный с помощью класса Random: \n");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
            System.out.print(array[i]+ " ");
        }

        System.out.print('\n' + "Отсортированный массив: \n");
        Arrays.sort(array);

        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.print("\nНеотсортированный массив, сгенерированный с помощью класса Math: \n");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Math.random();
            System.out.print(array2[i] + " ");
        }

        System.out.print('\n' + "Отсортированный массив: \n");
        Arrays.sort(array2);

        for (double j : array2) {
            System.out.print(j + " ");
        }
    }
}
