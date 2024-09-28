package org.java.sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Quick {

    private static void part(int[] array, int start, int end){
        if (start >= end) return;
        if(start < 0) return;
        int pivot = quickSort(array, start, end) ;
        part(array, start, pivot - 1);
        part(array, pivot + 1, end);
    }
    public static void main(String[] args) {
        int[] array = new int[]{5, 40, 15, 3, 25, 16};
        part(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static int quickSort(int[] array, int start, int end) {

        int pivot = array[end];
//        System.out.println("pivot: " + pivot);
        int i = start -1;
        for(int j = start;j<end+1;j++) {
//            System.out.println("i: " + i + ", j: " + j);
            if(array[j] < pivot) {
                i++;
//                System.out.println("i: " + i);
                int temp = array[j];
//                System.out.println("temp: " + temp);
                array[j] = array[i];
                array[i] = temp;
            }
        }
        i++;
//        System.out.println("i: " + i);
        int temp = array[end];
//        System.out.println("temppp: " + temp);
        array[end] = array[i];
        array[i] = temp;
        return i;
    }
}
