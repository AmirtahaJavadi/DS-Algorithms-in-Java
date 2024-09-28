package org.java.sorts;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] array = new int[]{5, 40, 15, 3, 2, 25 ,35};
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i+1; j < array.length; j++) {
                if (min > array[j]) {
                    index = j;
                    min = array[j];
                }
            }
            array[index] = array[i];
            array[i] = min;

            System.out.println(Arrays.toString(array));
        }
    }
}
