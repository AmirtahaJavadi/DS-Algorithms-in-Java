package org.java.sorts;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] array = new int[]{5, 40, 15, 3, 25, 16};

        System.out.println(Arrays.toString(quickSort(array,0,array.length-1)));
    }

    private static int[] quickSort(int[] array, int start, int end) {
        if (start > end) return null;
        int pivot = array[end];
        System.out.println("pivot: " + pivot);
        int i = -1;
        for(int j = start;j<end+1;j++) {
            System.out.println("i: " + i + ", j: " + j);
            if(array[j] < pivot) {
                i++;
                System.out.println("i: " + i);
                int temp = array[j];
                System.out.println("temp: " + temp);
                array[j] = array[i];
                array[i] = temp;
            }
            else if(array[j] == pivot) {
                i++;
                System.out.println("i: " + i);
                int temp = array[j];
                System.out.println("temppp: " + temp);
                array[j] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
}
