package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How much values in array?");
        int count = sc.nextInt();
        int[] array = createArray(count);
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    private static int[] reverseArray(int[] array) {
        int length = array.length;
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            length--;
            temp = array[i];
            array[i] = array[length - i];
            array[length - i] = temp;

        }
        return array;
    }

    private static int[] createArray(int count) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter number: " + (i + 1));
            array[i] = sc.nextInt();
        }
        return array;
    }

}
